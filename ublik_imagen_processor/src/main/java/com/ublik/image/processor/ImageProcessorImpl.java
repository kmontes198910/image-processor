package com.ublik.image.processor;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

class ImageProcessorImpl implements ImageProcessor {

    ImageProcessorImpl() {
    }

	@Override
	public byte[] addTextWatermark(String text, String url, int fontSize, String type, int positionX, int positionY, String color,
			float alpha) throws IOException {

        BufferedImage image = ImageIO.read(new URL(url));

        int imageType = "png".equalsIgnoreCase(type) ? BufferedImage.TYPE_INT_ARGB : BufferedImage.TYPE_INT_RGB;
        BufferedImage watermarked = new BufferedImage(image.getWidth(), image.getHeight(), imageType);

        Graphics2D w = (Graphics2D) watermarked.getGraphics();
        w.drawImage(image, 0, 0, null);
        AlphaComposite alphaChannel = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha);
        w.setComposite(alphaChannel);
        w.setColor(Color.getColor(color));
        w.setFont(new Font(Font.SANS_SERIF, Font.BOLD, fontSize));

        w.drawString(text, positionX, positionY);

        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ImageIO.write(watermarked, type, bos);
        
        w.dispose();

        return bos.toByteArray();
	}


}
