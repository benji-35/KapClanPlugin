package fr.kap35.clans.gui;

import fr.kap35.kapeasymenu.menu.exception.MenuSizeException;
import fr.kap35.kapeasymenu.menu.legacy.ChestMenu;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class MainClanMenu extends ChestMenu {

    public MainClanMenu(JavaPlugin plugin) throws MenuSizeException {
        super(plugin, "Kap Clan - Menu", 27);
        addItem(ClanItem.showAllClans(), 0);
        addItem(ClanItem.showMyClan(), 4);
        addItem(ClanItem.showClan(""), 8);
    }

    @Override
    protected void onCloseMenu(Player player) {

    }

    @Override
    protected void onOpenMenu(Player player) {

    }
}
