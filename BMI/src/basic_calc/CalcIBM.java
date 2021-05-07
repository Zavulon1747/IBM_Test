package basic_calc;

public class CalcIBM {

    public void absoluteIBMWithoutMuscles(double weight, double height) {
        double result = weight/(Math.pow(height, 2));
        if (result<16) {
            System.out.println("Dangerous lower weight!");
        } else if (result>=16&&result<18.5) {
            System.out.println("Lower weight. Need more eating and training.");
        } else if (result>=18.5&&result<25) {
            System.out.println("It's OK. Your weight in normal.");
        } else if (result>=25&&result<30) {
            System.out.println("Oh, your weight is more, than need. Are you fat or muscle-man?");
        } else if (result>=30&&result<35) {
            System.out.println("Mama Mia, please, loss your weight, it's not safety.");
        } else if (result>=35&&result<40) {
            System.out.println("You need to go a doctor. Maybe, you will get a heart attack.");
        } else {
            System.out.println("Only God will save you.");
        }

    }
}
