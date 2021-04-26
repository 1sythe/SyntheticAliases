package de.infernoxx.cosmeticscommand.main;

import org.bukkit.plugin.java.JavaPlugin;
import de.infernoxx.cosmeticscommand.commands.AliasCommand;


public class Main extends JavaPlugin {
	public void onEnable() {
		getCommand("cm").setExecutor(new AliasCommand());
	}
}
