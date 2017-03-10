package com.example.anandjha.firstapp.Activity;

import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.format.DateUtils;
import android.text.style.AlignmentSpan;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import android.util.Log;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.anandjha.firstapp.R;



    public class MainActivity extends Activity {
        private Button button;
        private ProgressBar progressBar;
        private TextView textView, textRainbow;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            textView = (TextView) findViewById(R.id.textView);
            textView.setText("New Swag");
            Typeface typeface = Typeface.createFromAsset(getAssets(), "Ruthie.ttf");
            textView.setTypeface(typeface);


            textRainbow = (TextView) findViewById(R.id.textRainbow);
            String text = textRainbow.getText().toString();
            String substring = "rainbow";

            SpannableString spannableString = new SpannableString(text);
            int start = text.toLowerCase().indexOf(substring);
            int end = start + substring.length();

            Log.d("Rainbow start",String.valueOf(start));
            Log.d("Rainbow end", String.valueOf(end));
            Log.d("Rainbow text is ", spannableString.toString());
            spannableString.setSpan(new RainbowSpan(this), start, end, 0);

        }

        @Override
        public boolean onKeyDown(int keyCode, KeyEvent event) {
            super.onKeyDown(keyCode, event);
            if (event.getKeyCode() == KeyEvent.KEYCODE_POWER) {
                Toast.makeText(this, "dsd", Toast.LENGTH_LONG).show();
                Log.e("jfsdl", "fds");
            }
            return super.onKeyDown(keyCode, event);
        }

        @Override
        public boolean onKeyLongPress(int keyCode, KeyEvent event) {
            super.onKeyLongPress(keyCode, event);
            if (event.getKeyCode() == KeyEvent.KEYCODE_POWER) {
                Toast.makeText(this, "dsd", Toast.LENGTH_LONG).show();
                Log.e("jfsdl", "fds");
            }
            return super.onKeyDown(keyCode, event);
        }

//        private class RainbowSpan extends CharacterStyle implements UpdateAppearance{
//
//            private final int[] colors;
//            public RainbowSpan(Context context) {
//                colors = context.getResources() .getIntArray(R.array.rainbows);
//                Log.d("Color length is", String.valueOf(colors.length));
//            }
//
//            @Override
//            public void updateDrawState(TextPaint paint) {
//
//                Log.d("Rain paint is", paint.toString());
//                paint.setStyle(Paint.Style.FILL);
//                Shader shader = new LinearGradient( 0, 0, 0, paint.getTextSize() * colors.length, colors, null,
//                        Shader.TileMode.MIRROR);
//                Matrix matrix = new Matrix();
//                matrix.setRotate(90);
//                shader.setLocalMatrix(matrix);
//                paint.setShader(shader);
//            }
//        }
    }