package useless.dfexample.testentity.HTest;

import net.minecraft.core.entity.EntityLiving;
import net.minecraft.core.world.World;

public class EntityHTest extends EntityLiving {
	public EntityHTest(World world) {
		super(world);
	}
	@Override
	public String getEntityTexture() {
		return "/assets/dragonfly/entity/BlackMoa.png";
	}

	@Override
	public String getDefaultEntityTexture() {
		return "/assets/dragonfly/entity/BlackMoa.png";
	}
}