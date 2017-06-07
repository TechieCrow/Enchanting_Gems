package com.chewabletech.init;

import com.chewabletech.items.*;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
    public static final ItemEnchantingGems sapphire = new ItemSapphire();
    public static final ItemEnchantingGems ruby = new ItemRuby();
    public static final ItemEnchantingGems pearl = new ItemPearl();
    public static final ItemEnchantingGems amber = new ItemAmber();
    public static final ItemEnchantingGems amberv2 = new ItemAmberv2();
    public static final ItemEnchantingGems amethyst = new ItemAmethyst();
    public static final ItemEnchantingGems turquoise = new ItemTurquoise();
    public static final ItemEnchantingGems opal = new ItemOpal();
    public static final ItemEnchantingGems jade = new ItemJade();
    public static final ItemEnchantingGems onyx = new ItemOnyx();
    public static final ItemEnchantingGems bloodstone = new ItemBloodstone();
    public static final ItemEnchantingGems moonstone = new ItemMoonstone();
    public static final ItemEnchantingGems tigerseye = new ItemTigersEye();
    public static final ItemEnchantingGems aquamarine = new ItemAquamarine();

    public static void init()
    {
        GameRegistry.registerItem(sapphire, "sapphire");
        GameRegistry.registerItem(ruby, "ruby");
        GameRegistry.registerItem(pearl, "pearl");
        GameRegistry.registerItem(amber, "amber");
        GameRegistry.registerItem(amberv2, "amber v2");
        GameRegistry.registerItem(amethyst, "amethyst");
        GameRegistry.registerItem(turquoise, "turquoise");
        GameRegistry.registerItem(opal, "opal");
        GameRegistry.registerItem(jade, "jade");
        GameRegistry.registerItem(onyx, "onyx");
        GameRegistry.registerItem(bloodstone, "bloodstone");
        GameRegistry.registerItem(moonstone, "moonstone");
        GameRegistry.registerItem(tigerseye, "tigerseye");
        GameRegistry.registerItem(aquamarine, "aquamarine");
    }
}