package com.github.islaage.GloriaSystem;

import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

public class Timer extends BukkitRunnable{

	private final GloriaSystem plg;
	private final Player pl;
	private int count;


	public Timer(GloriaSystem plg_, Player pl_, int count_) {
		plg = plg_;
		pl = pl_;
		count = count_;
	}

	public void run() {
		plg.getServer().dispatchCommand(plg.getServer().getConsoleSender(),"title "+pl.getName()+" title {\"text\":\""+count+"\",\"color\":\"red\",\"bold\":true}");

		count--;
		if(count >=0) {
			new Timer(plg,pl,count).runTaskLater(plg, 20);
		}


	}




}
