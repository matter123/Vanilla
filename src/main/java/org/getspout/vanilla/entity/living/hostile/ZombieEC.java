package org.getspout.vanilla.entity.living.hostile;

import org.getspout.api.metadata.MetadataStringValue;
import org.getspout.vanilla.entity.HostileEC;
import org.getspout.vanilla.entity.living.LandEC;
import org.getspout.vanilla.entity.living.MonsterEC;
import org.getspout.vanilla.mobs.MobID;

public class ZombieEC extends MonsterEC implements HostileEC, LandEC {
	@Override
	public void onAttached() {
		super.onAttached();
		parent.setMetadata(MobID.KEY, new MetadataStringValue(MobID.Zombie.id));
	}

	@Override
	public void onTick(float dt) {
		super.onTick(dt);
	}

}
