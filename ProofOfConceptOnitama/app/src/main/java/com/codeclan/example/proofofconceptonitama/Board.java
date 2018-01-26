package com.codeclan.example.proofofconceptonitama;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by user on 25/01/2018.
 */

public class Board {


    private ArrayList<SquareOnBoard> completeBoard;


    public Board(){
        completeBoard = new ArrayList<>();
        createBoard();
    }

    private void createBoard() {
        SquareOnBoard zerozero      = new SquareOnBoard(0, 0);
        SquareOnBoard zeroone       = new SquareOnBoard(0, 1);
        SquareOnBoard zerotwo       = new SquareOnBoard(0, 2);
        SquareOnBoard zerothree     = new SquareOnBoard(0, 3);
        SquareOnBoard zerofour      = new SquareOnBoard(0, 4);
        SquareOnBoard onezero       = new SquareOnBoard(1, 0);
        SquareOnBoard oneone        = new SquareOnBoard(1, 1);
        SquareOnBoard onetwo        = new SquareOnBoard(1, 2);
        SquareOnBoard onethree      = new SquareOnBoard(1, 3);
        SquareOnBoard onefour       = new SquareOnBoard(1, 4);
        SquareOnBoard twozero       = new SquareOnBoard(2, 0);
        SquareOnBoard twoone        = new SquareOnBoard(2, 1);
        SquareOnBoard twotwo        = new SquareOnBoard(2, 2);
        SquareOnBoard twothree      = new SquareOnBoard(2, 3);
        SquareOnBoard twofour       = new SquareOnBoard(2, 4);
        SquareOnBoard threezero     = new SquareOnBoard(3, 0);
        SquareOnBoard threeone      = new SquareOnBoard(3, 1);
        SquareOnBoard threetwo      = new SquareOnBoard(3, 2);
        SquareOnBoard threethree    = new SquareOnBoard(3, 3);
        SquareOnBoard threefour     = new SquareOnBoard(3, 4);
        SquareOnBoard fourzero      = new SquareOnBoard(4, 0);
        SquareOnBoard fourone       = new SquareOnBoard(4, 1);
        SquareOnBoard fourtwo       = new SquareOnBoard(4, 2);
        SquareOnBoard fourthree     = new SquareOnBoard(4, 3);
        SquareOnBoard fourfour      = new SquareOnBoard(4, 4);

        completeBoard.addAll(Arrays.asList(zerozero, zeroone, zerotwo, zerothree, zerofour,
                                            onezero, oneone, onetwo, onethree, onefour,
                                            twozero, twoone, twotwo, twothree, twofour,
                                            threezero, threeone, threetwo, threethree, threefour,
                                            fourzero, fourone, fourtwo, fourthree, fourfour));
    }

    public ArrayList<SquareOnBoard> getCompleteBoard(){
        ArrayList<SquareOnBoard> copyBoard = new ArrayList<>(this.completeBoard);
        return copyBoard;
    }
}
