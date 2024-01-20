package fr.kap35.clans.gui;

import fr.kap35.kapeasymenu.menu.exception.MenuSizeException;
import fr.kap35.kapeasymenu.menu.legacy.ChestMenu;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class PublicClanMenu extends ChestMenu {

    public PublicClanMenu(JavaPlugin plugin) throws MenuSizeException {
        super(plugin, "Public clan menu", 27);
    }

    @Override
    protected void onCloseMenu(Player player) {

    }

    @Override
    protected void onOpenMenu(Player player) {

    }
}
