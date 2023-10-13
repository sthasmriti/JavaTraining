package org.example;

public class MethodDemo {
    public static void main(String[] args) {
        MethodDemo demo = new MethodDemo();

        int result = demo.calc(12,10,"+");
        System.out.println("Result ="+result);
    }

//    private int sumOfNums(int a, int b){
//        return a+b;
//    }

    private int calc(int a, int b, String ops){
        int res = 0;
        if(ops.equals("+")){
            res =  a + b;
        } else if(ops.equals("-")){
            res =  a - b;
        }else if(ops.equals("*")){
            res =  a*b;
        }

        return res;

    }
}
