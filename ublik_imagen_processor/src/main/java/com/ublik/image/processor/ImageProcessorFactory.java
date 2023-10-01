
package com.ublik.image.processor;

public final class ImageProcessorFactory {

    private ImageProcessorFactory() {
    }

    public static ImageProcessor createImageIO() {
        return new ImageProcessorImpl();
    }
}
