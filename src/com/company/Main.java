package com.company;

public class Main {

    public static void main(String[] args) {

    }
        public static String metodOne(int age, int temperatura) {
            System.out.println("возраст " + age + " " + "температура " + temperatura);

            if (age > 20 && age <= 45 && temperatura >= -20 && temperatura <= 30) {
                return ("можно идти гулять");
            } else if (age >= 20 && temperatura <= 0 && temperatura >= 28) {
                return ("можно идти гулять");
            } else if (age < 45 && temperatura < -10 && temperatura >= 25) {
                return ("можно идти гулять");
            } else {

                return("Оставайтесь дома ");
            }
    }
}
