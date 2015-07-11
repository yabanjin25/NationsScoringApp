package com.example.yabanjin.nationsscoringapp.models;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Column.ForeignKeyAction;
import com.activeandroid.annotation.Table;
import com.activeandroid.query.Select;

import java.util.List;

@Table(name = "PlayerScores")
public class PlayerScore extends Model {
    @Column(name = "game_id", onUpdate = ForeignKeyAction.CASCADE, onDelete = ForeignKeyAction.CASCADE)
    public int gameId;

    @Column(name = "player_id", onUpdate = ForeignKeyAction.CASCADE, onDelete = ForeignKeyAction.CASCADE)
    public int playerId;

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

    public PlayerScore(int gameId, int playerId, int vpFromTokens, int vpFromColonies, int vpFromWorkersOnBuildings, int vpFromWorkersOnMilitary,
                       int totalGold, int totalFood, int totalStone, int totalBooks, int totalMilitaryStrength, int totalStability, int vpFromResources,
                       int turnOrder, int finalPlace) {
        super();
        this.gameId = gameId;
        this.playerId = playerId;
        this.vpFromTokens = vpFromTokens;
        this.vpFromColonies = vpFromColonies;
        this.vpFromWorkersOnBuildings = vpFromWorkersOnBuildings;
        this.vpFromWorkersOnMilitary = vpFromWorkersOnMilitary;
        this.totalGold = totalGold;
        this.totalFood = totalFood;
        this.totalStone = totalStone;
        this.totalBooks = totalBooks;
        this.totalMilitaryStrength = totalMilitaryStrength;
        this.totalStability = totalStability;
        this.vpFromResources = vpFromResources;
        this.turnOrder = turnOrder;
        this.finalPlace = finalPlace;
    }

    public static List<PlayerScore> getAllPlayerScores() {
        return new Select().from(PlayerScore.class)
                .orderBy("id ASC")
                .execute();
    }
}
