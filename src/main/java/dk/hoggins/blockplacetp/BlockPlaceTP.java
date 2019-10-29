package dk.hoggins.blockplacetp;

import dk.hoggins.blockplacetp.listeners.BlockBreakListener;
import dk.hoggins.blockplacetp.listeners.BlockPlaceListener;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class BlockPlaceTP extends JavaPlugin implements Listener {
    public static BlockPlaceTP plugin;
    @Override
    public void onEnable() {
        plugin = this;
        Listener listener = new BlockBreakListener();
        Listener placeListener = new BlockPlaceListener();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        plugin = null;
    }
}
