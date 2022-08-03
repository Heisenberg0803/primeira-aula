package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        funcaoSoma(2, 2);
        funcaoSubtrair(2, 5);
        List<String> x = nomesDeAlunos("Pedro", "Paulo");
        for (String s : x) {
            System.out.println();
        }
    }
    public static List<String> nomesDeAlunos(String s, String str){
        List<String> listString = new ArrayList<>();
        listString.add(s);
        listString.add(str);
        return listString;
    }
    public static void funcaoSubtrair(double x,double y){
        double z = x - y;
    }
    public static void funcaoSoma(int x, int y){
      int z = x+y;
        System.out.println("A soma de "+ x+" mais "+y+" é igual a "+z);
    }
}
