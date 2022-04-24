package net.mcreator.theboyssa.procedures;

import net.minecraftforge.eventbus.api.Event;

public class CumdropItemIsCraftedsmeltedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player) {
			ItemStack _setstack = new ItemStack(TheboyssaModItems.SOCK);
			_setstack.setCount(1);
			ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
		}
	}
}
