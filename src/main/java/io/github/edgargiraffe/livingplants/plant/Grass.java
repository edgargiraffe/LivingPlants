package io.github.edgargiraffe.livingplants.plant;

import org.bukkit.GrassSpecies;
import org.bukkit.Material;
import org.bukkit.block.Block;

public class Grass extends OneHighOnGrass {

	public Grass() {
		super("grass");
	}

	@Override
	public void grow(Block block) {
		block.setType(Material.LONG_GRASS);
		block.setData(GrassSpecies.NORMAL.getData());
	}

}
