package io.github.edgargiraffe.livingplants.plant.flower;

import io.github.edgargiraffe.livingplants.plant.OneHighOnGrass;

import org.bukkit.Material;
import org.bukkit.block.Block;

public class Poppy extends OneHighOnGrass {

	public Poppy() {
		super("poppy");
	}

	@Override
	public void grow(Block block) {
		block.setType(Material.RED_ROSE);
		block.setData((byte) 0x0);
	}

}
