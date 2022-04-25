
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.theboyssa.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.theboyssa.client.renderer.WhitepenisRenderer;
import net.mcreator.theboyssa.client.renderer.PenisRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class TheboyssaModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(TheboyssaModEntities.PENIS, PenisRenderer::new);
		event.registerEntityRenderer(TheboyssaModEntities.WHITEPENIS, WhitepenisRenderer::new);
	}
}
