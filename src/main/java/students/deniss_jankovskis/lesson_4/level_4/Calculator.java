package students.deniss_jankovskis.lesson_4.level_4;

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


    public boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;

        } else
            return false;
    }


    public int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            return firstNumber;

        } else
            return secondNumber;

    }


    public int maxOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber >= secondNumber && secondNumber >= thirdNumber) {
            return firstNumber;

        }

        else if (firstNumber >= thirdNumber && thirdNumber >= secondNumber) {
            return firstNumber;

        }

        else if (secondNumber >= thirdNumber && firstNumber >= thirdNumber) {
            return secondNumber;

        }

        else if (secondNumber >= thirdNumber) {
            return secondNumber;

        }

        else
            return thirdNumber;

    }


}
