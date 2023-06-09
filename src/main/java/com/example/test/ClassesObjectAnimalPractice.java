package com.example.test;

//  Practice
//  다음 클래스 직접 만든 후 객체 생성
//  클래스명: Animal
//  특성: 이름, 무게, 분류
//  기능: 먹기, 잠자기, 걷기, 뛰기

public class ClassesObjectAnimalPractice {
    String name;
    Double weight;
    String classification;

    ClassesObjectAnimalPractice(String name, Double weight, String classification) {
        this.name=name;
        this.weight=weight;
        this.classification=classification;
    }

    public void printInfo() {
        System.out.println("name = " + name);
        System.out.println("weight = " + weight);
        System.out.println("classification = " + classification);
    }

    public void eat() {
        System.out.println("냠냠!");
    }
    public void sleep() {
        System.out.println("쿨쿨!");
    }
    public void walk() {
        System.out.println("걷기!");
    }
    public void run() {
        System.out.println("뛰기!");
    }
    public static void main(String[] args) {
        // Test code
        ClassesObjectAnimalPractice animal1 = new ClassesObjectAnimalPractice("강아지", 5.0, "포유류");
        ClassesObjectAnimalPractice animal2 = new ClassesObjectAnimalPractice("구피", 0.01, "어류");
//
        animal1.printInfo();
        animal2.printInfo();
    }
}
