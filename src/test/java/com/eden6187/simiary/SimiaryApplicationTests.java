package com.eden6187.simiary;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class SimiaryApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void test(){
        assertThat(true).isFalse();
    }

}
