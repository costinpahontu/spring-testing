package ro.teamnet.hero;

import ro.teamnet.hero.annotations.RequestMapping;

import java.math.BigDecimal;

/**
 * MathOperationsStatic.java
 * <p/>
 * Copyright (c) 2013 Teamnet. All Rights Reserved.
 * <p/>
 * This source file may not be copied, modified or redistributed,
 * in whole or in part, in any form or for any reason, without the express
 * written consent of Teamnet.
 */

public class MathOperationsStatic {
    private MathOperationsStatic() {
       //throw new RuntimeException("Este un util");
    }

    public static BigDecimal add(BigDecimal a, BigDecimal b){
        return a.add(b);
    }

    @RequestMapping(value = "deAfisat")
    public int simpleAdd(){
        return 1+1;
    }


}
