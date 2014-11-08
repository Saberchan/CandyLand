package de.Satrium.CandyLand.init;

import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;
import de.Satrium.CandyLand.block.BlockCL;
import de.Satrium.CandyLand.block.BlockDarkGrass;
import de.Satrium.CandyLand.block.BlockMadLandsPortal;
import de.Satrium.CandyLand.block.TestBlock;

public class ModBlocks {
	public static final BlockCL testBlock = new TestBlock();
	public static final BlockCL darkGrass = new BlockDarkGrass();
	public static final Block madLandsPortal = new BlockMadLandsPortal();
	
	public static void registerBlocks(){
		GameRegistry.registerBlock(testBlock, "testBlock");
		GameRegistry.registerBlock(darkGrass, "darkGrass");
		GameRegistry.registerBlock(madLandsPortal, "madLandsPortal");
	}
}
