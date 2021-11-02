package com.projeto.atribuicao.ref;

public class Main {
//    Ententendo a diferença na atribuição entre tipos primitivos e objetos.
    public static void main(String[] args){
        int intA =1;
        int intB= intA;

        System.out.println(("intA "+ intA + " intB "+ intB));
        intA = 2;
        System.out.println(("intA "+ intA + " intB "+ intB));

        MeObjeto objA = new MeObjeto( 1);
        MeObjeto objB = objA;

        System.out.println("objA "+ objA+" objB "+ objB);
        objA.setNun(2);
        System.out.println("objA "+ objA+" objB "+ objB);


    }
}
