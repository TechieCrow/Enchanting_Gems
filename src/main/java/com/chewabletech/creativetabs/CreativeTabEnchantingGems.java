package com.chewabletech.creativetabs;

import com.chewabletech.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabEnchantingGems
{

    public static final CreativeTabs tabEnchantingGems = new CreativeTabs("EnchantingGems")
    {
//        List<ItemEnchantingGems> itemList = Arrays.asList(ModItems.amber, ModItems.amethyst, ModItems.bloodstone, ModItems.jade, ModItems.moonstone, ModItems.onyx, ModItems.opal, ModItems.pearl, ModItems.ruby, ModItems.sapphire, ModItems.tigerseye, ModItems.turquoise);
//
//        Random random = new Random();
//        ItemEnchantingGems randomitem = itemList.get(random.nextInt(itemList.size()));

        @Override
        public Item getTabIconItem()
        {
            return ModItems.sapphire;
        }
    };
}