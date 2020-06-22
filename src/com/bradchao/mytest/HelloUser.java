package com.bradchao.mytest;

import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.printf("Hello, %s", name);
    }
}
