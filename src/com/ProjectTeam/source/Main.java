package com.ProjectTeam.source;

import java.io.File;
import java.util.Map;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import com.ProjectTeam.Economy.Economy;
import com.ProjectTeam.Protocol.PotionEffects;

public class Main extends JavaPlugin{
	public FileConfiguration config;
	public String configString;
	public FileConfiguration SideKickAPI;
	public static String plugindir = "plugins/SideKickAPI/";
	public static File cfg = new File(plugindir + "SideKickAPI.yml");
	
	//TODO: onDisabled
	@Override
	public void onDisable() {
		saveConfig();
	}
	//TODO: onEnabled
	@Override 
	public void onEnable() {
		PotionEffects.setPotions();
		loadConfig();
	}
	
	public void loadConfig() {
		config = this.getConfig();
		ConfigurationSection section = config.getConfigurationSection("money");
		if (section != null) {
			for (String key : section.getKeys(false)) {
				double money = section.getDouble(key, section.getInt(key, 0));
				Economy.economy.put(key, money);
			}
		}
	}
	public void saveConfig() {
		config = this.getConfig();
		for (Map.Entry<String, Double> entry : Economy.economy.entrySet()) {
			config.set("money." + entry.getKey(), entry.getValue());
		}
		super.saveConfig();
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String cmdLabel, String[] args) { 
		if(cmdLabel.equalsIgnoreCase("sidekickapi")){
			sender.sendMessage(this.getName() + " " + this.getDescription().getVersion());
			sender.sendMessage(this.getDescription().getDescription());
			sender.sendMessage(this.getDescription().getAuthors().toString());
			return true;
		}
		return true;
	}

}
