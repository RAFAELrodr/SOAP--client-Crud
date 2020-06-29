
package com.example.consumingwebservice;

import com.example.consumingwebservice.wsdl.CustomerDetail;
import com.example.consumingwebservice.wsdl.GetAllCustomerDetailResponse;
import com.example.consumingwebservice.wsdl.GetCustomerDetailResponse;
import com.example.consumingwebservice.wsdl.InsertCustomerResponse;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;


@SpringBootApplication
public class ConsumingWebServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumingWebServiceApplication.class, args);
    }


}
