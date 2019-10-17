package com.company;

public class Main {

    public static void main(String[] args) {
        int [] posled =new int[args.length];
        for (int i=0;i<args.length;i++) {
            posled[i] = Integer.parseInt(args[i]);
            System.out.print(posled[i] + " ");
        }
        System.out.println();
        for (int j=0;j<args.length;j++) {
            for (int k = j + 1; k < args.length; k++) {
                if (posled[j] == posled[k])
                    System.out.println(posled[j]+" Равно "+posled[k]);
                else
                    System.out.println(posled[j]+" Не ранвно "+posled[k]);
            }

        }
    }
}
