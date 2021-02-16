package students.kristine_paskevica_lesson_4.level_4;

class CalculatorDemo {

    public static void main(String[] args) {

        Calculator kalkulators = new Calculator();
        int summa = kalkulators.summeshana(50, 15);
        System.out.println("Divu veselu skaitļu summa ir: " + summa);

        int starpiba = kalkulators.starpiba(30, 10);
        System.out.println("Divu veselu skaitļu starpība ir: " + starpiba);

        int reizinajums = kalkulators.reizinajums(30, 10);
        System.out.println("Divu veselu skaitļu reizinājums ir: " + reizinajums);

        int dalijums = kalkulators.dalishana(30, 10);
        System.out.println("Divu veselu skaitļu dalījums ir: " + dalijums);

        boolean paraNepa = kalkulators.paraNepara(32);
        System.out.println("Ievadītais skaitlis ir pāra " + paraNepa);

        int maksimalSkaitlis = kalkulators.maksSkaitlis(30, 20, 45);
        System.out.println("Vislielākais no visiem trīs skaitļiem ir: " + maksimalSkaitlis);
    }}
