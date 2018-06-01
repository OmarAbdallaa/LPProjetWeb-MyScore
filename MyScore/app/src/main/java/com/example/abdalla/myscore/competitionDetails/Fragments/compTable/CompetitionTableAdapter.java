package com.example.abdalla.myscore.competitionDetails.Fragments.compTable;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.abdalla.myscore.R;
import com.example.abdalla.myscore.competitionDetails.Fragments.compFixtures.CompetitionFixturesAdapter;
import com.example.abdalla.myscore.competitionDetails.competitionDetails_model.table_model;

import java.util.ArrayList;

/**
 * Created by abdalla  10-2017.
 */

public class CompetitionTableAdapter extends RecyclerView.Adapter<ViewHolder> {

    Context context;
    ArrayList<table_model> tableModels;

    public CompetitionTableAdapter(Context context, ArrayList<table_model> tableModels){
        this.context = context;
        this.tableModels = tableModels;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.comp_table_item,parent,false);
        return new ViewHolder(context,view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.bindTable(tableModels.get(position));
    }

    @Override
    public int getItemCount() {
        return tableModels.size();
    }
}
