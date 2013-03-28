package tdwp_ftw.biomesop.worldgen;

import java.util.Random;
import tdwp_ftw.biomesop.mod_BiomesOPlenty;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenSilverBirch2 extends WorldGenerator
{
    public boolean generate(World var1, Random var2, int var3, int var4, int var5)
    {
        while (var1.isAirBlock(var3 + 5, var4, var5 + 5) && var4 > 2)
        {
            --var4;
        }

        int var6 = var1.getBlockId(var3 + 5, var4, var5 + 5);

        if (var6 != Block.grass.blockID)
        {
            return false;
        }
        else
        {
            for (int var7 = -2; var7 <= 2; ++var7)
            {
                for (int var8 = -2; var8 <= 2; ++var8)
                {
                    if (var1.isAirBlock(var3 + var7 + 5, var4 - 1, var5 + var8 + 5) && var1.isAirBlock(var3 + var7 + 5, var4 - 2, var5 + var8 + 5))
                    {
                        return false;
                    }
                }
            }

			var1.setBlockAndMetadata(var3 + 1, var4 + 4, var5 + 8, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 2, var4 + 5, var5 + 0, Block.leaves.blockID, 6);
			var1.setBlockAndMetadata(var3 + 2, var4 + 5, var5 + 2, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 2, var4 + 5, var5 + 4, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 2, var4 + 5, var5 + 6, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 2, var4 + 6, var5 + 3, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 2, var4 + 7, var5 + 0, Block.leaves.blockID, 6);
			var1.setBlockAndMetadata(var3 + 2, var4 + 7, var5 + 2, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 2, var4 + 10, var5 + 4, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 2, var4 + 10, var5 + 6, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 2, var4 + 11, var5 + 5, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 2, var4 + 12, var5 + 5, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 3, var4 + 2, var5 + 1, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 3, var4 + 3, var5 + 3, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 3, var4 + 3, var5 + 5, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 3, var4 + 3, var5 + 6, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 3, var4 + 4, var5 + 1, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 3, var4 + 4, var5 + 3, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 3, var4 + 4, var5 + 6, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 3, var4 + 4, var5 + 9, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 3, var4 + 5, var5 + 0, Block.leaves.blockID, 6);
			var1.setBlockAndMetadata(var3 + 3, var4 + 5, var5 + 2, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 3, var4 + 5, var5 + 3, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 3, var4 + 6, var5 + 0, Block.leaves.blockID, 6);
			var1.setBlockAndMetadata(var3 + 3, var4 + 6, var5 + 3, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 3, var4 + 6, var5 + 7, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 3, var4 + 7, var5 + 4, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 3, var4 + 7, var5 + 5, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 3, var4 + 8, var5 + 2, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 3, var4 + 9, var5 + 3, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 3, var4 + 9, var5 + 5, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 3, var4 + 10, var5 + 5, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 3, var4 + 11, var5 + 4, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 3, var4 + 11, var5 + 5, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 3, var4 + 11, var5 + 7, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 3, var4 + 12, var5 + 3, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 3, var4 + 13, var5 + 3, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 4, var4 + 2, var5 + 1, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 4, var4 + 2, var5 + 2, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 4, var4 + 2, var5 + 7, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 4, var4 + 3, var5 + 3, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 4, var4 + 3, var5 + 4, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 4, var4 + 3, var5 + 6, Block.wood.blockID, 14);
			var1.setBlockAndMetadata(var3 + 4, var4 + 3, var5 + 7, Block.wood.blockID, 14);
			var1.setBlockAndMetadata(var3 + 4, var4 + 3, var5 + 8, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 4, var4 + 3, var5 + 9, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 4, var4 + 4, var5 + 0, Block.leaves.blockID, 6);
			var1.setBlockAndMetadata(var3 + 4, var4 + 4, var5 + 2, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 4, var4 + 4, var5 + 3, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 4, var4 + 4, var5 + 4, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 4, var4 + 4, var5 + 6, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 4, var4 + 4, var5 + 9, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 4, var4 + 5, var5 + 0, Block.leaves.blockID, 6);
			var1.setBlockAndMetadata(var3 + 4, var4 + 5, var5 + 2, Block.wood.blockID, 14);
			var1.setBlockAndMetadata(var3 + 4, var4 + 5, var5 + 3, Block.wood.blockID, 14);
			var1.setBlockAndMetadata(var3 + 4, var4 + 5, var5 + 4, Block.wood.blockID, 14);
			var1.setBlockAndMetadata(var3 + 4, var4 + 5, var5 + 5, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 4, var4 + 5, var5 + 6, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 4, var4 + 5, var5 + 7, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 4, var4 + 5, var5 + 8, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 4, var4 + 5, var5 + 9, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 4, var4 + 6, var5 + 0, Block.leaves.blockID, 6);
			var1.setBlockAndMetadata(var3 + 4, var4 + 6, var5 + 4, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 4, var4 + 6, var5 + 6, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 4, var4 + 7, var5 + 0, Block.leaves.blockID, 6);
			var1.setBlockAndMetadata(var3 + 4, var4 + 7, var5 + 1, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 4, var4 + 8, var5 + 1, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 4, var4 + 9, var5 + 4, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 4, var4 + 9, var5 + 6, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 4, var4 + 11, var5 + 2, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 4, var4 + 11, var5 + 3, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 4, var4 + 11, var5 + 5, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 4, var4 + 11, var5 + 8, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 4, var4 + 13, var5 + 4, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 4, var4 + 13, var5 + 5, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 4, var4 + 14, var5 + 5, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 5, var4 + 0, var5 + 5, Block.wood.blockID, 14);
			var1.setBlockAndMetadata(var3 + 5, var4 + 1, var5 + 5, Block.wood.blockID, 14);
			var1.setBlockAndMetadata(var3 + 5, var4 + 2, var5 + 3, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 5, var4 + 2, var5 + 5, Block.wood.blockID, 14);
			var1.setBlockAndMetadata(var3 + 5, var4 + 3, var5 + 4, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 5, var4 + 3, var5 + 5, Block.wood.blockID, 14);
			var1.setBlockAndMetadata(var3 + 5, var4 + 3, var5 + 9, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 5, var4 + 4, var5 + 3, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 5, var4 + 4, var5 + 4, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 5, var4 + 4, var5 + 5, Block.wood.blockID, 14);
			var1.setBlockAndMetadata(var3 + 5, var4 + 4, var5 + 7, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 5, var4 + 5, var5 + 3, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 5, var4 + 5, var5 + 4, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 5, var4 + 5, var5 + 5, Block.wood.blockID, 14);
			var1.setBlockAndMetadata(var3 + 5, var4 + 5, var5 + 6, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 5, var4 + 5, var5 + 7, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 5, var4 + 6, var5 + 5, Block.wood.blockID, 14);
			var1.setBlockAndMetadata(var3 + 5, var4 + 6, var5 + 6, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 5, var4 + 7, var5 + 1, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 5, var4 + 7, var5 + 5, Block.wood.blockID, 14);
			var1.setBlockAndMetadata(var3 + 5, var4 + 8, var5 + 3, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 5, var4 + 8, var5 + 4, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 5, var4 + 8, var5 + 5, Block.wood.blockID, 14);
			var1.setBlockAndMetadata(var3 + 5, var4 + 8, var5 + 6, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 5, var4 + 8, var5 + 7, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 5, var4 + 9, var5 + 5, Block.wood.blockID, 14);
			var1.setBlockAndMetadata(var3 + 5, var4 + 9, var5 + 7, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 5, var4 + 10, var5 + 5, Block.wood.blockID, 14);
			var1.setBlockAndMetadata(var3 + 5, var4 + 10, var5 + 6, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 5, var4 + 10, var5 + 7, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 5, var4 + 11, var5 + 2, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 5, var4 + 11, var5 + 4, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 5, var4 + 11, var5 + 5, Block.wood.blockID, 14);
			var1.setBlockAndMetadata(var3 + 5, var4 + 11, var5 + 7, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 5, var4 + 11, var5 + 8, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 5, var4 + 12, var5 + 2, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 5, var4 + 12, var5 + 5, Block.wood.blockID, 14);
			var1.setBlockAndMetadata(var3 + 5, var4 + 12, var5 + 7, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 5, var4 + 13, var5 + 4, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 5, var4 + 13, var5 + 5, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 5, var4 + 13, var5 + 6, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 5, var4 + 13, var5 + 7, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 5, var4 + 14, var5 + 5, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 5, var4 + 14, var5 + 6, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 6, var4 + 1, var5 + 5, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 6, var4 + 2, var5 + 6, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 6, var4 + 3, var5 + 6, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 6, var4 + 3, var5 + 8, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 6, var4 + 3, var5 + 9, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 6, var4 + 4, var5 + 0, Block.leaves.blockID, 6);
			var1.setBlockAndMetadata(var3 + 6, var4 + 4, var5 + 2, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 6, var4 + 4, var5 + 4, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 6, var4 + 4, var5 + 6, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 6, var4 + 4, var5 + 7, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 6, var4 + 5, var5 + 1, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 6, var4 + 5, var5 + 2, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 6, var4 + 5, var5 + 7, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 6, var4 + 6, var5 + 2, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 6, var4 + 6, var5 + 3, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 6, var4 + 6, var5 + 4, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 6, var4 + 6, var5 + 5, Block.wood.blockID, 14);
			var1.setBlockAndMetadata(var3 + 6, var4 + 6, var5 + 7, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 6, var4 + 7, var5 + 5, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 6, var4 + 7, var5 + 6, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 6, var4 + 8, var5 + 6, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 6, var4 + 9, var5 + 5, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 6, var4 + 10, var5 + 6, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 6, var4 + 10, var5 + 7, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 6, var4 + 11, var5 + 8, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 6, var4 + 12, var5 + 2, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 6, var4 + 13, var5 + 7, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 7, var4 + 3, var5 + 5, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 7, var4 + 4, var5 + 2, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 7, var4 + 4, var5 + 4, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 7, var4 + 4, var5 + 7, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 7, var4 + 5, var5 + 2, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 7, var4 + 5, var5 + 5, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 7, var4 + 5, var5 + 8, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 7, var4 + 6, var5 + 1, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 7, var4 + 6, var5 + 5, Block.wood.blockID, 14);
			var1.setBlockAndMetadata(var3 + 7, var4 + 6, var5 + 6, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 7, var4 + 7, var5 + 3, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 7, var4 + 7, var5 + 8, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 7, var4 + 8, var5 + 3, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 7, var4 + 9, var5 + 6, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 7, var4 + 10, var5 + 5, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 7, var4 + 10, var5 + 6, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 7, var4 + 11, var5 + 3, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 7, var4 + 13, var5 + 5, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 8, var4 + 5, var5 + 3, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 8, var4 + 5, var5 + 4, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 8, var4 + 5, var5 + 5, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 8, var4 + 5, var5 + 8, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 8, var4 + 6, var5 + 3, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 8, var4 + 6, var5 + 5, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 8, var4 + 6, var5 + 6, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 8, var4 + 6, var5 + 7, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 8, var4 + 7, var5 + 4, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 8, var4 + 9, var5 + 5, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 8, var4 + 11, var5 + 6, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 8, var4 + 12, var5 + 5, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 9, var4 + 5, var5 + 3, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 9, var4 + 7, var5 + 4, Block.leaves.blockID, 14);
			var1.setBlockAndMetadata(var3 + 10, var4 + 6, var5 + 5, Block.leaves.blockID, 14);
            return true;
        }
    }
}
