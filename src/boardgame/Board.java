package boardgame;

import exception.BoardException;

public class Board {

    private int rows;
    private int columns;
    private Piece[][] pieces;

    public Board(int row, int columns) {
        if (row < 1 || columns < 1){
            throw new BoardException("Error creating board : there must be at least 1 row and 1 collum");
        }
        this.rows = row;
        this.columns = columns;
        pieces = new Piece[row][columns];
    }

    public int getRows() {
        return rows;
    }


    public int getColumns() {
        return columns;
    }

    public Piece piece (int row, int columns){
        if (!positionExists(row,columns)){
            throw new BoardException("Position not on the board!");
        }
        return pieces[row][columns];
    }
    public Piece piece (Position position){
        if (!positionExists(position)){
            throw new BoardException("Position not on the board!");
        }
        return pieces[position.getRow()][position.getCollum()];
    }
    public void placePiece(Piece piece, Position position){
        if (thereIsAPiece(position)){
            throw new BoardException("There is a already a piece on position " + position);
        }
        pieces[position.getRow()][position.getCollum()] = piece;
        piece.position = position;
    }

    public Piece removePiece(Position position){
        if(!positionExists(position)){
            throw new BoardException("Position not on the board!");
        }
        if (piece(position) == null){
            return null;
        }
        Piece aux = piece(position);
        aux.position = null;
        pieces[position.getRow()][position.getCollum()] = null;
        return aux;
    }

    public Boolean positionExists(int row, int collum){
        return row >= 0 && row < rows && collum >= 0 && collum < columns;

    }
    public Boolean positionExists(Position position){

        return positionExists(position.getRow(),position.getCollum());
    }

    public Boolean thereIsAPiece(Position position){
        if (!positionExists(position)){
            throw new BoardException("Position not on the board!");
        }
        return piece(position) != null;
    }

}
