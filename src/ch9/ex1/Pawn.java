package ch9.ex1;

import java.util.ArrayList;

public class Pawn extends ChessPiece{

    public Pawn(String coordinates) {
        super(coordinates);
    }

    @Override
    ArrayList<String> canMoveTo() {
        int row = coordinates[0]-96;
        int column =coordinates[1]-48;

        ArrayList<String> moveTo = new ArrayList<String>();

        moveTo.add(column+1<9?""+(char)(row+96)+(char)(column+1+48):null);
        return moveTo;
    }
}
