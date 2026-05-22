package com.mvmomente.jpa_v2.dto.response;

import java.util.UUID;

public record UsuarioResponse(
        UUID id,
        String nome,
        String email
) {
}
