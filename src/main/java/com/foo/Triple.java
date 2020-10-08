package com.foo;

public class Triple
{
    private final int sum;
    private final int product;

    public Triple(int a, int b, int c)
    {
        sum = a + b + c;
        product = a * b * c;
    }

    public int getSum() {
        return sum;
    }

    public int getProduct() {
        return product;
    }
}