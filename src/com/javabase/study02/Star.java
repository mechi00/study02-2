package com.javabase.study02;

public class Star {

    // main 메소드
    // 자바 프로그램이 실행되는 시작점
    // 어떤 것을 실행하려고 하더라도 main메소드에 작성해야 한다.

    // 프로그래밍 : data + logic

    // logic -> 메소드 method
    // static으로 정의된 메소드에서는 static으로 정의된 메소드만 호출이 가능하다.
    public static void main(String[] args) {
        starOne(5);
    }

    public static void starOne(int n){
        /*
         * *
         * **
         * ***
         * ****
         * 출력을 해보자.
         * */
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
