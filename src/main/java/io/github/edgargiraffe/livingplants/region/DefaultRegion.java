package io.github.edgargiraffe.livingplants.region;

import io.github.edgargiraffe.livingplants.Util;
import io.github.edgargiraffe.livingplants.plant.Plant;

import org.bukkit.Material;
import org.bukkit.block.Block;

public class DefaultRegion extends Region {

	@Override
	public void grow(Block block) {
		if (Util.isOnBlock(block, Material.GRASS)) {
			Plant.plants.get("grass").grow(block);
		}
	}

}
