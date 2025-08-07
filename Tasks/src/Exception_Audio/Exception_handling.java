package Exception_Audio;

import java.io.File;
import java.util.Scanner;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Exception_handling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter first number: ");
            String s1 = sc.nextLine();

            System.out.print("Enter second number: ");
            String s2 = sc.nextLine();

            System.out.println("Concatenated Strings: " + s1 + s2);

            int a = Integer.parseInt(s1);
            int b = Integer.parseInt(s2);

            System.out.println("Addition: " + (a + b));
            System.out.println("Division: " + (a / b));
        } catch (NumberFormatException e2) {
            System.out.println("Please enter only numbers");
            System.out.println(e2);
            playSound(); // Play sound on NumberFormatException
        } catch (ArithmeticException e3) {
            System.out.println("Second number cannot be 0");
            System.out.println(e3);
            playSound(); // Play sound on ArithmeticException
        } finally {
            System.out.println("Finally Block Reached");
            sc.close();
        }
    }

    public static void playSound() {
        try {
            // Correct path (assuming file is placed under src/exception_audio/)
            File soundFile = new File("src/exception_audio/error.wav");

            if (!soundFile.exists()) {
                System.out.println("⚠ Sound file not found at: " + soundFile.getAbsolutePath());
                return;
            }

            AudioInputStream audioStream = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();

            // Wait for the sound to complete (simple sleep method)
            Thread.sleep(clip.getMicrosecondLength() / 500);
        } catch (Exception e) {
            System.out.println("⚠ Could not play sound: " + e.getMessage());
        }
    }
}
