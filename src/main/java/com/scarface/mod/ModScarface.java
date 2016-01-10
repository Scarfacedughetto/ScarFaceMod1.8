package com.scarface.mod;

import com.scarface.mod.init.BlockDollars;
import com.scarface.mod.init.BlockScarGlass;
import com.scarface.mod.init.ItemCoin;
import com.scarface.mod.proxy.CommonProxy;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)

public class ModScarface
{
    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;
    
   public static CreativeTabs tabScarface = new CreativeTabs("tabScarface"){
       @Override
       public Item getTabIconItem()
       {
           return ItemCoin.itemCoin;
       }

       @SideOnly(Side.CLIENT)
       public int func_151243_f()
       {
            return 0; // mettez ici votre metadata
       }
   };
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        
        ItemCoin.init();
        ItemCoin.register();
        BlockDollars.init();
        BlockDollars.register();
        BlockScarGlass.init();
        BlockScarGlass.register();
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.registerRenders();
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        
    }
}
