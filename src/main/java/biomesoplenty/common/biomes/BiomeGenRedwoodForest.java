package biomesoplenty.common.biomes;

import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenRedwoodForest extends BiomeGenBase
{

	public BiomeGenRedwoodForest(int par1)
	{
		super(par1);
		/*
		theBiomeDecorator = new BiomeDecoratorBOP(this);
		customBiomeDecorator = (BiomeDecoratorBOP)theBiomeDecorator;
		customBiomeDecorator.treesPerChunk = 75;
		customBiomeDecorator.grassPerChunk = 16;
		customBiomeDecorator.bushesPerChunk = 4;
		customBiomeDecorator.berryBushesPerChunk = 1;
		customBiomeDecorator.wheatGrassPerChunk = 7;
		customBiomeDecorator.shrubsPerChunk = 10;
		customBiomeDecorator.redwoodShrubsPerChunk = 100;
		customBiomeDecorator.waterReedsPerChunk = 2;
		customBiomeDecorator.generatePumpkins = false;
		*/
	}

	/**
	 * Gets a WorldGen appropriate for this biome.
	 */
	/*
	@Override
	public WorldGenerator getRandomWorldGenForTrees(Random par1Random)
	{
		return par1Random.nextInt(4) == 0 ? new WorldGenRedwoodTree(false) : (par1Random.nextInt(8) == 0 ? new WorldGenShrub(0,0) : new WorldGenRedwoodTree2(false));
	}
	
	@Override
	public void decorate(World par1World, Random par2Random, int par3, int par4)
	{
		super.decorate(par1World, par2Random, par3, par4);
		int var5 = 3 + par2Random.nextInt(6);

		for (int var6 = 0; var6 < var5; ++var6)
		{
			int var7 = par3 + par2Random.nextInt(16);
			int var8 = par2Random.nextInt(28) + 4;
			int var9 = par4 + par2Random.nextInt(16);
			int var10 = par1World.getBlockId(var7, var8, var9);

			Block block = Block.blocksList[var10]; 
			if (block != null && block.isGenMineableReplaceable(par1World, var7, var8, var9, Block.stone.blockID))
			{
				par1World.setBlock(var7, var8, var9, Block.oreEmerald.blockID, 0, 2);
			}
		}
	}
	*/

	/**
	 * Gets a WorldGen appropriate for this biome.
	 */
	/*
	@Override
	public WorldGenerator getRandomWorldGenForGrass(Random par1Random)
	{
		return par1Random.nextInt(4) == 0 ? new WorldGenTallGrass(Block.tallGrass.blockID, 2) : new WorldGenTallGrass(Block.tallGrass.blockID, 1);
	}
	*/
}