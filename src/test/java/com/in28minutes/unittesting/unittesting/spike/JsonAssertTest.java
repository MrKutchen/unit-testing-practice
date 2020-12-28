package com.in28minutes.unittesting.unittesting.spike;

import org.json.JSONException;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;

public class JsonAssertTest {

    String actualResponse = "{\"id\":1,\"name\":\"Ball\",\"price\":10,\"quantity\":100}";

    @Test
    public void jsonAssertStrictTrueExactMatchExceptForSpaces() throws JSONException {
        String expectedResponse = "{\"id\":1,\"name\":\"Ball\",\"price\":10,\"quantity\":100}";
        JSONAssert.assertEquals(expectedResponse, actualResponse, true);
    }

    @Test
    public void jsonAssertStrictFalseExactMatchExceptForSpaces() throws JSONException {
        String expectedResponse = "{\"id\":1,\"name\":\"Ball\",\"price\":10}";
        JSONAssert.assertEquals(expectedResponse, actualResponse, false);
    }

    @Test
    public void jsonAssertWithoutEscapeCharacters() throws JSONException {
        String expectedResponse = "{id:1, name:Ball, price :10}";
        JSONAssert.assertEquals(expectedResponse, actualResponse, false);
    }
}
