package net.mcreator.theboyssa.client.renderer;

public class WhitepenisRenderer extends MobRenderer<WhitepenisEntity, Modelwhite_pepe<WhitepenisEntity>> {

	public WhitepenisRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelwhite_pepe(context.bakeLayer(Modelwhite_pepe.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(WhitepenisEntity entity) {
		return new ResourceLocation("theboyssa:textures/penis.png");
	}

}
