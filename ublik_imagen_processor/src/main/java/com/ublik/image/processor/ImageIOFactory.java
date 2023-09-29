
package com.ublik.image.processor;

public final class ImageIOFactory {

    private ImageIOFactory() {
    }

    public static ImageIO createImageIO() {
        return new ImageIOImpl();
    }
}
