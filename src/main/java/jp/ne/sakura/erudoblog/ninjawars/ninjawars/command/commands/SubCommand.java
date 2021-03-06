package jp.ne.sakura.erudoblog.ninjawars.ninjawars.command.commands;

import jp.ne.sakura.erudoblog.ninjawars.ninjawars.NinjaWars;
import lombok.Getter;
import org.bukkit.entity.Player;

public abstract class SubCommand {

    @Getter
    private NinjaWars plugin;

    /*
     *  <command> <subcommand> args[0] args[1] ...
     */
    public SubCommand(NinjaWars plugin) {
        this.plugin = plugin;
    }


    /**
     * @param player コマンドが実行されたプレイヤー
     * @param args コマンドのエイリアス
     */
    public abstract void onCommand(Player player, String[] args);


    /**
     * @return サブコマンドの名前
     */
    public abstract String name();


    /**
     * @return サブコマンドの詳細
     */
    public abstract String info();


    /**
     * @return args[]の部分
     */
    public abstract String[] aliases();
}
