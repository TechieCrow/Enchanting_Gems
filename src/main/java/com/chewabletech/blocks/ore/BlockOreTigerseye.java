package com.chewabletech.blocks.ore;

import com.chewabletech.init.ModItems;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockOreTigerseye extends BlockOreEnchantingGems
{
    public BlockOreTigerseye()
    {
        super();
        this.setBlockName("enchantinggems.ore.tigerseye");
        this.setBlockTextureName("enchantinggems.ore.tigerseye");
    }

    public Item getItemDropped(int d, Random rand, int i)
    {
        return ModItems.tigerseye;
    }

    public int quantityDropped(Random rand)
    {
        return 1;
    }
}
