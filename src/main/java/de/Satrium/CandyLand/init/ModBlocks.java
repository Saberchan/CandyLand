package de.Satrium.CandyLand.init;

import cpw.mods.fml.common.registry.GameRegistry;
import de.Satrium.CandyLand.block.BlockCL;
import de.Satrium.CandyLand.block.BlockDarkGrass;
import de.Satrium.CandyLand.block.TestBlock;

public class ModBlocks {
	public static final BlockCL testBlock = new TestBlock();
	public static final BlockCL darkGrass = new BlockDarkGrass();
	
	public static void registerBlocks(){
		GameRegistry.registerBlock(testBlock, "testBlock");
		GameRegistry.registerBlock(darkGrass, "darkGrass");
	}
}
