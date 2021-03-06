
package net.mcreator.theboyssa.fluid;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleOptions;

import net.mcreator.theboyssa.init.TheboyssaModParticles;
import net.mcreator.theboyssa.init.TheboyssaModItems;
import net.mcreator.theboyssa.init.TheboyssaModFluids;
import net.mcreator.theboyssa.init.TheboyssaModBlocks;

public abstract class CumfluidFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> TheboyssaModFluids.CUMFLUID,
			() -> TheboyssaModFluids.FLOWING_CUMFLUID,
			FluidAttributes.builder(new ResourceLocation("theboyssa:blocks/cumfluid"), new ResourceLocation("theboyssa:blocks/cumfluid"))

					.density(2000).viscosity(2000)

					.sound(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bucket.empty")))).explosionResistance(100f)

							.levelDecreasePerBlock(2)

							.bucket(() -> TheboyssaModItems.CUMFLUID_BUCKET).block(() -> (LiquidBlock) TheboyssaModBlocks.CUMFLUID);

	private CumfluidFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return TheboyssaModParticles.CUMPATICLE;
	}

	public static class Source extends CumfluidFluid {
		public Source() {
			super();
			setRegistryName("cumfluid");
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends CumfluidFluid {
		public Flowing() {
			super();
			setRegistryName("flowing_cumfluid");
		}

		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
