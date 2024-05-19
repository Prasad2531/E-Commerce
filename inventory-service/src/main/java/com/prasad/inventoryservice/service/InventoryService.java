package com.prasad.inventoryservice.service;

import com.prasad.inventoryservice.dto.InventoryResponse;
import com.prasad.inventoryservice.model.Inventory;
import com.prasad.inventoryservice.repository.InventoryRepository;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class InventoryService {

    private final InventoryRepository inventoryRepository;

    @Transactional(readOnly = true)
    @SneakyThrows
    public List<InventoryResponse> isInStock(List<String> skuCode){
//        log.info("Wait started");
//        Thread.sleep(6000);
//        log.info("Wait ended"); //added 10 sec delay in to return response from inventory to order
        return  inventoryRepository.findBySkuCodeIn(skuCode)
                .stream()
                .map(inventory ->
                    InventoryResponse.builder()
                            .skuCode(inventory.getSkuCode())
                            .isInStock(inventory.getQuantity()>0)
                            .build()
                )
                .toList();

    }

    public String addInventory(Inventory inventory){
        inventoryRepository.save(inventory);
        return "Added "+inventory+" in inventory!";
    }
}
