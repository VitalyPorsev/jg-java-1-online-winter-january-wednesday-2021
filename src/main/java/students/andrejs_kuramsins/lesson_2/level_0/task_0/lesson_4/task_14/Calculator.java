package students.andrejs_kuramsins.lesson_2.level_0.task_0.lesson_4.task_14;

 class Calculator {
    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int sub(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int multi(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public int div(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    public boolean evenOrNot(int yourNumber) {
        if (yourNumber % 2 == 0) {
            return true;}
        else {
            return false;
        }
    }
    public int maxOfTwoNumber (int firstNumber, int secondNumber) {
        if (firstNumber>secondNumber) {
            return firstNumber; }
        else
            { return secondNumber;}

        }
    }


