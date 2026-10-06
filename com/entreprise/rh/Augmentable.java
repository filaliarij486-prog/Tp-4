package com.entreprise.rh;

import com.entreprise.exception.MontantInvalideException;

public interface Augmentable {

    double TAUX_MAX = 0.20;

    void augmenter(double taux) throws MontantInvalideException;

    default void augmenterStandard()
            throws MontantInvalideException {
        augmenter(0.05);
    }
}
