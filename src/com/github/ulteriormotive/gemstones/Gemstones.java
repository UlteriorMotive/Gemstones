package com.github.ulteriormotive.gemstones;

import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;

public class Gemstones extends JavaPlugin {
	Logger log = Logger.getLogger("Minecraft");
	
	public void onEnable(){
		log.info("The gemstones plugin has been enabled");
	}
	
	public void onDisable(){
		log.info("The gemstones plugin has been disabled");
	}
}
