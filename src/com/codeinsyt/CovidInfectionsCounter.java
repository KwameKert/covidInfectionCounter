package com.codeinsyt;

public class CovidInfectionsCounter {

    public static int count(int days, int infectionPerCount){


        if(days == 1) return 1;
        if(days == 2) return 1 + infectionPerCount;

        int oneDayEarlier = count(days -1, infectionPerCount);
        int twoDayEarlier = count(days - 2, infectionPerCount);

        return  oneDayEarlier+ infectionPerCount*( oneDayEarlier - twoDayEarlier );
    }


}
