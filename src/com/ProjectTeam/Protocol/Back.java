package com.ProjectTeam.Protocol;

import java.util.HashMap;

import org.bukkit.Location;

public class Back {
	
	public static HashMap<String, Location> back = new HashMap<String, Location>();
	
	/**
	 * 
	 * @param Players name
	 * @return Location
	 */
	public static Location getBackLocation(String playername){
		return back.get(playername);
	}
	
	/**
	 * 
	 * @param Players name
	 * @param location
	 * @return Location 
	 */
	public static Location setBack(String playername, Location location){
		return back.put(playername, location);
	}

}
