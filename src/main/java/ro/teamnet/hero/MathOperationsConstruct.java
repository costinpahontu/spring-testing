package ro.teamnet.hero;

import java.math.BigDecimal;

/**
 * MathOperationsConstruct.java
 * <p/>
 * Copyright (c) 2013 Teamnet. All Rights Reserved.
 * <p/>
 * This source file may not be copied, modified or redistributed,
 * in whole or in part, in any form or for any reason, without the express
 * written consent of Teamnet.
 */

public class MathOperationsConstruct {
    private BigDecimal a;
    private BigDecimal b;

    public MathOperationsConstruct(BigDecimal a, BigDecimal b) {
        assert a!=null;
        assert b!=null;
        this.a = a;
        this.b = b;
    }

    public BigDecimal add(){
        return a.add(b);
    }

    public BigDecimal substract(){
        return a.subtract(b);
    }

    public BigDecimal multiply(){
        return a.multiply(b);
    }

    public BigDecimal divide(){
        return a.divide(b);
    }

}
