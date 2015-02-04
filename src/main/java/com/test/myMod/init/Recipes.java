package com.test.myMod.init;


import com.test.myMod.reference.Names;
import com.test.myMod.reference.Reference;
import cpw.mods.fml.common.event.FMLInterModComms;
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

        String boneb_recipe =
                "<recipeGroup name=\"BlockBone\">" +
                        "<recipe name=\"BlockBone\" energyCost=\"100\">" +
                        "<input>" +
                        "<itemStack modID=\"" + Reference.MOD_ID + "\" itemName=\""+ Names.Blocks.BONE_BLOCK +"\"/>" +
                        "</input>" +
                        "<output>" +
                        "<itemStack modID=\"minecraft\" itemName=\"dye\" itemMeta=\"15\" number=\"6\" />" +
                        "</output>" +
                        "</recipe>" +
                        "</recipeGroup>";
        FMLInterModComms.sendMessage("EnderIO", "recipe:sagmill", boneb_recipe);


    }
}
