package com.example.yabanjin.nationsscoringapp.models;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

import java.util.Date;
import java.util.List;

@Table(name = "Games")
public class Game extends Model {
    @Column(name = "date_played")
    public Date datePlayed;

    public Game() {
        super();
    }

    public List<PlayerScore> playerScores() {
        return getMany(PlayerScore.class, "PlayerScore");
    }
}
