package com.example.yabanjin.nationsscoringapp.models;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import com.activeandroid.query.Select;

import java.util.List;

@Table(name = "Players")
public class Player extends Model {
    @Column(name = "player_name")
    public String name;

    @Column(name = "active")
    public boolean active;

    public Player() {
        super();
    }

    public Player(String playerName) {
        this.name = playerName;
        this.active = true;
    }

    public static List<Player> getAllPlayers() {
        return new Select().from(Player.class)
                .orderBy("id ASC")
                .execute();
    }

    public static long createNewPlayer(String name) {
        Player p = new Player();
        p.name = name;
        p.save();
        return p.getId();
    }

    public void activate() {
        this.active = true;
        this.save();
    }

    public void deactivate() {
        this.active = false;
        this.save();
    }

    public static Player getPlayer(long playerId) {
        Player p = Player.load(Player.class, playerId);
        return p;
    }
}
