package com.scarface.mod.init;

import com.scarface.mod.ModScarface;
import com.scarface.mod.Reference;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemCoin
{
    public static Item itemCoin;
    
    public static void init()
    {
        itemCoin = new Item().setUnlocalizedName("itemCoin").setCreativeTab(ModScarface.tabScarface);
    }
    
    public static void register()
    {
        GameRegistry.registerItem(itemCoin,"itemCoin");    
    }
    
    public static void registerRenders()
    {
        registerRender(itemCoin);
    }
    
    public static void registerRender(Item item)
    {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID+ ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }   
}