package com.ublik.image.processor;

import java.io.IOException;

public interface ImageProcessor {

	byte[] addTextWatermark(String text, String url, int fontSize, String type, int positionX, int positionY, String color, float alpha) throws IOException;
}
