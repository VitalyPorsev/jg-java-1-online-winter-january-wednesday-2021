package students.alex_kalashnikov.lesson_5.level_2.task_10;

class ArrayInt {

    public static void main(String[] args) {

        int[] numbers = {(int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100)};

        for (int i = 0; i < numbers.length; i++) {


            System.out.println("Index[" + i + "]: " + numbers[i]);
        }
    }

}