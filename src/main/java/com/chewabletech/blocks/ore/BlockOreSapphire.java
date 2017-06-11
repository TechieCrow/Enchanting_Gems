package com.chewabletech.blocks.ore;

import com.chewabletech.init.ModItems;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockOreSapphire extends BlockOreEnchantingGems
{
    public BlockOreSapphire()
    {
        super();
        this.setBlockName("enchantinggems.ore.sapphire");
        this.setBlockTextureName("enchantinggems.ore.sapphire");
    }

    public Item getItemDropped(int d, Random rand, int i)
    {
        return ModItems.sapphire;
    }

    public int quantityDropped(Random rand)
    {
        return 1;
    }
}