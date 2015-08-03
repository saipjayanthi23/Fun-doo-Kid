package projects.oss2015.cs.fundookid;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import org.apache.http.cookie.CookieAttributeHandler;


public class Shoes extends ActionBarActivity {

    public static MediaPlayer mpCheer,mpAww,mpRedBoots;

    float x1,x2,y1,y2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoes);

        mpCheer= MediaPlayer.create(this, R.raw.cheering);
        mpAww= MediaPlayer.create(this, R.raw.aww);
        mpRedBoots= MediaPlayer.create(this,R.raw.redboots);
        mpRedBoots.start();

    }

    public boolean onTouchEvent(MotionEvent touchevent)
    {
        switch (touchevent.getAction())
        {
            case MotionEvent.ACTION_DOWN:
            {
                x1 = touchevent.getX();
                y1 = touchevent.getY();
                break;
            }
            case MotionEvent.ACTION_UP:
            {
                x2 = touchevent.getX();
                y2 = touchevent.getY();

                //if left to right swipe event on screen
                if (x1 < x2)
                {
                    if(mpCheer.isPlaying()) mpCheer.stop();
                    Intent i = new Intent(this,Colors.class);
                    startActivity(i);
                }

                //if right to left swipe event on screen
                if (x1 > x2)
                {
                    if(mpCheer.isPlaying()) mpCheer.stop();
                    Intent i = new Intent(this,Coat.class);
                    startActivity(i);
                }

                break;
            }
        }
        return false;
    }
    public void onClickBlueBoot(View view){
        if(mpCheer.isPlaying() || mpCheer.isLooping()) {
            mpCheer.stop();
            mpCheer= MediaPlayer.create(this, R.raw.cheering);
        }
        mpAww.start();
    }

    public void onClickRedBoot(View view){
        if(mpAww.isPlaying() || mpAww.isLooping()) {
            mpAww.stop();
            mpAww= MediaPlayer.create(this, R.raw.aww);
        }
        mpCheer.start();

    }

    public void onClickYellowBoot(View view){
        if(mpCheer.isPlaying() || mpCheer.isLooping()) {
            mpCheer.stop();
            mpCheer= MediaPlayer.create(this, R.raw.cheering);
        }
        mpAww.start();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_shoes, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
