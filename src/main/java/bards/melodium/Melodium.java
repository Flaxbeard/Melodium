package bards.melodium;

import bards.melodium.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.sound.PlaySoundEvent;
import net.minecraftforge.client.event.sound.PlaySoundSourceEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod(modid = Melodium.MODID, version = Melodium.VERSION)
public class Melodium
{
    public static final String MODID = "melodium";
    public static final String NAME = "Melodium";
    public static final String VERSION = "1.0";
	
    @SidedProxy(clientSide = "bards.melodium.proxy.ClientProxy",serverSide = "bards.melodium.proxy.ServerProxy")
    public static CommonProxy proxy;
	
	public static CreativeTabs tab = new CreativeTabs("melodium") {
    	@Override
    	public String getTabLabel(){
    		return "melodium";
    	}
		@Override
		@SideOnly(Side.CLIENT)
		public ItemStack getTabIconItem(){
			return new ItemStack(RegistryManager.lyre,1);
		}
	};
	
    @Instance("melodium")
    public static Melodium instance;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
    	proxy.preInit(event);
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event){
    	proxy.init(event);
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event){
    	proxy.postInit(event);
    }
}
