package bards.melodium;

import java.util.ArrayList;
import java.util.List;

import bards.melodium.block.*;
import bards.melodium.item.*;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class RegistryManager {
	public static List<Item> items = new ArrayList<Item>();
	public static List<Block> blocks = new ArrayList<Block>();
	
	public static Item lyre, flute, drum, bell;

	public static void registerAll() {
		items.add(lyre = new ItemBase("lyre",true));
		items.add(flute = new ItemBase("flute",true));
		items.add(drum = new ItemBase("drum",true));
		items.add(bell = new ItemBase("bell",true));
	}

	public static void registerRendering() {
		for (Item i : items){
			if (i instanceof IModeledItem){
				((IModeledItem)i).initModel();
			}
		}
		for (Block b : blocks){
			if (b instanceof IModeledBlock){
				((IModeledBlock)b).initModel();
			}
		}
	}

}
