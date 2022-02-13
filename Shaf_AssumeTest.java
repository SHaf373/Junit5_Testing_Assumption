package com.mycompany.junit_examples;


import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

@DisplayName("junit")
public class Shaf_AssumeTest {
    //this class will return true value
    boolean assumet(){
        String attend="attend";
        if(attend=="attend"){return true;

    }else{
        return false;}
    }
    //this class will return false value
    boolean assumef(){
        String attend="notattend";
        if(attend=="attend"){
            return true;

        }else{
            return false;}
    }
//Asumetrue Testing
    @DisplayName("Assume True") //Anotation Display Name For easiness
    @Test//anotation for testing
    void Test1(){
        Assumptions.assumeTrue(assumet());
        //if assumption is true then this class will be excuted otherwise
        //will not executed
    }

    //AsumeFalse Testing
    @DisplayName("Assume False") //Anotation Display Name For easiness
    @Test//anotation for testing
    void Test2(){
        Assumptions.assumeFalse(assumef());
        //if assumption is False then this class will be excuted otherwise
        //will not executed
    }


    //Asumingthat class of junit Library used for assumption but comparing the boolean
    //if the boolean value is true it will be excecuted statements if boolean value is false it will ignore
    //the statement not disabling the whole class
    @Test
    @DisplayName("assuming that testing")
    void test3(){
            Assumptions.assumingThat(assumet(),()->//symbol use for excecuting statements
                     {//write statements that you want to execute here
                         System.out.println("Statement are executed"); });
    }


    @Test
    @DisplayName("Failure Class")
    @Disabled       //anotaion for disable the class which cause effect on whole testing
    void test4(){
        fail("this test fail");//this will result all TestClasses failed
        //so we will use @Disable anotation to stop the effect on other classes
    }

}
