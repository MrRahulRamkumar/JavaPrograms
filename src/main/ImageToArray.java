/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatest;

import com.sun.javafx.iio.ImageLoader;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Rahul Ramkumar
 */
public class ImageToArray 
{
    public static BufferedImage loadImage(String path)
    {
        try
        {

            return ImageIO.read(ImageLoader.class.getResource(path));
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
            System.exit(1);
        }
        return null;
    }
    
    public static byte[] bufferedImageToByteArray(BufferedImage image, String format) throws IOException 
    {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ImageIO.write(image, format, baos);
        return baos.toByteArray();
    } 
    
    public static void main(String [] args) throws IOException
    {
        BufferedImage buf_image = loadImage("C:\\Users\\Rahul Ramkumar\\Documents\\NetBeansProjects\\Handwrite\\src\\util\\b.jpg");
        byte[] imageByteArray = bufferedImageToByteArray(buf_image,"jpg");
    }
}
