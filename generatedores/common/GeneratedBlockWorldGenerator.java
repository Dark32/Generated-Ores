package mods.generatedores.common;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class GeneratedBlockWorldGenerator implements IWorldGenerator {
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        switch(world.provider.dimensionId) {
            case -1: generateNether(world, random, chunkX*16, chunkZ*16);
            case 0: generateSurface(world, random, chunkX*16, chunkZ*16);
        }
    }

    private void generateSurface(World world, Random random, int blockX, int blockZ) {
        int Xcoord = blockX + random.nextInt(16);
        int Ycoord = random.nextInt(2) + 58;
        int Zcoord = blockZ + random.nextInt(16);

        (new WorldGenMinable(GeneratedOresMain.mundaneore.blockID, 10)).generate(world, random, Xcoord, Ycoord, Zcoord);

        Ycoord = random.nextInt(2) + 60;

        (new WorldGenMinable(GeneratedOresMain.magicore.blockID, 10)).generate(world, random, Xcoord, Ycoord, Zcoord);

        Ycoord = random.nextInt(2) + 56;

        (new WorldGenMinable(GeneratedOresMain.rareore.blockID, 10)).generate(world, random, Xcoord, Ycoord, Zcoord);

        Ycoord = random.nextInt(2) + 54;

        (new WorldGenMinable(GeneratedOresMain.legendaryore.blockID, 10)).generate(world, random, Xcoord, Ycoord, Zcoord);
    }

    private void generateNether(World world, Random random, int blockX, int blockZ) {

    }
}
