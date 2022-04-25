
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.theboyssa.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.theboyssa.item.SockItem;
import net.mcreator.theboyssa.item.FourskinItem;
import net.mcreator.theboyssa.item.CumzoneItem;
import net.mcreator.theboyssa.item.CumsockItem;
import net.mcreator.theboyssa.item.CumfluidItem;
import net.mcreator.theboyssa.item.CumdropItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TheboyssaModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item CUMSOCK = register(new CumsockItem());
	public static final Item CUMBLOCK = register(TheboyssaModBlocks.CUMBLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item CUMDROP = register(new CumdropItem());
	public static final Item SOCK = register(new SockItem());
	public static final Item CUMZONE = register(new CumzoneItem());
	public static final Item PENIS = register(
			new SpawnEggItem(TheboyssaModEntities.PENIS, -26215, -13108, new Item.Properties().tab(CreativeModeTab.TAB_MISC))
					.setRegistryName("penis_spawn_egg"));
	public static final Item FOURSKIN = register(new FourskinItem());
	public static final Item WHITEPENIS = register(
			new SpawnEggItem(TheboyssaModEntities.WHITEPENIS, -26215, -13108, new Item.Properties().tab(CreativeModeTab.TAB_MISC))
					.setRegistryName("whitepenis_spawn_egg"));
	public static final Item CUMFLUID_BUCKET = register(new CumfluidItem());
	public static final Item AGEDCUM = register(TheboyssaModBlocks.AGEDCUM, CreativeModeTab.TAB_BUILDING_BLOCKS);

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	private static Item register(Block block, CreativeModeTab tab) {
		return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
