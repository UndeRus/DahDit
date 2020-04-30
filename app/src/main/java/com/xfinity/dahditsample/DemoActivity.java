/*
 * Copyright 2017 Comcast Cable Communications Management, LLC
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.xfinity.dahditsample;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

import com.xfinity.dahditsample.databinding.ActivityDemoBinding;

public class DemoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityDemoBinding view = ActivityDemoBinding.inflate(getLayoutInflater());
        setContentView(view.getRoot());



        final Handler handler = new Handler();


        final boolean[] isBlack = {false};
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                isBlack[0] = !isBlack[0];

                if (isBlack[0]) {
                    view.line4.setDotColor(Color.RED);
                } else {
                    view.line4.setDotColor(Color.BLACK);
                }

                handler.postDelayed(this, 1000);
            }
        };
        runnable.run();
    }
}
