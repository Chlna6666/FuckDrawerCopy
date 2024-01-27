package org.com.fuckdrawercopy;

import org.bukkit.Bukkit;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.entity.EntityChangeBlockEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Arrays;
import java.util.List;

public final class FuckDrawerCopy extends JavaPlugin implements Listener {

    private List<String> blockList = Arrays.asList(
            "STORAGEDRAWERS_OAK_FULL_DRAWERS_1",
            "STORAGEDRAWERS_OAK_FULL_DRAWERS_2",
            "STORAGEDRAWERS_OAK_FULL_DRAWERS_4",
            "STORAGEDRAWERS_OAK_HALF_DRAWERS_1",
            "STORAGEDRAWERS_OAK_HALF_DRAWERS_2",
            "STORAGEDRAWERS_OAK_HALF_DRAWERS_4",
            "STORAGEDRAWERS_SPRUCE_FULL_DRAWERS_1",
            "STORAGEDRAWERS_SPRUCE_FULL_DRAWERS_2",
            "STORAGEDRAWERS_SPRUCE_FULL_DRAWERS_4",
            "STORAGEDRAWERS_SPRUCE_HALF_DRAWERS_1",
            "STORAGEDRAWERS_SPRUCE_HALF_DRAWERS_2",
            "STORAGEDRAWERS_SPRUCE_HALF_DRAWERS_4",
            "STORAGEDRAWERS_BIRCH_FULL_DRAWERS_1",
            "STORAGEDRAWERS_BIRCH_FULL_DRAWERS_2",
            "STORAGEDRAWERS_BIRCH_FULL_DRAWERS_4",
            "STORAGEDRAWERS_BIRCH_HALF_DRAWERS_1",
            "STORAGEDRAWERS_BIRCH_HALF_DRAWERS_2",
            "STORAGEDRAWERS_BIRCH_HALF_DRAWERS_4",
            "STORAGEDRAWERS_JUNGLE_FULL_DRAWERS_1",
            "STORAGEDRAWERS_JUNGLE_FULL_DRAWERS_2",
            "STORAGEDRAWERS_JUNGLE_FULL_DRAWERS_4",
            "STORAGEDRAWERS_JUNGLE_HALF_DRAWERS_1",
            "STORAGEDRAWERS_JUNGLE_HALF_DRAWERS_2",
            "STORAGEDRAWERS_JUNGLE_HALF_DRAWERS_4",
            "STORAGEDRAWERS_ACACIA_FULL_DRAWERS_1",
            "STORAGEDRAWERS_ACACIA_FULL_DRAWERS_2",
            "STORAGEDRAWERS_ACACIA_FULL_DRAWERS_4",
            "STORAGEDRAWERS_ACACIA_HALF_DRAWERS_1",
            "STORAGEDRAWERS_ACACIA_HALF_DRAWERS_2",
            "STORAGEDRAWERS_ACACIA_HALF_DRAWERS_4",
            "STORAGEDRAWERS_DARK_OAK_FULL_DRAWERS_1",
            "STORAGEDRAWERS_DARK_OAK_FULL_DRAWERS_2",
            "STORAGEDRAWERS_DARK_OAK_FULL_DRAWERS_4",
            "STORAGEDRAWERS_DARK_OAK_HALF_DRAWERS_1",
            "STORAGEDRAWERS_DARK_OAK_HALF_DRAWERS_2",
            "STORAGEDRAWERS_DARK_OAK_HALF_DRAWERS_4",
            "STORAGEDRAWERS_CRIMSON_FULL_DRAWERS_1",
            "STORAGEDRAWERS_CRIMSON_FULL_DRAWERS_2",
            "STORAGEDRAWERS_CRIMSON_FULL_DRAWERS_4",
            "STORAGEDRAWERS_CRIMSON_HALF_DRAWERS_1",
            "STORAGEDRAWERS_CRIMSON_HALF_DRAWERS_2",
            "STORAGEDRAWERS_CRIMSON_HALF_DRAWERS_4",
            "STORAGEDRAWERS_WARPED_FULL_DRAWERS_1",
            "STORAGEDRAWERS_WARPED_FULL_DRAWERS_2",
            "STORAGEDRAWERS_WARPED_FULL_DRAWERS_4",
            "STORAGEDRAWERS_WARPED_HALF_DRAWERS_1",
            "STORAGEDRAWERS_WARPED_HALF_DRAWERS_2",
            "STORAGEDRAWERS_WARPED_HALF_DRAWERS_4",
            "STORAGEDRAWERS_COMPACTING_DRAWERS_3"
    );

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
        Bukkit.getLogger().info("干，抽屉复制 by Chlna6666");
    }

    /*@EventHandler
    public void onBreak(BlockBreakEvent event){
        String blockType = event.getBlock().getType().toString();
        getLogger().info(event + "破坏了" + blockType + "方块");

    }*/

    @EventHandler
    public void onBlockBreak(BlockBreakEvent event) {
        String blockType = event.getBlock().getType().toString();
        if (event.getPlayer() != null && "Deployer".equals(event.getPlayer().getName())) {
            if (blockList.contains(blockType)) {
                event.setCancelled(true);
                double x = event.getPlayer().getLocation().getX();
                double y = event.getPlayer().getLocation().getY();
                double z = event.getPlayer().getLocation().getZ();
                getLogger().warning("Deployer：X=" + x + ", Y=" + y + ", Z=" + z +" 试图挖掘列表中的方块：" + blockType);
            }
        }

    }



    @Override
    public void onDisable() {

    }

}
