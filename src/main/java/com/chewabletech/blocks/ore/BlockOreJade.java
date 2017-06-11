package com.chewabletech.blocks.ore;

import com.chewabletech.init.ModItems;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockOreJade extends BlockOreEnchantingGems
{
    public BlockOreJade()
    {
        super();
        this.setBlockName("enchantinggems.ore.jade");
        this.setBlockTextureName("enchantinggems.ore.jade");
    }

    public Item getItemDropped(int d, Random rand, int i)
    {
        return ModItems.jade;
    }

    public int quantityDropped(Random rand)
    {
        return 1;
    }
}