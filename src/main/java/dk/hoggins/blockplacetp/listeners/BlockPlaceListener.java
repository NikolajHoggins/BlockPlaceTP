package dk.hoggins.blockplacetp.listeners;

import dk.hoggins.blockplacetp.BlockPlaceTP;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.plugin.Plugin;

import java.util.Random;

public class BlockPlaceListener implements Listener {
    public BlockPlaceListener() {
        Plugin main = BlockPlaceTP.plugin;
        main.getServer().getPluginManager().registerEvents(this, main);
    }
    @EventHandler
    public void onBlockPlace(BlockPlaceEvent event) {
        Player p = event.getPlayer();
        p.sendMessage(p.getName() + " placed: " + event.getBlock().getType());
        System.out.println(p.getName() + " placed: " + event.getBlock().getType());
        Location newLoc = new Location(p.getWorld(), p.getLocation().getX()+getRand(),p.getLocation().getY()+getRand(),p.getLocation().getZ()+getRand());
        p.teleport(newLoc);
    }

    public double getRand(){
        Random rand = new Random();
        int max = 5;
        int min = -5;
        int fullrange = max + (-1 * min);
        double randomValue = min + (fullrange * rand.nextDouble());
        return randomValue;
    }
}
