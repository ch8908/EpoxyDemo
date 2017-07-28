package com.example.epoxydemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.simpleButton, R.id.listButton})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.simpleButton:
                startActivity(new Intent(this, SimpleActivity.class));
                break;
            case R.id.listButton:
                startActivity(new Intent(this, ListActivity.class));
                break;
        }
    }
}
