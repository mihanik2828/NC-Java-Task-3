package ch9.ex1;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Knight");
        Knight knight = new Knight("e4");
        System.out.println(knight.canMoveTo().toString());

        knight.setCoordinates("a1");
        System.out.println(knight.canMoveTo().toString());
//////////////////////////////////////////////////////////////////////
     //   System.out.println("Pawn");
/*        Pawn pawn = new Pawn("e4");
        System.out.println(pawn.canMoveTo().toString());

        pawn.setCoordinates("a8");
        System.out.println(pawn.canMoveTo().toString());*/
///////////////////////////////////////////////////////////////////////
    //    System.out.println("Bishop");
/*        Bishop bishop = new Bishop("e4");
        System.out.println(bishop.canMoveTo().toString());
        System.out.println();
        bishop.setCoordinates("a1");
        System.out.println(bishop.canMoveTo().toString());*/
///////////////////////////////////////////////////////////////////////
   //     System.out.println("Rook");
        /*

        Rook rook = new Rook("e4");
        System.out.println(rook.canMoveTo().toString());
        System.out.println();
        rook.setCoordinates("a1");
        System.out.println(rook.canMoveTo().toString());
*/

///////////////////////////////////////////////////////////////////////
 //       System.out.println("Queen");
/*        Queen queen = new Queen("e4");
        System.out.println(queen.canMoveTo().toString());
        System.out.println();
        queen.setCoordinates("a1");
        System.out.println(queen.canMoveTo().toString());*/
///////////////////////////////////////////////////////////////////////
        System.out.println("King");
        King king = new King("e4");
        System.out.println(king.canMoveTo().toString());
        System.out.println();
        king.setCoordinates("a1");
        System.out.println(king.canMoveTo().toString());
    }
}
