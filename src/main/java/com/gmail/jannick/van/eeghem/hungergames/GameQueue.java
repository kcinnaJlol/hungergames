package com.gmail.jannick.van.eeghem.hungergames;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.block.Block;

public class GameQueue implements Iterable<QueuedPlayer> {
	List<QueuedPlayer> list = new ArrayList<>();
	Block targetBlock;
	@Override
	public Iterator<QueuedPlayer> iterator() {
		// TODO Auto-generated method stub
		
		return list.iterator();
			
		
	}
	public GameQueue(Location loc, String name) {
		// TODO Auto-generated constructor stub
		targetBlock = Bukkit.getServer().getWorld(name).getBlockAt(loc);
	}
	public GameQueue(int x, int y, int z, String name) {
		// TODO Auto-generated constructor stub
		targetBlock = Bukkit.getServer().getWorld(name).getBlockAt(x, y, z);
	}

}
