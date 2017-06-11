package com.chewabletech.blocks.polished;

import com.chewabletech.creativetabs.CreativeTabEnchantingGems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockPolishedEnchantingGems extends Block
{
    public BlockPolishedEnchantingGems(Material material)
    {
        super(material);
        this.setStepSound(soundTypeStone);
        this.setHarvestLevel("pickaxe", 2);
        this.setHardness(10.0f);
        this.setResistance(20.0f);
        this.setCreativeTab(CreativeTabEnchantingGems.tabEnchantingGems);
    }

    public BlockPolishedEnchantingGems()
    {
        this(Material.iron);
    }
}