
package net.mcreator.theboyssa.item;

public class FourskinItem extends Item {

	public FourskinItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(3).saturationMod(0.3f).alwaysEat().meat().build()));
		setRegistryName("fourskin");
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);

		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		FourskinFoodEatenProcedure.execute(entity);

		return retval;
	}

}
