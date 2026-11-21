package mate.academy.rickandmorty.service;

import java.util.List;
import mate.academy.rickandmorty.dto.internal.InternalResponseDto;
import mate.academy.rickandmorty.dto.internal.SearchParametersDto;

public interface CharacterService {
    InternalResponseDto getRandomCharacter();

    List<InternalResponseDto> getCharactersByParams(SearchParametersDto searchParametersDto);

    void saveAll();
}
