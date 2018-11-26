package norling.hellworld.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import norling.hellworld.Main;
import norling.hellworld.blocks.BlockBase;

public class BlockInit {
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//Copper
	public static final Block COPPER_BLOCK = new BlockBase("copper_block", Material.IRON, Main.CREATIVE_TAB);
	// public static final Block COPPER_DIRT = new BlockDirtBase("copper_dirt", Main.CREATIVE_TAB);
	//public static final Block COPPER_LEAVES = new BlockLeavesBase("copper_leaves");
	//public static final Block COPPER_LOG = new BlockLogBase("copper_log");
	public static final Block COPPER_ORE = new BlockBase("copper_ore", Material.ROCK, Main.CREATIVE_TAB);
}
