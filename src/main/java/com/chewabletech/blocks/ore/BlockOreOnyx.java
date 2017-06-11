package com.chewabletech.blocks.ore;

import com.chewabletech.init.ModItems;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockOreOnyx extends BlockOreEnchantingGems
{
    public BlockOreOnyx()
    {
        super();
        this.setBlockName("enchantinggems.ore.onyx");
        this.setBlockTextureName("enchantinggems.ore.onyx");
    }

    public Item getItemDropped(int d, Random rand, int i)
    {
        return ModItems.onyx;
    }

    public int quantityDropped(Random rand)
    {
        return 1;
    }
}