package com.in28minutes.unittesting.unittesting.data;

import com.in28minutes.unittesting.unittesting.model.Item;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

@DataJpaTest
public class ItemRepositoryTest {

    @Autowired
    private ItemRepository itemRepository;

    @Test
    public void findAllTest() {
        List<Item> items = itemRepository.findAll();
        Assertions.assertEquals(3, items.size());
    }
}
