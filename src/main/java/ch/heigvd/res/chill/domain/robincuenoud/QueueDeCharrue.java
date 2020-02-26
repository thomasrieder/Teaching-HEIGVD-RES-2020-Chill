package ch.heigvd.res.chill.domain.robincuenoud;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class QueueDeCharrue implements IProduct {

    public final static String NAME = "Queue de Charrue";
    public final static BigDecimal PRICE = new BigDecimal(4);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
