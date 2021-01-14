package com.devopsusa.paymentservice.controller;

import com.devopsusa.paymentservice.domain.Payment;
import com.devopsusa.paymentservice.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Random;

@Controller
@RequestMapping("/api")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/payment/doPayment")
    public ResponseEntity<Payment> doPayment(@RequestBody Payment payload){
        Payment payment = paymentService.doPayment(payload);
        return new ResponseEntity<Payment>(payment, new HttpHeaders(), HttpStatus.OK);
    }


}
