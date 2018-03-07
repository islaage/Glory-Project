package com.github.islaage.GloriaSystem;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Commands implements CommandExecutor{

	private final GloriaSystem plg;

	public Commands(GloriaSystem plg_) {
		plg = plg_;
	}

    @Override
    public boolean onCommand(CommandSender sender, Command cmd,String commandLabel,String[] args) {

	if (cmd.getName().equalsIgnoreCase("test")){
		if(sender instanceof Player) {
			new Timer(plg, (Player)sender,15).runTaskLater(plg, 0);
			sender.sendMessage("タイマー起動");
			return true;
		}
	}
	return false;

}
}
