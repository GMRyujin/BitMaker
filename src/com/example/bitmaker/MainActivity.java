package com.example.bitmaker;

import com.google.ads.AdRequest;
import com.google.ads.AdSize;
import com.google.ads.AdView;

import BitMaker.Base.BitMakerView;
import RidemPang.Base.RidemPangView;
import Technology.Base.TechnologyActivity;
import android.os.Bundle;
import android.os.Vibrator;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.widget.RelativeLayout;

public class MainActivity extends TechnologyActivity {
	private static final String MY_AD_UNIT_ID = "a1509bc01d2705b";	//나의 서비스 광고
	private AdView adView = null;//
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        InitTechnologyActivity();
        SetGameView(new BitMakerView(this,true,true));
        ApplyCurrentLayout();
        
        /* TODO 광고 설정 */
        adView = new AdView(this, AdSize.BANNER, MY_AD_UNIT_ID);
        //반드시 레이아웃에 id가 지정되어 있어야 하고 반드시 ***id로 찾아야한다.***
        RelativeLayout layout = GetCurrentLayout();
        //새로운 광고를 요청합니다. 
        layout.addView(adView);
        adView.loadAd(new AdRequest());
        /* TODO 광고 설정 끝 */
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    public void onDestroy() {
        adView.destroy();
        super.onDestroy();   
    }
}
