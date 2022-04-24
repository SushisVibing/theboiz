
package net.mcreator.theboyssa.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

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
