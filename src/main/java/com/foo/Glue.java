package com.foo;

import io.cucumber.java.ParameterType;

public class Glue
{
    @ParameterType("([\\d]+):([\\d]+):([\\d]+)")
    public Triple triple(String a, String b, String c)
    {
        return new Triple(Integer.parseInt(a), Integer.parseInt(b), Integer.parseInt(c));
    }
}
