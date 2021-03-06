
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.theboyssa.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.theboyssa.block.CumzonePortalBlock;
import net.mcreator.theboyssa.block.CumfluidBlock;
import net.mcreator.theboyssa.block.CumblockBlock;
import net.mcreator.theboyssa.block.AgedcumBlock;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TheboyssaModBlocks {
	private static final List<Block> REGISTRY = new ArrayList<>();
	public static final Block CUMBLOCK = register(new CumblockBlock());
	public static final Block CUMZONE_PORTAL = register(new CumzonePortalBlock());
	public static final Block CUMFLUID = register(new CumfluidBlock());
	public static final Block AGEDCUM = register(new AgedcumBlock());

	private static Block register(Block block) {
		REGISTRY.add(block);
		return block;
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Block[0]));
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			CumblockBlock.registerRenderLayer();
		}
	}
}
