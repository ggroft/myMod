package com.test.myMod.init;


import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class Recipes
{
    public static void init()
    {


        GameRegistry.addRecipe(new ItemStack(ModItems.BoneSword),
                " b ", " b ", " s ",
                'b', new ItemStack(Items.dye,1,15),'s', new ItemStack(Items.stick));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.dye,9,15),
                new ItemStack(ModeBlocks.BlockBone)));

        GameRegistry.addRecipe(new ItemStack(ModeBlocks.BlockBone),
                "bbb", "bbb", "bbb",
                'b', new ItemStack(Items.dye,1,15));
    }
}
