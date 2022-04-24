package net.mcreator.theboyssa.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.theboyssa.entity.PenisEntity;
import net.mcreator.theboyssa.client.model.Modelcustom_model;

public class PenisRenderer extends MobRenderer<PenisEntity, Modelcustom_model<PenisEntity>> {
	public PenisRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<PenisEntity, Modelcustom_model<PenisEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("theboyssa:textures/.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(PenisEntity entity) {
		return new ResourceLocation("theboyssa:textures/penis.png");
	}
}
