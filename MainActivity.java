package com.example.colourr;

import android.graphics.Canvas;
import android.graphics.Color;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import android.graphics.Bitmap;

import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;

import android.widget.ImageView;

public class MainActivity extends AppCompatActivity
{
    int ch=1;
    float font=30;
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bitmap bg = Bitmap.createBitmap(600, 1280, Bitmap.Config.ARGB_8888);
        ImageView i = (ImageView) findViewById(R.id.imageView);
        i.setBackgroundDrawable(new BitmapDrawable(bg));
        Canvas canvas = new Canvas(bg);

        Paint paint = new Paint();
        paint.setColor(Color.BLUE);
        paint.setTextSize(50);


        canvas.drawRect(0, 20, 600, 1400, paint);

        Button b2= (Button) findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (ch) {
                    case 1:
                        i.setBackgroundColor(Color.RED);
                        break;
                    case 2:
                        i.setBackgroundColor(Color.GREEN);
                        break;
                    case 3:
                        i.setBackgroundColor(Color.BLUE);
                        break;
                    case 4:
                        i.setBackgroundColor(Color.CYAN);
                        break;
                    case 5:
                        i.setBackgroundColor(Color.YELLOW);
                        break;
                    case 6:
                        i.setBackgroundColor(Color.MAGENTA);
                        break;
                }
                ch++;
                if (ch == 7)
                    ch = 1;
            }
        });
    }
}
