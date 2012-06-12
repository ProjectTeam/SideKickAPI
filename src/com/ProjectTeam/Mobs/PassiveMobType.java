package com.ProjectTeam.Mobs;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.EntityType;

public enum PassiveMobType {
	VILLAGER(EntityType.VILLAGER),
	CHICKEN(EntityType.CHICKEN),
	COW(EntityType.COW),
	EGG(EntityType.EGG),
	IRON_GOLEM(EntityType.IRON_GOLEM),
	OCELOT(EntityType.OCELOT),
	PIG(EntityType.PIG),
	PLAYER(EntityType.PLAYER),
	SHEEP(EntityType.SHEEP),
	SNOWMAN(EntityType.SNOWMAN),
	SQUID(EntityType.SQUID),
	WOLF(EntityType.WOLF);

	private EntityType type;

	
	private PassiveMobType(EntityType type) {
		this.type = type;
	}
	
	public EntityType getPassiveMobType(){
		return this.type;
	}
	
	public String getName(){
		return type.getName();
	}
	
	public void spawnPassive(Location arg0, World world){
		world.spawnCreature(arg0, type);
	}

}
