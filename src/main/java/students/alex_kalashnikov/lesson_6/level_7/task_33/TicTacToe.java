package students.alex_kalashnikov.lesson_6.level_7.task_33;

class TicTacToe {

    public String[][] createField() {
        String[][] array = new String[3][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = ".";
            }
        }
        return array;
    }

    public Move getFromKeyboard(String[][] field, String playerToCheck) { // запрашивает координаты ячейки [X,Y] - числа от 0 до 2
        boolean checkX = true; // проверяет число X
        boolean checkY = true;  // проверяет число Y
        boolean checkField = true;// проверяет был ли уже ход в ячейке [X,Y] массива
        int x = 0;
        int y = 0;
        while (checkField) { // если в ячейке был ход, то запускает цикл заново, пока игрок не заведет координаты ячейки со значением "."
            while (checkX) { // если число правильное, то прерывает цикл
                java.util.Scanner scanner = new java.util.Scanner(System.in);
                System.out.print("Player " + playerToCheck + " enter X (0 - 2): ");
                x = scanner.nextInt();
                if (x == 0 || x == 1 || x == 2) {
                    checkX = false;
                } else {
                    System.out.println("Wrong number! Please, reenter!");
                }
            }
            while (checkY) { // если число правильное, то прерывает цикл
                java.util.Scanner scanner = new java.util.Scanner(System.in);
                System.out.print("Player " + playerToCheck + " enter Y (0 - 2): ");
                y = scanner.nextInt();
                if (y == 0 || y == 1 || y == 2) {
                    checkY = false;
                } else {
                    System.out.println("Wrong number! Please, reenter!");
                }
            }
            if (field[x][y] == "0" || field[x][y] == "X") {
                System.out.println("This cell already moved!!! Please, reenter!");
                checkX = true;
                checkY = true;
            } else {
                checkField = false;
            }
        }
        return new Move(x, y);
    }

    public int computerHorizontal(String[][] field) {
        int row = -1;
        for (int i = 0; i < field.length; i++) {
            int numberOfMoves = 0;
            for (int j = 0; j < field.length; j++) {
                if (field[i][j] == "X") {
                    numberOfMoves++;
                    System.out.println("Horizontal " + numberOfMoves);
                }
                if (numberOfMoves == 2) {
                    row = i;
                    break;
                }
            }
        }
        System.out.println("ROW: "+ row);
        return row;
    }

    public int computerVertical(String[][] field) {
        int column = -1;
        for (int i = 0; i < field.length; i++) {
            int numberOfMoves = 0;
            for (int j = 0; j < field.length; j++) {
                if (field[j][i].equals("X")) {
                    numberOfMoves++;
                    System.out.println("Vertical " + numberOfMoves);
                }
                if (numberOfMoves == 2) {
                    column = i;
                    break;
                }
            }
        }
        System.out.println("COLUMN: " + column);
        return column;
    }

    public Move computer(String[][] field, String playerToCheck) {  // компьютер генерирует случайный ход в незанятой ячейке
        boolean checkField = true;
        int x = 0;
        int y = 0;
        while (checkField) {
            if (computerHorizontal(field) == -1) {
                x = (int) (Math.random() * 3);
            }
            else {
                x = computerHorizontal(field);
            }
            y = (int) (Math.random() * 3);
            if (computerVertical(field) == -1) {
                x = (int) (Math.random() * 3);
                y = (int) (Math.random() * 3);
            }
            else {
                x = (int) (Math.random() * 3);
                y = computerVertical(field);
            }
            if (field[x][y].equals(".")) {
                checkField = false;
            }
        }
        return new Move(x, y);
    }


    public void printFieldToConsole(String[][] field) {
        for (int i = 0; i < field.length; i++) {
            System.out.print(field[0][i] + "  ");
        }
        System.out.println(" ");
        for (int i = 0; i < field.length; i++) {
            System.out.print(field[1][i] + "  ");
        }
        System.out.println(" ");
        for (int i = 0; i < field.length; i++) {
            System.out.print(field[2][i] + "  ");
        }
        System.out.println(" ");
    }

    public boolean isWinPositionForHorizontals(String[][] field, String playerToCheck) {
        boolean hit = false;
        for (int i = 0; i < field.length; i++) {
            int numberOfHits = 0;
            for (int j = 0; j < field.length; j++) {
                if (field[i][j] == playerToCheck) {
                    numberOfHits++;
                }
            }
            if (numberOfHits == 3) {
                return hit = true;
            }
        }
        return hit;
    }

    public boolean isWinPositionForVerticals(String[][] field, String playerToCheck) {
        boolean hit = false;
        for (int i = 0; i < field.length; i++) {
            int numberOfHits = 0;
            for (int j = 0; j < field.length; j++) {
                if (field[j][i] == playerToCheck) {
                    numberOfHits++;
                }
            }
            if (numberOfHits == 3) {
                return hit = true;
            }
        }
        return hit;

    }

    public boolean isWinPositionForDiagonals(String[][] field, String playerToCheck) {
        boolean hit = false;
        boolean hit1 = false;
        int j = 0;
        int k = 0;
        int numberOfHits = 0;
        int numberOfHits1 = 0;

        for (int i = 0; i < field.length; i++) {                    // для одной диагонали
            if (field[i][j] == playerToCheck) {
                numberOfHits++;
            }
            j++;
            if (numberOfHits == 3) {
                return hit = true;
            }
        }
        for (int i = 2; i > -1; i--) {                              // для другой диагонали
            if (field[k][i] == playerToCheck) {
                numberOfHits1++;
            }
            k++;
            if (numberOfHits1 == 3) {
                return hit1 = true;
            }
        }
        return hit || hit1;
    }

    public boolean isWinPosition(String[][] field, String playerToCheck) {
        return isWinPositionForHorizontals(field, playerToCheck) || isWinPositionForVerticals(field, playerToCheck) || isWinPositionForDiagonals(field, playerToCheck);
    }

    public boolean isDrawPosition(String[][] field) {
        if (isWinPosition(field, "0") || isWinPosition(field, "X")) {
            return false;
        } else {
            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field.length; j++) {
                    if (field[i][j] == ".") {
                        return false;
                    }
                }
            }
            return true;
        }
    }

    public void play() {
        String[][] field = createField();
        while (true) {
            printFieldToConsole(field);
            Move move0 = getFromKeyboard(field, "0");
            field[move0.getX()][move0.getY()] = "0";
//            printFieldToConsole(field);
            if (isWinPosition(field, "0")) {
                System.out.println("Player 0 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }

//            printFieldToConsole(field);
            Move move1 = computer(field, "X");
            field[move1.getX()][move1.getY()] = "X";
            printFieldToConsole(field);
            if (isWinPosition(field, "X")) {
                System.out.println("Player 1 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }
        }
    }

}
