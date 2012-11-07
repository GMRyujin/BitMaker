package BitMaker.Base;

import com.example.bitmaker.*;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import Technology.Base.GameView;
import Technology.Base.GameView.GameThread;
import Technology.Control.AnimatedGameButton;
import Technology.Game.GameWorld;
import Technology.Interface.IControllable;
import Technology.Util.BitmapLoader;
import Technology.Util.GameSound;
import Technology.Util.MusicPlayer;
import Technology.Util.TechVibrator;

public class BitMakerView extends GameView {

	public BitMakerView(Context context, boolean isFullSceen,
			boolean isShowTitle) {
		super(context, isFullSceen, isShowTitle);
	}
	
	private AnimatedGameButton[] btn = new AnimatedGameButton[15];
	private boolean btn11 = false;
	
	class BitMakerThread extends GameThread{
		@Override
		protected void onInitialize() {
			super.onInitialize();
			InitClearColor(Color.BLACK);
			setMultiTouch(true);
			
			BitmapLoader loader = BitmapLoader.getInstance();
			loader.put("ButttonUp", com.example.bitmaker.R.drawable.bit_button_up);
			loader.put("ButttonDown", com.example.bitmaker.R.drawable.bit_button_down);
			
			final GameSound sound = GameSound.getInstance();
			sound.Load("00", R.raw.00);
			sound.Load("01", R.raw.01);
			sound.Load("02", R.raw.02);
			sound.Load("03", R.raw.03);
			sound.Load("04", R.raw.04);
			sound.Load("05", R.raw.05);
			sound.Load("06", R.raw.06);
			sound.Load("07", R.raw.07);
			sound.Load("08", R.raw.08);
			sound.Load("09", R.raw.09);
			sound.Load("10", R.raw.10);
			sound.Load("11", R.raw.11);
			sound.Load("12", R.raw.12);
			sound.Load("13", R.raw.13);
			sound.Load("14", R.raw.14);
			
			
			
			int width = GetScreenWidth();
			int height = GetScreenHeight();
			
			int buttonWidth = width/3;
			int buttonHeight = height/5;
			
			
			int i = 0;
			int j = 0;
			
			for(int y = 0 ; y < 5; y++){
				for(int x = 0 ; x < 3 ; x ++){
					btn[y*3+x] = new AnimatedGameButton(loader.get("ButttonUp"), loader.get("ButttonDown"), 1000,1000
							,buttonWidth*x,buttonHeight*y, buttonWidth*(x+1),buttonHeight*(y+1));
					btn[y*3+x].AddWorld();
				}
			}
			
			
			//TODO 버튼마다 비트를 추가한다.
			btn[0].setOnActionControl(new IControllable() {
				@Override
				public void onActionUp(float x, float y) {
					
				}
				
				@Override
				public void onActionMove(float x, float y) {
					
				}
				
				@Override
				public void onActionDown(float x, float y) {
					// TODO 비트를 들려준다.
					if(btn11 == false){
						MusicPlayer.get("heart_beat").setLooping(true);
						MusicPlayer.get("heart_beat").setVolume(100, 100);
						MusicPlayer.get("heart_beat").start();
						btn11 = true;
					}else{
						MusicPlayer.get("heart_beat").pause();
						btn11 = false;
					}
				}
			});
			
			btn[4].setOnActionControl(new IControllable() {
				@Override
				public void onActionUp(float x, float y) {
					
				}
				
				@Override
				public void onActionMove(float x, float y) {
					
				}
				
				@Override
				public void onActionDown(float x, float y) {
					// TODO 비트를 들려준다.
					sound.Play("dung", 10, 10, 0, 1);
				}
			});
			
			
			
			btn[12].setOnActionControl(new IControllable() {
				@Override
				public void onActionUp(float x, float y) {
					
				}
				
				@Override
				public void onActionMove(float x, float y) {
					
				}
				
				@Override
				public void onActionDown(float x, float y) {
					// TODO 비트를 들려준다.
					sound.Play("drum1", 10, 10, 0, 1);
				}
			});
			
			btn[13].setOnActionControl(new IControllable() {
				@Override
				public void onActionUp(float x, float y) {
					
				}
				
				@Override
				public void onActionMove(float x, float y) {
					
				}
				
				@Override
				public void onActionDown(float x, float y) {
					// TODO 비트를 들려준다.
					sound.Play("drum2", 10, 10, 0, 1);
				}
			});
			
			btn[14].setOnActionControl(new IControllable() {
				@Override
				public void onActionUp(float x, float y) {
					
				}
				
				@Override
				public void onActionMove(float x, float y) {
					
				}
				
				@Override
				public void onActionDown(float x, float y) {
					// TODO 비트를 들려준다.
					sound.Play("drum3", 10, 10, 0, 1);
				}
			});
		}

		@Override
		protected void Update(float timeDelta) {
			super.Update(timeDelta);
			GameWorld.getInstance().Update(timeDelta);
		}
		
		@Override
		protected void Draw(Canvas canvas) {
			super.Draw(canvas);
			Clear(canvas);
			GameWorld.getInstance().Draw(canvas);
		}
	}
	
	@Override
	protected GameThread CreateCurrentThread() {
		return new BitMakerThread();
	}
}
