package de.Satrium.CandyLand.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import de.Satrium.CandyLand.reference.Reference;

public class BlockCL extends Block{

	public BlockCL(Material material) {
		super(material);
		this.setCreativeTab(Reference.CREATIVE_TAB);
	}

	public BlockCL(){
		this(Material.rock);
	}
	
	@Override
	public String getUnlocalizedName() {		
		return String.format("tile.%s%s",Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister){
		blockIcon = iconRegister.registerIcon(getUnwrappedUnlocalizedName(this.getUnlocalizedName()));
	}
	
	public String getUnwrappedUnlocalizedName(String unlocalizedName){
		return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	}
}
