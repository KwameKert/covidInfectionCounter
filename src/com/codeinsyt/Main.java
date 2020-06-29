package com.codeinsyt;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println(covidInfectionCount(5));

    }

    public static int covidInfectionCount(int days){
            int infectionPerCount = 2;

            if(days == 1) return 1;
            if(days == 2) return 3;

            int oneDayEarlier = covidInfectionCount(days -1);
            int twoDayEarlier = covidInfectionCount(days - 2);

        return  oneDayEarlier+ infectionPerCount*( oneDayEarlier - twoDayEarlier );
    }
}
