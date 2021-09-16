package net.runelite.client.plugins.ztob.rooms.BLNylocas;

import com.google.common.collect.ImmutableMap;
import java.util.Arrays;
import java.util.HashSet;
import lombok.Getter;

public class BLNylocasWave
{
	public static final int MAX_WAVE = 31;
	static final ImmutableMap<Integer, BLNylocasWave> waves = ImmutableMap.<Integer, BLNylocasWave>builder()
		.put(1, new BLNylocasWave(1, new BLNyloNPC[]{new BLNyloNPC(BLNylocasType.RANGE_SMALL, BLNylocasSpawnPoint.WEST_SOUTH, true), new BLNyloNPC(BLNylocasType.MAGE_SMALL, BLNylocasSpawnPoint.SOUTH_EAST), new BLNyloNPC(BLNylocasType.MELEE_SMALL, BLNylocasSpawnPoint.EAST_NORTH)}))
		.put(2, new BLNylocasWave(2, new BLNyloNPC[]{new BLNyloNPC(BLNylocasType.MAGE_SMALL, BLNylocasSpawnPoint.WEST_NORTH), new BLNyloNPC(BLNylocasType.MELEE_SMALL, BLNylocasSpawnPoint.SOUTH_WEST, true), new BLNyloNPC(BLNylocasType.RANGE_SMALL, BLNylocasSpawnPoint.EAST_SOUTH)}))
		.put(3, new BLNylocasWave(3, new BLNyloNPC[]{new BLNyloNPC(BLNylocasType.MELEE_SMALL, BLNylocasSpawnPoint.WEST_SOUTH), new BLNyloNPC(BLNylocasType.RANGE_SMALL, BLNylocasSpawnPoint.SOUTH_EAST), new BLNyloNPC(BLNylocasType.MAGE_SMALL, BLNylocasSpawnPoint.EAST_NORTH, true)}))
		.put(4, new BLNylocasWave(4, new BLNyloNPC[]{new BLNyloNPC(BLNylocasType.RANGE_SMALL, BLNylocasSpawnPoint.WEST_NORTH), new BLNyloNPC(BLNylocasType.MAGE_BIG, BLNylocasSpawnPoint.SOUTH_BIG), new BLNyloNPC(BLNylocasType.MELEE_SMALL, BLNylocasSpawnPoint.EAST_SOUTH)}))
		.put(5, new BLNylocasWave(5, 16, new BLNyloNPC[]{new BLNyloNPC(BLNylocasType.RANGE_BIG, BLNylocasSpawnPoint.WEST_BIG), new BLNyloNPC(BLNylocasType.MELEE_SMALL, BLNylocasSpawnPoint.SOUTH_EAST), new BLNyloNPC(BLNylocasType.MAGE_SMALL, BLNylocasSpawnPoint.EAST_NORTH)}))
		.put(6, new BLNylocasWave(6, new BLNyloNPC[]{new BLNyloNPC(BLNylocasType.MAGE_SMALL, BLNylocasSpawnPoint.WEST_NORTH), new BLNyloNPC(BLNylocasType.RANGE_SMALL, BLNylocasSpawnPoint.SOUTH_WEST), new BLNyloNPC(BLNylocasType.MELEE_BIG, BLNylocasSpawnPoint.EAST_NORTH)}))
		.put(7, new BLNylocasWave(7, 12, new BLNyloNPC[]{new BLNyloNPC(BLNylocasType.MAGE_SMALL, BLNylocasSpawnPoint.SOUTH_EAST), new BLNyloNPC(BLNylocasType.RANGE_BIG, BLNylocasSpawnPoint.SOUTH_BIG, true), new BLNyloNPC(BLNylocasType.MELEE_SMALL, BLNylocasSpawnPoint.EAST_NORTH)}))
		.put(8, new BLNylocasWave(8, new BLNyloNPC[]{new BLNyloNPC(BLNylocasType.MAGE_BIG, BLNylocasSpawnPoint.WEST_BIG, true), new BLNyloNPC(BLNylocasType.MELEE_SMALL, BLNylocasSpawnPoint.SOUTH_WEST), new BLNyloNPC(BLNylocasType.RANGE_SMALL, BLNylocasSpawnPoint.EAST_SOUTH)}))
		.put(9, new BLNylocasWave(9, 12, new BLNyloNPC[]{new BLNyloNPC(BLNylocasType.RANGE_BIG, BLNylocasSpawnPoint.WEST_BIG, true), new BLNyloNPC(BLNylocasType.MELEE_SMALL, BLNylocasSpawnPoint.WEST_SOUTH), new BLNyloNPC(BLNylocasType.MAGE_SMALL, BLNylocasSpawnPoint.EAST_NORTH)}))
		.put(10, new BLNylocasWave(10, 8, new BLNyloNPC[]{new BLNyloNPC(BLNylocasType.RANGE_SMALL, BLNylocasSpawnPoint.WEST_NORTH), new BLNyloNPC(BLNylocasType.RANGE_SMALL, BLNylocasSpawnPoint.WEST_SOUTH, true),
			new BLNyloNPC(BLNylocasType.RANGE_SMALL, BLNylocasSpawnPoint.SOUTH_WEST), new BLNyloNPC(BLNylocasType.RANGE_SMALL, BLNylocasSpawnPoint.SOUTH_EAST),
			new BLNyloNPC(BLNylocasType.RANGE_SMALL, BLNylocasSpawnPoint.EAST_NORTH, true), new BLNyloNPC(BLNylocasType.RANGE_BIG, BLNylocasSpawnPoint.EAST_NORTH)}))
		.put(11, new BLNylocasWave(11, 8, new BLNyloNPC[]{new BLNyloNPC(BLNylocasType.MAGE_BIG, BLNylocasSpawnPoint.WEST_BIG, true),
			new BLNyloNPC(BLNylocasType.MAGE_SMALL, BLNylocasSpawnPoint.SOUTH_WEST), new BLNyloNPC(BLNylocasType.MAGE_SMALL, BLNylocasSpawnPoint.SOUTH_EAST),
			new BLNyloNPC(BLNylocasType.MAGE_SMALL, BLNylocasSpawnPoint.EAST_NORTH, true), new BLNyloNPC(BLNylocasType.MAGE_SMALL, BLNylocasSpawnPoint.EAST_SOUTH)}))
		.put(12, new BLNylocasWave(12, 8, new BLNyloNPC[]{new BLNyloNPC(BLNylocasType.MELEE_SMALL, BLNylocasSpawnPoint.WEST_NORTH), new BLNyloNPC(BLNylocasType.MELEE_SMALL, BLNylocasSpawnPoint.WEST_SOUTH, true),
			new BLNyloNPC(BLNylocasType.MELEE_BIG, BLNylocasSpawnPoint.SOUTH_BIG),
			new BLNyloNPC(BLNylocasType.MELEE_SMALL, BLNylocasSpawnPoint.EAST_NORTH, true), new BLNyloNPC(BLNylocasType.MELEE_SMALL, BLNylocasSpawnPoint.EAST_SOUTH)}))
		.put(13, new BLNylocasWave(13, 8, new BLNyloNPC[]{new BLNyloNPC(BLNylocasType.RANGE_SMALL, BLNylocasSpawnPoint.WEST_NORTH), new BLNyloNPC(BLNylocasType.MAGE_SMALL, BLNylocasSpawnPoint.WEST_SOUTH, true),
			new BLNyloNPC(BLNylocasType.MELEE_SMALL, BLNylocasSpawnPoint.SOUTH_WEST), new BLNyloNPC(BLNylocasType.RANGE_SMALL, BLNylocasSpawnPoint.SOUTH_EAST),
			new BLNyloNPC(BLNylocasType.MELEE_BIG, BLNylocasSpawnPoint.EAST_NORTH, true)}))
		.put(14, new BLNylocasWave(14, 8, new BLNyloNPC[]{new BLNyloNPC(BLNylocasType.MAGE_SMALL, BLNylocasSpawnPoint.WEST_NORTH), new BLNyloNPC(BLNylocasType.MELEE_SMALL, BLNylocasSpawnPoint.WEST_SOUTH, true),
			new BLNyloNPC(BLNylocasType.RANGE_SMALL, BLNylocasSpawnPoint.SOUTH_WEST), new BLNyloNPC(BLNylocasType.MAGE_SMALL, BLNylocasSpawnPoint.SOUTH_EAST),
			new BLNyloNPC(BLNylocasType.RANGE_BIG, BLNylocasSpawnPoint.EAST_NORTH, true)}))
		.put(15, new BLNylocasWave(15, 8, new BLNyloNPC[]{new BLNyloNPC(BLNylocasType.MELEE_SMALL, BLNylocasSpawnPoint.WEST_NORTH), new BLNyloNPC(BLNylocasType.RANGE_SMALL, BLNylocasSpawnPoint.WEST_SOUTH, true),
			new BLNyloNPC(BLNylocasType.MAGE_BIG, BLNylocasSpawnPoint.SOUTH_BIG),
			new BLNyloNPC(BLNylocasType.MAGE_SMALL, BLNylocasSpawnPoint.EAST_NORTH, true), new BLNyloNPC(BLNylocasType.RANGE_SMALL, BLNylocasSpawnPoint.EAST_SOUTH)}))
		.put(16, new BLNylocasWave(16, new BLNyloNPC[]{new BLNyloNPC(BLNylocasType.RANGE_SMALL, BLNylocasSpawnPoint.WEST_NORTH), new BLNyloNPC(BLNylocasType.MELEE_SMALL, BLNylocasSpawnPoint.SOUTH_WEST), new BLNyloNPC(BLNylocasType.MAGE_SMALL, BLNylocasSpawnPoint.EAST_SOUTH)}))
		.put(17, new BLNylocasWave(17, 12, new BLNyloNPC[]{new BLNyloNPC(BLNylocasType.MAGE_BIG, BLNylocasSpawnPoint.WEST_BIG), new BLNyloNPC(BLNylocasType.MAGE_BIG, BLNylocasSpawnPoint.SOUTH_BIG), new BLNyloNPC(BLNylocasType.MAGE_BIG, BLNylocasSpawnPoint.EAST_NORTH)}))
		.put(18, new BLNylocasWave(18, 8, new BLNyloNPC[]{new BLNyloNPC(BLNylocasType.RANGE_BIG, BLNylocasSpawnPoint.WEST_BIG, true), new BLNyloNPC(BLNylocasType.RANGE_BIG, BLNylocasSpawnPoint.SOUTH_BIG), new BLNyloNPC(BLNylocasType.RANGE_BIG, BLNylocasSpawnPoint.EAST_NORTH)}))
		.put(19, new BLNylocasWave(19, 12, new BLNyloNPC[]{new BLNyloNPC(BLNylocasType.MAGE_BIG, BLNylocasSpawnPoint.WEST_BIG), new BLNyloNPC(BLNylocasType.MAGE_BIG, BLNylocasSpawnPoint.SOUTH_BIG), new BLNyloNPC(BLNylocasType.MAGE_BIG, BLNylocasSpawnPoint.EAST_NORTH, true)}))
		.put(20, new BLNylocasWave(20, 16, new BLNyloNPC[]{new BLNyloNPC(BLNylocasType.MELEE_BIG, BLNylocasSpawnPoint.WEST_BIG), new BLNyloNPC(BLNylocasType.MAGE_BIG, BLNylocasSpawnPoint.SOUTH_BIG, true), new BLNyloNPC(BLNylocasType.MELEE_BIG, BLNylocasSpawnPoint.EAST_NORTH)}))
		.put(21, new BLNylocasWave(21, 8, new BLNyloNPC[]{new BLNyloNPC(BLNylocasType.MAGE_SMALL, BLNylocasSpawnPoint.WEST_NORTH), new BLNyloNPC(BLNylocasType.MAGE_SMALL, BLNylocasSpawnPoint.WEST_SOUTH),
			new BLNyloNPC(BLNylocasType.MELEE_SMALL, BLNylocasSpawnPoint.SOUTH_WEST, true), new BLNyloNPC(BLNylocasType.MELEE_SMALL, BLNylocasSpawnPoint.SOUTH_EAST),
			new BLNyloNPC(BLNylocasType.RANGE_SMALL, BLNylocasSpawnPoint.EAST_NORTH), new BLNyloNPC(BLNylocasType.RANGE_SMALL, BLNylocasSpawnPoint.EAST_SOUTH, true)}))
		.put(22, new BLNylocasWave(22, 12, new BLNyloNPC[]{new BLNyloNPC(BLNylocasType.MELEE_BIG, BLNylocasSpawnPoint.WEST_BIG),
			new BLNyloNPC(BLNylocasType.MAGE_SMALL, BLNylocasSpawnPoint.SOUTH_WEST), new BLNyloNPC(BLNylocasType.RANGE_SMALL, BLNylocasSpawnPoint.SOUTH_EAST),
			new BLNyloNPC(BLNylocasType.MAGE_BIG, BLNylocasSpawnPoint.EAST_NORTH, true)}))
		.put(23, new BLNylocasWave(23, 8, new BLNyloNPC[]{new BLNyloNPC(BLNylocasType.MAGE_SMALL, BLNylocasSpawnPoint.WEST_NORTH), new BLNyloNPC(BLNylocasType.RANGE_SMALL, BLNylocasSpawnPoint.WEST_SOUTH),
			new BLNyloNPC(BLNylocasType.RANGE_BIG, BLNylocasSpawnPoint.SOUTH_BIG, true),
			new BLNyloNPC(BLNylocasType.MAGE_BIG, BLNylocasSpawnPoint.EAST_NORTH)}))
		.put(24, new BLNylocasWave(24, 8, new BLNyloNPC[]{new BLNyloNPC(BLNylocasType.RANGE_BIG, BLNylocasSpawnPoint.WEST_BIG, true), new BLNyloNPC(BLNylocasType.MAGE_BIG, BLNylocasSpawnPoint.SOUTH_BIG, true), new BLNyloNPC(BLNylocasType.MELEE_BIG, BLNylocasSpawnPoint.EAST_NORTH, true)}))
		.put(25, new BLNylocasWave(25, 8, new BLNyloNPC[]{new BLNyloNPC(BLNylocasType.MELEE_BIG, BLNylocasSpawnPoint.WEST_BIG, true), new BLNyloNPC(BLNylocasType.RANGE_BIG, BLNylocasSpawnPoint.SOUTH_BIG), new BLNyloNPC(BLNylocasType.MAGE_BIG, BLNylocasSpawnPoint.EAST_NORTH)}))
		.put(26, new BLNylocasWave(26, new BLNyloNPC[]{new BLNyloNPC(BLNylocasType.MAGE_BIG, BLNylocasSpawnPoint.WEST_BIG, true), new BLNyloNPC(BLNylocasType.MELEE_BIG, BLNylocasSpawnPoint.SOUTH_BIG), new BLNyloNPC(BLNylocasType.MAGE_BIG, BLNylocasSpawnPoint.EAST_NORTH)}))
		.put(27, new BLNylocasWave(27, 8, new BLNyloNPC[]{new BLNyloNPC(BLNylocasType.MAGE_BIG, BLNylocasSpawnPoint.WEST_BIG), new BLNyloNPC(BLNylocasType.MELEE_BIG, BLNylocasSpawnPoint.SOUTH_BIG, true), new BLNyloNPC(BLNylocasType.MAGE_BIG, BLNylocasSpawnPoint.EAST_NORTH)}))
		.put(28, new BLNylocasWave(28, new BLNyloNPC[]{new BLNyloNPC(BLNylocasType.MELEE_SMALL, BLNylocasSpawnPoint.WEST_NORTH), new BLNyloNPC(BLNylocasType.RANGE_SMALL, BLNylocasSpawnPoint.WEST_SOUTH, true),
			new BLNyloNPC(BLNylocasType.MAGE_SMALL, BLNylocasSpawnPoint.SOUTH_WEST), new BLNyloNPC(BLNylocasType.MELEE_SMALL, BLNylocasSpawnPoint.SOUTH_EAST),
			new BLNyloNPC(BLNylocasType.MAGE_SMALL, BLNylocasSpawnPoint.EAST_NORTH), new BLNyloNPC(BLNylocasType.RANGE_SMALL, BLNylocasSpawnPoint.EAST_SOUTH)}))
		.put(29, new BLNylocasWave(29, new BLNyloNPC[]{new BLNyloNPC(BLNylocasType.MELEE_SMALL, BLNylocasSpawnPoint.WEST_NORTH, true), new BLNyloNPC(BLNylocasType.RANGE_SMALL, BLNylocasSpawnPoint.WEST_SOUTH),
			new BLNyloNPC(BLNylocasType.MELEE_BIG, BLNylocasSpawnPoint.SOUTH_BIG),
			new BLNyloNPC(BLNylocasType.MAGE_SMALL, BLNylocasSpawnPoint.EAST_NORTH), new BLNyloNPC(BLNylocasType.RANGE_SMALL, BLNylocasSpawnPoint.EAST_SOUTH, true)}))
		.put(30, new BLNylocasWave(30, new BLNyloNPC[]{new BLNyloNPC(BLNylocasType.RANGE_BIG, BLNylocasSpawnPoint.WEST_BIG),
			new BLNyloNPC(BLNylocasType.MAGE_SMALL, BLNylocasSpawnPoint.SOUTH_WEST), new BLNyloNPC(BLNylocasType.MELEE_SMALL, BLNylocasSpawnPoint.SOUTH_EAST),
			new BLNyloNPC(BLNylocasType.MAGE_BIG, BLNylocasSpawnPoint.EAST_BIG, true)}))
		.put(31, new BLNylocasWave(31, new BLNyloNPC[]{new BLNyloNPC(BLNylocasType.MELEE_SMALL, BLNylocasSpawnPoint.WEST_NORTH), new BLNyloNPC(BLNylocasType.RANGE_SMALL, BLNylocasSpawnPoint.WEST_SOUTH),
			new BLNyloNPC(BLNylocasType.MAGE_SMALL, BLNylocasSpawnPoint.SOUTH_WEST), new BLNyloNPC(BLNylocasType.MELEE_SMALL, BLNylocasSpawnPoint.SOUTH_EAST),
			new BLNyloNPC(BLNylocasType.MAGE_SMALL, BLNylocasSpawnPoint.EAST_NORTH), new BLNyloNPC(BLNylocasType.RANGE_SMALL, BLNylocasSpawnPoint.EAST_SOUTH)}))
		.build();

	@Getter
	private final int wave;
	@Getter
	private final HashSet<BLNyloNPC> waveData;
	@Getter
	private final int waveDelay;

	private BLNylocasWave(int wave, BLNyloNPC[] waveData)
	{
		this(wave, 4 ,waveData);
	}

	private BLNylocasWave(int wave, int waveDelay, BLNyloNPC[] waveData)
	{
		this.wave = wave;
		this.waveData = new HashSet<>(Arrays.asList(waveData));
		this.waveDelay = waveDelay;
	}
}
