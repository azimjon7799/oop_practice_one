package oop_pracitce;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TogriBurchakliUchburchak gipotenuza  = new TogriBurchakliUchburchak();
        gipotenuza.setKatet1(3);
        gipotenuza.setKatet2(4);
        gipotenuza.setGipotenuza();
        System.out.println(gipotenuza.getGipotenuza());
    }
}