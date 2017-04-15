package bards.melodium.proxy;

import bards.melodium.RegistryManager;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {
	//public static ParticleRenderer particleRenderer = new ParticleRenderer();
	
	@Override
	public void preInit(FMLPreInitializationEvent event){
		super.preInit(event);
		//ShaderUtil.init();
		//ModelManager.init();
		RegistryManager.registerRendering();
	}
	
	@Override
	public void init(FMLInitializationEvent event){
		super.init(event);
	}
	
	@Override
	public void postInit(FMLPostInitializationEvent event){
		super.postInit(event);
	}
}
