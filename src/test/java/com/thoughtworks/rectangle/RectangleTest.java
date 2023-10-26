package com.thoughtworks.rectangle;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

public class RectangleTest{
    @Test
    public void shouldReturnAreaWhenLengthAndWidthAreGiven()
    {
        Rectangle rectangle = new Rectangle(3.14,2.67);
        double Area = rectangle.area();
        assertThat(Area, is(equalTo(8.3838)));
    }

}