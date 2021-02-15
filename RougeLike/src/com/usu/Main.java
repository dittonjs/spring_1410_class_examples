package com.usu;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	    // initial setup
        char[][] level;
        int numRows = 15;
        int numCols = 15;
        int currentLevel = 1;
        boolean isAlive = true;
        boolean hasKey = false;
        level = generateLevel(currentLevel, numRows, numCols);
        displayLevel(level);

    }

    public static void displayLevel(char[][] level) {
        for(int row = 0; row < level.length; row++) {
            for (int col = 0; col < level[row].length; col ++) {
                System.out.printf("%3c", level[row][col]);
            }
            System.out.println();
        }
    }
    // ' ' = floor
    // '*' = wall
    // 'P' = player
    // 'B' = bandit
    // 'K' = key
    // 'E' = exit
    public static char[][] generateLevel(int currentLevel, int numRows, int numCols) {
        char[][] level = new char[numRows][numCols];
        addFloor(level);
        addWalls(level);
        generateTerrain(level);
//        addPlayer(level);
//        addBandits(level, currentLevel);
//        addKey(level);
//        addExit(level);
        return level;
    }

    public static void addFloor(char[][] level) {
        for(int row = 0; row < level.length; row++) {
            for (int col = 0; col < level[row].length; col ++) {
                level[row][col] = ' ';
            }
        }
    }

    public static void addWalls(char[][] level) {
        // top wall
        for (int i = 0; i<level[0].length; i ++) {
            level[0][i] = '*';
        }

        // bottom wall
        for (int i = 0; i<level[level.length - 1].length; i ++) {
            level[level.length - 1][i] = '*';
        }

        // left wall
        for (int i = 0; i<level.length; i ++) {
            level[i][0] = '*';
        }

        // right wall
        for (int i = 0; i<level.length; i ++) {
            level[i][level[i].length - 1] = '*';
        }
    }

    public static void generateTerrain(char[][] level) {
        randomlyPlaceWalls(level);
        char[][] generatedLevel = doCellularAutomata(level);
        // copy generateLevel into our actual level
    }

    public static void randomlyPlaceWalls(char[][] level) {
        Random rng = new Random();
        for(int row = 2; row < level.length - 2; row++) {
            for (int col = 2; col < level[row].length - 2; col ++) {
                double random = rng.nextDouble();
                if (random > .6) {
                    level[row][col] = '*';
                }
            }
        }
    }

    public static char[][] doCellularAutomata(char[][] level) {
        char[][] tempLevel = copyLevel(level);

        //
    }

    public static char[][] copyLevel(char[][] level) {
        char[][] levelCopy = new char[level.length][level[0].length];
        for(int row = 0; row < level.length; row++) {
            for (int col = 0; col < level[row].length; col ++) {
                levelCopy[row][col] = level[row][col];
            }
        }
        return levelCopy;
    }
}
