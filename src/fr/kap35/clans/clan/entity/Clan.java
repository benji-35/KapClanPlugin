package fr.kap35.clans.clan.entity;

import fr.kap35.clans.clan.ientity.IClan;
import fr.kap35.clans.clan.ientity.exception.PermissionDoesNotExistsException;
import fr.kap35.clans.clan.ientity.exception.PlayerNotMemberException;

import java.util.*;

public class Clan implements IClan {
    String name;
    UUID creator;
    Map<String, List<Permission>> clanPermissions;
    Map<UUID, String> members;
    List<UUID> bannedMembers;

    public Clan(String name, UUID creator, Map<UUID, String> members, Map<String, List<Permission>> clanPermissions) {
        this.name = name;
        this.creator = creator;
        this.clanPermissions = clanPermissions;
        this.members = members;
        this.bannedMembers = new ArrayList<>();
    }

    public Clan(String name, UUID creator, Map<UUID, String> members, Map<String, List<Permission>> clanPermissions, List<UUID> bannedMembers) {
        this.name = name;
        this.creator = creator;
        this.clanPermissions = clanPermissions;
        this.members = members;
        this.bannedMembers = bannedMembers;
    }

    @Override
    public void addMember(UUID player) {
        members.put(player, null);
    }
    @Override
    public void removePlayer(UUID player) {
        members.remove(player);
    }

    @Override
    public void banMember(UUID player) {
        members.remove(player);
        bannedMembers.add(player);
    }
    @Override
    public void unbanPlayer(UUID player) {
        bannedMembers.remove(player);
    }

    @Override
    public boolean isPlayerInClan(UUID player) {
        if (creator.equals(player))
            return true;
        for(UUID uuid : members.keySet()) {
            if (uuid.equals(player))
                return true;
        }
        return false;
    }

    @Override
    public void setPermission(String permissionName, Permission permission) {
        if (!clanPermissions.containsKey(permissionName)) {
            clanPermissions.put(permissionName, new ArrayList<>());
        }
        List<Permission> permissions = clanPermissions.get(permissionName);
        if (!permissions.contains(permission))
            permissions.add(permission);
        clanPermissions.put(permissionName, permissions);
    }
    @Override
    public void setMemberPermission(UUID player, String permissionName) throws PlayerNotMemberException, PermissionDoesNotExistsException {
        if (!clanPermissions.containsKey(permissionName))
            throw new PermissionDoesNotExistsException();
        if (!members.containsKey(player))
            throw new PlayerNotMemberException();
        members.put(player, permissionName);
    }

    @Override
    public String getName() {
        return name;
    }
    @Override
    public UUID getCreator() {
        return creator;
    }
    @Override
    public Set<UUID> getMembers() {
        return members.keySet();
    }
    @Override
    public Map<UUID, String> getMemberPermissionsName() {
        return members;
    }
    @Override
    public Set<UUID> getBanned() {
        return new HashSet<>(bannedMembers);
    }
}
