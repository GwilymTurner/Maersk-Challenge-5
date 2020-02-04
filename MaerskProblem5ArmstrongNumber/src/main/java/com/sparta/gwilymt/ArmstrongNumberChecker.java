package com.sparta.gwilymt;

public class ArmstrongNumberChecker {
    public static boolean isArmstrongNumber(Integer number){
        String numberToString = number.toString();
        Integer total = ArmstrongNumberChecker.calculateArmstrongNumber(numberToString);
        if (total.equals(number)){
            System.out.println(number + " is an Armstrong number!");
            return true;
        }
        System.out.println(number + " is not an Armstrong number.");
        return false;
    }
    public static Integer calculateArmstrongNumber(String number){
        int total = 0;
        for (int i = 0; i < number.length(); i++) {
            int current = Integer.parseInt(number, i, i+1, 10);
            total += (current * current * current);
        }
        return total;
    }
}