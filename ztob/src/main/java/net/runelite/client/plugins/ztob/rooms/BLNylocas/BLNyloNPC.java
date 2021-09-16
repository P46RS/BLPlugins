package net.runelite.client.plugins.ztob.rooms.BLNylocas;

import java.util.Objects;
import lombok.Data;

@Data
class BLNyloNPC
{
	private BLNylocasType nyloType;
	private BLNylocasSpawnPoint spawnPoint;
	private boolean aggressive = false;

	BLNyloNPC(BLNylocasType nyloType, BLNylocasSpawnPoint nylocasSpawnPoint)
	{
		this.nyloType = nyloType;
		this.spawnPoint = nylocasSpawnPoint;
	}

	BLNyloNPC(BLNylocasType nyloType, BLNylocasSpawnPoint nylocasSpawnPoint, boolean aggressive)
	{
		this(nyloType, nylocasSpawnPoint);
		this.aggressive = aggressive;
	}

	@Override
	public boolean equals(Object other)
	{
		if (!(other instanceof BLNyloNPC))
		{
			return false;
		}
		BLNyloNPC otherNpc = (BLNyloNPC)other;
		return this.nyloType.equals(otherNpc.getNyloType()) && this.spawnPoint.equals(otherNpc.getSpawnPoint());
	}

	@Override
	public int hashCode()
	{
		return Objects.hash(this.nyloType, this.spawnPoint);
	}
}
