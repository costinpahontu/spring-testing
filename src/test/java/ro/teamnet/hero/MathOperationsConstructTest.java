package ro.teamnet.hero;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * MathOperationsConstructTest.java
 * <p/>
 * Copyright (c) 2013 Teamnet. All Rights Reserved.
 * <p/>
 * This source file may not be copied, modified or redistributed,
 * in whole or in part, in any form or for any reason, without the express
 * written consent of Teamnet.
 */

public class MathOperationsConstructTest {
    private BigDecimal a;
    private BigDecimal b;
    MathOperations mathOperations;

    @Before
    public void setUp() throws Exception {
        b=BigDecimal.ZERO;
        a=BigDecimal.TEN;
        mathOperations=
                new MathOperations();

    }

    @Test
    public void testDivide() throws Exception {
        Assert.assertEquals(BigDecimal.ZERO,mathOperations.divide(b,a));

    }
}
