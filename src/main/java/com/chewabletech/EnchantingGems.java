package com.chewabletech;

import com.chewabletech.init.ModBlocks;
import com.chewabletech.init.ModItems;
import com.chewabletech.init.Recipes;
import com.chewabletech.proxy.IProxy;
import com.chewabletech.reference.Reference;
import com.chewabletech.utility.LogHelper;
import com.chewabletech.world.gen.Oregen;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class EnchantingGems
{
    @Mod.Instance(Reference.MOD_ID)
    public static EnchantingGems instance;

    public static Oregen Oregen = new Oregen();

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS, modId = Reference.MOD_ID)
    public static IProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ModBlocks.init();
        ModItems.init();
        GameRegistry.registerWorldGenerator(new Oregen(), 0);
        LogHelper.info("Pre-Initialization Completed!");
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        Recipes.init();
        LogHelper.info("Initialization Completed!");
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("Post Initialization Completed!");
    }
}