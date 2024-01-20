package fr.kap35.clans.gui;

import fr.kap35.clans.KapClan;
import fr.kap35.kapeasymenu.Items.GuiItem;
import fr.kap35.kapeasymenu.Items.IGuiItem;
import fr.kap35.kapeasymenu.listeners.ItemActions;
import org.bukkit.Material;

public class ClanItem {

    public static IGuiItem showMyClan() {
        return new GuiItem(KapClan.getInstance(), Material.ARROW)
                .setName("Show my clan")
                .setAmount(1)
                .setDisableEvent(true)
                .setAction(ItemActions.LEFT_CLICK, (player, javaPlugin) -> {
                    ((KapClan) javaPlugin).openMenu(KapClan.ClanMenuName.MY_CLANS, player);
                });
    }
    public static IGuiItem showAllClans() {
        return new GuiItem(KapClan.getInstance(), Material.ARROW)
                .setName("All clans")
                .setAmount(1)
                .setDisableEvent(true)
                .setAction(ItemActions.LEFT_CLICK, (player, javaPlugin) -> {
                    ((KapClan) javaPlugin).openMenu(KapClan.ClanMenuName.LIST_CLANS, player);
                });
    }
    public static IGuiItem showClan(String clanName) {
        return new GuiItem(KapClan.getInstance(), Material.ARROW)
                .setName("All clans")
                .setAmount(1)
                .setDisableEvent(true)
                .setAction(ItemActions.LEFT_CLICK, (player, javaPlugin) -> {
                    ((KapClan) javaPlugin).openMenu(KapClan.ClanMenuName.PUBLIC_PAGE_CLAN, player);
                });
    }
}
