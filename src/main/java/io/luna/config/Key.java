package io.luna.config;

import static java.lang.String.format;
import java.math.BigInteger;

public final class Key {
    private BigInteger modulus;
    private BigInteger exponent;

    public BigInteger getModulus() {
        return this.modulus;
    }

    public BigInteger getExponent() {
        return this.exponent;
    }

    public void setModulus(BigInteger modulus) {
        this.modulus = modulus;
    }

    public void setExponent(BigInteger exponent) {
        this.exponent = exponent;
    }

    @Override
    public String toString() {
        return new StringBuilder()
            .append( format( "Exponent: %s\n", exponent ) )
            .append( format( "Modulus: %s\n", modulus ) )
            .toString();
    }
}