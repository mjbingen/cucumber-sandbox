package com.foo;

import io.cucumber.java8.En;
import org.junit.Assert;

public class Steps implements En
{
    Integer sum = null;
    Integer product = null;

    public Steps()
    {
        When("we have {int}:{int}:{int}", (Integer a, Integer b, Integer c) ->
        {
            sum = a + b + c;
            product = a * b * c;
        });

        Then("the sum shall be {int}", (Integer sum) ->
        {
            Assert.assertEquals(sum, this.sum);
        });

        Then("the product shall be {int}", (Integer product) ->
        {
            Assert.assertEquals(product, this.product);
        });
    }
}