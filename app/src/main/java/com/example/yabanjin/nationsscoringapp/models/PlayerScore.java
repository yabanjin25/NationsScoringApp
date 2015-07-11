package com.example.yabanjin.nationsscoringapp.models;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Column.ForeignKeyAction;
import com.activeandroid.annotation.Table;

@Table(name = "PlayerScores")
public class PlayerScore extends Model {
    @Column(name = "game", onUpdate = ForeignKeyAction.CASCADE, onDelete = ForeignKeyAction.CASCADE)
    public Game game;

    @Column(name = "player", onUpdate = ForeignKeyAction.CASCADE, onDelete = ForeignKeyAction.CASCADE)
    public Player player;

    @Column(name = "vp_from_tokens")
    public int vpFromTokens;

    @Column(name = "vp_from_colonies")
    public int vpFromColonies;

    @Column(name = "vp_from_workers_on_buildings")
    public int vpFromWorkersOnBuildings;

    @Column(name = "vp_from_workers_on_military")
    public int vpFromWorkersOnMilitary;

    @Column(name = "total_gold")
    public int totalGold;

    @Column(name = "total_food")
    public int totalFood;

    @Column(name = "total_stone")
    public int totalStone;

    @Column(name = "total_books")
    public int totalBooks;

    @Column(name = "total_military_strength")
    public int totalMilitaryStrength;

    @Column(name = "total_stability")
    public int totalStability;

    @Column(name = "vp_from_resources")
    public int vpFromResources;

    @Column(name = "turn_order")
    public int turnOrder;

    @Column(name = "place")
    public int finalPlace;


    public PlayerScore() {
        super();
    }
}
