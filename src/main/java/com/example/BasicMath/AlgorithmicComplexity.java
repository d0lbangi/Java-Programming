package com.example.BasicMath;

// 기초 수학 - 알고리즘 복잡도
public class AlgorithmicComplexity {

    static int fibonacci(int n) {
        if (n<3){
            return 1;
        }
        return fibonacci(n-2)+fibonacci(n-1);
    }

    static int factorial(int n) {
        if (n<1) {
            return 1;
        }
        return n*fibonacci(n-1);
    }

    public static void main(String[] args) {

        // 1. 시간 복잡도
        System.out.println("== 시간 복잡도 ==");

        // O(1)
        System.out.println("== O(1) ==");
        System.out.println("Hello");

        // O(logN)
        System.out.println("== O(logN) ==");
        for(int i = 0; i < 16 ; i*=2){
            System.out.println("Hello");
        }

        // O(N)
        System.out.println("== O(N) ==");
        for(int i = 0; i < 2 ; i++) {
            System.out.println("Hello");
        }

        // O(NlogN)
        System.out.println("== O(NlogN) ==");
        for(int i = 0; i < 2 ; i++) {
            for (int j = 0; i < 8; i *= 2) {
                System.out.println("Hello");
            }
        }

        // O(N^2)
        System.out.println("== O(N^2) ==");
        for(int i = 0; i < 2 ; i++) {
            for (int j = 0; i < 2 ; i++) {
                System.out.println("Hello");
            }
        }
    }
}
