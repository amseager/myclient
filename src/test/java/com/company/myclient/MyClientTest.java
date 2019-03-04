package com.company.myclient;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;


@RunWith(SpringRunner.class)
@SpringBootTest
public class MyClientTest {

    @Autowired
    private MyClient myClient;

    @Mock
    private MyResponseErrorHandler myResponseErrorHandler;

    @Test
    public void sampleTest() throws IOException {
        //The example of configuring myResponseErrorHandler behavior
        Mockito.when(myResponseErrorHandler.hasError(Mockito.any())).thenReturn(true);

        //Call myClient method

        //Asserts...
    }
}