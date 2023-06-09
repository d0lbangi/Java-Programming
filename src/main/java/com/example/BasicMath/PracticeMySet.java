package com.example.BasicMath;

// ArrayList를 사용한 집합 구현 실습 (집합 관련 연산 사용 X)

import java.util.ArrayList;

class Myset {
// ArrayList
    ArrayList<Integer> list;

// 생성자1
    Myset() {
        this.list = new ArrayList<Integer>();
    }

// 생성자2
    Myset(int[] arr) {
        this.list = new ArrayList<Integer>();

        for(int item: arr){
            this.list.add(item);
        }
    }

// 원소 추가 (중복 X)
    public void add(int x) {
        for (int item: this.list) {
            if(item == x) {
                return;
            }
        }
        this.list.add(x);
    }

// 교집합
    public Myset retainAll(Myset b) {
        Myset result = new Myset();

        for(int itemA: this.list) {
            for(int itemB: b.list) {
                if(itemA == itemB) {
                    result.add(itemA);
                }
            }
        }
        return result;
    }

// 합집합
    public Myset addAll(Myset b ) {
        Myset result = new Myset();

        for(int itemA: this.list) {
            result.add(itemA);
        }

        for(int itemB: b.list) {
            result.add(itemB);
        }
        return result;
    }


// 차집합
    public Myset removeAll(Myset b) {
        Myset result = new Myset();

        for (int itemA: this.list) {
            boolean containFlag = false;

            for(int itemB: b.list) {
                if (itemA == itemB) {
                    containFlag = true;
                    break;
                }
            }
            if (!containFlag) {
                result.add(itemA);
            }
        }
        return result;
    }
}

public class PracticeMySet {

    public static void main(String[] args) {

        Myset a = new Myset();

        a.add(1);
        a.add(1);
        a.add(1);
        System.out.println(a.list);
        a.add(2);
        a.add(3);
        System.out.println(a.list);

        a = new Myset(new int[]{1,2,3,4,5});
        Myset b = new Myset(new int[]{2,4,6,8,10});
        System.out.println("a: " + a.list);
        System.out.println("a: " + b.list);

        Myset result = a.retainAll(b);
        System.out.println("교집합: " + result.list);

        result = a.addAll(b);
        System.out.println("합집합: " + result.list);

        result = a.removeAll(b);
        System.out.println("차집합: " + result.list);
    }
}
