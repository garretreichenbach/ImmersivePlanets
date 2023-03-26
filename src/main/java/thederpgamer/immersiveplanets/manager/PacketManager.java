package thederpgamer.immersiveplanets.manager;

import api.network.packets.PacketUtil;
import thederpgamer.immersiveplanets.network.client.ExampleClientPacket;

public class PacketManager {

	public static void initialize() {
		PacketUtil.registerPacket(ExampleClientPacket.class);
	}
}