package com.chewabletech.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class Recipes
{
    public static void init()
    {
        ItemStack enchantedsword = new ItemStack(Items.diamond_sword);
        enchantedsword.addEnchantment(Enchantment.sharpness, 1);

        GameRegistry.addShapelessRecipe((enchantedsword), new ItemStack(ModItems.sapphire, 1), Items.diamond_sword);

        // Block Recipes
        GameRegistry.addRecipe(new ItemStack(ModBlocks.blockaquamarine, 1), "III", "III", "III", 'I', ModItems.aquamarine);
        GameRegistry.addRecipe(new ItemStack(ModBlocks.blockbloodstone, 1), "III", "III", "III", 'I', ModItems.bloodstone);
        GameRegistry.addRecipe(new ItemStack(ModBlocks.blockbloodstonev2, 1), "III", "III", "III", 'I', ModItems.bloodstone);
        GameRegistry.addRecipe(new ItemStack(ModBlocks.blockjade, 1), "III", "III", "III", 'I', ModItems.jade);
        GameRegistry.addRecipe(new ItemStack(ModBlocks.blockonyx, 1), "III", "III", "III", 'I', ModItems.onyx);
        GameRegistry.addRecipe(new ItemStack(ModBlocks.blockonyxv2, 1), "III", "III", "III", 'I', ModItems.onyx);
        GameRegistry.addRecipe(new ItemStack(ModBlocks.blockopal, 1), "III", "III", "III", 'I', ModItems.opal);
        GameRegistry.addRecipe(new ItemStack(ModBlocks.blockpearl, 1), "III", "III", "III", 'I', ModItems.pearl);
        GameRegistry.addRecipe(new ItemStack(ModBlocks.blockruby, 1), "III", "III", "III", 'I', ModItems.ruby);
        GameRegistry.addRecipe(new ItemStack(ModBlocks.blocksapphire, 1), "III", "III", "III", 'I', ModItems.sapphire);
        GameRegistry.addRecipe(new ItemStack(ModBlocks.blockturquoise, 1), "III", "III", "III", 'I', ModItems.turquoise);
        GameRegistry.addRecipe(new ItemStack(ModBlocks.blockturquoisev2, 1), "III", "III", "III", 'I', ModItems.turquoise);
    }
}