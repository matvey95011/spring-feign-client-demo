package ru.example.java.spring.demo.client;

import org.springframework.cloud.openfeign.FeignClient;
import ru.example.java.spring.demo.api.PhoneApi;

@FeignClient(name = "phoneClient", url = "${api.baseUrl}")
public interface PhoneClient extends PhoneApi {
}
