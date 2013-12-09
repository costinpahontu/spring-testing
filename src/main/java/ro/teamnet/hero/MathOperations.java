package ro.teamnet.hero;

import java.math.BigDecimal;

/**
 * MathOperations.java
 * <p/>
 * Copyright (c) 2013 Teamnet. All Rights Reserved.
 * <p/>
 * This source file may not be copied, modified or redistributed,
 * in whole or in part, in any form or for any reason, without the express
 * written consent of Teamnet.
 */

public class MathOperations {

    public BigDecimal add(BigDecimal a, BigDecimal b){
        return a.add(b);
    }

    public BigDecimal substract(BigDecimal a, BigDecimal b){
        return a.subtract(b);
    }

    public BigDecimal multiply(BigDecimal a, BigDecimal b){
       return a.multiply(b);
    }

    public BigDecimal divide(BigDecimal a, BigDecimal b){
        return a.divide(b);
    }
}
