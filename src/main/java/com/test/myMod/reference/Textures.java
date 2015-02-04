package com.test.myMod.reference;

import com.test.myMod.utility.ResourceLocationHelper;
import net.minecraft.util.ResourceLocation;

public final class Textures
{
    public static final String RESOURCE_PREFIX = Reference.MOD_ID.toLowerCase() + ":";

    public static final class Armor
    {
        private static final String ARMOR_SHEET_LOCATION = "textures/armor/";
    }
    public static final class Model
    {
        private static final String MODEL_TEXTURE_LOCATION = "textures/models/";
      //  public static final ResourceLocation CALCINATOR_IDLE = ResourceLocationHelper.getResourceLocation(MODEL_TEXTURE_LOCATION + "calcinator_idle.png");
    }
    public static final class Gui
    {
        private static final String GUI_SHEET_LOCATION = "textures/gui/";
    }
    public static final class Effect
    {
        private static final String EFFECTS_LOCATION = "textures/effects/";
    }
    public static final class Glyph
    {
        private static final String SYMBOL_TEXTURE_LOCATION = "textures/glyphs/";
    }
}
