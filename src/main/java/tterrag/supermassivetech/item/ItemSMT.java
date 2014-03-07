package tterrag.supermassivetech.item;

import tterrag.supermassivetech.SuperMassiveTech;
import tterrag.supermassivetech.lib.Reference;
import net.minecraft.item.Item;

public class ItemSMT extends Item
{
	public ItemSMT(String unlocName, String textureName)
	{
		super();
		
		setCreativeTab(SuperMassiveTech.tabSMT);
		setUnlocalizedName(unlocName);
		setTextureName(Reference.MODID + ":" + textureName);
	}
}