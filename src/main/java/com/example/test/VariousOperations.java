package com.example.test;

public class VariousOperations {

    public static void main(String[] args) {
//      1. 대입 연산, 부호 연산자
        int num = 100;
        num = +10;
        num = 10;
        num = -10;

//      2. 산술 연산자, 증가/감소 연산자
        System.out.println("== 산술 연산자, 증가/감소 연산자 ==");
        int numX = 10;
        int numY = 3;
        int result = 0;

        result = numX + numY;
        result = numX - numY;
        result = numX * numY;
        result = numX / numY;
        result = numX % numY;
        System.out.println("result = " + result);

        int numZ = 1;
        System.out.println("numZ = " + numZ++);
        System.out.println("numZ = " + numZ);

        numZ = 1;
        System.out.println("numZ = " + ++numZ);
        System.out.println("numZ = " + numZ);

        numZ = 1;
        System.out.println("numZ = " + numZ--);
        System.out.println("numZ = " + numZ);

        numZ = 1;
        System.out.println("numZ = " + --numZ);
        System.out.println("numZ = " + numZ);


//      관계 연산자
        System.out.println("== 관계 연산자 ==");
        int numA = 10;
        int numB = 9;

        System.out.println(numA > numB);
        System.out.println(numA < numB);
        System.out.println(numA == numB);
        System.out.println(numA != numB);

//      논리 연산자
        System.out.println("== 논리 연산자 ==");
        System.out.println((10 > 9) && (1 == 0));
        System.out.println((10 > 9) || (1 == 0));

//      복합 대입 연산자
        System.out.println("== 복합 대입 연산자 ==");
        int num1 = 10;
        int num2 = 5;
        num1 += num2;
//      num1 = num1 + num2;
        System.out.println("num1 = " + num1);

//      삼항 연산자
        System.out.println("== 삼항 연산자 ==");
        int a = 100;
        String aResult = (a == 10) ? "yes" : "no";
        System.out.println("aResult = " + aResult);

//      비트 논리 연산자
        System.out.println("== 비트 논리 연산자 ==");
//      AND 연산자 (&)
        System.out.println("== & ==");
        int num11 = 5;
        int num22 = 3;
        int result2 = 0;

        result2 = num11 & num22;
        System.out.println("result = " + result2);
        System.out.println(Integer.toBinaryString(num11));
        System.out.println("%04d\n", Integer.parseInt(Integer.toBinaryString(num11)));
        System.out.println("%04d\n", Integer.parseInt(Integer.toBinaryString(num22)));
        System.out.println("%04d\n", Integer.parseInt(Integer.toBinaryString(result2)));

//      OR 연산자 (|)
        System.out.println("== | ==");

        result2 = num11 | num22;
        System.out.println("result = " + result2);
        System.out.println("%04d\n", Integer.parseInt(Integer.toBinaryString(num11)));
        System.out.println("%04d\n", Integer.parseInt(Integer.toBinaryString(num22)));
        System.out.println("%04d\n", Integer.parseInt(Integer.toBinaryString(result2)));

//      XOR 연산자 (^)
        System.out.println("== XOR ==");

        result = num1 ^ num2;
        System.out.println("result2 = " + result2);
        System.out.println("%04d\n", Integer.parseInt(Integer.toBinaryString(num11)));
        System.out.println("%04d\n", Integer.parseInt(Integer.toBinaryString(num22)));
        System.out.println("%04d\n", Integer.parseInt(Integer.toBinaryString(result2)));

//      반전 연산자 (~)
        System.out.println("== ~ ==");
        num11 = 5;

        result2 = ~num11;
        System.out.println("result2 = " + result2);
        System.out.println("%04d\n", Integer.parseInt(Integer.toBinaryString(num11)));
        System.out.println("%04d\n", Integer.toBinaryString(num11));

//      비트 이동 연산자
        System.out.println("== 비트 이동 연산자 ==");
//      << 연산자
        int numAA = 3;
        result33 = numAA << 1;

        System.out.println("result2 = " + result2);
        System.out.println("%04d\n", Integer.parseInt(Integer.toBinaryString(numAA)));
        System.out.println("%04d\n", Integer.parseInt(Integer.toBinaryString(result)));

//      >> 연산자
        result == numAA >> 1;

        System.out.println("result2 = " + result2);
        System.out.println("%04d\n", Integer.parseInt(Integer.toBinaryString(numAA)));
        System.out.println("%04d\n", Integer.parseInt(Integer.toBinaryString(result)));

//      >>> 연산자
        numA = -5;
        result = numA >> 1;
        System.out.println("%s\n", Integer.toBinaryString((numA));
        System.out.println("%s\n", Integer.toBinaryString((result));

        result = numA >>> 1;
        System.out.println("%s\n", Integer.toBinaryString((numA));
        System.out.println("%s\n", Integer.toBinaryString((result));
    }
}
