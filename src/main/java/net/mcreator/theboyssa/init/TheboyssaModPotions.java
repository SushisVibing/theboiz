
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.theboyssa.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TheboyssaModPotions {
	private static final List<Potion> REGISTRY = new ArrayList<>();
	public static final Potion CUMGRENADE = register(new Potion(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 3600, 0, false, true),
			new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 3600, 0, false, true), new MobEffectInstance(MobEffects.BLINDNESS, 3600, 0, false, true),
			new MobEffectInstance(MobEffects.BAD_OMEN, 3600, 0, false, true)).setRegistryName("cumgrenade"));

	private static Potion register(Potion potion) {
		REGISTRY.add(potion);
		return potion;
	}

	@SubscribeEvent
	public static void registerPotions(RegistryEvent.Register<Potion> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Potion[0]));
	}
}
