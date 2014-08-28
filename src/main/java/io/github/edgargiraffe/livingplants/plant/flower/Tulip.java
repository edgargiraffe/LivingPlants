package io.github.edgargiraffe.livingplants.plant.flower;

import io.github.edgargiraffe.livingplants.plant.Flora;
import io.github.edgargiraffe.livingplants.plant.OneHighOnGrass;

import org.bukkit.block.Block;

public class Tulip extends OneHighOnGrass {

	private Flora flora = new Flora();

	public Tulip() {
		super("tulip");
		this.flora.addPlant(new RedTulip(), 0.25);
		this.flora.addPlant(new OrangeTulip(), 0.25);
		this.flora.addPlant(new WhiteTulip(), 0.25);
		this.flora.addPlant(new PinkTulip(), 0.25);
	}

	@Override
	public void grow(Block block) {
		this.flora.growSomething(block);
	}

}
