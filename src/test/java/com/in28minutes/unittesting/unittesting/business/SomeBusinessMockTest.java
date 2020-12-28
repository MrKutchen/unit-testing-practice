package com.in28minutes.unittesting.unittesting.business;

import com.in28minutes.unittesting.unittesting.data.SomeDataService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class SomeBusinessMockTest {

    @InjectMocks
    SomeBusinessImpl business;

    @Mock
    SomeDataService dataServiceMock;

    @Test
    public void calculateSumUsingDataServiceBasic() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{1, 2, 3});
        Assertions.assertEquals(6, business.calculateSumUsingDataService());
    }

    @Test
    public void calculateSumUsingDataServiceEmpty() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{});
        Assertions.assertEquals(0, business.calculateSumUsingDataService());
    }

    @Test
    public void calculateSumUsingDataServiceOneElement() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{5});
        Assertions.assertEquals(5, business.calculateSumUsingDataService());
    }
}
