package com.chewabletech.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

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
        GameRegistry.addRecipe(new ItemStack(ModBlocks.blockjade, 1), "III", "III", "III", 'I', ModItems.jade);
        GameRegistry.addRecipe(new ItemStack(ModBlocks.blockonyx, 1), "III", "III", "III", 'I', ModItems.onyx);
        GameRegistry.addRecipe(new ItemStack(ModBlocks.blockopal, 1), "III", "III", "III", 'I', ModItems.opal);
        GameRegistry.addRecipe(new ItemStack(ModBlocks.blockpearl, 1), "III", "III", "III", 'I', ModItems.pearl);
        GameRegistry.addRecipe(new ItemStack(ModBlocks.blockruby, 1), "III", "III", "III", 'I', ModItems.ruby);
        GameRegistry.addRecipe(new ItemStack(ModBlocks.blocksapphire, 1), "III", "III", "III", 'I', ModItems.sapphire);
        GameRegistry.addRecipe(new ItemStack(ModBlocks.blocktigerseye, 1), "III", "III", "III", 'I', ModItems.tigerseye);
        GameRegistry.addRecipe(new ItemStack(ModBlocks.blockturquoise, 1), "III", "III", "III", 'I', ModItems.turquoise);

        // Smelting Ore Recipes
//        GameRegistry.addSmelting(ModBlocks.orejade, new ItemStack(ModItems.jade), 0.5F);
//        GameRegistry.addSmelting(ModBlocks.oreonyx, new ItemStack(ModItems.onyx), 0.5F);
//        GameRegistry.addSmelting(ModBlocks.oreopal, new ItemStack(ModItems.opal), 0.5F);
//        GameRegistry.addSmelting(ModBlocks.oreruby, new ItemStack(ModItems.ruby), 0.5F);
//        GameRegistry.addSmelting(ModBlocks.oresapphire, new ItemStack(ModItems.sapphire), 0.5F);
//        GameRegistry.addSmelting(ModBlocks.oreturquoise, new ItemStack(ModItems.turquoise), 0.5F);

        // Smelting Polished Recipes
        GameRegistry.addSmelting(ModBlocks.blockbloodstone, new ItemStack(ModBlocks.blockpolishedbloodstone), 1.0F);
        GameRegistry.addSmelting(ModBlocks.blockonyx, new ItemStack(ModBlocks.blockpolishedonyx), 1.0F);
        GameRegistry.addSmelting(ModBlocks.blockturquoise, new ItemStack(ModBlocks.blockpolishedturquoise), 1.0F);
    }
}