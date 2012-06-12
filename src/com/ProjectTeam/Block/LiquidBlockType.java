package com.ProjectTeam.Block;

import net.minecraft.server.Block;

public enum LiquidBlockType {
	
	WATER(Block.WATER);
	
	private final Block block;
	
	private LiquidBlockType(Block block){
		this.block = block;
	}
	
	
	public String getName(){
		return block.getName();
	}

}
