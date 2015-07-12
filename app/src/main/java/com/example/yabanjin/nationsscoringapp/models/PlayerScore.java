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
    public long gameId;

    @Column(name = "player_id", onUpdate = ForeignKeyAction.CASCADE, onDelete = ForeignKeyAction.CASCADE)
    public long playerId;

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

    @Column(name = "total_vp")
    public int totalVp;

    @Column(name = "turn_order")
    public int turnOrder;

    @Column(name = "place")
    public int finalPlace;


    public PlayerScore() {
        super();
        this.gameId = -1;
        this.playerId = -1;
        this.vpFromTokens = 0;
        this.vpFromColonies = 0;
        this.vpFromWorkersOnBuildings = 0;
        this.vpFromWorkersOnMilitary = 0;
        this.totalGold = 0;
        this.totalFood = 0;
        this.totalStone = 0;
        this.totalBooks = 0;
        this.totalMilitaryStrength = 0;
        this.totalStability = 0;
        this.vpFromResources = 0;
        this.totalVp = 0;
        this.turnOrder = -1;
        this.finalPlace = 0;
    }

    public PlayerScore(long gameId, long playerId, int vpFromTokens, int vpFromColonies, int vpFromWorkersOnBuildings, int vpFromWorkersOnMilitary,
                       int totalGold, int totalFood, int totalStone, int totalBooks, int totalMilitaryStrength, int totalStability, int vpFromResources,
                       int totalVp, int turnOrder, int finalPlace) {
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
        this.totalVp = totalVp;
        this.turnOrder = turnOrder;
        this.finalPlace = finalPlace;
    }

    public static List<PlayerScore> getAllPlayerScores() {
        return new Select().from(PlayerScore.class)
                .orderBy("id ASC")
                .execute();
    }

    public long getGameId() {
        return gameId;
    }

    public int getVpFromTokens() {
        return vpFromTokens;
    }

    public long getPlayerId() {
        return playerId;
    }

    public int getVpFromColonies() {
        return vpFromColonies;
    }

    public int getVpFromWorkersOnBuildings() {
        return vpFromWorkersOnBuildings;
    }

    public int getTotalGold() {
        return totalGold;
    }

    public int getTotalFood() {
        return totalFood;
    }

    public int getTotalMilitaryStrength() {
        return totalMilitaryStrength;
    }

    public int getTotalStability() {
        return totalStability;
    }

    public int getTurnOrder() {
        return turnOrder;
    }

    public int getFinalPlace() {
        return finalPlace;
    }

    public int getTotalVp() {
        return totalVp;
    }

    public int getVpFromResources() {
        return vpFromResources;
    }

    public int getTotalStone() {
        return totalStone;
    }

    public int getTotalBooks() {
        return totalBooks;
    }

    public int getVpFromWorkersOnMilitary() {
        return vpFromWorkersOnMilitary;
    }

    public void setGameId(long gameId) {
        this.gameId = gameId;
    }

    public void setPlayerId(long playerId) {
        this.playerId = playerId;
    }

    public void setVpFromColonies(int vpFromColonies) {
        this.vpFromColonies = vpFromColonies;
        this.updateTotalVp();
    }

    public void setVpFromTokens(int vpFromTokens) {
        this.vpFromTokens = vpFromTokens;
        this.updateTotalVp();
    }

    public void setVpFromWorkersOnBuildings(int vpFromWorkersOnBuildings) {
        this.vpFromWorkersOnBuildings = vpFromWorkersOnBuildings;
        this.updateTotalVp();
    }

    public void setVpFromWorkersOnMilitary(int vpFromWorkersOnMilitary) {
        this.vpFromWorkersOnMilitary = vpFromWorkersOnMilitary;
        this.updateTotalVp();
    }

    public void setTotalGold(int totalGold) {
        this.totalGold = totalGold;
        this.updateVpFromResources();
        this.updateTotalVp();
    }

    public void setTotalFood(int totalFood) {
        this.totalFood = totalFood;
        this.updateVpFromResources();
        this.updateTotalVp();
    }

    public void setTotalStone(int totalStone) {
        this.totalStone = totalStone;
        this.updateVpFromResources();
        this.updateTotalVp();
    }

    public void setTotalBooks(int totalBooks) {
        this.totalBooks = totalBooks;
        this.updateVpFromResources();
        this.updateTotalVp();
    }

    public void setTotalMilitaryStrength(int totalMilitaryStrength) {
        this.totalMilitaryStrength = totalMilitaryStrength;
        this.updateVpFromResources();
        this.updateTotalVp();
    }

    public void setTotalStability(int totalStability) {
        this.totalStability = totalStability;
        this.updateVpFromResources();
        this.updateTotalVp();
    }

    public void setTurnOrder(int turnOrder) {
        this.turnOrder = turnOrder;
    }

    public void setFinalPlace(int finalPlace) {
        this.finalPlace = finalPlace;
    }

    protected void updateVpFromResources() {
        this.vpFromResources = this.totalGold
                + this.totalFood
                + this.totalStone
                + this.totalBooks
                + this.totalMilitaryStrength
                + this.totalStability;
    }

    protected void updateTotalVp() {
        this.totalVp = this.vpFromTokens
                + this.vpFromColonies
                + this.vpFromWorkersOnBuildings
                + this.vpFromWorkersOnMilitary
                + (this.vpFromResources / 10);
    }
}
