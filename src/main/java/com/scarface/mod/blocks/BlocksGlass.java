package com.scarface.mod.blocks;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBreakable;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlocksGlass extends BlockBreakable
{
   private static final String __OBFID = "CL_00000249";

   public BlocksGlass(Material p_i45408_1_, boolean p_i45408_2_)
   {
       super(p_i45408_1_, p_i45408_2_);
       this.setCreativeTab(CreativeTabs.tabBlock);
   }
 
       public int quantityDropped(Random random)
   {
       return 0;
   }

   @SideOnly(Side.CLIENT)
   public EnumWorldBlockLayer getBlockLayer()
   {
       return EnumWorldBlockLayer.CUTOUT;
   }

   public boolean isFullCube()
   {
       return false;
   }

   protected boolean canSilkHarvest()
   {
       return true;
   }
}