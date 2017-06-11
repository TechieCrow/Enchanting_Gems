package com.chewabletech.utility;

import com.chewabletech.init.ModItems;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent;

public class CustomDrops
{
    public static double rand;
    public static double randItem;

    @SubscribeEvent
    public void onDrops(BlockEvent.HarvestDropsEvent event)
    {
        rand = Math.random();

//        ArrayList<ItemEnchantingGems> drops = new ArrayList<ItemEnchantingGems>(ModItems.amber, ModItems.amberv2);

        randItem = Math.random();

        {
            if (rand < 0.02)
                if (event.block == Blocks.leaves)
                    event.drops.add(new ItemStack(ModItems.amber));
        }

        {
            if (rand < 0.01)
                if (event.block == Blocks.leaves)
                    event.drops.add(new ItemStack(ModItems.amberv2));
        }
    }
}