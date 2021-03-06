package com.songoda.skyblock.api.event.island;

import com.songoda.skyblock.api.invite.IslandInvitation;
import com.songoda.skyblock.api.island.Island;
import org.bukkit.event.HandlerList;

public class IslandInviteEvent extends IslandEvent {

    private static final HandlerList HANDLERS = new HandlerList();

    private final IslandInvitation invite;

    public IslandInviteEvent(Island island, IslandInvitation invite) {
        super(island);
        this.invite = invite;
    }

    public IslandInvitation getInvite() {
        return invite;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public HandlerList getHandlerList() {
        return HANDLERS;
    }
}
