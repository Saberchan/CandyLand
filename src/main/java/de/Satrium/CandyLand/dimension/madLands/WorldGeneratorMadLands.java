package de.Satrium.CandyLand.dimension.madLands;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import cpw.mods.fml.common.IWorldGenerator;
import de.Satrium.CandyLand.reference.Reference;

public class WorldGeneratorMadLands implements IWorldGenerator{

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		if(world.provider.dimensionId == Reference.madLandsID){
			
		}
	}

}
