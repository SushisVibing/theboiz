
package net.mcreator.theboyssa.client.particle;

@OnlyIn(Dist.CLIENT)
public class CumpaticleParticle extends TextureSheetParticle {

	public static CumpaticleParticleProvider provider(SpriteSet spriteSet) {
		return new CumpaticleParticleProvider(spriteSet);
	}

	public static class CumpaticleParticleProvider implements ParticleProvider<SimpleParticleType> {
		private final SpriteSet spriteSet;

		public CumpaticleParticleProvider(SpriteSet spriteSet) {
			this.spriteSet = spriteSet;
		}

		public Particle createParticle(SimpleParticleType typeIn, ClientLevel worldIn, double x, double y, double z, double xSpeed, double ySpeed,
				double zSpeed) {
			return new CumpaticleParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed, this.spriteSet);
		}
	}

	private final SpriteSet spriteSet;

	protected CumpaticleParticle(ClientLevel world, double x, double y, double z, double vx, double vy, double vz, SpriteSet spriteSet) {
		super(world, x, y, z);
		this.spriteSet = spriteSet;

		this.setSize(0.2f, 0.2f);

		this.lifetime = 7;

		this.gravity = 0f;
		this.hasPhysics = true;

		this.xd = vx * 1;
		this.yd = vy * 1;
		this.zd = vz * 1;

		this.setSpriteFromAge(spriteSet);
	}

	@Override
	public ParticleRenderType getRenderType() {
		return ParticleRenderType.PARTICLE_SHEET_OPAQUE;
	}

	@Override
	public void tick() {
		super.tick();

		if (!this.removed) {
			this.setSprite(this.spriteSet.get((this.age / 1) % 1 + 1, 1));
		}

	}

}
