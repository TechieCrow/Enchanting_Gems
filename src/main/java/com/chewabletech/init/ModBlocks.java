package com.chewabletech.init;

import com.chewabletech.blocks.*;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks
{
    // Ores
    public static final BlockEnchantingGems oreonyx = new BlockOreOnyx();
    public static final BlockEnchantingGems oreopal = new BlockOreOpal();
    public static final BlockEnchantingGems oreruby = new BlockOreRuby();
    public static final BlockEnchantingGems oresapphire = new BlockOreSapphire();
    public static final BlockEnchantingGems oreturquoise = new BlockOreTurquoise();

    // Blocks
    public static final BlockEnchantingGems blockonyx = new BlockOnyx();
    public static final BlockEnchantingGems blockonyxv2 = new BlockOnyxv2();
    public static final BlockEnchantingGems blockopal = new BlockOpal();
    public static final BlockEnchantingGems blockruby = new BlockRuby();
    public static final BlockEnchantingGems blocksapphire = new BlockSapphire();
    public static final BlockEnchantingGems blockturquoise = new BlockTurquoise();
    public static final BlockEnchantingGems blockturquoisev2 = new BlockTurquoisev2();
    public static final BlockEnchantingGems blockbloodstone = new BlockBloodstone();
    public static final BlockEnchantingGems blockbloodstonev2 = new BlockBloodstonev2();
    public static final BlockEnchantingGems blockaquamarine = new BlockAquamarine();
    public static final BlockEnchantingGems blockjade = new BlockJade();
    public static final BlockEnchantingGems blockpearl = new BlockPearl();

    public static void init()
    {
        // Ores
        GameRegistry.registerBlock(oreonyx, "onyx ore");
        GameRegistry.registerBlock(oreopal, "opal ore");
        GameRegistry.registerBlock(oreruby, "ruby ore");
        GameRegistry.registerBlock(oresapphire, "sapphire ore");
        GameRegistry.registerBlock(oreturquoise, "turquoise ore");

        // Blocks
        GameRegistry.registerBlock(blockonyx, "onyx block");
        GameRegistry.registerBlock(blockonyxv2, "onyx block v2");
        GameRegistry.registerBlock(blockopal, "opal block");
        GameRegistry.registerBlock(blockruby, "ruby block");
        GameRegistry.registerBlock(blocksapphire, "sapphire block");
        GameRegistry.registerBlock(blockturquoise, "turquoise block");
        GameRegistry.registerBlock(blockturquoisev2, "turquoise block v2");
        GameRegistry.registerBlock(blockbloodstone, "bloodstone block");
        GameRegistry.registerBlock(blockbloodstonev2, "bloodstone block v2");
        GameRegistry.registerBlock(blockaquamarine, "aquamarine block");
        GameRegistry.registerBlock(blockjade, "jade block");
        GameRegistry.registerBlock(blockpearl, "pearl block");
    }
}