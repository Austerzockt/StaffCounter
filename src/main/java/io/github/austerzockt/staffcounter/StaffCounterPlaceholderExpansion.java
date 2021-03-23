package io.github.austerzockt.staffcounter;

import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class StaffCounterPlaceholderExpansion extends PlaceholderExpansion {
    private StaffCounter staffCounter;
    public StaffCounterPlaceholderExpansion(StaffCounter staffCounter) {
    this.staffCounter = staffCounter;
    }

    @Override
    public boolean persist() {
        return true;
    }

    @Override
    public @NotNull String getIdentifier() {
        return "staffcounter";
    }

    @Override
    public String onPlaceholderRequest(Player player, @NotNull String identifier) {
    if (identifier.equals("counter")) {
        int amount = 0;
        for (Player s : Bukkit.getOnlinePlayers()) {
            if (s.hasPermission("staffcounter.staff")) {
            amount += 1;
            }

        }
        return String.valueOf(amount);
    }
    return null;
    }

    @Override
    public @NotNull String getAuthor() {
        return staffCounter.getDescription().getAuthors().toString();
    }

    @Override
    public boolean canRegister() {
        return true;
    }

    @Override
    public @NotNull String getVersion() {
        return staffCounter.getDescription().getVersion();
    }
}
