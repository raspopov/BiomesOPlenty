package tdwp_ftw.biomesop.blocks;

import tdwp_ftw.biomesop.mod_BiomesOPlenty;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.IBlockAccess;

public class BlockMagicPlank extends Block
{
    /** The type of tree this block came from. */
    public static final String[] woodType = new String[] {"magic"};

    public BlockMagicPlank(int par1)
    {
        super(par1, 56, Material.wood);
        this.setCreativeTab(mod_BiomesOPlenty.tabBiomesOPlenty);
    }

    /**
     * Determines the damage on the item the block drops. Used in cloth and wood.
     */
    public int damageDropped(int par1)
    {
        return par1;
    }
}
