package com.chewabletech.init;

import com.chewabletech.blocks.block.*;
import com.chewabletech.blocks.ore.*;
import com.chewabletech.blocks.polished.BlockPolishedBloodstone;
import com.chewabletech.blocks.polished.BlockPolishedEnchantingGems;
import com.chewabletech.blocks.polished.BlockPolishedOnyx;
import com.chewabletech.blocks.polished.BlockPolishedTurquoise;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks
{
    // Ores
    public static final BlockOreEnchantingGems oreonyx = new BlockOreOnyx();
    public static final BlockOreEnchantingGems oreopal = new BlockOreOpal();
    public static final BlockOreEnchantingGems oreruby = new BlockOreRuby();
    public static final BlockOreEnchantingGems oresapphire = new BlockOreSapphire();
    public static final BlockOreEnchantingGems oreturquoise = new BlockOreTurquoise();
    public static final BlockOreEnchantingGems orejade = new BlockOreJade();
    public static final BlockOreEnchantingGems orebloodstone = new BlockOreBloodstone();
    public static final BlockOreEnchantingGems oretigerseye = new BlockOreTigerseye();

    // Blocks
    public static final BlockEnchantingGems blockonyx = new BlockOnyx();
    public static final BlockEnchantingGems blockopal = new BlockOpal();
    public static final BlockEnchantingGems blockruby = new BlockRuby();
    public static final BlockEnchantingGems blocksapphire = new BlockSapphire();
    public static final BlockEnchantingGems blockturquoise = new BlockTurquoise();
    public static final BlockEnchantingGems blockbloodstone = new BlockBloodstone();
    public static final BlockEnchantingGems blockaquamarine = new BlockAquamarine();
    public static final BlockEnchantingGems blockjade = new BlockJade();
    public static final BlockEnchantingGems blockpearl = new BlockPearl();
    public static final BlockEnchantingGems blocktigerseye = new BlockTigersEye();

    // Polished
    public static final BlockPolishedEnchantingGems blockpolishedonyx = new BlockPolishedOnyx();
    public static final BlockPolishedEnchantingGems blockpolishedturquoise = new BlockPolishedTurquoise();
    public static final BlockPolishedEnchantingGems blockpolishedbloodstone = new BlockPolishedBloodstone();

    public static void init()
    {
        // Ores
        GameRegistry.registerBlock(orebloodstone, "bloodstone ore");
        GameRegistry.registerBlock(orejade, "jade ore");
        GameRegistry.registerBlock(oreonyx, "onyx ore");
        GameRegistry.registerBlock(oreopal, "opal ore");
        GameRegistry.registerBlock(oreruby, "ruby ore");
        GameRegistry.registerBlock(oresapphire, "sapphire ore");
        GameRegistry.registerBlock(oretigerseye, "tigers eye ore");
        GameRegistry.registerBlock(oreturquoise, "turquoise ore");

        // Blocks
        GameRegistry.registerBlock(blockaquamarine, "aquamarine block");
        GameRegistry.registerBlock(blockbloodstone, "bloodstone block");
        GameRegistry.registerBlock(blockjade, "jade block");
        GameRegistry.registerBlock(blockonyx, "onyx block");
        GameRegistry.registerBlock(blockopal, "opal block");
        GameRegistry.registerBlock(blockpearl, "pearl block");
        GameRegistry.registerBlock(blockruby, "ruby block");
        GameRegistry.registerBlock(blocksapphire, "sapphire block");
        GameRegistry.registerBlock(blocktigerseye, "tigers eye block");
        GameRegistry.registerBlock(blockturquoise, "turquoise block");

        // Polished
        GameRegistry.registerBlock(blockpolishedbloodstone, "polished bloodstone block");
        GameRegistry.registerBlock(blockpolishedonyx, "polished onyx block");
        GameRegistry.registerBlock(blockpolishedturquoise, "polished turquoise block");
    }
}