package students.vitaly_porsev.lesson_12.level_3.task_21;

class TestException extends Exception { }

class Main {
    public static void main(String args[]) {
        try {
            throw new TestException();
        } catch(TestException t) {
            System.out.println("Got the Test Exception");
        } finally {
            System.out.println("Inside finally block ");
        }
    }
}

//Мы словили TestException и вывели finally.