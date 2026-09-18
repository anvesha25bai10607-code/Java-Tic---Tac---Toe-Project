import java.util.Scanner;

public class Project {

    public static int add3(int x, int y, int z) {
        return x + y + z;
    }

    public static void showBoard(int[] pX, int[] pO) {
        String[] board = new String[9];

        for (int i = 0; i < 9; i++) {
            if (pX[i] == 1) {
                board[i] = "X";
            } else if (pO[i] == 1) {
                board[i] = "O";
            } else {
                board[i] = String.valueOf(i);
            }
        }

        System.out.println(board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("--|---|--");
        System.out.println(board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("--|---|--");
        System.out.println(board[6] + " | " + board[7] + " | " + board[8]);
    }

    public static int winner(int[] pX, int[] pO) {
        int[][] patterns = {
            {0, 1, 2},
            {3, 4, 5},
            {6, 7, 8},
            {0, 3, 6},
            {1, 4, 7},
            {2, 5, 8},
            {0, 4, 8},
            {2, 4, 6}
        };

        for (int[] pattern : patterns) {
            int a = pattern[0];
            int b = pattern[1];
            int c = pattern[2];

            if (add3(pX[a], pX[b], pX[c]) == 3) {
                System.out.println("X wins!");
                return 1;
            }

            if (add3(pO[a], pO[b], pO[c]) == 3) {
                System.out.println("O wins!");
                return 0;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] pX = new int[9];
        int[] pO = new int[9];

        int turn = 1;

        System.out.println("Tic Tac Toe Game");

        while (true) {
            showBoard(pX, pO);

            int pos;

            if (turn == 1) {
                System.out.print("X, enter position: ");
                pos = scanner.nextInt();
                pX[pos] = 1;
            } else {
                System.out.print("O, enter position: ");
                pos = scanner.nextInt();
                pO[pos] = 1;
            }

            int result = winner(pX, pO);

            if (result != -1) {
                System.out.println("Game Over");
                break;
            }

            int filled = 0;

            for (int i = 0; i < 9; i++) {
                filled += pX[i] + pO[i];
            }

            if (filled == 9) {
                System.out.println("It's a draw!");
                System.out.println("Game Over");
                break;
            }

            turn = 1 - turn;
        }

        scanner.close();
    }
}
