package pl.adcom.jwttest.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    public String home() {
        return "Hello World !!!!";
    }

    @GetMapping(name = "/user")
    @PreAuthorize("hasRole('USER')")
    public String profileUser() {
        return "Hello USER !!!!";
    }

    @GetMapping("/admin")
    @PreAuthorize("hasRole('ADMIN')")
    public String profileAdmin() {
        return "Hello Admin !!!!";
    }

}
