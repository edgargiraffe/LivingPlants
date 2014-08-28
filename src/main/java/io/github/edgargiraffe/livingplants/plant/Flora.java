package io.github.edgargiraffe.livingplants.plant;

import java.util.ArrayList;
import java.util.Random;

import org.bukkit.block.Block;

public class Flora {

	private Random random = new Random();
	private ArrayList<Plant> plants = new ArrayList<Plant>();
	private ArrayList<Double> probabilities = new ArrayList<Double>();

	public void addPlant(Plant plant, double probability) {
		this.plants.add(plant);
		this.probabilities.add(probability);
	}

	public void growSomething(Block block) {

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
