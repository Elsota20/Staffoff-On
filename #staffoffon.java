package com.tuempresa.tuproyecto;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class StaffPrefixPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Registra el manejador de comandos en el plugin
        getCommand("staffoff").setExecutor(new StaffPrefixCommand());
        getCommand("staffon").setExecutor(new StaffPrefixCommand());
    }

    // Clase interna para manejar los comandos
    public class StaffPrefixCommand implements CommandExecutor {

        @Override
        public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
            // Verifica si el comando es enviado por un jugador
            if (sender instanceof Player) {
                Player player = (Player) sender;
                
                // Maneja el comando staffoff
                if (command.getName().equalsIgnoreCase("staffoff")) {
                    if (player.hasPermission("staff.use")) {
                        // Elimina el prefijo del jugador
                        player.setDisplayName(player.getName()); // Restablece el nombre
                        player.sendMessage(ChatColor.GREEN + "Prefijo de staff desactivado.");
                        return true;
                    } else {
                        player.sendMessage(ChatColor.RED + "No tienes permiso para usar este comando.");
                        return false;
                    }
                }
                
                // Maneja el comando staffon
                else if (command.getName().equalsIgnoreCase("staffon")) {
                    if (player.hasPermission("staff.use")) {
                        // Agrega el prefijo al jugador
                        player.setDisplayName(ChatColor.GREEN + "[Helper] " + player.getName()); // Agrega el prefijo
                        player.sendMessage(ChatColor.GREEN + "Prefijo de staff activado.");
                        return true;
                    } else {
                        player.sendMessage(ChatColor.RED + "No tienes permiso para usar este comando.");
                        return false;
                    }
                }
            }
            return false;
        }
    }
}
