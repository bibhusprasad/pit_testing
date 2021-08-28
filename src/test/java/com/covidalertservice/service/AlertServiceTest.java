package com.covidalertservice.service;

import com.covidalertservice.controller.service.AlertService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AlertServiceTest {

    AlertService alertService = new AlertService();

    @Test
    public void show(){
        alertService.getAlertAboutState("abc");
    }
}
