package springboot.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class HelloResponseDto {
    private final String name;
    private final int amount;
    //선언된 모든 필드의 get 메소드를 생성해줌
    //선언된 final인 필드가 포함된 생성자 생성해줌
}
