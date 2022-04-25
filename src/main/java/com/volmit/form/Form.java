package com.volmit.form;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class Form extends JavaPlugin {
    private static Form instance;

    @Override
    public void onEnable() {
        instance = this;
    }

    @Override
    public void onDisable() {

    }

    public static Form instance()
    {
        return instance;
    }

    private static void log(String category, Object message)
    {
        instance.getServer().getConsoleSender().sendMessage(ChatColor.GRAY + "[" + category + ChatColor.GRAY + "]: " + message);
    }

    public static void v(Object msg)
    {
        log(ChatColor.LIGHT_PURPLE + "Verbose", ChatColor.GRAY + "" + msg);
    }

    public static void i(Object msg)
    {
        log(ChatColor.GREEN + "Verbose", ChatColor.WHITE + "" + msg);
    }

    public static void w(Object msg)
    {
        log(ChatColor.GOLD + "Warn", ChatColor.YELLOW + "" + msg);
    }

    public static void f(Object msg)
    {
        log(ChatColor.DARK_RED + "Fatal", ChatColor.RED + "" + msg);
    }
}
