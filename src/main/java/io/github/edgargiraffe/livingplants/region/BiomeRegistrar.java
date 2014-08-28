package io.github.edgargiraffe.livingplants.region;

public class BiomeRegistrar {

	private static void register(org.bukkit.block.Biome biome) {
		Region.regions.put(biome.toString().toLowerCase(), null);
	}

	public static void registerBiomes() {
		register(org.bukkit.block.Biome.SWAMPLAND);
		register(org.bukkit.block.Biome.FOREST);
		register(org.bukkit.block.Biome.TAIGA);
		register(org.bukkit.block.Biome.DESERT);
		register(org.bukkit.block.Biome.PLAINS);
		register(org.bukkit.block.Biome.HELL);
		register(org.bukkit.block.Biome.SKY);
		register(org.bukkit.block.Biome.OCEAN);
		register(org.bukkit.block.Biome.RIVER);
		register(org.bukkit.block.Biome.EXTREME_HILLS);
		register(org.bukkit.block.Biome.FROZEN_OCEAN);
		register(org.bukkit.block.Biome.FROZEN_RIVER);
		register(org.bukkit.block.Biome.ICE_PLAINS);
		register(org.bukkit.block.Biome.ICE_MOUNTAINS);
		register(org.bukkit.block.Biome.MUSHROOM_ISLAND);
		register(org.bukkit.block.Biome.MUSHROOM_SHORE);
		register(org.bukkit.block.Biome.BEACH);
		register(org.bukkit.block.Biome.DESERT_HILLS);
		register(org.bukkit.block.Biome.FOREST_HILLS);
		register(org.bukkit.block.Biome.TAIGA_HILLS);
		register(org.bukkit.block.Biome.SMALL_MOUNTAINS);
		register(org.bukkit.block.Biome.JUNGLE);
		register(org.bukkit.block.Biome.JUNGLE_HILLS);
		register(org.bukkit.block.Biome.JUNGLE_EDGE);
		register(org.bukkit.block.Biome.DEEP_OCEAN);
		register(org.bukkit.block.Biome.STONE_BEACH);
		register(org.bukkit.block.Biome.COLD_BEACH);
		register(org.bukkit.block.Biome.BIRCH_FOREST);
		register(org.bukkit.block.Biome.BIRCH_FOREST_HILLS);
		register(org.bukkit.block.Biome.ROOFED_FOREST);
		register(org.bukkit.block.Biome.COLD_TAIGA);
		register(org.bukkit.block.Biome.COLD_TAIGA_HILLS);
		register(org.bukkit.block.Biome.MEGA_TAIGA);
		register(org.bukkit.block.Biome.MEGA_TAIGA_HILLS);
		register(org.bukkit.block.Biome.EXTREME_HILLS_PLUS);
		register(org.bukkit.block.Biome.SAVANNA);
		register(org.bukkit.block.Biome.SAVANNA_PLATEAU);
		register(org.bukkit.block.Biome.MESA);
		register(org.bukkit.block.Biome.MESA_PLATEAU_FOREST);
		register(org.bukkit.block.Biome.MESA_PLATEAU);
		register(org.bukkit.block.Biome.SUNFLOWER_PLAINS);
		register(org.bukkit.block.Biome.DESERT_MOUNTAINS);
		register(org.bukkit.block.Biome.FLOWER_FOREST);
		register(org.bukkit.block.Biome.TAIGA_MOUNTAINS);
		register(org.bukkit.block.Biome.SWAMPLAND_MOUNTAINS);
		register(org.bukkit.block.Biome.ICE_PLAINS_SPIKES);
		register(org.bukkit.block.Biome.JUNGLE_MOUNTAINS);
		register(org.bukkit.block.Biome.JUNGLE_EDGE_MOUNTAINS);
		register(org.bukkit.block.Biome.COLD_TAIGA_MOUNTAINS);
		register(org.bukkit.block.Biome.SAVANNA_MOUNTAINS);
		register(org.bukkit.block.Biome.SAVANNA_PLATEAU_MOUNTAINS);
		register(org.bukkit.block.Biome.MESA_BRYCE);
		register(org.bukkit.block.Biome.MESA_PLATEAU_FOREST_MOUNTAINS);
		register(org.bukkit.block.Biome.MESA_PLATEAU_MOUNTAINS);
		register(org.bukkit.block.Biome.BIRCH_FOREST_MOUNTAINS);
		register(org.bukkit.block.Biome.BIRCH_FOREST_HILLS_MOUNTAINS);
		register(org.bukkit.block.Biome.ROOFED_FOREST_MOUNTAINS);
		register(org.bukkit.block.Biome.MEGA_SPRUCE_TAIGA);
		register(org.bukkit.block.Biome.EXTREME_HILLS_MOUNTAINS);
		register(org.bukkit.block.Biome.EXTREME_HILLS_PLUS_MOUNTAINS);
		register(org.bukkit.block.Biome.MEGA_SPRUCE_TAIGA_HILLS);

	}

}
