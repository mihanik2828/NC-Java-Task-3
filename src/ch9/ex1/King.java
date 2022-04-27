package ch9.ex1;

import java.util.ArrayList;

public class King extends ChessPiece{
    public King(String coordinates) {
        super(coordinates);
    }

    @Override
    ArrayList<String> canMoveTo() {
        int row = coordinates[0]-96;
        int column =coordinates[1]-48;

        ArrayList<String> moveTo = new ArrayList<String>();

        for(int i=-1; i<2;i++)
            for(int j=-1; j<2;j++)
                if(row+i>0 && row+i<9 && column+j>0 && column+j<9 && !(i==0 && j==0))
                    moveTo.add(""+(char)(row+i+96)+(char)(column+j+48));
        return moveTo;
    }
}
