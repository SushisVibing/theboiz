package net.mcreator.theboyssa.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.theboyssa.entity.WhitepenisEntity;
import net.mcreator.theboyssa.client.model.Modelwhite_pepe;

public class WhitepenisRenderer extends MobRenderer<WhitepenisEntity, Modelwhite_pepe<WhitepenisEntity>> {
	public WhitepenisRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelwhite_pepe(context.bakeLayer(Modelwhite_pepe.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(WhitepenisEntity entity) {
		return new ResourceLocation("theboyssa:textures/penis.png");
	}
}
