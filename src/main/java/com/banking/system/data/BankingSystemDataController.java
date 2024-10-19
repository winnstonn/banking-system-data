package com.banking.system.data;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankingSystemDataController {

	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

	@PostMapping("/save-transfer-data")
	public TransferDataResponse saveTransferData() {
		return new TransferDataResponse()
				.setMessage("Save Transfer Data Controller");
	}
}
