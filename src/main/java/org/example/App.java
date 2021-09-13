package org.example;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Muhammad Alli
 */

import java.util.Scanner;
public class App{
    public static void main(String[] args) {

        Scanner Peep = new Scanner(System.in);
        System.out.println("What many people do you have?");
        String peeps = Peep.nextLine();
        int people = Integer.parseInt(peeps); //int people


        Scanner pizza = new Scanner(System.in);
        System.out.println("How many pizzas?");
        String Pizza = pizza.nextLine();
        int PIZZA = Integer.parseInt(Pizza); //int PIZZA


        Scanner s = new Scanner(System.in);
        System.out.println("How many slices?");
        String sl = s.nextLine();
        int slices = Integer.parseInt(sl); //int slices

        int sliceperpizza = slices*PIZZA;
        int sliceperperson = sliceperpizza / people;
        int remainder = sliceperpizza % people;

        System.out.println("People: "+ people +" Pizzas: "+ PIZZA +" Total Slices: "+ sliceperpizza);
        System.out.println("Each person gets "+sliceperperson+" slices\n The remainder is: "+remainder);



    }
}
