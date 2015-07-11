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

    public Player() {
        super();
    }

    public Player(String playerName) {
        this.name = playerName;
    }

    public static List<Player> getAllPlayers() {
        return new Select().from(Player.class)
                .orderBy("id ASC")
                .execute();
    }
}
