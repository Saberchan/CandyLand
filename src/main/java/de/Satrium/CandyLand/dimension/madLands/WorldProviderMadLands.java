package de.Satrium.CandyLand.dimension.madLands;

import de.Satrium.CandyLand.CandyLand;
import de.Satrium.CandyLand.reference.Reference;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.WorldChunkManager;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.ChunkProviderGenerate;

public class WorldProviderMadLands extends WorldProvider{

	@Override
	public String getDimensionName() {		
		return "MadLands";
	}
	
	@Override
	public IChunkProvider createChunkGenerator() {		
		return new ChunkProviderMadLands(this.worldObj, this.worldObj.getSeed(), false);
	}	
	
	@Override
	protected void registerWorldChunkManager() {
		this.worldChunkMgr = new WorldChunkManagerMadLands(worldObj);
		this.dimensionId = Reference.madLandsID;
	}

	@Override
	public boolean canBlockFreeze(int x, int y, int z, boolean byWater) {
		return false;
	}
	
	@Override
	public boolean canRespawnHere() {
		return false;
	}
	
	@Override
	public boolean canDoRainSnowIce(Chunk chunk) {
		return false;
	}	
}
