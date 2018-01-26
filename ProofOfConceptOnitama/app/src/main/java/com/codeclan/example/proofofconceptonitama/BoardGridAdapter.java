package com.codeclan.example.proofofconceptonitama;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import java.util.ArrayList;

/**
 * Created by user on 25/01/2018.
 */

public class BoardGridAdapter extends ArrayAdapter<SquareOnBoard> {


    public BoardGridAdapter(Context context, ArrayList<SquareOnBoard> squares) {
        super(context, 0, squares);
    }


    public View getView(int position, View squareView, ViewGroup parent){
        if (squareView == null){
            squareView = LayoutInflater.from(getContext()).inflate(R.layout.square_item_view, parent, false);
        }

        ImageView squareImage = squareView.findViewById(R.id.squareItemView);

        SquareOnBoard currentSquare = getItem(position);

        if (currentSquare.getxCoord() == 3 && currentSquare.getyCoord() == 3){
            squareImage.setImageResource(R.drawable.small_rock);
        }

        squareView.setTag(currentSquare);

        return squareView;

    }
}
