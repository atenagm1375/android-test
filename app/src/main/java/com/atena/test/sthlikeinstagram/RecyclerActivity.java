package com.atena.test.sthlikeinstagram;

import android.app.Activity;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerActivity extends Activity {


    private List<Data> dataset;

    private void initializeData() {
        dataset = new ArrayList<>();
        dataset.add(new Data("gwez", "Let there be gwez!", R.drawable.gwezzz));
        dataset.add(new Data("state", "This is the start accepting state of an automaton", R.drawable.accept_state));
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        RVAdapter rvAdapter = new RVAdapter(dataset);
        recyclerView.setAdapter(rvAdapter);
    }
}
