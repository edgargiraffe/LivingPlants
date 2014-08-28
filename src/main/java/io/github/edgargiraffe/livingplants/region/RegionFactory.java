package io.github.edgargiraffe.livingplants.region;

import io.github.edgargiraffe.livingplants.Configuration;
import io.github.edgargiraffe.livingplants.Configuration.ConfigurationException;

public class RegionFactory {

	public static void createBiomes(Configuration parent) throws ConfigurationException {
		Configuration config = parent.getConfig("regions");

		for (Integer i = 0;; i++) {

			Configuration region;
			try {
				region = config.getConfig(i.toString());
			} catch (ConfigurationException e) {
				break;
			}

			new ConfigRegion(i.toString(), region);
		}

	}

}
