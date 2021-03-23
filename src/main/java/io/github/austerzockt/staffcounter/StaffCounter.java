package io.github.austerzockt.staffcounter;

import org.bukkit.plugin.java.JavaPlugin;

public final class StaffCounter extends JavaPlugin {

    @Override
    public void onEnable() {
    new StaffCounterPlaceholderExpansion(this).register();
    }


}
