package com.example.ejercicio38;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConstraintLayout layout1 = (ConstraintLayout)findViewById(R.id.layout1);
        Lienzo fondo = new Lienzo(this);
        layout1.addView(fondo);
        getSupportActionBar().hide();
    }

    class Lienzo extends View {

        public Lienzo (Context context){
            super(context);
        }

        protected void onDraw(Canvas canvas){
            canvas.drawRGB(0,0,255);
            int ancho = canvas.getWidth();
            int alto = canvas.getHeight();
            Bitmap bmp = BitmapFactory.decodeResource(getResources(),R.drawable.akali2);
            canvas.drawBitmap(bmp, (ancho-650)/2, (alto-380)/2, null);
        }
    }
}