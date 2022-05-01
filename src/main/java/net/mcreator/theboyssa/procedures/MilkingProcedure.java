package net.mcreator.theboyssa.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.theboyssa.init.TheboyssaModItems;

public class MilkingProcedure {
	public static void execute(Entity sourceentity) {
		if (sourceentity == null)
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
		}
	}
}
