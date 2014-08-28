package io.github.edgargiraffe.livingplants.plant;

import io.github.edgargiraffe.livingplants.Util;

import org.bukkit.Material;
import org.bukkit.block.Block;

public abstract class OneHighOnGrass extends Plant {

	public OneHighOnGrass(String name) {
		super(name);
	}

	@Override
	public boolean canGrowHere(Block block) {
		return Util.isOnBlock(block, Material.GRASS);
	}

}
