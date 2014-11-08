package de.Satrium.CandyLand.block;

import net.minecraft.block.BlockPortal;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.World;
import de.Satrium.CandyLand.dimension.TeleporterMadLands;
import de.Satrium.CandyLand.reference.Reference;

public class BlockMadLandsPortal extends BlockPortal{

	public BlockMadLandsPortal() {
		//this.setCreativeTab(Reference.CREATIVE_TAB);
		this.setBlockName("madLandsPortal");
	}
	
	
	@Override
	public String getUnlocalizedName() {		
		return String.format("tile.%s%s",Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}
	
	/*@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister){
		blockIcon = iconRegister.registerIcon(getUnwrappedUnlocalizedName(this.getUnlocalizedName()));
	}*/
	
	public String getUnwrappedUnlocalizedName(String unlocalizedName){
		return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	}
	
	@Override
	public void onEntityCollidedWithBlock(World world, int x,int y, int z, Entity entity) {
		if(entity.ridingEntity == null && entity.riddenByEntity == null && entity instanceof EntityPlayerMP){
			EntityPlayerMP player = (EntityPlayerMP)entity;
			MinecraftServer server = MinecraftServer.getServer();
			if(player.timeUntilPortal > 0){
				player.timeUntilPortal = 10;
			}else if(player.dimension != Reference.madLandsID){
				player.timeUntilPortal = 10;
				player.mcServer.getConfigurationManager().transferPlayerToDimension(player, Reference.madLandsID, new TeleporterMadLands(server.worldServerForDimension(Reference.madLandsID)));
			}else{
				player.mcServer.getConfigurationManager().transferPlayerToDimension(player, Reference.madLandsID, new TeleporterMadLands(server.worldServerForDimension(0)));
			}
		}
	}
	
	
	
}
