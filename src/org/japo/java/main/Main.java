/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.main;

import java.util.Random;

/**
 *
 * @author CicloM
 */
public class Main {

    public static final Random RND = new Random();

    public static void main(String[] args) {
        final double ALTURA_MIN = 0.50;
        final double ALTURA_MAX = 2.50;

        double altura = RND.nextDouble() * (ALTURA_MAX - ALTURA_MIN) + ALTURA_MIN;
        System.out.printf("Altura Aleatoria...: %.2f%n", altura);
    }

}
