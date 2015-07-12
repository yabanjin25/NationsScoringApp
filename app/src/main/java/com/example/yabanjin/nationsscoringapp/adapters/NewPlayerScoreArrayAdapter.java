package com.example.yabanjin.nationsscoringapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.yabanjin.nationsscoringapp.R;
import com.example.yabanjin.nationsscoringapp.models.Player;
import com.example.yabanjin.nationsscoringapp.models.PlayerScore;

import java.util.List;

public class NewPlayerScoreArrayAdapter extends ArrayAdapter<PlayerScore> {

    private static class ViewHolder {
        TextView tvPlayerName;
        TextView tvPlayerScore;
    }

    public NewPlayerScoreArrayAdapter(Context context, List<PlayerScore> scores) {
        super(context, android.R.layout.simple_list_item_1, scores);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        PlayerScore score = getItem(position);
        ViewHolder viewHolder;
        if (convertView == null) {
            viewHolder = new ViewHolder();
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_player_score, parent, false);

            viewHolder.tvPlayerName = (TextView) convertView.findViewById(R.id.tvPlayerName);
            viewHolder.tvPlayerScore = (TextView) convertView.findViewById(R.id.tvPlayerScore);

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.tvPlayerName.setText(Player.getPlayer(score.playerId).name);
        viewHolder.tvPlayerScore.setText(score.totalVp);

        return convertView;
    }
}
