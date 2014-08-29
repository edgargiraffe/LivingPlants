package io.github.edgargiraffe.livingplants.plant;

import io.github.edgargiraffe.livingplants.plant.flower.Allium;
import io.github.edgargiraffe.livingplants.plant.flower.AzureBluet;
import io.github.edgargiraffe.livingplants.plant.flower.BlueOrchid;
import io.github.edgargiraffe.livingplants.plant.flower.Dandelion;
import io.github.edgargiraffe.livingplants.plant.flower.OrangeTulip;
import io.github.edgargiraffe.livingplants.plant.flower.OxeyeDaisy;
import io.github.edgargiraffe.livingplants.plant.flower.PinkTulip;
import io.github.edgargiraffe.livingplants.plant.flower.Poppy;
import io.github.edgargiraffe.livingplants.plant.flower.RedTulip;
import io.github.edgargiraffe.livingplants.plant.flower.Tulip;
import io.github.edgargiraffe.livingplants.plant.flower.WhiteTulip;

public class PlantRegistrar {

	public static void registerPlants() {
		new Grass();
		new DeadBush();
		new Fern();
		new Cactus();
		new SugarCane();

		new Dandelion();
		new Poppy();
		new BlueOrchid();
		new Allium();
		new AzureBluet();
		new Tulip();
		new RedTulip();
		new OrangeTulip();
		new WhiteTulip();
		new PinkTulip();
		new OxeyeDaisy();
	}

}
