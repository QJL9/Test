package dev.ender.test;


import ender.dev.verify.Tasks.InitialVerifyTask;
import ender.dev.verify.Tasks.VerifyTask;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;
public final class Test extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        FileConfiguration CONFIG = this.getConfig();
        String customerId = CONFIG.getString("customer_id");
        String cdKey = CONFIG.getString("cd_key");


        new VerifyTask(this, customerId, cdKey)
                .runTaskTimerAsynchronously(this, 0, 20*10);

    }

    @Override
    public void onDisable() {

        // Plugin shutdown logic
    }
}
