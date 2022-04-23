
package net.mcreator.theboyssa.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class CumsockItem extends Item {

	public CumsockItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("cumsock");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

}
