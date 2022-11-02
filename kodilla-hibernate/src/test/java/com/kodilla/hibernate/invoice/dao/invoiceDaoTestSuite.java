package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

@SpringBootTest
public class invoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
      void TestInvoiceDaoSave() {
        // Given
        Product product1 = new Product(1, "Dinosaur");
        Product product2 = new Product(2, "Robot");
        Product product3 = new Product(3, "Car Toy");


        Item item1 = new Item(product1, new BigDecimal(5), 2);
        Item item2 = new Item(product2, new BigDecimal(22), 1);
        Item item3 = new Item(product3, new BigDecimal(7), 3);

        List<Item> itemList = new ArrayList<>();

        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);

        Invoice invoice1 = new Invoice("1", itemList);


        // When
        invoiceDao.save(invoice1);
        int id = invoice1.getId();
        // Then
        assertEquals(0, id);
        //CleanUp
//        invoiceDao.delete(invoice1);

    }

}
