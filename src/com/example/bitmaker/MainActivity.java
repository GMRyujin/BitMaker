package com.example.bitmaker;

import BitMaker.Base.BitMakerView;
import RidemPang.Base.RidemPangView;
import Technology.Base.TechnologyActivity;
import android.os.Bundle;
import android.os.Vibrator;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;

public class MainActivity extends TechnologyActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        InitTechnologyActivity();
        SetGameView(new BitMakerView(this,true,true));
        ApplyCurrentLayout();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
