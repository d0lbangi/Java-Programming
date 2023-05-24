package com.example.test;

// Java - Variables and Datatypes
public class VariablesDatatypes {

    public static void main(String[] args) {
        // 1. 변수 사용하기
        System.out.println("== 변수 사용하기 ==");

        int age = 10;
        System.out.println(age);

        String country = "Korea";
        System.out.println(country);

        // 2. 변수 이용 규칙
        System.out.println("== 변수 이용 규칙");
        // 2-1. 문자, 숫자, _(underscore), $ 사용 가능
        int apple = 2000;
        int apple3 = 2000;
        int _apple = 2000;
        int $apple = 2000;
        System.out.println($apple);
        System.out.println("$apple = " + $apple);

        // 2-2. 숫자로 시작 X
        // int 3apple = 2000; >> 에러 발생

        // 2-3. 대소문자 구분
        int apple5 = 1000;
        int Apple5 = 2000;

        // 2-4. 공백 사용 X
        int one_apple = 1000;
        int oneApple = 1000;

        // 2-5. 예약어 사용 X
        // 예약어 예시: true, false, if, switch, for, continue, break, ...
        //  int true = 1; >> 에러 발생
        
        // 참고) 한글 사용 가능
        int 사과 = 1000;
        System.out.println("사과 = " + 사과);

        // 3. 표기법
        // 3.1 카멜 표기법 (camelCase)
        // 변수, 함수
        int myAge = 10;
        int oneApplePrice = 1000;

        // 3.2 파스칼 표기법 (PascalCase)
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

        // 1.3 2진수 / 8진수 / 16진수
        int numBase2 = 0b1100;
        System.out.println("numBase2 = " + numBase2);
        int numBase8 = 014;
        System.out.println("numBase8 = " + numBase8);
        int numBase16 = 0xC;
        System.out.println("numBase16 = " + numBase16);

        System.out.println("0b" + Integer.toBinaryString(numBase2));
        System.out.println("0" + Integer.toOctalString(numBase8));
        System.out.println("0x" + Integer.toHexString(numBase16));

        // 2. 자료형 - 부울
        System.out.println("== 부울 ==");
        boolean isPass = true;
        System.out.println("isPass = " + isPass);
        boolean isOk = false;
        System.out.println("isOk = " + isOk);

        // 3. 자료형 - 문자
        System.out.println("== 문자 ==");
        char keyFirst = 'a';
        System.out.println("keyFirst = " + keyFirst);
        char keyLast = 'z';
        System.out.println("keyLast = " + keyLast);
        System.out.println((int)keyFirst); // 아스키코드
        System.out.println((int)keyLast); // 아스키코드
    }
}
