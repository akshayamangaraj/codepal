package com.subrat.practice.printoddandeven;



public class Class1 implements Runnable {

    private boolean isEven;
    private int no;
    private Class2 obj;

    public Class1(boolean isEven, int no, Class2 obj){
        this.isEven = isEven;
        this.no = no;
        this.obj = obj;
    }



    @Override
    public void run() {
        int number = isEven==true?2:1;
        while(number<=no){
            if(isEven){
                obj.printEven(number);
            }else{
                obj.printOdd(number);
            }
            number = number+2;
        }

    }


}
