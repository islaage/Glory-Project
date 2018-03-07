package com.github.islaage.GloriaSystem;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;

/**
 *  ログインメッセージ
 */

public class LoginMessage implements Listener {

	@SuppressWarnings("unused")
	private final GloriaSystem plg;

    /**
     * コンストラクタ
     * @param plg_  プラグインメインクラスのインスタンス
     */

	public LoginMessage(GloriaSystem plg_) {
		plg = plg_;
	}

	@EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        // ログインしたプレイヤーにメッセージを表示する
		Player p = event.getPlayer();
        event.getPlayer().sendMessage("テスト");
        // プレイヤーに本を作成して渡す
        ItemStack item = new ItemStack(Material.WRITTEN_BOOK);
        BookMeta meta = (BookMeta)item.getItemMeta();
        meta.setAuthor("a");
        meta.setDisplayName("a");
        meta.addPage(new String[]{
            // 1ページ目
            "1145141919810364364893！\n"});
        item.setItemMeta(meta);
        p.getInventory().addItem(item);
    }
	}

