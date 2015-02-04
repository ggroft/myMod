package com.test.myMod.client.gui;


import com.test.myMod.handler.ConfigurationHandler;
import com.test.myMod.reference.Reference;
import cpw.mods.fml.client.config.GuiConfig;
import cpw.mods.fml.client.config.IConfigElement;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import java.util.ArrayList;
import java.util.List;




public class ModGuiConfig extends GuiConfig
{
    static List<IConfigElement> list = null;

    static
    {
        addToConfigGui(new ConfigElement(ConfigurationHandler.configuration.getCategory(Reference.CATEGORY_FORGECRAFT)).getChildElements());
        addToConfigGui(new ConfigElement(ConfigurationHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements());
    }

    public ModGuiConfig(GuiScreen guiScreen)
    {
        this(guiScreen, list, Reference.MOD_ID, false, false, Reference.CONFIG_MAIN_GUI_NAME, false);
    }

    private ModGuiConfig(GuiScreen guiScreen, List<IConfigElement> configElements, String modId, boolean modifyOnFly, boolean requireWorldRestart,
                         String guiName, boolean foo)
    {
        super(guiScreen, configElements, modId, modifyOnFly, requireWorldRestart, guiName);
    }

    private static void addToConfigGui(List<IConfigElement> configElements) {
        if(list == null){
            list = new ArrayList<IConfigElement>();
        }
        for (int i = 0; i < configElements.size(); i++) {
            list.add(configElements.get(i));
        }
    }
}
