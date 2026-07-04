package com.cognizant.mockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.Test;

public class MyServiceTest {

    @Test
    public void testVerifyInteraction() {

        ExternalApi api = mock(ExternalApi.class);

        MyService service = new MyService(api);

        service.fetchData();

        verify(api).getData();
    }
}