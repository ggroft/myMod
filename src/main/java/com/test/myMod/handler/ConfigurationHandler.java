package com.test.myMod.handler;



import com.test.myMod.reference.Config;
import com.test.myMod.reference.Reference;
import com.test.myMod.utility.LogHelper;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler

{
    public static Configuration configuration;
    public static boolean configValue=false;
    public static boolean configValue2=false;
    public static void init(File configFile)
    {
        if (configuration == null)
        {
            configuration = new Configuration(configFile);
            loadConfiguration();
        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if(event.modID.equalsIgnoreCase(Reference.MOD_ID))
        {
            loadConfiguration();
        }
    }



    private static void loadConfiguration()
    {
        try {
            configuration.load();
            Config.CONFIG_VALUE1 = configuration.get(Configuration.CATEGORY_GENERAL, "Config value 1", 2, "Configure value nr1").getInt(2);
            Config.CONFIG_VALUE2 = (float) configuration.get(Reference.CATEGORY_FORGECRAFT, "Config value 2", 0.5f, "Configure value nr2").getDouble(0.5f);
            Config.CONFIG_VALUE3 = configuration.get(Reference.CATEGORY_FORGECRAFT, "Config value 3", 10, "Configure value nr3").getInt(10);
            Config.CONFIG_VALUE4 = (float) configuration.get(Configuration.CATEGORY_GENERAL, "Config value 4", 4.0f, "Configure value nr4").getDouble(4.0f);
        } catch (Exception e) {
            LogHelper.error(e);
        } finally {
            if (configuration.hasChanged()) {
                configuration.save();
            }
        }
    }

}



