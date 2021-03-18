package students.alex_kalashnikov.lesson_8.level_4.task_19;

public abstract class Shape {

    private String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();

    abstract double calculatePerimeter();

}