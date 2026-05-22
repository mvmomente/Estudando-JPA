package com.mvmomente.jpa_v2.service;

import com.mvmomente.jpa_v2.dto.request.LoginDto;
import com.mvmomente.jpa_v2.dto.request.RegisterDto;
import com.mvmomente.jpa_v2.dto.response.UsuarioResponse;
import com.mvmomente.jpa_v2.entity.Usuario;
import com.mvmomente.jpa_v2.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioService {
    private final UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    public UsuarioResponse criarUsuario(RegisterDto dto) {
                if (repository.findByEmail(dto.email()).isPresent()) {
            throw new IllegalArgumentException("Email já cadastrado!");
        }

        Usuario usuario = new Usuario();
        usuario.setNome(dto.nome());
        usuario.setEmail(dto.email());
        usuario.setSenha(dto.senha());

        Usuario salvo = repository.save(usuario);

        return new UsuarioResponse(
                salvo.getId(),
                salvo.getNome(),
                salvo.getEmail()
        );
    }

    public List<UsuarioResponse> listarUsuarios() {
        return repository.findAll()
                .stream()
                .map(u -> new UsuarioResponse(
                        u.getId(),
                        u.getNome(),
                        u.getEmail()
                ))
                .toList();
    }

    public UsuarioResponse acessarUsuario(LoginDto dto) {
        Usuario usuario = repository.findByEmail(dto.email())
                .orElseThrow(() -> new IllegalArgumentException("Email ou senha inválida!"));

        if (!usuario.getSenha().equals(dto.senha())) {
            throw new IllegalArgumentException("Email ou senha inválida!");
        }

        return new UsuarioResponse(
                usuario.getId(),
                usuario.getNome(),
                usuario.getEmail()
        );
    }
}
