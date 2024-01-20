package fr.kap35.clans.command;

import fr.kap35.clans.KapClan;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ClanCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (! (commandSender instanceof Player))
            return false;
        Player player = (Player) commandSender;
        KapClan.getInstance().openMenu(KapClan.ClanMenuName.MAIN_MENU, player);
        return true;
    }
}
