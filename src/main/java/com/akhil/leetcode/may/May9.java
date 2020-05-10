package com.akhil.leetcode.may;

public class May9 {
    public boolean isPerfectSquare(int num) {
        double s = (double) num;
        int sq = (int)Math.sqrt(s);
        if(Math.pow(sq,2)== num)
            return true;
        else return false;
    }
}
