package tech.glasgowneuro.tutorial_app;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Plots some random stuff
 */

public class GraphicsView extends View {

    //String TAG="ECGAxisView";
    int width;
    int height;
    Paint paint_black;
    Paint paint_blue;
    Paint paint_green;
    int abc=0;

    public GraphicsView(Context context) {
        super(context);
        doInit();
    }

    public GraphicsView(Context context, AttributeSet attrs) {
        super(context, attrs);
        doInit();
    }

    public GraphicsView(Context context, AttributeSet attrs, int defStyle) {
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

    void repaint_it() {
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

        canvas.drawText("Hello!",50,50,paint_black);
        canvas.drawLine(100,100,300,100,paint_blue);
    } // Paint


}
