package com.tsmds;

public class Triangle
{
    public Triangle()
    {

    }

    public boolean isExists(double a, double b, double c){
        return a + b > c && a + c > b && b + c > a;
    }
}
