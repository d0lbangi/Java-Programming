package com.example.BasicMath;

// 기초 수학1 - 점화식과 재귀함수
public class RecursiveFormulasAnRecursiveFunctions {

    static int recursion(int n) {
        if(n == 1) {
            return 1;
        }
            return 3*recursion(n-1);
    }

    static int recursion2(int n) {
        if(n == 1) {
            return 1;
        }
            return n+recursion2(n-1);
    }

    static int recursion3(int n) {
        if(n < 3) {
            return 1;
        }
        return recursion3(n-2) + recursion3(n-1);
    }

    public static void main(String[] args) {
        // 점화식 => 반복문, 재귀함수
        System.out.println("== 점화식/재귀함수 연습1");
        // 1,3,9,27,... n 번째의 수
        int n = 4;
        int result = 1;
        for (int i = 0; i < n ; i++){
            if(i == 0) {
                result = 1;
            } else {
                result *= 3;
            }
        }
        System.out.println("result : " + result);

        System.out.println("== 점화식/재귀함수 연습2");
        // 1,2,3,4,5,6,... 의 n번째 까지의 합
        n = 5;
        result = 0;
        for(int i = 1; i < n + 1; i++){
            result += i; // i(1) i < 6 => i=1,2,3,4,5 // 0 = 0 + 1 + 2 + 3 + 4 + 5 = 15
        }
        System.out.println(result);

        System.out.println("== 점화식/재귀함수 연습3");
        // 1, 1, 2, 3, 5, 8, 13, ... 의 n번째 수
        n = 6;
        result = 0;
        int a1 = 1;
        int a2 = 1;

        if(n<3) {
            result = 1;
        } else {
            for(int i =2; i < n; i++){
                result = a1 + a2;
                a1 = a2;
                a2 = result;
            }
            System.out.println(result);
        }




    }
}
