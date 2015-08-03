package projects.oss2015.cs.fundookid;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class Sounds extends ActionBarActivity {

    public static MediaPlayer mpCow,mpPig,mpCat,mpDog,mpLamb,mpDuck,mpLion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sounds);

        mpCow= MediaPlayer.create(this, R.raw.cow);
        mpPig= MediaPlayer.create(this, R.raw.pig);
        mpCat= MediaPlayer.create(this, R.raw.cat);
        mpDog= MediaPlayer.create(this, R.raw.dog);
        mpLamb= MediaPlayer.create(this, R.raw.lamb);
        mpDuck= MediaPlayer.create(this, R.raw.duck);
        mpLion= MediaPlayer.create(this, R.raw.lion);

    }

    public void onClickCow(View view){

        checkSounds();
        mpCow.start();
    }

    public void onClickPig(View view){

        checkSounds();
        mpPig.start();
    }

    public void onClickCat(View view){
        checkSounds();
        mpCat.start();
    }

    public void onClickDog(View view){
        checkSounds();
        mpDog.start();
    }

    public void onClickLamb(View view){
        checkSounds();
        mpLamb.start();
    }

    public void onClickDuck(View view){

        checkSounds();
        mpDuck.start();
    }

    public void onClickLion(View view){

        checkSounds();
        mpLion.start();
    }

    public void checkSounds(){
        if(mpCow.isPlaying() || mpCow.isLooping()) {
            mpCow.stop();
        }
        if(mpPig.isPlaying() || mpPig.isLooping()) {
            mpPig.stop();
        }
        if(mpCat.isPlaying() || mpCat.isLooping()) {
            mpCat.stop();
        }
        if(mpDog.isPlaying() || mpDog.isLooping()) {
            mpDog.stop();
        }
        if(mpLamb.isPlaying() || mpLamb.isLooping()) {
            mpLamb.stop();
        }
        if(mpDuck.isPlaying() || mpDuck.isLooping()) {
            mpDuck.stop();
        }
        if(mpLion.isPlaying() || mpLion.isLooping()) {
            mpLion.stop();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_sounds, menu);
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
