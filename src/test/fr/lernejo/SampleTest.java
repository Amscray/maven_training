package fr.lernejo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SampleTest {

    @Test

    void testAdditionSuccess(){
        int a = 2;
        int b = 8;
        int resultat = 10;
        Sample.Operation addition= Sample.Operation.ADD;
        Sample sample= new Sample();
        Assertions.assertEquals(resultat, sample.op(addition,a,b));

    }

    @Test
    void testAdditionFail(){
        int a = 2;
        int b = 8;
        int resultat = 20;
        Sample.Operation addition= Sample.Operation.ADD;
        Sample sample= new Sample();
        Assertions.assertNotEquals(resultat, sample.op(addition,a,b));

    }

    @Test
    void testMultiplicationSuccess(){
        int a = 2;
        int b = 8;
        int resultat = 16;
        Sample.Operation multiplication= Sample.Operation.MULT;
        Sample sample= new Sample();
        Assertions.assertEquals(resultat, sample.op(multiplication,a,b));


    }

    @Test
    void testMultiplicationFail(){
        int a = 2;
        int b = 8;
        int resultat = 40;
        Sample.Operation multiplication= Sample.Operation.MULT;
        Sample sample= new Sample();
        Assertions.assertNotEquals(resultat, sample.op(multiplication,a,b));


    }

}

