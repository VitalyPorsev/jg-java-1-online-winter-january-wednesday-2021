package students.kate_br.lesson_5.level_6.task_35;

 class Arrays {

     public int findMax(int[] array){

         int max = array[0];

         for(int num : array){
             if (num > max){
                 max = num;
             }
         }
         return max;

     }
}
