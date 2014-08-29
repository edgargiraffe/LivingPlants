package io.github.edgargiraffe.livingplants.plant;

import org.bukkit.GrassSpecies;
import org.bukkit.Material;
import org.bukkit.block.Block;

public class Fern extends OneHighOnGrass {

	public Fern() {
		super("fern");
	}

	@Override
	public void grow(Block block) {
		block.setType(Material.LONG_GRASS);
		block.setData(GrassSpecies.FERN_LIKE.getData());
	}

}
