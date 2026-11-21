package mate.academy.rickandmorty.controller;

import java.util.List;
import lombok.RequiredArgsConstructor;
import mate.academy.rickandmorty.dto.internal.InternalResponseDto;
import mate.academy.rickandmorty.dto.internal.SearchParametersDto;
import mate.academy.rickandmorty.service.CharacterServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/characters")
public class CharacterController {
    private final CharacterServiceImpl characterService;

    @GetMapping("/random")
    public InternalResponseDto getRandomCharacter() {
        return characterService.getRandomCharacter();
    }

    @GetMapping("/search")
    public List<InternalResponseDto> search(@RequestBody SearchParametersDto searchParametersDto) {
        return characterService.getCharactersByParams(searchParametersDto);
    }
}
