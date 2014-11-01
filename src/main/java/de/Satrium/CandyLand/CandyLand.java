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
import de.Satrium.CandyLand.proxy.IProxy;
import de.Satrium.CandyLand.reference.Reference;

@Mod(modid=Reference.MOD_ID, name="Candy Land", version="0.1-Aplha", acceptedMinecraftVersions="1.7.10")
public class CandyLand {

	public static final BlockCL testBlock = new TestBlock();
	public static final BlockCL darkGrass = new BlockDarkGrass();
	
	@Mod.Instance(Reference.MOD_ID)
	public static CandyLand instance;
	
	@SidedProxy(clientSide=Reference.CLIENT_PROXY_CLASS, serverSide=Reference.SERVER_PROXY_CLASS)
	public static IProxy proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event){
		GameRegistry.registerBlock(testBlock, "testBlock");
		GameRegistry.registerBlock(darkGrass, "darkGrass");
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event){

	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
	}
}
