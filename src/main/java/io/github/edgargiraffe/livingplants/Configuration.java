package io.github.edgargiraffe.livingplants;

import java.util.List;

import org.bukkit.configuration.ConfigurationSection;

public class Configuration {

	public static class ConfigurationException extends Exception {
		private static final long serialVersionUID = 5135441857669146156L;

		public ConfigurationException(String message) {
			super(message);
		}
	}

	public static class ConfigurationMissingException extends ConfigurationException {
		private static final long serialVersionUID = 5135441857669146156L;

		public ConfigurationMissingException(String key) {
			super("Paramenter \"" + key + "\" must be set in the configuration file.");
		}
	}

	private ConfigurationSection config;
	private static int UNSET_INT = 0;
	private static double UNSET_DOUBLE = 0.0;

	public Configuration(ConfigurationSection config) {
		this.config = config;
	}

	public int getInt(String key) throws ConfigurationException {
		int value = this.config.getInt(key);
		if (value == UNSET_INT) {
			throw new ConfigurationMissingException(key);
		}
		return value;
	}

	public double getDouble(String key) throws ConfigurationException {
		double value = this.config.getDouble(key);
		if (value == UNSET_DOUBLE) {
			throw new ConfigurationMissingException(key);
		}
		return value;
	}

	public List<String> getStringList(String key) throws ConfigurationException {
		List<String> value = this.config.getStringList(key);
		if (value == null) {
			throw new ConfigurationMissingException(key);
		}
		return value;
	}

	public List<Double> getDoubleList(String key) throws ConfigurationException {
		List<Double> value = this.config.getDoubleList(key);
		if (value == null) {
			throw new ConfigurationMissingException(key);
		}
		return value;
	}

	public Configuration getConfig(String key) throws ConfigurationException {
		ConfigurationSection value = this.config.getConfigurationSection(key);
		if (value == null) {
			throw new ConfigurationMissingException(key);
		}
		return new Configuration(value);
	}

}
