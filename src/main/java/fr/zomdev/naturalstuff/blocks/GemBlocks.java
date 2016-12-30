package fr.zomdev.naturalstuff.blocks;

import fr.zomdev.naturalstuff.enumerations.GemBlocksEnumType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

/**
 * Created by ZomDev on 29/12/2016.
 */
public class GemBlocks extends NSBlock {

    public static final PropertyEnum VARIANTS = PropertyEnum.create("gems", GemBlocksEnumType.class);

    public GemBlocks() {
        super(Material.ROCK, "gemBlock");
        this.setDefaultState(getDefaultState().withProperty(VARIANTS, GemBlocksEnumType.EARTHBLOCK));
        this.setCreativeTab(CreativeTabs.MISC);
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        return ((GemBlocksEnumType) state.getValue(VARIANTS)).getMeta();
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void getSubBlocks(Item itemIn, CreativeTabs tab, List<ItemStack> list) {

        list.add(new ItemStack(this, 1, GemBlocksEnumType.EARTHBLOCK.getMeta()));
        list.add(new ItemStack(this, 1, GemBlocksEnumType.WATERBLOCK.getMeta()));
        list.add(new ItemStack(this, 1, GemBlocksEnumType.FIREBLOCK.getMeta()));
        list.add(new ItemStack(this, 1, GemBlocksEnumType.AIRBLOCK.getMeta()));

    }

    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, new IProperty[]{VARIANTS});
    }

    public String getUnlocalizedName(int metadata) {
        return super.getUnlocalizedName() + "." + GemBlocksEnumType.getStateFromMeta(metadata).getName();
    }
}
