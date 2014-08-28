package io.github.edgargiraffe.livingplants.plant.flower;

import io.github.edgargiraffe.livingplants.plant.Plant;

import org.bukkit.block.Block;

public class Sunflower extends Plant {

	public Sunflower() {
		super("sunflower");
	}

	@Override
	public boolean canGrowHere(Block block) {
		return false;
	}

	@Override
	public void grow(Block block) {
		block.setTypeId(175);
		block.setData((byte) 0x0);
	}

}
