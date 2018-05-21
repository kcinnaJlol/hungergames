package com.gmail.jannick.van.eeghem.hungergames;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GameQueue implements Iterable<QueuedPlayer> {
	private List<QueuedPlayer> list = new ArrayList<>();
	@Override
	public Iterator<QueuedPlayer> iterator() {
		// TODO Auto-generated method stub
		
		return list.iterator();
			
		
	}

}
