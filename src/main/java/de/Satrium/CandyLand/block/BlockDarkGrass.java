package de.Satrium.CandyLand.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class BlockDarkGrass extends BlockCL{

	public IIcon[] icons = new IIcon[3];
	
	public BlockDarkGrass() {
		super(Material.grass);
		this.setBlockName("darkGrass");
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		icons[0] = iconRegister.registerIcon("grass_top");
		icons[1] = iconRegister.registerIcon("grass_side");
		icons[2] = iconRegister.registerIcon("dirt");
	}
	
	@Override
	public IIcon getIcon(int side, int meta) {
		switch(side){
		case 1:
			return icons[0];
		case 0:
			return icons[2];
		default:
			return icons[1];
		}
	}
}
