package com.udacity.pricing.api;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class PricingControllerTest {
    
        @LocalServerPort
        private int port;
    
        @Autowired
        private TestRestTemplate restTemplate;
    
        @Test
        public void getPrice() {
            assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/services/price?vehicleId=1",
                    String.class)).contains("price");
        }
}
