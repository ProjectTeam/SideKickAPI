package com.ProjectTeam.Mobs;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.EntityType;

public enum HostileMobType {
	  ZOMBIE(EntityType.ZOMBIE), 
	  ENDERMAN(EntityType.ENDERMAN), 
	  SKELETON(EntityType.SKELETON), 
	  SPIDER(EntityType.SPIDER), 
	  CREEPER(EntityType.CREEPER), 
	  DRAGON(EntityType.ENDER_DRAGON),
	  BLAZE(EntityType.BLAZE),
	  CAVE_SPIDER(EntityType.CAVE_SPIDER),
	  GHAST(EntityType.GHAST),
	  GIANT(EntityType.GIANT),
	  PIG_ZOMBIE(EntityType.PIG_ZOMBIE),
	  SILVERFISH(EntityType.SILVERFISH),
	  SLIME(EntityType.SLIME);

	  private EntityType type;
	  
	  private HostileMobType(EntityType type) {
	    this.type = type;
	  }
	  
	  public EntityType getHostileMobType(){
		  return this.type;
	  }
	  
	  public void spawnHostile(Location location, World world){
		  world.spawnCreature(location, type) ;
	  }
	  
	  public String getName(){
		  return type.getName();
	  }

}
