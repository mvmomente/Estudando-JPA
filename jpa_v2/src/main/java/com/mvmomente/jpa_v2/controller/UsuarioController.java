package com.mvmomente.jpa_v2.controller;

import com.mvmomente.jpa_v2.dto.request.LoginDto;
import com.mvmomente.jpa_v2.dto.request.RegisterDto;
import com.mvmomente.jpa_v2.dto.response.UsuarioResponse;
import com.mvmomente.jpa_v2.entity.Usuario;
import com.mvmomente.jpa_v2.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    public record MessageResponse(String message, UsuarioResponse response) {}

    @Autowired
    private UsuarioService service;

    @GetMapping
    public ResponseEntity<List<UsuarioResponse>> exibirUsuarios() {
        return ResponseEntity.ok(service.listarUsuarios());
    }

    @PostMapping("/registrar")
    public ResponseEntity<MessageResponse> registrarUsuario(@RequestBody RegisterDto dto) {

        UsuarioResponse response = service.criarUsuario(dto);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(new MessageResponse("Usuario criado com sucesso!", response));
    }

    @PostMapping("/login")
    public ResponseEntity<MessageResponse> loginUsuario(@RequestBody LoginDto dto) {
        UsuarioResponse response = service.acessarUsuario(dto);

        return ResponseEntity.status(HttpStatus.OK)
                .body(new MessageResponse("Usuario logado com sucesso!", response));
    }
}
