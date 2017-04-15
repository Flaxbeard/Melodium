package bards.melodium.block;

import bards.melodium.Melodium;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockBase extends Block implements IModeledBlock {
	public Item itemBlock = null;

	public BlockBase(Material materialIn, String name, boolean addToTab) {
		super(materialIn);
		setUnlocalizedName(name);
		setRegistryName(Melodium.MODID+":"+name);
		if (addToTab){
			setCreativeTab(Melodium.tab);
		}
		GameRegistry.register(this);
        GameRegistry.register(itemBlock = (new ItemBlock(this).setRegistryName(this.getRegistryName())));
	}
	
	@Override
	public void initModel(){
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName().toString(),"inventory"));
	}

}
