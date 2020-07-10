package org.spring.test.payment.api;

import org.spring.test.common.api.result.Resp;
import org.spring.test.common.entity.Payment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pay")
public class PaymentAPI {
	
	@GetMapping("get")
	public Resp get() {
		return new Resp(200,"success",null);
	}
	
	@PostMapping("create")
	public Resp create(@RequestBody Payment pay) {
		return new Resp(200,"success",null);
	}
}
