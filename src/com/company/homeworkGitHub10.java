package com.company;

import java.util.Scanner;

public class homeworkGitHub10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        get(a,1,2,3,4,5,6,7,8,9,10,48,29,95,567,25,19);
    }
    static void get(int a , int ...var){
        for(int i = 0 ; i < var.length ; i++){
            System.out.print(var[i] + " ");
        }
        for(int i = 0; i < var[i]; i++){
            if(a==var[i]){
                System.out.println(true);
            }else{
                System.out.println(false);
            }
        }
    }
}
