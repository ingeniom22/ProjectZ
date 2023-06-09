package com.ingeniom22;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityTransformEvent;
import org.bukkit.event.entity.EntityTransformEvent.TransformReason;

public class BlockDrowned implements Listener {
    private final Main plugin;

    public BlockDrowned(Main plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onZombieDrown(EntityTransformEvent event) {
        if (event.getEntity().hasMetadata("type") && event.getTransformReason() == TransformReason.DROWNED) {
            event.setCancelled(true);
        }
    }

}
