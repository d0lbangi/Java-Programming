package com.example.LambdaExpression;// Java 프로그래밍 - 람다식

interface ComputeTool {
    public abstract int compute(int x, int y);

//    public abstract int compute2(int x, int y);
}



public class Main {

    public static void main(String[] args) {

        ComputeTool cTool1 = new ComputeTool() {
            @Override
            public int compute(int x, int y) {
                return x + y;
            }

//            @Override
            public int compute2(int x, int y) {
                return x - y;
            }
        };
        System.out.println(cTool1.compute(1,2));


        // 람다식
        ComputeTool cToo2 = (x, y) -> {return x + y; };
        System.out.println(cToo2.compute(1,2));

    }
}
