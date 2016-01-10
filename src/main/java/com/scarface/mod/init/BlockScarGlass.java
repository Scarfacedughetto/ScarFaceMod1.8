package com.scarface.mod.init;

import com.scarface.mod.ModScarface;
import com.scarface.mod.Reference;
import com.scarface.mod.blocks.BlocksGlass;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class BlockScarGlass extends BlocksGlass
{
    public BlockScarGlass(Material p_i45408_1_, boolean p_i45408_2_)
    {
        super(p_i45408_1_, p_i45408_2_);
        // TODO Auto-generated constructor stub
    }

    public static Block BlockScarGlass;
    
    public static void init()
    {
        BlockScarGlass = new BlocksGlass(Material.glass, true).setUnlocalizedName("BlockScarGlass").setCreativeTab(ModScarface.tabScarface);
    }
    
    public static void register()
    {
        GameRegistry.registerBlock(BlockScarGlass, BlockScarGlass.getUnlocalizedName().substring(5));
        
        }
    
    public static void registerRenders()
    {
        registerRender(BlockScarGlass);
    }
    
    public static void registerRender(Block block)
    {
        Item item = Item.getItemFromBlock(block);
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID+ ":" + item.getUnlocalizedName().substring(5), "inventory"));  
    }
}
