package com.chewabletech.blocks;

import com.chewabletech.creativetabs.CreativeTabEnchantingGems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockEnchantingGems extends Block
{
    public BlockEnchantingGems(Material material)
    {
        super(material);
        this.setCreativeTab(CreativeTabEnchantingGems.tabEnchantingGems);
    }

    public BlockEnchantingGems()
    {
        this(Material.iron);
    }
}