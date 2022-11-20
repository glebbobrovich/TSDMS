package com.tsmds;

public class Calculator
{
    public Calculator()
    {

    }

    public double execute(double a, double b, char operation)
    {
        double executionResult = 0;
        if(operation == '+'){
            executionResult = a + b;
        }
        else if (operation == '-') {
            executionResult = a - b;
        }
        else if (operation == '/') {
            executionResult = a / b;
        }
        else if (operation == '*') {
            executionResult = a * b;
        }
        else if (operation == '%') {
            executionResult = a % b;
        }
        return executionResult;
    }
}