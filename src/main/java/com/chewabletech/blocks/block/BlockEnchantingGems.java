package com.chewabletech.blocks.block;

import com.chewabletech.creativetabs.CreativeTabEnchantingGems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockEnchantingGems extends Block
{
    public BlockEnchantingGems(Material material)
    {
        super(material);
        this.setStepSound(soundTypeStone);
        this.setHarvestLevel("pickaxe", 2);
        this.setHardness(10.0f);
        this.setResistance(20.0f);
        this.setCreativeTab(CreativeTabEnchantingGems.tabEnchantingGems);
    }

    public BlockEnchantingGems()
    {
        this(Material.iron);
    }
}