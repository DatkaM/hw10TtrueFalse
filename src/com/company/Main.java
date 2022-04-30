package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(get(a,1,2,3,4,5,6,7,10,47,92,48,58,378,9530,17,83,55));


    }
    static boolean get(int a,int ...var) {
        for(int i = 0; i < var.length;i++){
            if(a==var[i]){
                return true;
            }else{

            }
        }
        return false;
    }


    }












