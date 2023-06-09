package com.example.BasicMath;

import com.example.abstractClass.Practice;

// 1, 2, 3, 4를 이용하여 세 자리 자연수를 만드는 방법 (순서 o , 중복 x)의 각 결과를 출력하시오.
// 방법 1
public class Permutation2 {
    void Permutation(int[] arr, int depth, int n, int r) { // arr: 배열, depth: 자릿수, n: 총 개수, r: 몇 자리 자연수 선택
        if(depth == r){
            for (int i = 0 ; i < r; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }

        for(int i = depth; i < n;i++){
            swap(arr, depth, i);
            Permutation(arr, depth+1, n, r);
            swap(arr, depth, i);
        }
    }

    void swap(int[] arr, int depth, int idx) {
        int tmp = arr[depth];
        arr[depth] = arr[idx];
        arr[idx] = tmp;
    }

    public static void main(String[] args) {
        // test code
        int[] arr = {1,2,3,4};

        Permutation2 p = new Permutation2();
        p.Permutation(arr, 0, 4, 3);
    }
}
