package com.example.ejercicio32;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConstraintLayout layout1 = (ConstraintLayout)findViewById(R.id.layout1);
        Lienzo fondo = new Lienzo(this);
        layout1.addView(fondo);
    }

    class Lienzo extends View {

        public Lienzo(Context context){
            super(context);
        }

        protected void onDraw(Canvas canvas){
            Paint pincel1 = new Paint();
            int ancho = canvas.getWidth();
            canvas.drawRGB(255,255,255);

            pincel1.setARGB(255,255,0,0);
            canvas.drawRect(10,10,ancho-10,90,pincel1);

            pincel1.setStyle(Paint.Style.STROKE);
            canvas.drawRect(10,110,ancho-10,200,pincel1);

            pincel1.setStrokeWidth(3);
            canvas.drawRect(10,210,ancho-10,300,pincel1);
        }
    }
}