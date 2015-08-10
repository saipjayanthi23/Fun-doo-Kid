package projects.oss2015.cs.fundookid;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.DragShadowBuilder;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class Shapes extends Activity implements OnTouchListener {

    MediaPlayer mpTada,mpAww,mpApplause;
    private RelativeLayout.LayoutParams layoutParams;

    myDragEventListener mDragListen=new myDragEventListener();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shapes);


        findViewById(R.id.circle).setOnTouchListener(this);
        findViewById(R.id.star).setOnTouchListener(this);
        findViewById(R.id.rectangle).setOnTouchListener(this);
        findViewById(R.id.triangle).setOnTouchListener(this);
        findViewById(R.id.dottedcircle).setOnDragListener(mDragListen);
        findViewById(R.id.dottedrectangle).setOnDragListener(mDragListen);
        findViewById(R.id.dottedstar).setOnDragListener(mDragListen);
        findViewById(R.id.dottedtriangle).setOnDragListener(mDragListen);

        mpTada=MediaPlayer.create(this,R.raw.tada);
        mpApplause= MediaPlayer.create(this,R.raw.applause);
        mpAww=MediaPlayer.create(this,R.raw.aww);

    }

    public void checkSounds(){

        if(mpApplause.isPlaying()){
            mpApplause.stop();
            mpApplause= MediaPlayer.create(this,R.raw.applause);
        }

        if(mpAww.isPlaying()){
            mpAww.stop();
            mpAww=MediaPlayer.create(this,R.raw.aww);
        }

    }

    public void onClickReplay(View view){
        Intent ireplay = new Intent(this,Shapes.class);
        startActivity(ireplay);
    }

    public void onClickNext(View view){

        Intent inext = new Intent(this,MainActivity.class);
        startActivity(inext);
    }

    @Override
    public boolean onTouch(View view, MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {

            DragShadowBuilder shadow = new View.DragShadowBuilder(view);
            view.startDrag(null, shadow, view, 0);
            return true;

        } else {
            return false;
        }
    }

    protected class myDragEventListener implements View.OnDragListener {

        @Override
        public boolean onDrag(View v, DragEvent event) {

            switch (event.getAction()) {
                case DragEvent.ACTION_DRAG_STARTED:
                   Log.i("start", "Action is DragEvent.ACTION_DRAG_STARTED");
                    break;

                case DragEvent.ACTION_DRAG_ENTERED:
                   Log.i("enter", "Action is DragEvent.ACTION_DRAG_ENTERED");
                    break;

                case DragEvent.ACTION_DRAG_LOCATION:
                    break;

                case DragEvent.ACTION_DRAG_EXITED:
                    Log.i("exit", "Action is DragEvent.ACTION_DRAG_EXITED");
                    break;

                case DragEvent.ACTION_DROP:

                    Log.i("drop", "Action is DragEvent.ACTION_DRAG_DROP");

                    View view = (View) event.getLocalState();

                    if (v.getId() == R.id.dottedcircle && view.getId() == R.id.circle) {
                        ViewGroup from = (ViewGroup) view.getParent();
                        from.removeView(view);
                        ImageView t1 = (ImageView)v;
                        view.setVisibility(View.VISIBLE);
                        t1.setImageResource(R.drawable.circle);
                        checkSounds();
                        mpApplause.start();
                        return true;
                    } else if (v.getId() == R.id.dottedstar && view.getId() == R.id.star) {
                        ViewGroup from = (ViewGroup) view.getParent();
                        from.removeView(view);
                        ImageView t2 = (ImageView)v;
                        view.setVisibility(View.VISIBLE);
                        t2.setImageResource(R.drawable.start);
                        checkSounds();
                        mpApplause.start();
                        return true;
                    } else if (v.getId() == R.id.dottedrectangle && view.getId() == R.id.rectangle) {
                        ViewGroup from = (ViewGroup) view.getParent();
                        from.removeView(view);
                        ImageView t3 = (ImageView)v;
                        view.setVisibility(View.VISIBLE);
                        t3.setImageResource(R.drawable.rectangle);
                        checkSounds();
                        mpApplause.start();
                        return true;
                    } else if (v.getId() == R.id.dottedtriangle && view.getId() == R.id.triangle) {
                         ViewGroup from = (ViewGroup) view.getParent();
                         from.removeView(view);
                         ImageView t4 = (ImageView)v;
                         view.setVisibility(View.VISIBLE);
                         t4.setImageResource(R.drawable.triangle);
                        checkSounds();
                        mpApplause.start();
                        return true;
                    } else {
                        checkSounds();
                        mpAww.start();
                        return false;
                    }

                case DragEvent.ACTION_DRAG_ENDED:
                    Log.i("ended", "Action is DragEvent.ACTION_DRAG_ENDED");
                    break;

            }
            return true;
        }
    }
}






