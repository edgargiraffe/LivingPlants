package io.github.edgargiraffe.livingplants.plant.flower;

import io.github.edgargiraffe.livingplants.plant.OneHighOnGrass;

import org.bukkit.Material;
import org.bukkit.block.Block;

public class WhiteTulip extends OneHighOnGrass {

	public WhiteTulip() {
		super("tulip");
	}

	@Override
	public void grow(Block block) {
		block.setType(Material.RED_ROSE);
		block.setData((byte) 0x6);
	}

}
