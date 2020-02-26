package ch.heigvd.res.chill.domain.thomasrieder;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class InnisAndGunn implements IProduct{

    public final static String NAME = "Innis & Gunn";
    public final static BigDecimal PRICE = new BigDecimal(3.0);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}


