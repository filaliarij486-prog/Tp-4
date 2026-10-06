	package com.entreprise.app;

import com.entrprise.compta.Facture;

public class DecouverteExceptions {

    public static void main(String[] args) {

        try {
            double[] primes = new double[3];
            primes[5] = 100;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(
                e.getClass().getSimpleName() +
                " : " + e.getMessage());
        }

        try {
            double m = Double.parseDouble("abc");
        } catch (NumberFormatException e) {
            System.out.println(
                e.getClass().getSimpleName() +
                " : " + e.getMessage());
        }

        try {
            Facture f = null;
            f.getMontantAPayer();
        } catch (NullPointerException e) {
            System.out.println(
                e.getClass().getSimpleName() +
                " : " + e.getMessage());
        }

        try {
            int partParPersonne = 9000 / 0;
        } catch (ArithmeticException e) {
            System.out.println(
                e.getClass().getSimpleName() +
                " : " + e.getMessage());
        } finally {
            System.out.println("Fin des essais");
        }
    }
}