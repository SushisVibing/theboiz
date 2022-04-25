
package net.mcreator.theboyssa.world.features.lakes;

public class CumfluidFeature extends LakeFeature {
	public static final CumfluidFeature FEATURE = (CumfluidFeature) new CumfluidFeature().setRegistryName("theboyssa:cumfluid");
	public static final ConfiguredFeature<?, ?> CONFIGURED_FEATURE = FEATURE
			.configured(new BlockStateConfiguration(TheboyssaModBlocks.CUMFLUID.defaultBlockState()))
			.rangeUniform(VerticalAnchor.aboveBottom(0), VerticalAnchor.belowTop(0)).squared().rarity(5);

	public static final Set<ResourceLocation> GENERATE_BIOMES = null;

	public CumfluidFeature() {
		super(BlockStateConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<BlockStateConfiguration> context) {
		WorldGenLevel world = context.level();
		ResourceKey<Level> dimensionType = world.getLevel().dimension();
		boolean dimensionCriteria = false;

		if (dimensionType == Level.OVERWORLD)
			dimensionCriteria = true;
		if (dimensionType == ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("theboyssa:cumzone")))
			dimensionCriteria = true;

		if (!dimensionCriteria)
			return false;

		return super.place(context);
	}
}
