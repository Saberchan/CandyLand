package de.Satrium.CandyLand.reference;

import de.Satrium.CandyLand.CandyLand;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class Reference {
	public static final String MOD_ID = "candyland";
	public static final String MOD_NAME = "Candy Land";
	public static final String MOD_VERSION = "0.1-Alpha";
	public static final String MC_VERSION = "1.7.10";
	
	public static final String CLIENT_PROXY_CLASS = "de.Satrium.CandyLand.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "de.Satrium.CandyLand.proxy.ServerProxy";
	
	public static final CreativeTabs CREATIVE_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()) {		
		@Override
		public Item getTabIconItem() {			
			return Items.blaze_rod;
		}
	};
}
