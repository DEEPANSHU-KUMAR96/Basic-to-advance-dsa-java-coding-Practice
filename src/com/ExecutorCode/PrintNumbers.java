package com.ExecutorCode;

public class PrintNumbers implements  Runnable {
    @Override
    public void run(){
        for (int i = 0; i <10; i++) {
            System.out.printf("Numbers is %d\n", i+1);

        }
    }

}
