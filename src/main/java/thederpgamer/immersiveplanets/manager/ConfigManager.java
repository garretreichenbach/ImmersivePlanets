package thederpgamer.immersiveplanets.manager;

import api.mod.config.FileConfiguration;
import thederpgamer.immersiveplanets.ImmersivePlanets;

public class ConfigManager {

	private static FileConfiguration mainConfig;
	private static final String[] defaultMainConfig = {
			"debug-mode: false",
			"max-world-logs: 5"
	};

	public static void initialize(ImmersivePlanets instance) {
		mainConfig = instance.getConfig("config");
		mainConfig.saveDefault(defaultMainConfig);
	}

	public static FileConfiguration getMainConfig() {
		return mainConfig;
	}
}
