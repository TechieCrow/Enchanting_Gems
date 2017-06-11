package com.chewabletech.blocks.ore;

import com.chewabletech.init.ModItems;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockOreTurquoise extends BlockOreEnchantingGems
{
    public BlockOreTurquoise()
    {
        super();
        this.setBlockName("enchantinggems.ore.turquoise");
        this.setBlockTextureName("enchantinggems.ore.turquoise");
    }

    public Item getItemDropped(int d, Random rand, int i)
    {
        return ModItems.turquoise;
    }

    public int quantityDropped(Random rand)
    {
        return 1;
    }
}