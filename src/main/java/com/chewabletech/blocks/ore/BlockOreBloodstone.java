package com.chewabletech.blocks.ore;

import com.chewabletech.init.ModItems;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockOreBloodstone extends BlockOreEnchantingGems
{
    public BlockOreBloodstone()
    {
        super();
        this.setBlockName("enchantinggems.ore.bloodstone");
        this.setBlockTextureName("enchantinggems.ore.bloodstone");
    }

    public Item getItemDropped(int d, Random rand, int i)
    {
        return ModItems.bloodstone;
    }

    public int quantityDropped(Random rand)
    {
        return 1;
    }
}