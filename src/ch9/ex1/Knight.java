package ch9.ex1;

import java.util.ArrayList;

public class Knight extends ChessPiece{


    public Knight(String coordinates) {
        super(coordinates);
    }

    @Override
    ArrayList<String> canMoveTo() {
        int row = coordinates[0]-96;
        int column =coordinates[1]-48;

        ArrayList<String> moveTo = new ArrayList<String>();

        for(int i=row-2;i<row+3;i++)
            for(int j=column-2;j<row+3;j++)
                if((i>0 && i<9) && ((j>0 && j<9)) && ((row-i)*(row-i) + (column-j)*(column-j))==5)
                    moveTo.add(""+(char)(i+96)+(char)(j+48));

        return moveTo;
    }

}
