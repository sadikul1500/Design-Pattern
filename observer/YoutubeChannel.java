/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.ArrayList;

/**
 *
 * @author iit
 */
public class YoutubeChannel {
    ArrayList<IObserver> list = new ArrayList();
    
    public void subscribe(IObserver io)
    {
        list.add(io);
    }
    
    public void unsubscribe(IObserver io)
    {
        list.remove(io);
    }
    
    public void sendNotification()
    {
        for(int i=0; i<list.size(); i++)
        {
            String str = list.get(i).getNotification();
            System.out.println(str);
        }
    }
    
    public void videoUploaded()
    {
        sendNotification();
    }
    
}
