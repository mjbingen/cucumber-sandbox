package com.foo;

import io.cucumber.java8.En;
import org.junit.Assert;

public class Steps implements En
{
    Integer sum = null;
    Integer product = null;

    public Steps()
    {
        // This works when embedded in a fat jar, but the below implementation does not!
        //When("we have {int}:{int}:{int}", (Integer a, Integer b, Integer c) ->
        //{
        //    sum = a + b + c;
        //    product = a * b * c;
        //});

        // This does not work when cucumber is embedded into a fat-jar and executed.
        // But this does work when executed from IDE, the gradle "cucumber" task,
        // or with traditional classpath setting of cucumber jars and execution.
        When("we have {triple}", (Triple triple) ->
        {
            sum = triple.getSum();
            product = triple.getProduct();
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