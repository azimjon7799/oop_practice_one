package oop_pracitce;

public class TogriBurchakliUchburchak {
    double gipotenuza;// to'g'ri burchakli uchburchak gipotenuzasi
    int katet1;// to'g'ri burchakli uchburchakning 1-kateti
    int katet2; // to'g'ri burchakli uchburchakning 2-kateti

    // katetning qiymatini olish uchun metod
    public int getKatet1() {
        return katet1;
    }

    //katetning qiymatini o'zgartirish yoki o'rnatish uchun metod
    public void setKatet1(int katet1) {
        this.katet1 = katet1;
    }


    public int getKatet2() {
        return katet2;
    }

    public void setKatet2(int katet2) {
        this.katet2 = katet2;
    }

    // gipotenuzaning qiymatini c^2 = (a^2 + b^2)^(1/2) formula bo'yicha o'rnatish yoki pifagor teoremasi
    public void setGipotenuza() {
        int a = getKatet1();
        int b = getKatet2();
        this.gipotenuza = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    // gipotenuzaning qiymatini qaytarish
    public double getGipotenuza() {
        return gipotenuza;
    }
}
