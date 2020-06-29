package com.codeinsyt;

public class Main {

    public static void main(String[] args) {
        // write your code here

        //count for 10 days with a one infection rate
        System.out.println(" Day  |  No. infections");
        for(int day = 1; day < 11; day++){
            int numberInfections =  CovidInfectionsCounter.count(day, 1);
            System.out.println(day + " | "+ numberInfections+" ");
        }

    }


}
