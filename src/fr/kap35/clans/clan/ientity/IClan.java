package fr.kap35.clans.clan.ientity;

import fr.kap35.clans.clan.entity.Permission;
import fr.kap35.clans.clan.ientity.exception.PermissionDoesNotExistsException;
import fr.kap35.clans.clan.ientity.exception.PlayerNotMemberException;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public interface IClan {

    void addMember(UUID player);
    void removePlayer(UUID player);
    void banMember(UUID player);
    void unbanPlayer(UUID player);
    boolean isPlayerInClan(UUID player);

    void setPermission(String permissionName, Permission permission);
    void setMemberPermission(UUID player, String permissionName) throws PermissionDoesNotExistsException, PlayerNotMemberException;

    String getName();
    UUID getCreator();
    Set<UUID> getMembers();
    Map<UUID, String> getMemberPermissionsName();
    Set<UUID> getBanned();

}
