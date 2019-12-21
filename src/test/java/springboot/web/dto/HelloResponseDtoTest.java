package springboot.web.dto;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat; //assertj 테스트 검증 라이브러리, junit assertThat 대신 사용

public class HelloResponseDtoTest {

    @Test
    public void loombok_test() {
        String name = "test";
        int amount = 1000;

        HelloResponseDto dto = new HelloResponseDto(name, amount);

        assertThat(dto.getName()).isEqualTo(name); //assertj 검증 메소드, isEqualTo 동등 비교 메소드
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}
