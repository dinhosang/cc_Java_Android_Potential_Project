package com.codeclan.example.proofofconceptonitama;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.GridView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Board board = new Board();
        BoardGridAdapter boardGridAdapter = new BoardGridAdapter(this, board.getCompleteBoard());

        GridView gridView = findViewById(R.id.boardGridView);
        gridView.setAdapter(boardGridAdapter);
    }
}
