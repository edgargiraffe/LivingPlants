package io.github.edgargiraffe.livingplants.plant;

import java.util.HashMap;

import org.bukkit.block.Block;

public abstract class Plant {

	public static HashMap<String, Plant> plants = new HashMap<String, Plant>();

	public Plant(String name) {
		plants.put(name, this);
	}

	public abstract boolean canGrowHere(Block block);

	public abstract void grow(Block block);

}
