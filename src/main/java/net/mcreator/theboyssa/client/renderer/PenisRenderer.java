package net.mcreator.theboyssa.client.renderer;

public class PenisRenderer extends MobRenderer<PenisEntity, Modelcustom_model<PenisEntity>> {

	public PenisRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 0.5f);

		this.addLayer(new EyesLayer<PenisEntity, Modelcustom_model<PenisEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("theboyssa:textures/rfdsfadsf.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(PenisEntity entity) {
		return new ResourceLocation("theboyssa:textures/rfdsfadsf.png");
	}

}
