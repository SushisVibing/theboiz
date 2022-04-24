package net.mcreator.theboyssa.procedures;

import net.minecraftforge.eventbus.api.Event;

public class FourskinFoodEatenProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.POISON, 330, 1, (false), (false)));
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 330, 1, (false), (false)));
	}
}
