package com.chewabletech.world.gen;

import com.chewabletech.init.ModBlocks;
import com.chewabletech.world.gen.feature.NetherGenMinable;
import com.chewabletech.world.gen.feature.OverworldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import java.util.Random;

public class Oregen implements IWorldGenerator
{
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
    {

        switch (world.provider.dimensionId)
        {
            case -1:
                generateInNether(world, random, chunkX * 16, chunkZ * 16);
                break;
            case 0:
                generateInOverworld(world, random, chunkX * 16, chunkZ * 16);
                break;
            case 1:
                generateInEnd(world, random, chunkX * 16, chunkZ * 16);
                break;

        }

    }

    public void generateInEnd(World world, Random random, int x, int y)
    {
        // The End oregen. - Empty for now, nothing to add to it.

    }

    public void generateInOverworld(World world, Random random, int x, int z)
    {
        for (int i = 0; i < 1; i++) // The number after i (in this case 6) is how many veins spawn per chunk (16*16*16 area)
        {
            // DO NOT CHANGE
            int xcoord = x + random.nextInt(16); // DO NOT CHANGE
            int ycoord = random.nextInt(20); // Set In The Config file (ore spawn height)
            int zcoord = z + random.nextInt(16); // DO NOT CHANGE
            // Generates it (the number in the World Gen Minable function (in this case 5) is the max amount of blocks in each vein).
            new OverworldGenMinable(ModBlocks.oresapphire, 5).generate(world, random, xcoord, ycoord, zcoord);

        }
    }

    public void generateInNether(World world, Random random, int x, int y)
    {
        for (int i = 0; i < 1; i++)
        {
            int x1coord = x + random.nextInt(16);
            int y1coord = random.nextInt(256);
            int z1coord = y + random.nextInt(16);
            new NetherGenMinable(ModBlocks.blockbloodstone, 5).generate(world, random, x1coord, y1coord, z1coord);
        }
    }
}
