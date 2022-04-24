
package net.mcreator.theboyssa.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class CumdropItem extends Item {
	public CumdropItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64).rarity(Rarity.UNCOMMON));
		setRegistryName("cumdrop");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
