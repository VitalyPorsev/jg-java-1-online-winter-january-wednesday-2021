package students.alex_kalashnikov.lesson_14.level_2.tasks_7_13;

class AppleGreenColorHeavyWeightPredicate implements ApplePredicate {

    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equals("green") && apple.getWeight() > 150;
    }

}