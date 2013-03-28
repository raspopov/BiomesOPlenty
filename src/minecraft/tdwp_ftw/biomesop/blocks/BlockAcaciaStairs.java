package tdwp_ftw.biomesop.blocks;

import tdwp_ftw.biomesop.mod_BiomesOPlenty;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.IBlockAccess;

public class BlockAcaciaStairs extends BlockStairs
{
    /** The block that is used as model for the stair. */
    private final Block modelBlock;

    public BlockAcaciaStairs(int par1, Block par2Block, int par3)
    {
        super(par1, par2Block, par3);
        blockIndexInTexture = par3;
        this.modelBlock = par2Block;
		this.setBurnProperties(this.blockID, 5, 20);
        this.setLightOpacity(0);
        this.setCreativeTab(mod_BiomesOPlenty.tabBiomesOPlenty);
    }
}
