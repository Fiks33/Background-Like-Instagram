package com.trust.android.sampletransitioninstagram;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.trust.android.sampletransitioninstagram.widget.GradientBackgroundPainter;

/**
 * Created by Mochamad Taufik on 19-Sep-16.
 * Email   : thidayat13@gmail.com
 * Company : TRUSTUDIO
 */
public class SampleActivity extends AppCompatActivity {

    private GradientBackgroundPainter gradientBackgroundPainter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        View backgroundImage = findViewById(R.id.root_view);

        final int[] drawables = new int[3];
        drawables[0] = R.drawable.gradient_1;
        drawables[1] = R.drawable.gradient_2;
        drawables[2] = R.drawable.gradient_3;

        gradientBackgroundPainter = new GradientBackgroundPainter(backgroundImage, drawables);
        gradientBackgroundPainter.start();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        gradientBackgroundPainter.stop();
    }

}