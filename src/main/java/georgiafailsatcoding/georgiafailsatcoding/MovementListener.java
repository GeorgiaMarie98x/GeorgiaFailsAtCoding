package georgiafailsatcoding.georgiafailsatcoding;

import org.bukkit.Particle;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class MovementListener implements Listener {

    @EventHandler
    public void onMove(PlayerMoveEvent e) {

        Player p = e.getPlayer();

        p.spawnParticle(Particle.FIREWORKS_SPARK, p.getLocation(), 3);


    }


}
