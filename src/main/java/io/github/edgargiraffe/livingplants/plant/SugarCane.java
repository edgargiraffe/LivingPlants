package io.github.edgargiraffe.livingplants.plant;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;

public class SugarCane extends Plant {

	public SugarCane() {
		super("sugar_cane");
	}

	private boolean isOnGoodBlock(Block block) {
		return block.getRelative(BlockFace.DOWN).getType() == Material.GRASS
				|| block.getRelative(BlockFace.DOWN).getType() == Material.DIRT
				|| block.getRelative(BlockFace.DOWN).getType() == Material.SAND;
	}

	private boolean isNextToWater(Block block) {
		Block down = block.getRelative(BlockFace.DOWN);
		return down.getRelative(BlockFace.NORTH).getType() == Material.STATIONARY_WATER
				|| down.getRelative(BlockFace.SOUTH).getType() == Material.STATIONARY_WATER
				|| down.getRelative(BlockFace.EAST).getType() == Material.STATIONARY_WATER
				|| down.getRelative(BlockFace.WEST).getType() == Material.STATIONARY_WATER;
	}

	@Override
	public boolean canGrowHere(Block block) {
		return block.getType() == Material.AIR && this.isOnGoodBlock(block) && this.isNextToWater(block);
	}

	@Override
	public void grow(Block block) {
		block.setType(Material.SUGAR_CANE_BLOCK);
	}

}
