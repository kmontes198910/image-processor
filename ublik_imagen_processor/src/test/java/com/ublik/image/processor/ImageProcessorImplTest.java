package com.ublik.image.processor;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ImageProcessorImplTest {

    private final ImageProcessorImpl imageIOImpl = new ImageProcessorImpl();

    @Test
    void padLeft() {
        assertThat(imageIOImpl.process())
                .isEqualTo("Image");
    }

}