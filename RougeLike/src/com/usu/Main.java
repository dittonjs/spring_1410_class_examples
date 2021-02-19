package com.usu;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // initial setup
        char[][] level;
        int numRows = 15;
        int numCols = 15;
        int currentLevel = 16;
        boolean isAlive = true;
        boolean hasKey = false;
        level = generateLevel(currentLevel, numRows, numCols);
        Scanner scanner = new Scanner(System.in);
        while(true) {
            displayLevel(level);
            char input = scanner.next().charAt(0);

        }

    }

    public static void movePlayer(char[][] level, char input) {

    }

    public static int[] findPlayer(char[][] level) {
        int[] position = new int[2];
        for(int row = 0; row < level.length; row++) {
            for (int col = 0; col < level[row].length; col ++) {
                if (level[row][col] == 'P') {
                    position[0] = row;
                    position[1] = col;
                }
            }
        }

        return position;
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
        addPlayer(level);
        addExit(level);
        addBandits(level, currentLevel);
        addExtra(level, 'K');
        return level;
    }

    public static void addBandits(char[][] level, int currentLevel) {
        int count = (int)(Math.log(currentLevel) / Math.log(2));
        if (count == 0) {
            count = 1;
        }

        for (int i = 0; i < count; i++) {
            addExtra(level, 'B');
        }
    }

    public static void addExtra(char[][] level, char extra) {
        Random rng = new Random();
        int row = rng.nextInt(level.length - 3) + 2;
        int col = rng.nextInt(level[0].length - 3) + 2;

        boolean placed = false;
        while(!placed) {
            if (level[row][col] != ' ') {
                row --;
            } else {
                level[row][col] = extra;
                placed = true;
            }
        }
    }

    public static void addPlayer(char[][] level) {
        level[level.length - 2][1] = 'P';
    }

    public static void addExit(char[][] level) {
        level[1][level[1].length - 2] = 'E';
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
        for(int row = 2; row < level.length - 2; row++) {
            for (int col = 2; col < level[row].length - 2; col ++) {
                level[row][col] = generatedLevel[row][col];
            }
        }
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

        for(int i = 0; i < 2; i++) {
            char[][] newTempLevel = new char[tempLevel.length][tempLevel[0].length];
            for (int row = 2; row < level.length - 2; row++) {
                for (int col = 2; col < level[row].length - 2; col++) {
                    int count = countNeighbors(tempLevel, row, col);
                    if (tempLevel[row][col] == '*' && count < 3) {
                        newTempLevel[row][col] = ' ';
                    } else if (tempLevel[row][col] == ' ' && count > 3) {
                        newTempLevel[row][col] = '*';
                    } else {
                        newTempLevel[row][col] = tempLevel[row][col];
                    }

                }
            }
            tempLevel = newTempLevel;
        }
        //
        return tempLevel;
    }

    public static int countNeighbors(char[][] level, int row, int col) {
        int count = 0;
        if (level[row - 1][col - 1] == '*') {
            count ++;
        }
        if (level[row - 1][col] == '*') {
            count ++;
        }
        if (level[row - 1][col + 1] == '*') {
            count ++;
        }
        if (level[row][col - 1] == '*') {
            count ++;
        }
        if (level[row][col + 1] == '*') {
            count ++;
        }
        if (level[row + 1][col - 1] == '*') {
            count ++;
        }
        if (level[row + 1][col] == '*') {
            count ++;
        }
        if (level[row + 1][col + 1] == '*') {
            count ++;
        }
        return count;
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
