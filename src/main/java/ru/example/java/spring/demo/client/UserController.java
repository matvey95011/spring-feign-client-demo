package ru.example.java.spring.demo.client;

import org.springframework.cloud.openfeign.FeignClient;
import ru.example.java.spring.demo.api.UserApi;

@FeignClient(name = "userClient", url = "${api.baseUrl}")
public interface UserController extends UserApi {
}
