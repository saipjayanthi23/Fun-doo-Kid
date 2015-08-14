/* Copyright (c) 2015 Sai Jayanthi
   This source file is licensed under the "MIT license".
   Please see the file COPYING in this distribution for license terms.
*/

/*
   This program provides the functionality to implement sound features for Animal sounds activity
 */
package projects.oss2015.cs.fundookid;

import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import java.io.IOException;


public class Sounds extends ActionBarActivity {

    public MediaPlayer mpCow,mpPig,mpCat,mpDog,mpLamb,mpDuck,mpLion;

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


        ImageButton btncow=(ImageButton)findViewById(R.id.CowButton);
        btncow.setOnClickListener(new View.OnClickListener() {

            public void onClick(View vone) {
                checkSounds();

                mpCow.start();
            }
        });

        ImageButton btnpig=(ImageButton)findViewById(R.id.PigButton);
        btnpig.setOnClickListener(new View.OnClickListener() {

            public void onClick(View vone) {
                checkSounds();
                mpPig.start();
            }
        });
        ImageButton btncat=(ImageButton)findViewById(R.id.CatButton);
        btncat.setOnClickListener(new View.OnClickListener() {

            public void onClick(View vone) {
                checkSounds();
                mpCat.start();
            }
        });
        ImageButton btndog=(ImageButton)findViewById(R.id.DogButton);
        btndog.setOnClickListener(new View.OnClickListener() {

            public void onClick(View vone) {
                checkSounds();
                mpDog.start();
            }
        });
        ImageButton btnlamb=(ImageButton)findViewById(R.id.LambButton);
        btnlamb.setOnClickListener(new View.OnClickListener() {

            public void onClick(View vone) {
                checkSounds();
                mpLamb.start();
            }
        });
        ImageButton btnduck=(ImageButton)findViewById(R.id.DuckButton);
        btnduck.setOnClickListener(new View.OnClickListener() {

            public void onClick(View vone) {
                checkSounds();
                mpDuck.start();
            }
        });

        ImageButton btnlion=(ImageButton)findViewById(R.id.LionButton);
        btnlion.setOnClickListener(new View.OnClickListener() {

            public void onClick(View vone) {
                checkSounds();
                mpLion.start();
            }
        });
    }

    /*public void onClickCow(View view){

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
*/
    public void checkSounds() {
       if (mpPig.isPlaying()) {
           mpPig.stop();
           mpPig= MediaPlayer.create(this, R.raw.pig);

       }
        if (mpCat.isPlaying()) {
            mpCat.stop();
            mpCat= MediaPlayer.create(this, R.raw.cat);
        }
        if (mpDog.isPlaying()) {
            mpDog.stop();
            mpDog= MediaPlayer.create(this, R.raw.dog);
        }
        if (mpLamb.isPlaying()) {
            mpLamb.stop();
            mpLamb= MediaPlayer.create(this, R.raw.lamb);
        }
        if (mpDuck.isPlaying()) {
            mpDuck.stop();
            mpDuck= MediaPlayer.create(this, R.raw.duck);
        }
        if (mpLion.isPlaying()) {
            mpLion.stop();
            mpLion= MediaPlayer.create(this, R.raw.lion);
        }

        if (mpCow.isPlaying()) {
            mpCow.stop();
            mpCow= MediaPlayer.create(this, R.raw.cow);
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
