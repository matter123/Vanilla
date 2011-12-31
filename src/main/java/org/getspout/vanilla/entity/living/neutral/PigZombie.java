/*
 * This file is part of Vanilla (http://www.getspout.org/).
 *
 * Vanilla is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Vanilla is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.getspout.vanilla.entity.living.neutral;

import org.getspout.api.metadata.MetadataStringValue;
import org.getspout.vanilla.entity.NeutralEntity;
import org.getspout.vanilla.entity.living.hostile.Zombie;
import org.getspout.vanilla.mobs.MobID;

public class PigZombie extends Zombie implements NeutralEntity {
	@Override
	public void onAttached() {
		super.onAttached();
		parent.setMetadata(MobID.KEY, new MetadataStringValue(MobID.ZombiePigman.id));
	}

	@Override
	public void onTick(long dt) {
		super.onTick(dt);
	}
}