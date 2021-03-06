/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author 16478
 */
public class Music_player {
    static Music_player player = new Music_player();
    static Clip clip;
    private Music_player()
    {
        
    }
    
    public static Music_player getInstance()
    {
        return player;
    }
    
    public static void loadMusic(String filepath)
    {
        try{
            File musicPath = new File(filepath);
            if(musicPath.exists())
            {
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                clip = AudioSystem.getClip();
                clip.open(audioInput);
                System.out.println("Loaded");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
