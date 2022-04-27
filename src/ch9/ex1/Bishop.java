package ch9.ex1;

import java.util.ArrayList;

public class Bishop extends ChessPiece{

    public Bishop(String coordinates) {
        super(coordinates);
    }

    @Override
    ArrayList<String> canMoveTo() {
        int row = coordinates[0]-96;
        int column =coordinates[1]-48;

        ArrayList<String> moveTo = new ArrayList<String>();

        for(int i=1;i<9;i++)
            if(row!=i)
            moveTo.add(""+(char)(i+96)+(char)(column+48));

        for(int i=1;i<9;i++)
            if(column!=i)
                moveTo.add(""+(char)(row+96)+(char)(i+48));


        return moveTo;
    }
}
