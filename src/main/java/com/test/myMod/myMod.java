package com.test.myMod;

import com.test.myMod.handler.ConfigurationHandler;
import com.test.myMod.init.*;
import com.test.myMod.proxy.IProxy;
import com.test.myMod.reference.Reference;
import com.test.myMod.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;


@Mod(modid=Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)

public class myMod
{
    @Mod.Instance(Reference.MOD_ID)
    public static myMod instance;

    @SidedProxy(clientSide =Reference.CLIENT_PROXY_CLASS, serverSide =Reference.SERVER_PROXY_CLASS )
    public static IProxy proxy;

    public void serverLoad(FMLServerStartingEvent event){}
    public void registerRenderers(){}

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        LogHelper.info("Pre-initialization complete!");

        ModItems.init();
        ModeBlocks.init();
        OreGen.init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        Recipes.init();
        HutGen.init();
        LogHelper.info("Initialization complete!");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("Post-initialization complete!");

     //   for (String oreName : OreDictionary.getOreNames())
     //   {
     //       LogHelper.info(oreName);
     //   }

    }


}
