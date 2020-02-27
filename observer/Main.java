/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author iit
 */
public class Main {
    public static void main(String[] args)
    {
        YoutubeChannel ch = new YoutubeChannel();
        ch.subscribe(new Email());
        ch.subscribe(new Sms());
        ch.subscribe(new Account());
        
        ch.videoUploaded();
    }
}
