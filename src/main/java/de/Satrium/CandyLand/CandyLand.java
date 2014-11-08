package de.Satrium.CandyLand;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.DimensionManager;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import de.Satrium.CandyLand.dimension.madLands.WorldProviderMadLands;
import de.Satrium.CandyLand.dimension.madLands.biomes.BiomeGenMadLandPlains;
import de.Satrium.CandyLand.init.ModBlocks;
import de.Satrium.CandyLand.init.ModItems;
import de.Satrium.CandyLand.proxy.IProxy;
import de.Satrium.CandyLand.reference.Reference;

@Mod(modid=Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.MOD_VERSION, acceptedMinecraftVersions=Reference.MC_VERSION)
public class CandyLand {

	
	public static BiomeGenBase madLandPlains = new BiomeGenMadLandPlains(200);
	
	@Mod.Instance(Reference.MOD_ID)
	public static CandyLand instance;
	
	@SidedProxy(clientSide=Reference.CLIENT_PROXY_CLASS, serverSide=Reference.SERVER_PROXY_CLASS)
	public static IProxy proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event){
		ModBlocks.registerBlocks();
		ModItems.registerItems();
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event){
		DimensionManager.registerProviderType(Reference.madLandsID, WorldProviderMadLands.class, false);
		DimensionManager.registerDimension(Reference.madLandsID, Reference.madLandsID);
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
	}
}
