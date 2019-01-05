package com.finwintech;

import com.finwintech.wsdl.GetBinInfoResponse;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Scanner;

@SpringBootApplication
public class MySpringApplicationClient {

	public static void main(String[] args) {
		SpringApplication.run(MySpringApplicationClient.class, args);
    }

	@Bean
	CommandLineRunner lookup(BinClient binClient) {
		return args -> {
			Scanner in = new Scanner(System.in);
            System.out.println(">>>>>>>>>>>>>>>>>");
            System.out.println("Input a BIN number: ");
			String bin_number = in.next();
            System.out.println(">>>>>>>>>>>>>>>>>");
			System.out.println("---=== Get BIN by Bin Number ===---");
			GetBinInfoResponse binInfoResponse = binClient.getBinByBinNumber(bin_number);
            System.out.println("BIN:               "+ binInfoResponse.getBinNumber());
            System.out.println("Bank Country Name: " + binInfoResponse.getBankCountryName());
            System.out.println("Bank Issuing:      " + binInfoResponse.getBankIssuing());
            System.out.println(">>>>>>>>>>>>>>>>>");
        };
	}	
}            