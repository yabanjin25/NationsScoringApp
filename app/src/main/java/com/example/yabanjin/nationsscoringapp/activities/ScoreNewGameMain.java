package com.example.yabanjin.nationsscoringapp.activities;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import com.example.yabanjin.nationsscoringapp.R;
import com.example.yabanjin.nationsscoringapp.adapters.NewPlayerScoreArrayAdapter;
import com.example.yabanjin.nationsscoringapp.models.PlayerScore;

import java.util.ArrayList;


public class ScoreNewGameMain extends ActionBarActivity {

    protected ArrayList<PlayerScore> playerScores;
    protected NewPlayerScoreArrayAdapter aPlayerScores;
    protected ListView lvPlayerScores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_new_game_main);

        playerScores = new ArrayList<>();
        aPlayerScores = new NewPlayerScoreArrayAdapter(this, playerScores);
        lvPlayerScores = (ListView) findViewById(R.id.lvNewPlayerScores);
        lvPlayerScores.setAdapter(aPlayerScores);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_score_new_game_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
