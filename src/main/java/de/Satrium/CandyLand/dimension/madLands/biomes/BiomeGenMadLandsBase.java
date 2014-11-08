package de.Satrium.CandyLand.dimension.madLands.biomes;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenMadLandsBase extends BiomeGenBase{

	public BiomeGenMadLandsBase(int id) {
		super(id);		
	}
	
	@Override
	public void genTerrainBlocks(World world, Random random, Block[] blocks, byte[] byteArray, int x,int z, double p_150573_7_) {
		 boolean flag = true;
	        Block block = this.topBlock;
	        byte b0 = (byte)(this.field_150604_aj & 255);
	        Block block1 = this.fillerBlock;
	        int k = -1;
	        int l = (int)(p_150573_7_ / 3.0D + 3.0D + random.nextDouble() * 0.25D);
	        int i1 = x & 15;
	        int j1 = z & 15;
	        int k1 = blocks.length / 256;

	        for (int l1 = 255; l1 >= 0; --l1)
	        {
	            int i2 = (j1 * 16 + i1) * k1 + l1;

	            if (l1 <= 0 + random.nextInt(5))
	            {
	            	blocks[i2] = Blocks.bedrock;
	            }
	            else
	            {
	                Block block2 = blocks[i2];

	                if (block2 != null && block2.getMaterial() != Material.air)
	                {
	                    if (block2 == Blocks.glowstone)
	                    {
	                        if (k == -1)
	                        {
	                            if (l <= 0)
	                            {
	                                block = null;
	                                b0 = 0;
	                                block1 = Blocks.glowstone;
	                            }
	                            else if (l1 >= 59 && l1 <= 64)
	                            {
	                                block = this.topBlock;
	                                b0 = (byte)(this.field_150604_aj & 255);
	                                block1 = this.fillerBlock;
	                            }

	                            if (l1 < 63 && (block == null || block.getMaterial() == Material.air))
	                            {
	                                if (this.getFloatTemperature(x, l1, z) < 0.15F)
	                                {
	                                    block = Blocks.ice;
	                                    b0 = 0;
	                                }
	                                else
	                                {
	                                    block = Blocks.water;
	                                    b0 = 0;
	                                }
	                            }

	                            k = l;

	                            if (l1 >= 62)
	                            {
	                            	blocks[i2] = block;
	                            	byteArray[i2] = b0;
	                            }
	                            else if (l1 < 56 - l)
	                            {
	                                block = null;
	                                block1 = Blocks.glowstone;
	                                blocks[i2] = Blocks.gravel;
	                            }
	                            else
	                            {
	                            	blocks[i2] = block1;
	                            }
	                        }
	                        else if (k > 0)
	                        {
	                            --k;
	                            blocks[i2] = block1;

	                            if (k == 0 && block1 == Blocks.sand)
	                            {
	                                k = random.nextInt(4) + Math.max(0, l1 - 63);
	                                block1 = Blocks.sandstone;
	                            }
	                        }
	                    }
	                }
	                else
	                {
	                    k = -1;
	                }
	            }
	        }
	}

}
