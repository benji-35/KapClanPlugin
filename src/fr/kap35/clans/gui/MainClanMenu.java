package fr.kap35.clans.gui;

import fr.kap35.kapeasymenu.menu.exception.MenuSizeException;
import fr.kap35.kapeasymenu.menu.legacy.ChestMenu;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class MainClanMenu extends ChestMenu {

    public MainClanMenu(JavaPlugin plugin) throws MenuSizeException {
        super(plugin, "Kap Clan - Menu", 27);
    }

    @Override
    protected void onCloseMenu(Player player) {

    }

    @Override
    protected void onOpenMenu(Player player) {

    }
}
