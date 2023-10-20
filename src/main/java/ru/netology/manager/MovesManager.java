package ru.netology.manager;

public class MovesManager {

    private String[] moves = new String[0];
    private int limit;

    public MovesManager() {
        this.limit = 5;

    }

    public MovesManager(int limit) {
        this.limit = limit;

    }


    public void addMovie(String movie) {
        String[] tmp = new String[moves.length + 1];
        for (int i = 0; i < moves.length; i++) {
            tmp[i] = moves[i];
        }
        tmp[tmp.length - 1] = movie;
        this.moves = tmp;
    }

    public String[] allmoves() {
        return moves;
    }

    public String[] findLast() {
        int result;
        if (moves.length < limit) {
            result = moves.length;

        } else {
            result = limit;
        }
        String[] tmp = new String[result];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = moves[moves.length - 1 - i];
        }
        return tmp;

    }


}























