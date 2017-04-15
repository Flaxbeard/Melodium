package bards.melodium.item;

import bards.melodium.Melodium;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemBase extends Item implements IModeledItem {
	public ItemBase(String name, boolean addToTab){
		super();
		setUnlocalizedName(name);
		setRegistryName(Melodium.MODID+":"+name);
		if (addToTab){
			setCreativeTab(Melodium.tab);
		}
		GameRegistry.register(this);
	}
	
	@Override
	public void initModel(){
		ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName().toString()));
	}
}
