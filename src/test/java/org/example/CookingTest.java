package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CookingTest {

    @DisplayName("메뉴에 해당하는 음식을 만든다")
    @Test
    void makeCookTest() {
        Cooking cooking = new Cooking();
        MenuItem menuItem = new MenuItem("돈까스", 5000);

        /**
         * 중요
         * 요리사(cooking)에게 요리를 만들어 달라는(makeCook)
         * 요청을 하면서 'menuItem' 항목을 전달
         */
        Cook cook = cooking.makeCook(menuItem);
        assertThat(cook).isEqualTo(new Cook("돈까스", 5000));
    }
}
