package fr.kap35.clans;

import fr.kap35.clans.clan.ClanManager;
import fr.kap35.clans.clan.IClanManager;
import fr.kap35.clans.gui.ClanListMenu;
import fr.kap35.clans.gui.ClanMenu;
import fr.kap35.clans.gui.MainClanMenu;
import fr.kap35.clans.gui.PublicClanMenu;
import fr.kap35.kapeasymenu.Interfaces.IGuiManager;
import fr.kap35.kapeasymenu.KapEasyMenu;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class KapClan extends JavaPlugin {

    IClanManager clanManager;
    IGuiManager guiManager;

    private static KapClan plugin = null;

    @Override
    public void onEnable() {
        plugin = this;
        guiManager = ((KapEasyMenu) Bukkit.getServer().getPluginManager().getPlugin("KapEasyMenu")).getGuiManager();
        clanManager = new ClanManager();
        try {
            guiManager.registerMenus(new PublicClanMenu(this), ClanMenuName.PUBLIC_PAGE_CLAN.name);
            guiManager.registerMenus(new MainClanMenu(this), ClanMenuName.MAIN_MENU.name);
            guiManager.registerMenus(new ClanMenu(this), ClanMenuName.MY_CLANS.name);
            guiManager.registerMenus(new ClanListMenu(this), ClanMenuName.LIST_CLANS.name);
        } catch (Exception e) {
            Bukkit.getConsoleSender().sendMessage("Failed to load menus");
        }
    }

    @Override
    public void onDisable() {
    }

    public void openMenu(ClanMenuName menuName, Player player) {
        guiManager.openMenu(player, menuName.name);
    }

    public static KapClan getInstance() {
        return plugin;
    }

    public enum ClanMenuName {
        MAIN_MENU("mainClanMenu"),
        LIST_CLANS("listClansMenu"),
        MY_CLANS("myClanmenu"),
        PUBLIC_PAGE_CLAN("publicClanMenu")
        ;

        private final String name;

        ClanMenuName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}
