package mate.academy.rickandmorty.dto.internal;

import jakarta.validation.constraints.NotBlank;

public record SearchParametersDto(@NotBlank String param) {
}
