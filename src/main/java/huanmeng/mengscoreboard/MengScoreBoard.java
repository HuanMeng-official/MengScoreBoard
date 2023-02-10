package huanmeng.mengscoreboard;

import org.bukkit.plugin.java.JavaPlugin;

public final class MengScoreBoard extends JavaPlugin {

    @Override
    public void onLoad() {
        System.out.println("插件正在加载");
    }

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("插件成功加载");
        getConfig().options().copyDefaults(true);
        saveDefaultConfig();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("插件正在关闭");
    }
}
