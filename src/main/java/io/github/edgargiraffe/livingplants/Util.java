package io.github.edgargiraffe.livingplants;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;

public class Util {

	public static boolean isOnBlock(Block block, Material material) {
		return block.getType() == Material.AIR && block.getRelative(BlockFace.DOWN).getType() == material;
	}

}
