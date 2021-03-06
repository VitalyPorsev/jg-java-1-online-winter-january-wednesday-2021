package students.deniss_jankovskis.lesson_6.level_5.task_26;

class TicTacToe {


    public boolean isDrawPosition(int[][] field) {

        return !isWin(field) && !isDraw(field);
    }

    public boolean isDraw(int[][] field) {

        int num = -1;
        for (int[] ints : field) {
            for (int anInt : ints) {
                if (anInt == num) {
                    return true;
                }
            }
        }
        return false;
    }


    public boolean isWin(int[][] field) {

        boolean isWin0 = isWinPosition(field, 0);
        boolean isWin1 = isWinPosition(field, 1);
        return isWin0 || isWin1;
    }


    public boolean isWinPosition(int[][] field, int playerToCheck) {
        boolean isWinHorizontal = isWinPositionForHorizontals(field, playerToCheck);
        boolean isWinVertical = isWinPositionForVerticals(field, playerToCheck);
        boolean isWinDiagonal = isWinPositionForDiagonals(field, playerToCheck);
        return isWinHorizontal || isWinVertical || isWinDiagonal;
    }

    public boolean checkHorizontalPosition(int[][] field, int playerToCheck) {
        int count = 0;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] == playerToCheck) {
                    count++;
                }
                if (count == field[i].length) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean checkVerticalPosition(int[][] field, int playerToCheck) {

        for (int j = 0; j < 3; j++) {
            if (field[0][j] == playerToCheck && field[1][j] == playerToCheck
                    && field[2][j] == playerToCheck) {
                return true;
            }
        }
        return false;
    }

    public boolean checkDiagonalPosition(int[][] field, int playerToCheck) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (field[0][0] == field[1][1] && field[1][1] == field[2][2]) {
                    return true;
                } else if (field[0][2] == field[1][1] && field[1][1] == field[2][0]) {
                    return true;
                }
            }
        }

        return false;
    }


    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {

        TicTacToe ticTacToe = new TicTacToe();
        return ticTacToe.checkHorizontalPosition(field, playerToCheck);
    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {

        TicTacToe ticTacToe = new TicTacToe();
        return ticTacToe.checkVerticalPosition(field, playerToCheck);
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {

        TicTacToe ticTacToe = new TicTacToe();
        return ticTacToe.checkDiagonalPosition(field, playerToCheck);
    }

}


