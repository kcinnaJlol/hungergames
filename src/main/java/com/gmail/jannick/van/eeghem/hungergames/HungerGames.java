package com.gmail.jannick.van.eeghem.hungergames;

import java.util.Map;
import java.util.Set;
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
	private Set<GameQueue> queues;
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
		if (vals.containsKey("queues")) {
			@SuppressWarnings("unchecked")
			Map<String, Object> tqueues = (Map<String, Object>) vals.get("queues");
			for (Object val : tqueues.values()) {
				if (val instanceof Map<?, ?>) {
					Map<?, ?> queue = (Map<?, ?>) val;
					queues.add(new GameQueue((int) queue.get("x"), (int) queue.get("y"), (int) queue.get("z"),
							(String) queue.get("world")));
				}
			}
		} else {
			log.log(Level.CONFIG, "There are no queuers");
		}
		super.onEnable();
	}

	@EventHandler(priority = EventPriority.MONITOR)
	public void onClick(PlayerInteractEvent e) {
		Block b = e.getClickedBlock();

	}
}
