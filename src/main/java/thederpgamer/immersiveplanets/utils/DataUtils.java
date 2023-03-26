package thederpgamer.immersiveplanets.utils;

import api.common.GameClient;
import api.common.GameCommon;
import thederpgamer.immersiveplanets.ImmersivePlanets;

public class DataUtils {

	public static String getResourcesPath() {
		return ImmersivePlanets.getInstance().getSkeleton().getResourcesFolder().getPath().replace('\\', '/');
	}

	public static String getWorldDataPath() {
		String universeName = GameCommon.getUniqueContextId();
		if(!universeName.contains(":")) return getResourcesPath() + "/data/" + universeName;
		else {
			try {
				ImmersivePlanets.logWarning("Client " + GameClient.getClientPlayerState().getName() + " attempted to illegally access server data.", null);
			} catch(Exception ignored) { }
			return null;
		}
	}
}
