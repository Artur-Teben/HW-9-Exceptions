package executor;

import division.SafeDivision;
import exceptions.ExceptionA;
import exceptions.ExceptionB;
import rethrowing.RethrowingException;

import java.io.IOException;

public class Executor {

    public void run() {
        SafeDivision safeDivision = new SafeDivision();

        safeDivision.divide();
        showHowToCatchExceptions();
        rethrowException();
    }

    public void showHowToCatchExceptions() {
        try{
            throw new ExceptionA();
        } catch(ExceptionA e) {
            e.printStackTrace();
        }

        try{
            throw new ExceptionB();
        } catch(ExceptionB e) {
            e.printStackTrace();
        }

        try{
            throw new NullPointerException();
        } catch(NullPointerException e) {
            e.printStackTrace();
        }

        try{
            throw new IOException();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    public void rethrowException() {
        RethrowingException rethrowingException = new RethrowingException();
        try {
            rethrowingException.someMethod();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
