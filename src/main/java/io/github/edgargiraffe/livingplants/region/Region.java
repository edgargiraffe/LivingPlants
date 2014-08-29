package io.github.edgargiraffe.livingplants.region;

import io.github.edgargiraffe.livingplants.Configuration;
import io.github.edgargiraffe.livingplants.Configuration.ConfigurationException;
import io.github.edgargiraffe.livingplants.plant.Plant;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import org.bukkit.block.Block;

public class Region {

	public static HashMap<String, Region> regions = new HashMap<String, Region>();

	private Random random = new Random();
	private double weight;
	private List<Plant> plants = new ArrayList<Plant>();
	private List<Double> probabilities = new ArrayList<Double>();

	public Region(String name, Configuration config) throws ConfigurationException {
		this.weight = config.getDouble("weight");
		List<String> plantNames = config.getStringList("plants");
		this.probabilities = config.getDoubleList("probabilities");

		// Register all the regions using the biome names
		for (String biomeName : config.getStringList("biomes")) {
			if (false == Region.regions.keySet().contains(biomeName)) {
				throw new Configuration.ConfigurationException("Region " + name + ": \"" + biomeName
						+ "\" is not a valid biome.");
			}
			Region.regions.put(biomeName, this);
		}

		// Check to see that the plants and probabilities match
		if (plantNames.size() != this.probabilities.size()) {
			throw new Configuration.ConfigurationException("Region " + name
					+ ": the number of plants and probabilities must be equal.");
		}

		// Check to see that all plants are valid and populate list
		for (String plantName : plantNames) {
			if (false == Plant.plants.keySet().contains(plantName)) {
				throw new Configuration.ConfigurationException("Region " + name + ": \"" + plantName
						+ "\" is not a valid plant.");
			}
			this.plants.add(Plant.plants.get(plantName));
		}

		// Check to see that the probabilities given sum to 1
		double total_probability = 0;
		for (Double probability : this.probabilities) {
			total_probability += probability;
		}
		if (Math.abs(total_probability - 1) > 0.000001) {
			throw new Configuration.ConfigurationException("Region " + name
					+ ": The sum of all probabilities must equal 1.");
		}

	}

	public void grow(Block block) {
		if (this.random.nextDouble() > this.weight) {
			return;
		}

		double rand = this.random.nextDouble();
		double threshold = 0;

		for (int i = 0; i < this.plants.size(); i++) {
			threshold += this.probabilities.get(i);
			if (rand < threshold && this.plants.get(i).canGrowHere(block)) {
				this.plants.get(i).grow(block);
				return;
			}
		}

	}

}
