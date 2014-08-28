package io.github.edgargiraffe.livingplants.plant.flower;

import io.github.edgargiraffe.livingplants.plant.OneHighOnGrass;

import org.bukkit.Material;
import org.bukkit.block.Block;

public class Allium extends OneHighOnGrass {

	public Allium() {
		super("allium");
	}

	@Override
	public void grow(Block block) {
		block.setType(Material.RED_ROSE);
		block.setData((byte) 0x2);
	}

}
