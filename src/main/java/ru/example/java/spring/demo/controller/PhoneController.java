package ru.example.java.spring.demo.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.example.java.spring.demo.client.PhoneClient;
import ru.example.java.spring.demo.model.PhoneResponse;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/phones")
public class PhoneController {

    private final PhoneClient client;

    @GetMapping
    ResponseEntity<List<PhoneResponse>> getAllPhone() {
        return client.findAllPhone();
    }

    @GetMapping("/{id}")
    ResponseEntity<PhoneResponse> getById(@PathVariable Long id) {
        return client.findPhoneById(id);
    }

}
