package com.ublik.image.processor;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ImageIOImplTest {

    private final ImageIOImpl imageIOImpl = new ImageIOImpl();

    @Test
    void padLeft() {
        assertThat(imageIOImpl.padLeft())
                .isEqualTo("");
    }

}