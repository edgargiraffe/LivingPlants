package io.github.edgargiraffe.livingplants.plant;

import io.github.edgargiraffe.livingplants.Util;

import org.bukkit.GrassSpecies;
import org.bukkit.Material;
import org.bukkit.block.Block;

public class DeadBush extends Plant {

	public DeadBush() {
		super("dead_bush");
	}

	@Override
	public boolean canGrowHere(Block block) {
		return Util.isOnBlock(block, Material.SAND);
	}

	@Override
	public void grow(Block block) {
		block.setType(Material.LONG_GRASS);
		block.setData(GrassSpecies.DEAD.getData());
	}

}
