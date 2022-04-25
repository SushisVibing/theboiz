
package net.mcreator.theboyssa.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

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