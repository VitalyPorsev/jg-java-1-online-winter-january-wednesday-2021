package students.vitaly_porsev.lesson_5.level_6.task_36;

class Arrays {

    public int[] create(int length) {
        return new int[length];
    }

    public int findMax(int[] array) {
        int max = 0;
        for(int num : array){
            if(num > max){
                max = num;
            }
        }return max;
    }
}
