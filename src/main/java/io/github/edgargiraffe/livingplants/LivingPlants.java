package io.github.edgargiraffe.livingplants;

import io.github.edgargiraffe.livingplants.Configuration.ConfigurationException;
import io.github.edgargiraffe.livingplants.plant.PlantRegistrar;
import io.github.edgargiraffe.livingplants.region.BiomeRegistrar;
import io.github.edgargiraffe.livingplants.region.Region;
import io.github.edgargiraffe.livingplants.region.RegionFactory;

import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.Chunk;
import org.bukkit.World;
import org.bukkit.block.Biome;
import org.bukkit.block.Block;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitScheduler;

public class LivingPlants extends JavaPlugin implements Runnable {

	Random random = new Random();
	BukkitScheduler scheduler = Bukkit.getScheduler();

	int delay;
	int period;
	int chunks;

	public LivingPlants() throws ConfigurationException {
		Configuration config = new Configuration(this.getConfig());

		this.delay = config.getInt("delay");
		this.period = config.getInt("period");
		this.chunks = config.getInt("chunks");

		PlantRegistrar.registerPlants();
		BiomeRegistrar.registerBiomes();
		RegionFactory.createBiomes(config);
	}

	@Override
	public void onEnable() {
		this.scheduler.scheduleSyncRepeatingTask(this, this, this.delay, this.period);
	}

	@Override
	public void onDisable() {
		this.scheduler.cancelTasks(this);
	}

	@Override
	public void run() {

		for (World world : Bukkit.getWorlds()) {

			Chunk[] loadedChunks = world.getLoadedChunks();

			// We need to skip unloaded worlds
			if (loadedChunks.length <= 0) {
				continue;
			}

			for (int i = 0; i < this.chunks; i++) {
				Chunk chunk = loadedChunks[this.random.nextInt(loadedChunks.length)];

				int x = this.random.nextInt(16);
				int y = this.random.nextInt(128);
				int z = this.random.nextInt(16);

				Block block = chunk.getBlock(x, y, z);

				// Biome biome = BiomeRegistrar.getBiome(block.getBiome());

				Region biome = Region.regions.get(Biome.DESERT.toString().toLowerCase());
				if (biome != null) {
					biome.grow(block);
				}

			}
		}
	}
}
