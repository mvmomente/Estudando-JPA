package com.mvmomente.jpa_v2.dto.request;

import java.util.UUID;

public record RegisterDto(
        UUID id,
        String nome,
        String email,
        String senha
) {
}
