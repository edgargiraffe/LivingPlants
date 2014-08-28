package io.github.edgargiraffe.livingplants.plant.flower;

import io.github.edgargiraffe.livingplants.plant.OneHighOnGrass;

import org.bukkit.Material;
import org.bukkit.block.Block;

public class Dandelion extends OneHighOnGrass {

	public Dandelion() {
		super("dandelion");
	}

	@Override
	public void grow(Block block) {
		block.setType(Material.YELLOW_FLOWER);
	}

}
