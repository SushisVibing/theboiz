
package net.mcreator.theboyssa.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BucketItem;

import net.mcreator.theboyssa.init.TheboyssaModFluids;

public class CumfluidItem extends BucketItem {
	public CumfluidItem() {
		super(() -> TheboyssaModFluids.CUMFLUID,
				new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON).tab(CreativeModeTab.TAB_MISC));
		setRegistryName("cumfluid_bucket");
	}
}
