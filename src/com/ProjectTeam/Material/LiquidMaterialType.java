package com.ProjectTeam.Material;

import org.bukkit.Material;




public enum LiquidMaterialType {
	
	WATER(Material.WATER),
	WATER_BUCKET(Material.WATER_BUCKET),
	LAVA(Material.LAVA),
	LAVA_BUCKET(Material.LAVA_BUCKET);
	
	
	private final Material type;
	
	private LiquidMaterialType(Material type){
		this.type = type;
	}
	
	public int getID(){
		return type.getId();
	}

}
