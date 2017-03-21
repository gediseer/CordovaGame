package io.cordova.hellocordova;

import android.media.MediaPlayer;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ItemListJavaScriptHandler
{
    private MediaPlayer player;
    public void goItem(String url, String parentId, String type)
    {
        if (player != null) {
            player.stop();
            player = null;
        }
        if (type.equalsIgnoreCase("audio"))
        {
            try
            {
                player = new MediaPlayer();
                //player.setDataSource(url);

                File file = new File(url);

                FileInputStream fis = new FileInputStream(file);
                player.setDataSource(fis.getFD());
                player.prepare();
                player.start()                                                                                                                                                                     ;
            }
            catch (IllegalArgumentException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            catch (IllegalStateException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}