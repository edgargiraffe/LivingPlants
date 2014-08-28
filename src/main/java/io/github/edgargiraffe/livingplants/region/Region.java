package io.github.edgargiraffe.livingplants.region;

import java.util.HashMap;

import org.bukkit.block.Block;

public abstract class Region {

	public static HashMap<String, Region> regions = new HashMap<String, Region>();

	public abstract void grow(Block block);

}
