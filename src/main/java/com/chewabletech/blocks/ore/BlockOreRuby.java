package com.chewabletech.blocks.ore;

import com.chewabletech.init.ModItems;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockOreRuby extends BlockOreEnchantingGems
{
    public BlockOreRuby()
    {
        super();
        this.setBlockName("enchantinggems.ore.ruby");
        this.setBlockTextureName("enchantinggems.ore.ruby");
    }

    public Item getItemDropped(int d, Random rand, int i)
    {
        return ModItems.ruby;
    }

    public int quantityDropped(Random rand)
    {
        return 1;
    }
}
