package com.entreprise.rh;

import com.entreprise.exception.MontantInvalideException;

public class Commercial extends Employe implements Augmentable {

    private double fixe;
    private double chiffreAffaires;

    public Commercial(String nom, double fixe,
                      double chiffreAffaires, String agence)
            throws MontantInvalideException {

        super(nom, agence);

        if (fixe <= 0) {
            throw new MontantInvalideException("fixe", fixe);
        }

        if (chiffreAffaires < 0) {
            throw new MontantInvalideException(
                    "chiffreAffaires", chiffreAffaires);
        }

        this.fixe = fixe;
        this.chiffreAffaires = chiffreAffaires;
    }

    public String getPoste() {
        return "Commercial";
    }

    public double getSalaire() {
        return fixe + chiffreAffaires * 5 / 100;
    }

    public void augmenter(double taux)
            throws MontantInvalideException {

        if (taux <= 0 || taux > TAUX_MAX) {
            throw new MontantInvalideException("taux", taux);
        }

        fixe = fixe * (1 + taux);
    }

    public String toString() {
        return getPoste() + "[" +
               super.toString() +
               ", fixe=" + fixe +
               ", chiffreAffaires=" + chiffreAffaires + "]";
    }
}