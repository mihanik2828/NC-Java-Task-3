package ch9.ex1;

import java.util.ArrayList;

public abstract class ChessPiece {
    protected char[] coordinates;

    public ChessPiece(String coordinates) {
        this.coordinates=coordinates.toCharArray();
    }

    abstract ArrayList<String> canMoveTo();

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates.toCharArray();
    }
}
