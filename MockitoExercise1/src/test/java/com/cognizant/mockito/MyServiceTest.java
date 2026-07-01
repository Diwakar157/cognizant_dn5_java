package com.cognizant.mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class MyServiceTest {

    @Test
    public void testFetchData() {

        ExternalApi api = mock(ExternalApi.class);

        when(api.getData()).thenReturn("Mock Data");

        MyService service = new MyService(api);

        String result = service.fetchData();

        assertEquals("Mock Data", result);
    }
}