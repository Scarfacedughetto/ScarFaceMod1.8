package com.scarface.mod.proxy;

import com.scarface.mod.init.BlockDollars;

import com.scarface.mod.init.ItemCoin;
import com.scarface.mod.init.BlockScarGlass;


public class ClientProxy extends CommonProxy
{
    @Override
    public void registerRenders()
    {
        BlockScarGlass.registerRenders();
        ItemCoin.registerRenders();
        BlockDollars.registerRenders();
    }

}
