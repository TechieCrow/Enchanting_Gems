package com.chewabletech.items.item;

import com.chewabletech.creativetabs.CreativeTabEnchantingGems;
import net.minecraft.item.Item;

public class ItemEnchantingGems extends Item
{
    public ItemEnchantingGems()
    {
        super();
        this.setMaxStackSize(64);
        this.setCreativeTab(CreativeTabEnchantingGems.tabEnchantingGems);
    }
}