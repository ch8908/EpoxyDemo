package com.example.epoxydemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.example.epoxydemo.controller.ListController;
import com.example.epoxydemo.model.Comment;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {

    @BindView(R.id.recyclerView) RecyclerView recyclerView;
    private ListController controller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple);
        ButterKnife.bind(this);
        setUpController();
        setUpRecyclerView();
        updateController();
    }

    private void updateController() {
        List<Comment> result = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            result.add(new Comment(i, "Comment:" + String.valueOf(i)));
        }
        controller.setData(result);
    }

    private void setUpRecyclerView() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(controller.getAdapter());
    }

    private void setUpController() {
        controller = new ListController(this);
    }
}
