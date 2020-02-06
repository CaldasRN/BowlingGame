package com.company;

public class GAME {

    int scoreArray[] = new int[21];
    int currentRoll = 0;

    public void roll(int pins) {
//        if (pins == 10) {
//            scoreArray[currentRoll++] = pins;
//            scoreArray[currentRoll++] = 0;
//        }
//        else {
            scoreArray[currentRoll++] = pins;
//        }
    }

    public int Score(){
        int total = 0;
        for(int i=0; i<19; i+=2){
            total += scoreArray[i];
            if (i < 15) {
                if (scoreArray[i] == 10) {
                    total += scoreArray[i + 2];
                    if (scoreArray[i + 2] == 10) {
                        total += scoreArray[i + 4];
                    } else {
                        total += scoreArray[i + 3];
                    }
                } else {
                    total += scoreArray[i + 1];
                    if ((scoreArray[i] + scoreArray[i + 1]) == 10) {
                        total += scoreArray[i + 2];
                    }
                }
            } else if (i < 17){
                if (scoreArray[i] == 10){
                    total += scoreArray[i + 2] + scoreArray[i + 3];
                } else {
                    total += scoreArray[i + 1];
                    if ((scoreArray[i] + scoreArray[i + 1]) == 10) {
                        total += scoreArray[i + 2];
                    }
                }
            }else {
                total += scoreArray[i + 1];
                if ((scoreArray[i] == 10)
                        || ((scoreArray[i] + scoreArray[i + 1]) == 10)){
                    total += scoreArray[i + 2];
                }
            }
        }
        return total;
    }
}
