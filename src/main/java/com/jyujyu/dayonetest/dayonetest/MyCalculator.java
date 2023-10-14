package com.jyujyu.dayonetest.dayonetest;

public class MyCalculator {
    private Double result;

    public MyCalculator() {
        this.result = 0.0;
    }

    public MyCalculator(Double initResult){
        this.result = initResult;
    }

    public MyCalculator add(Double number) {
        this.result += number;
        return this;
    }
    public MyCalculator minus(Double number) {
        this.result -= number;
        return this;
    }
    public MyCalculator multiply(Double number) {
        this.result *= number;
        return this;
    }
    public MyCalculator divide(Double number){
        if(number == 0.0){
            throw new ArithmeticException();
        }

        this.result/=number;
        return this;
    }

    public Double getResult(){
        return this.result;
    }


}
