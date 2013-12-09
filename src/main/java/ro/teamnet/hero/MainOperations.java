package ro.teamnet.hero;

import ro.teamnet.hero.annotations.RequestMapping;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * MainOperations.java
 * <p/>
 * Copyright (c) 2013 Teamnet. All Rights Reserved.
 * <p/>
 * This source file may not be copied, modified or redistributed,
 * in whole or in part, in any form or for any reason, without the express
 * written consent of Teamnet.
 */

public class MainOperations {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {
        Class c = MathOperationsStatic.class;
        Constructor[] constr = c.getDeclaredConstructors();
        Constructor mainConstr = constr[0];
        if(!mainConstr.isAccessible()){
            mainConstr.setAccessible(true);
        }
        Object obj = mainConstr.newInstance();
        Method m = c.getDeclaredMethod("simpleAdd");
        System.out.println(m.invoke(obj));





        String valoare=m.getAnnotation(RequestMapping.class).value();
          System.out.println(valoare);
         //http://stackoverflow.com/questions/18340666/how-to-get-the-value-of-annotation-using-reflection-in-java
        //MyClass.class.getMethod("getElement").getAnnotation(JsonView.class).value()
    }
}
