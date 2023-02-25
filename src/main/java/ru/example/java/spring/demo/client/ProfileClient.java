package ru.example.java.spring.demo.client;

import org.springframework.cloud.openfeign.FeignClient;
import ru.example.java.spring.demo.api.ProfileApi;

@FeignClient(name = "profileClient", url = "${api.baseUrl}")
public interface ProfileClient extends ProfileApi {
}
