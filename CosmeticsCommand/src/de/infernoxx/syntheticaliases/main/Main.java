package de.infernoxx.syntheticaliases.main;

import org.bukkit.plugin.java.JavaPlugin;

import de.infernoxx.syntheticaliases.commands.AliasCommand;
import de.infernoxx.syntheticaliases.commands.CreditsCommand;
import de.infernoxx.syntheticaliases.commands.TopcreditsCommand;


public class Main extends JavaPlugin {
	public void onEnable() {
		getCommand("cm").setExecutor(new AliasCommand());
		getCommand("credits").setExecutor(new CreditsCommand());
		getCommand("topcredits").setExecutor(new TopcreditsCommand());
	}
}
