package students.kristine_paskevica.lesson_8.level_4.task_16;

 class Circle extends Shape{

     private double radius;

     public Circle(String title, double radius) {
         super(title);
         this.radius = radius;
     }

     @Override
     double calculateArea() {
         return Math.PI * Math.pow(radius,2);
     }

     @Override
     double calculatePerimeter() {
         return 2 * Math.PI * radius;
     }
}