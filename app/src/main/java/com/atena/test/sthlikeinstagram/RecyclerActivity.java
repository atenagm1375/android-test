package com.atena.test.sthlikeinstagram;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerActivity extends Activity {

    private List<Data> dataset;
    private RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.my_recycler);

        rv=(RecyclerView)findViewById(R.id.recycler);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);
        rv.setHasFixedSize(true);

        initializeData();
        initializeAdapter();
    }

    private void initializeData(){
        dataset = new ArrayList<>();
        dataset.add(new Data("state", "start accepting state", R.drawable.accept_state));
        dataset.add(new Data("state", "start accepting state", R.drawable.accept_state));
        dataset.add(new Data("state", "start accepting state", R.drawable.accept_state));
        dataset.add(new Data("state", "start accepting state", R.drawable.accept_state));
        dataset.add(new Data("state", "start accepting state", R.drawable.accept_state));
        dataset.add(new Data("state", "start accepting state", R.drawable.accept_state));
    }

    private void initializeAdapter(){
        RVAdapter adapter = new RVAdapter(dataset);
        rv.setAdapter(adapter);
    }
}
