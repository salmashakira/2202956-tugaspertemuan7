/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pbopert7.linearequation;

/**
 *
 * @author A S U S
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan nilai a: ");
        double a = scanner.nextDouble();

        System.out.println("Masukkan nilai b: ");
        double b = scanner.nextDouble();

        System.out.println("Masukkan nilai c: ");
        double c = scanner.nextDouble();

        System.out.println("Masukkan nilai d: ");
        double d = scanner.nextDouble();

        System.out.println("Masukkan nilai e: ");
        double e = scanner.nextDouble();

        System.out.println("Masukkan nilai f: ");
        double f = scanner.nextDouble();

        LinearEquation equation = new LinearEquation(a, b, c, d, e, f);

        if (equation.isSolvable()) {
            double x = equation.getX();
            double y = equation.getY();
            System.out.println("Persamaan memiliki solusi berikut");
            System.out.println("x = " + x + ", y = " + y);
        } else {
            System.out.println("Persamaan tidak memiliki solusi.");
        }
    }
}

