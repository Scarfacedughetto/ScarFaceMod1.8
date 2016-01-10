package com.scarface.mod.init;

import com.scarface.mod.ModScarface;
import com.scarface.mod.Reference;
import com.scarface.mod.blocks.BlocksMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockDollars
{
    public static Block blockDollars;
    
    public static void init()
    {
        blockDollars = new BlocksMod(Material.rock).setUnlocalizedName("blockDollars").setCreativeTab(ModScarface.tabScarface);
    }
    
    public static void register()
    {
        GameRegistry.registerBlock(blockDollars, blockDollars.getUnlocalizedName().substring(5));
        
        }
    
    public static void registerRenders()
    {
        registerRender(blockDollars);
    }
    
    public static void registerRender(Block block)
    {
        Item item = Item.getItemFromBlock(block);
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID+ ":" + item.getUnlocalizedName().substring(5), "inventory"));  
    }
}
