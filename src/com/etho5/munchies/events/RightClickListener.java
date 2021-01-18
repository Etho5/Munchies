package com.etho5.munchies.events;

import com.etho5.munchies.items.CustomItem;
import com.etho5.munchies.items.Items;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;


public class RightClickListener implements Listener {

    //TODO debug this shit

    @EventHandler
    public void onRightClick(PlayerInteractEvent e) {
        Player p = e.getPlayer();
        PlayerInventory inv = p.getInventory();
        ItemStack main = inv.getItemInMainHand();
        ItemStack off = inv.getItemInOffHand();

        //null check
        if(main.getItemMeta() == null || off.getItemMeta() == null) {
            e.setCancelled(false);
        }

        // rightclick when hungry on certain foods to instaeat
        if((e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK) && p.getFoodLevel() < 20) {
            if(main.getItemMeta() != null && main.getItemMeta().hasCustomModelData()) {
                if (main.getItemMeta().getCustomModelData() == 536110) {
                    main.setAmount(main.getAmount() - 1);
                    if (main.getAmount() < 1) {
                        inv.setItemInMainHand(new ItemStack(Material.AIR));
                    } else {
                        inv.setItemInMainHand(main);
                    }
                    p.setFoodLevel(p.getFoodLevel() + 6);
                    p.setSaturation(p.getSaturation() + 14.4F);
                    p.playSound(p.getLocation(), Sound.ENTITY_GENERIC_EAT, 3.0F, 0.75F);

                } else if (main.getItemMeta().getCustomModelData() == 536105) {
                    main.setAmount(main.getAmount() - 1);
                    if (main.getAmount() < 1) {
                        inv.setItemInMainHand(Items.CAN.getItem());
                    } else {
                        inv.setItemInMainHand(main);
                        inv.addItem(Items.CAN.getItem());
                    }
                    p.setFoodLevel(p.getFoodLevel() + 4);
                    p.setSaturation(p.getSaturation() + 4.5F);
                    p.playSound(p.getLocation(), Sound.ENTITY_GENERIC_DRINK, 3.0F, 0.5F);

                } else if (main.getItemMeta().getCustomModelData() == 53678) {
                    main.setAmount(main.getAmount() - 1);
                    if (main.getAmount() < 1) {
                        inv.setItemInMainHand(Items.CAN.getItem());
                    } else {
                        inv.setItemInMainHand(main);
                        inv.addItem(Items.CAN.getItem());
                    }
                    p.setFoodLevel(p.getFoodLevel() + 5);
                    p.setSaturation(p.getSaturation() + 6.5F);
                    p.playSound(p.getLocation(), Sound.ENTITY_GENERIC_EAT, 3.0F, 0.75F);
                }

            } else if (off.getItemMeta() != null && off.getItemMeta().hasCustomModelData()) {
                if (off.getItemMeta().getCustomModelData() == 536110) {
                    off.setAmount(off.getAmount() - 1);
                    if (off.getAmount() < 1) {
                        inv.setItemInOffHand(new ItemStack(Material.AIR));
                    } else {
                        inv.setItemInOffHand(off);
                    }
                    p.setFoodLevel(p.getFoodLevel() + 6);
                    p.setSaturation(p.getSaturation() + 14.4F);
                    p.playSound(p.getLocation(), Sound.ENTITY_GENERIC_EAT, 3.0F, 0.75F);
                }

                else if (off.getItemMeta().getCustomModelData() == 536105) {
                    off.setAmount(off.getAmount() - 1);
                    if (off.getAmount() < 1) {
                        inv.setItemInOffHand(Items.CAN.getItem());
                    } else {
                        inv.setItemInOffHand(off);
                        inv.addItem(Items.CAN.getItem());
                    }
                    p.setFoodLevel(p.getFoodLevel() + 4);
                    p.setSaturation(p.getSaturation() + 4.5F);
                    p.playSound(p.getLocation(), Sound.ENTITY_GENERIC_DRINK, 3.0F, 0.5F);

                } else if (off.getItemMeta().getCustomModelData() == 53678) {
                    off.setAmount(off.getAmount() - 1);
                    if (off.getAmount() < 1) {
                        inv.setItemInOffHand(Items.CAN.getItem());
                    } else {
                        inv.setItemInOffHand(off);
                        inv.addItem(Items.CAN.getItem());
                    }
                    p.setFoodLevel(p.getFoodLevel() + 5);
                    p.setSaturation(p.getSaturation() + 6.5F);
                    p.playSound(p.getLocation(), Sound.ENTITY_GENERIC_EAT, 3.0F, 0.75F);
                }
            }
        }
    }
}