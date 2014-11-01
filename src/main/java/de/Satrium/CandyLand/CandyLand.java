package de.Satrium.CandyLand;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import de.Satrium.CandyLand.block.BlockCL;
import de.Satrium.CandyLand.block.BlockDarkGrass;
import de.Satrium.CandyLand.block.TestBlock;
import de.Satrium.CandyLand.init.ModBlocks;
import de.Satrium.CandyLand.init.ModItems;
import de.Satrium.CandyLand.proxy.IProxy;
import de.Satrium.CandyLand.reference.Reference;

@Mod(modid=Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.MOD_VERSION, acceptedMinecraftVersions=Reference.MC_VERSION)
public class CandyLand {

	
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

	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
	}
}
