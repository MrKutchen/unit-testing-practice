package com.in28minutes.unittesting.unittesting.business;

import com.in28minutes.unittesting.unittesting.data.ItemRepository;
import com.in28minutes.unittesting.unittesting.model.Item;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ItemBusinessServiceTest {

    @InjectMocks
    private ItemBusinessService itemBusinessService;

    @Mock
    private ItemRepository itemRepository;

    @Test
    public void retrieveAllItemsBasic() {
        when(itemRepository.findAll()).thenReturn(Arrays.asList(new Item(2, "Item2", 10, 10),
                new Item(3, "Item3", 20, 20)));
        List<Item> items = itemBusinessService.retrieveAllItems();
        Assertions.assertEquals(100, items.get(0).getValue());
        Assertions.assertEquals(400, items.get(1).getValue());
    }

}
