package net.mcreator.theboyssa.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.theboyssa.entity.WhitepenisEntity;
import net.mcreator.theboyssa.client.model.Modelcustom_model;

public class WhitepenisRenderer extends MobRenderer<WhitepenisEntity, Modelcustom_model<WhitepenisEntity>> {
	public WhitepenisRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(WhitepenisEntity entity) {
		return new ResourceLocation("theboyssa:textures/penis.png");
	}
}
