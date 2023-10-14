package com.jyujyu.dayonetest.dayonetest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyCalculatorTest {

    @Test
    void add() {
        //AAA
        //준비(Arange)
        MyCalculator myCalculator = new MyCalculator();

        //행동(act)
        myCalculator.add(10.0);

        //단언(assert)
        Assertions.assertEquals(10.0,myCalculator.getResult());
    }

    @Test
    void minus() {
        //GWT 패턴

        //Given(준비)
        MyCalculator myCalculator = new MyCalculator(10.0);

        //When(행동/연산)
        myCalculator.minus(5.0);

        //Then(검증 비교 단언)
        Assertions.assertEquals(5.0,myCalculator.getResult());
    }

    @Test
    void multiply() {
        MyCalculator myCalculator = new MyCalculator(2.0);
        myCalculator.multiply(2.0);
        Assertions.assertEquals(4.0,myCalculator.getResult());
    }

    @Test
    void divide() {
        MyCalculator myCalculator = new MyCalculator(10.0);
        myCalculator.divide(2.0);
        Assertions.assertEquals(5.0,myCalculator.getResult());
    }

    @Test
    void getResult() {

    }

    @Test
    void comlicatedCalculateTest(){
        //given
        MyCalculator myCalculator = new MyCalculator(0.0);

        //when
       Double result =  myCalculator
                .add(10.0)
                .minus(4.0)
                .multiply(2.0)
                .divide(3.0)
                .getResult();

        //Then
        Assertions.assertEquals(4.0,result);
    }

    @Test
    void divideZeroTest(){
        //given
        MyCalculator myCalculator = new MyCalculator(10.0);

        //when
//        myCalculator.divide(0.0);
        //then
//        Assertions.assertThrows(MyCalculator.ArithmeticException.class,()->{
//           myCalculator.divide(0.0);
//        });
    }
}