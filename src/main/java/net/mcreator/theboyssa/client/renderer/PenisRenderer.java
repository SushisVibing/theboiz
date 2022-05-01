package net.mcreator.theboyssa.client.renderer;

public class PenisRenderer extends MobRenderer<PenisEntity, Modelcustom_model<PenisEntity>> {

	public PenisRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(PenisEntity entity) {
		return new ResourceLocation("theboyssa:textures/penis.png");
	}

}
