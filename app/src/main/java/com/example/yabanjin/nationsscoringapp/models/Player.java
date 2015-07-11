package com.example.yabanjin.nationsscoringapp.models;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

import java.util.Date;

@Table(name = "Players")
public class Player extends Model {
    @Column(name = "player_name")
    public Date datePlayed;

    public Player() {
        super();
    }
}
