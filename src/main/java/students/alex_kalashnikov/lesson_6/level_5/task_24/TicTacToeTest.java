package students.alex_kalashnikov.lesson_6.level_5.task_24;

class TicTacToeTest {

    public static void main(String[] args) {
        TicTacToeTest test = new TicTacToeTest();
        test.isWinPositionForDiagonalsTest1();
        test.isWinPositionForDiagonalsTest2();
        test.isWinPositionForDiagonalsTest3();
    }

    public void test(boolean realResult, boolean expectedResult) {
        if (realResult == expectedResult) {
            System.out.println("WinPositionForDiagonalsTest is OK!");
        } else {
            System.out.println("WinPositionForDiagonalsTest is FAILED!");
        }
    }

    public void isWinPositionForDiagonalsTest1() {
        boolean expectedResult = true;
        TicTacToe test = new TicTacToe();
        int[][] testArray = test.create(3);
        testArray[0][0] = 0;
        testArray[0][1] = 1;
        testArray[0][2] = 1;
        testArray[1][0] = 1;
        testArray[1][1] = 1;
        testArray[1][2] = -1;
        testArray[2][0] = 1;
        testArray[2][1] = -1;
        testArray[2][2] = 0;
        boolean realResult = test.isWinPositionForDiagonals(testArray, 1);
        test(realResult, expectedResult);
    }

    public void isWinPositionForDiagonalsTest2() {
        boolean expectedResult = true;
        TicTacToe test = new TicTacToe();
        int[][] testArray = test.create(3);
        testArray[0][0] = 0;
        testArray[0][1] = 1;
        testArray[0][2] = 1;
        testArray[1][0] = -1;
        testArray[1][1] = 0;
        testArray[1][2] = 1;
        testArray[2][0] = 0;
        testArray[2][1] = -1;
        testArray[2][2] = 0;
        boolean realResult = test.isWinPositionForDiagonals(testArray, 0);
        test(realResult, expectedResult);
    }

    public void isWinPositionForDiagonalsTest3() {
        boolean expectedResult = false;
        TicTacToe test = new TicTacToe();
        int[][] testArray = test.create(3);
        testArray[0][0] = 1;
        testArray[0][1] = 0;
        testArray[0][2] = 1;
        testArray[1][0] = 0;
        testArray[1][1] = 1;
        testArray[1][2] = 0;
        testArray[2][0] = 1;
        testArray[2][1] = 1;
        testArray[2][2] = 0;
        boolean realResult = test.isWinPositionForDiagonals(testArray, 0);
        test(realResult, expectedResult);
    }

}