package de.Satrium.CandyLand.dimension.madLands.biomes;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import de.Satrium.CandyLand.init.ModBlocks;

public class BiomeGenMadLandPlains extends BiomeGenMadLandsBase {

	public BiomeGenMadLandPlains(int p_i1971_1_) {
		super(p_i1971_1_);
		this.topBlock = ModBlocks.darkGrass;
		this.fillerBlock = Blocks.sandstone;
		this.setBiomeName("Plains");
	}
}
