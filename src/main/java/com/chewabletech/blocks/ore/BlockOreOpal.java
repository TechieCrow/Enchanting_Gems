package com.chewabletech.blocks.ore;

import com.chewabletech.init.ModItems;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockOreOpal extends BlockOreEnchantingGems
{
    public BlockOreOpal()
    {
        super();
        this.setBlockName("enchantinggems.ore.opal");
        this.setBlockTextureName("enchantinggems.ore.opal");
    }

    public Item getItemDropped(int d, Random rand, int i)
    {
        return ModItems.opal;
    }

    public int quantityDropped(Random rand)
    {
        return 1;
    }
}