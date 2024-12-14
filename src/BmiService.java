public class BmiService {

    public int calculate(double weightInKilograms, double heightInMeters) {
        double bmiIndex = weightInKilograms / Math.pow(heightInMeters, 2);
        return (int) bmiIndex;
    }
}

