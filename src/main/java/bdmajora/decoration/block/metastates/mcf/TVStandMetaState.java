package bdmajora.decoration.block.metastates.mcf;

import net.minecraft.core.block.Block;
import net.minecraft.core.world.WorldSource;
import bdmajora.decoration.block.mcf.BlockTVStand; // Assuming TVStand is the class of your block
import useless.dragonfly.model.blockstates.processed.MetaStateInterpreter;

import java.util.HashMap;

public class TVStandMetaState extends MetaStateInterpreter {
	@Override
	public HashMap<String, String> getStateMap(WorldSource worldSource, int x, int y, int z, Block block, int meta) {
		int hRotation = meta & 0b11;
		HashMap<String, String> result = new HashMap<>();
		result.put("facing", new String[]{"east", "west", "south", "north"}[hRotation]);

		// Add the connecting attribute
		if (block instanceof BlockTVStand) { // Check if the block is an instance of TVStand
			result.put("right", ((BlockTVStand)block).canConnectTo(worldSource, x - 1, y, z) ? "true" : "false");
			result.put("left", ((BlockTVStand)block).canConnectTo(worldSource, x + 1, y, z) ? "true" : "false");
		}

		return result;
	}
}