package net.md_5.bungee.api.event;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import net.md_5.bungee.api.config.ServerInfo;
import net.md_5.bungee.api.plugin.Event;
import net.md_5.bungee.protocol.packet.Handshake;

/**
 * Event called to represent a player first making their presence and username
 * known.
 */
@Data
@ToString(callSuper = false)
@EqualsAndHashCode(callSuper = false)
public class IpForwardEvent extends Event
{

    /**
     * Uuid of player
     */
    private String uuid;

    /**
     * Name of player
     */
    private final String name;

    /**
     * The handshake.
     */
    private final Handshake handshake;

    /**
     * Target server.
     */
    private final ServerInfo target;

    public IpForwardEvent(Handshake handshake, String uuid, String name, ServerInfo target)
    {
        this.uuid = uuid;
        this.handshake = handshake;
        this.name = name;
        this.target = target;
    }
}
