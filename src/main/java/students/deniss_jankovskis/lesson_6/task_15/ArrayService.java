package students.deniss_jankovskis.lesson_6.task_15;

class ArrayService {


    int replaceAll(int[] arr, int numberToReplace, int newNumber) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToReplace) {
                arr[i] = newNumber;
                count++;
            }

        }
        return count;

    }
}
