package com.thoughtworks.rectangle;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.api.Test;

public class RectangleTest{
    @Test
    public void shouldReturnAreaWhenLengthAndWidthAreGiven()
    {
        Rectangle rectangle = new Rectangle(4,6);
        int Area = rectangle.area();
        assertThat(Area, equalTo(24));
    }

}