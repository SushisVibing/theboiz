package net.mcreator.theboyssa.procedures;

import net.minecraftforge.eventbus.api.Event;

public class MilkingProcedure {
	public static void execute(Entity entity, Entity sourceentity, ItemStack itemstack) {
		if (entity == null || sourceentity == null)
			return;
		if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == TheboyssaModItems.SOCK) {
			if (sourceentity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(TheboyssaModItems.SOCK);
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
						_player.inventoryMenu.getCraftSlots());
			}
			if (sourceentity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(TheboyssaModItems.CUMSOCK);
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 6600);
		}
	}
}
