package dk.hoggins.blockplacetp.listeners;

import dk.hoggins.blockplacetp.BlockPlaceTP;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.plugin.Plugin;

public class BlockBreakListener implements Listener {
    public BlockBreakListener() {
        Plugin main = BlockPlaceTP.plugin;
        main.getServer().getPluginManager().registerEvents(this, main);
    }
    @EventHandler
    public void onBlockBreak(BlockBreakEvent event) {
        System.out.println(event);
    }
}
