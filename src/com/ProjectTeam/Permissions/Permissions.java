package com.ProjectTeam.Permissions;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class Permissions {

	/**
	 * Checks if a player has a SideKick permission node
	 * 
	 * @param player
	 * @param node
	 * @return
	 */
	public static boolean hasSideKickNode(Player player, String node) {
		if (player.hasPermission("Sidekick." + node)) {
			return true;
		} else {
			player.sendMessage(ChatColor.RED + "You do not have permission!");
			return false;
		}
	}
	
	/**
	 * Checks if a player has a Permission node
	 * @param player
	 * @param node
	 * @return
	 */
	public static boolean has(Player player, String node){
		if(player.hasPermission(node)){
			return true;
		} else {
			player.sendMessage(ChatColor.RED + "You do not have permission!");
			return false;
		}
	}

}
