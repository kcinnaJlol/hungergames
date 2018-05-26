package com.gmail.jannick.van.eeghem.hungergames;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.bukkit.block.Block;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class HungerGames extends JavaPlugin {
	private final FileConfiguration config = getConfig();
	private List<GameQueue> queues = new ArrayList<>();
	private final Logger log = getLogger();
	@Override
	public void onDisable() {
		// TODO Auto-generated method stub
		super.onDisable();
	}

	@Override
	public void onEnable() {
		// TODO Auto-generated method stub
		Map<String, Object> vals = config.getValues(true);
		if(vals.containsKey("queues")) {
			Object tqueues = vals.get("queues");
			if (tqueues instanceof Map<?, ?>) {
				@SuppressWarnings("unchecked")
				Map<String, Object> queues = (Map<String, Object>) tqueues;
			}
		}else {
			log.log(Level.CONFIG, "There are no queuers");
		}
		super.onEnable();
	}

	@EventHandler(priority = EventPriority.MONITOR)
	public void onClick(PlayerInteractEvent e) {
		Block b = e.getClickedBlock();
		
	}
}
