package com.example.keycloaksandbox.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/api")
public class SandboxController {

    @GetMapping("/auth")
    public ResponseEntity auth(Principal principal){
        return ResponseEntity.ok("Acesso com auth");
    }

    @GetMapping("/noauth")
    public ResponseEntity noAuth(){
        return ResponseEntity.ok("Acesso sem auth");
    }

}
