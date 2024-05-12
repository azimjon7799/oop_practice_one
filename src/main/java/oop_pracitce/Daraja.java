package oop_pracitce;

public class Daraja {
    // sonning musbat darajasini double ko'rinishda qaytaradi
    public double musbatDaraja(double value, double extent) {
        if (extent == 1){
            return value;
        }
        if (extent == 0) {
            return 1;
        }
        if (extent == 2){
            return value * value;
        }
        double result = 1;
        for (int i = 1; i <= extent; i++) {
            result *= value;
        };
        return result;
    }
}
