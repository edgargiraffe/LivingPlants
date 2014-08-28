package io.github.edgargiraffe.livingplants.plant;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;

public class Cactus extends Plant {

	public Cactus() {
		super("cactus");
	}

	@Override
	public boolean canGrowHere(Block block) {
		return block.getType() == Material.AIR && block.getRelative(BlockFace.DOWN).getType() == Material.SAND
				&& block.getRelative(BlockFace.NORTH).getType() == Material.AIR
				&& block.getRelative(BlockFace.SOUTH).getType() == Material.AIR
				&& block.getRelative(BlockFace.EAST).getType() == Material.AIR
				&& block.getRelative(BlockFace.WEST).getType() == Material.AIR
				&& block.getRelative(BlockFace.UP).getType() == Material.AIR;
	}

	@Override
	public void grow(Block block) {
		block.setType(Material.CACTUS);
	}

}
