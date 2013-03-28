package tdwp_ftw.biomesop.biomes;

import java.util.Random;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenerator;
import tdwp_ftw.biomesop.worldgen.WorldGenApple;
import tdwp_ftw.biomesop.worldgen.WorldGenAppleTree1;
import tdwp_ftw.biomesop.worldgen.WorldGenAppleTree2;

public class BiomeGenOrchard extends BiomeGenBase
{
    private BiomeDecoratorBOP customBiomeDecorator;

    public BiomeGenOrchard(int par1)
    {
        super(par1);
        this.theBiomeDecorator = new BiomeDecoratorBOP(this);
        this.customBiomeDecorator = (BiomeDecoratorBOP)theBiomeDecorator;
        this.customBiomeDecorator.treesPerChunk = 2;
        this.customBiomeDecorator.flowersPerChunk = 20;
        this.customBiomeDecorator.whiteFlowersPerChunk = 20;
        this.customBiomeDecorator.tinyFlowersPerChunk = 20;
        this.customBiomeDecorator.grassPerChunk = 15;
    }
	
    /**
     * Gets a WorldGen appropriate for this biome.
     */
    public WorldGenerator getRandomWorldGenForTrees(Random par1Random)
    {
        //return (WorldGenerator)(par1Random.nextInt(3) == 0 ? new WorldGenAppleTree1() : new WorldGenAppleTree2());
		return new WorldGenApple(false);
    }

    /**
     * Provides the basic grass color based on the biome temperature and rainfall
     */
    public int getBiomeGrassColor()
    {
        return 14024557;
    }
}
