package students.alex_kalashnikov.lesson_9.level_6.task_31;

class FraudRule2 extends FraudRule {

    private int maxTransactionAmount;

    public FraudRule2(String ruleName, int maxTransactionAmount) {
        super(ruleName);
        this.maxTransactionAmount = maxTransactionAmount;
    }

    @Override
    public boolean isFraud(Transaction t) {
        return t.getAmount() > maxTransactionAmount;
    }

}