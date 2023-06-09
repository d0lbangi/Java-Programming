package com.example.BasicMath;

// 1, 2, 3, 4를 이용하여 세 자리 자연수를 만드는 방법 (순서 o , 중복 x)의 각 결과를 출력하시오.
// 방법 2

import java.util.Arrays;

public class PracticePermutation2 {

    void Permutation(int[] arr, int depth, int n ,int r, boolean[] visited, int[] out){

        if (depth == r){
            System.out.println(Arrays.toString(out));
            return;
        }
        for(int i = 0; i < n; i++){
            if(visited[i] != true){
                visited[i] = true;
                out[depth] = arr[i];
                Permutation(arr, depth +1, n, r, visited, out);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) {

        // test code
        int[] arr = {1,2,3,4};

        int n = 4;
        int r = 3;
        boolean[] visited = new boolean[n];
        int[] out = new int[r];

        PracticePermutation2 p = new PracticePermutation2();
        p.Permutation(arr, 0, n , r, visited, out);
    }
}
