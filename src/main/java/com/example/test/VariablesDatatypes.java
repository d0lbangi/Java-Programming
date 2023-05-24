package com.example.test;

// Java - Variables and Datatypes
public class VariablesDatatypes {

    public static void main(String[] args) {
        // 변수 사용하기
        System.out.println("== 변수 사용하기 ==");

        int age = 10;
        System.out.println(age);

        String country = "Korea";
        System.out.println(country);

        // 변수 이용 규칙
        System.out.println("== 변수 이용 규칙");
        // 문자, 숫자, _(underscore), $ 사용 가능
        int apple = 2000;
        int apple3 = 2000;
        int _apple = 2000;
        int $apple = 2000;
        System.out.println($apple);
        System.out.println("$apple = " + $apple);

        // 숫자로 시작 X
        // int 3apple = 2000; >> 에러 발생

        // 대소문자 구분
        int apple5 = 1000;
        int Apple5 = 2000;

        // 공백 사용 X
        int one_apple = 1000;
        int oneApple = 1000;

        // 예약어 사용 X
        // 예약어 예시: true, false, if, switch, for, continue, break, ...
        //  int true = 1; >> 에러 발생
        
        // 참고) 한글 사용 가능
        int 사과 = 1000;
        System.out.println("사과 = " + 사과);

        // 표기법
        // 카멜 표기법 (camelCase)
        // 변수, 함수
        int myAge = 10;
        int oneApplePrice = 1000;

        // 파스칼 표기법 (PascalCase)
        // 클래스
        int MyAge = 10;
        int OneApplePrice = 1000;

        // 참고) 스네이크 표기법 (snake_case) 사용 X
        int my_age = 10;
        int one_apple_price = 1000;

        ////////////////////////////////////////////
        // Variables and DataTypes2

        // 자료형 - 숫자
        System.out.println("== 숫자 ==");
        // 정수
        int intNum = 10;
        System.out.println("intNum = " + intNum);

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        
        int intNum2 = Integer.MAX_VALUE;
        System.out.println("intNum2 = " + intNum2);
        int intNum3 = Integer.MAX_VALUE + 1;
        System.out.println("intNum3 = " + intNum3);
        long longNum = (long)Integer.MAX_VALUE +1;
        System.out.println("longNum = " + longNum);

        // 실수
        float floatNum = 1.23f;
        double doubleNum = 1.23;
        System.out.println(Float.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);

        // 2진수 / 8진수 / 16진수
        int numBase2 = 0b1100;
        System.out.println("numBase2 = " + numBase2);
        int numBase8 = 014;
        System.out.println("numBase8 = " + numBase8);
        int numBase16 = 0xC;
        System.out.println("numBase16 = " + numBase16);

        System.out.println("0b" + Integer.toBinaryString(numBase2));
        System.out.println("0" + Integer.toOctalString(numBase8));
        System.out.println("0x" + Integer.toHexString(numBase16));

        // 자료형 - 부울
        System.out.println("== 부울 ==");
        boolean isPass = true;
        System.out.println("isPass = " + isPass);
        boolean isOk = false;
        System.out.println("isOk = " + isOk);

        // 자료형 - 문자
        System.out.println("== 문자 ==");
        char keyFirst = 'a';
        System.out.println("keyFirst = " + keyFirst);
        char keyLast = 'z';
        System.out.println("keyLast = " + keyLast);
        System.out.println((int)keyFirst); // 아스키코드
        System.out.println((int)keyLast); // 아스키코드

        // 자룔형 - 뭄ㄴ자열
        System.out.println("== 문자열 ==");
        String s1 = "Hello World!";
        System.out.println("s1 = " + s1);
        String s2 = "01234";
        System.out.println("s2 = " + s2);

        // equals
        String s3 = "Hi";
        String s4 = "Hi";
        System.out.println(s3.equals(s4));
        System.out.println(s3 == s4);
        String s5 = new String("Hi");
        System.out.println(s3.equals(s5));
        System.out.println(s3 == s5);

        // indexOf
        String s6 = "Hello! World!";
        System.out.println(s6.indexOf("!"));
        System.out.println(s6.indexOf("!", s6.indexOf("!")+1));

        // replace
        String s7 = s6.replace("Hello", "Bye");
        System.out.println("s7 = " + s7);

        // substring
        System.out.println(s7.substring(0, 3));
        System.out.println(s7.substring(0, s7.indexOf("!")+1));

        // toUpperCase
        System.out.println(s7.toUpperCase());

        // 자료형 - StringBuffer
        System.out.println("== StringBuffer ==");
        StringBuffer sb1 = new StringBuffer();
        sb1.append("01234");
        System.out.println("sb1 = " + sb1);
        sb1.append("56789");
        System.out.println("sb1 = " + sb1);

        String a = "01234";
        String b = "56789";
        String bak = a;
        System.out.println(a == bak);

        a += b;
        System.out.println(a);
        System.out.println(a == bak);

        // 자료형
        System.out.println("== 배열 ==");
        int[] myArray1 = {1,2,3,4,5};
        System.out.println(myArray1[0]);
        System.out.println(myArray1[1]);
        System.out.println(myArray1[2]);
        System.out.println(myArray1[3]);
        System.out.println(myArray1[4]);

        char[] myArray2 = {'a', 'b', 'c', 'd', 'e'};
        System.out.println(myArray2[2]);

        String[] myArray3 = new String[3];
        myArray3[0] = "Hello";
        myArray3[1] = " ";
        myArray3[2] = "World!";
        System.out.println(myArray3[0] + myArray3[1] + myArray3[2]);
    }
}
