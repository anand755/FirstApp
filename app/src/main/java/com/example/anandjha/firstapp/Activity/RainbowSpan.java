package com.example.anandjha.firstapp.Activity;

import android.app.Activity;
import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import android.util.Log;

import com.example.anandjha.firstapp.R;

/**
 * Created by anandjha on 31/01/17.
 */
public class RainbowSpan extends CharacterStyle implements UpdateAppearance {

    private final int[] colors;

    public RainbowSpan(Context context) {
                colors = context.getResources() .getIntArray(R.array.rainbows);
                Log.d("Color length is", String.valueOf(colors.length));
            }

    @Override
    public void updateDrawState(TextPaint tp) {

        Log.d("Rain paint is", tp.toString());
                tp.setStyle(Paint.Style.FILL);
                Shader shader = new LinearGradient( 0, 0, 0, tp.getTextSize() * colors.length, colors, null,
                        Shader.TileMode.MIRROR);
                Matrix matrix = new Matrix();
                matrix.setRotate(90);
                shader.setLocalMatrix(matrix);
                tp.setShader(shader);
    }
}
