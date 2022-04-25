
package net.mcreator.theboyssa.item;

import net.minecraft.network.chat.Component;

public class CumfluidItem extends BucketItem {

	public CumfluidItem() {
		super(() -> TheboyssaModFluids.CUMFLUID,
				new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON).tab(CreativeModeTab.TAB_MISC));
		setRegistryName("cumfluid_bucket");
	}

}
