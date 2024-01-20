package fr.kap35.clans.gui;

import fr.kap35.kapeasymenu.menu.exception.MenuSizeException;
import fr.kap35.kapeasymenu.menu.legacy.ChestPaginationMenu;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class ClanListMenu extends ChestPaginationMenu {

    public ClanListMenu(JavaPlugin plugin) throws MenuSizeException {
        super(plugin, "List of clans", 27);
    }

    @Override
    protected void onSwitchPage(Player player, int i) {

    }

    @Override
    protected void onCloseMenu(Player player) {

    }

    @Override
    protected void onOpenMenu(Player player) {

    }
}
