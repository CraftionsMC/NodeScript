/*
 * Copyright (c) 2021 Ben Siebert. All rights reserved.
 */
package net.craftions.nodescript.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CommandNode implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        return true;
    }
}
