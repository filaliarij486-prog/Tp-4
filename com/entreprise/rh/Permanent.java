package com.entreprise.rh;

import com.entreprise.exception.MontantInvalideException;

public class Permanent extends Employe implements Augmentable {

    private double salaireMensuel;

    public Permanent(String nom, double salaire)
            throws MontantInvalideException {

        super(nom);

        if (salaire <= 0) {
            throw new MontantInvalideException("salaire", salaire);
        }

        salaireMensuel = salaire;
    }

    public Permanent(String nom, double salaire, String agence)
            throws MontantInvalideException {

        super(nom, agence);

        if (salaire <= 0) {
            throw new MontantInvalideException("salaire", salaire);
        }

        salaireMensuel = salaire;
    }

    public String getPoste() {
        return "Permanent";
    }

    public double getSalaire() {
        return salaireMensuel;
    }

    public void augmenter(double taux)
            throws MontantInvalideException {

        if (taux <= 0 || taux > TAUX_MAX) {
            throw new MontantInvalideException("taux", taux);
        }

        salaireMensuel = salaireMensuel * (1 + taux);
    }

    public String toString() {
        return getPoste() + "[" +
               super.toString() +
               ", salaire=" + getSalaire() + "]";
    }
}


