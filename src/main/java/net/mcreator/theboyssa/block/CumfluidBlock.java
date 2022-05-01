
package net.mcreator.theboyssa.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

import net.mcreator.theboyssa.init.TheboyssaModFluids;

public class CumfluidBlock extends LiquidBlock {
	public CumfluidBlock() {
		super(TheboyssaModFluids.CUMFLUID, BlockBehaviour.Properties.of(Material.WATER).strength(100f)

		);
		setRegistryName("cumfluid");
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}
}
