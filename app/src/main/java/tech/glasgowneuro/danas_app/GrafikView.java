package tech.glasgowneuro.danas_app;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.View;

/**
 * Plots some random stuff
 */

public class GrafikView extends View {

    //String TAG="ECGAxisView";
    int width;
    int height;
    Paint paint_black;
    Paint paint_blue;
    Paint paint_green;
    int abc=0;

    public GrafikView(Context context) {
        super(context);
        doInit();
    }

    public GrafikView(Context context, AttributeSet attrs) {
        super(context, attrs);
        doInit();
    }

    public GrafikView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        doInit();
    }

    private void doInit() {
        paint_black = new Paint();
        paint_black.setColor(Color.rgb(0, 0, 0));
        paint_blue = new Paint();
        paint_blue.setColor(Color.rgb(0, 0, 255));
        paint_green = new Paint();
        paint_green.setColor(Color.rgb(255, 0, 0));
    }

    void neuMalen() {
        invalidate();
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        width = canvas.getWidth();
        height = canvas.getHeight();

        float sw;
        if (width>height) {
            sw = width/100;
        } else {
            sw = height/100;
        }

        paint_black.setStrokeWidth(sw);

        canvas.drawText("Hallo Dana hjgjhgjgjhjghjg",800,100,paint_black);
        canvas.drawLine(100,100,300,100,paint_blue);
        canvas.drawLine(300,100,300,200,paint_blue);
        canvas.drawLine(300,200,100,200,paint_blue);
        canvas.drawLine(100,200,100,100,paint_blue);

        for(int i=0;i<300;i=i+10) {
            canvas.drawText("Hallo Dana", width / 2+i, height / 2 + i, paint_black);
        }

        for(int i=0;i<300;i=i+10) {

            canvas.drawLine(100+i, 100, 200+i, 200, paint_blue);
        }
        if (abc>0) {
            canvas.drawCircle(800, 300, 100, paint_blue);
        }
    } // Paint


}
