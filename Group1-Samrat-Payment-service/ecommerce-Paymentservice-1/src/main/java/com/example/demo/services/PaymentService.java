package com.example.demo.services;

import org.springframework.http.ResponseEntity;

import com.example.demo.entities.PaymentDto;

public interface PaymentService {

	ResponseEntity<PaymentDto> processPayment(PaymentDto dto);
}