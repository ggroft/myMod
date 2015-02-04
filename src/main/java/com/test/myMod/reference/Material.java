package com.test.myMod.reference;

        import net.minecraft.item.Item;
        import net.minecraft.item.ItemArmor;
        import net.minecraftforge.common.util.EnumHelper;

public class Material
{
    public static final class Tools
    {
        public static final Item.ToolMaterial BONE_MATTER = EnumHelper.addToolMaterial(Names.Materials.BONE_MATTER, 3, 0, 14f, 3f, 0);
    }
    public static final class Armor
    {
        public static final ItemArmor.ArmorMaterial BONE_MATTER = EnumHelper.addArmorMaterial(Names.Materials.BONE_MATTER, 0, new int[]{3, 8, 6, 3}, 0);
    }


}