package BitMaker.Base;

import Technology.Base.GameView;
import Technology.Control.AnimatedGameButton;
import Technology.Game.GameWorld;
import Technology.Interface.IControllable;
import Technology.Util.BitmapLoader;
import Technology.Util.GameSound;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;

import com.example.bitmaker.R;

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
			sound.Load("00", R.raw.a00);
			sound.Load("01", R.raw.a01);
			sound.Load("02", R.raw.a02);
			sound.Load("03", R.raw.a03);
			sound.Load("04", R.raw.a04);
			sound.Load("05", R.raw.a05);
			sound.Load("06", R.raw.a06);
			sound.Load("07", R.raw.a07);
			sound.Load("08", R.raw.a08);
			sound.Load("09", R.raw.a09);
			sound.Load("10", R.raw.a10);
			sound.Load("11", R.raw.a11);
			sound.Load("12", R.raw.a12);
			sound.Load("13", R.raw.a13);
			sound.Load("14", R.raw.a14);
			
			int width = GetScreenWidth();
			int height = GetScreenHeight();
			
			int buttonWidth = width/3;
			int buttonHeight = height/6;
			int offsetY = 110;
			
			
			int i = 0;
			int j = 0;
			
			for(int y = 0 ; y < 5; y++){
				for(int x = 0 ; x < 3 ; x ++){
					btn[y*3+x] = new AnimatedGameButton(loader.get("ButttonUp"), loader.get("ButttonDown"), 1000,1000
							,buttonWidth*x,buttonHeight*y + offsetY, buttonWidth*(x+1),buttonHeight*(y+1) + offsetY);
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
					sound.Play("00", 10, 10, 0, 1);
				}
			});
			
			btn[1].setOnActionControl(new IControllable() {
				@Override
				public void onActionUp(float x, float y) {
					
				}
				
				@Override
				public void onActionMove(float x, float y) {
					
				}
				
				@Override
				public void onActionDown(float x, float y) {
					// TODO 비트를 들려준다.
					sound.Play("01", 10, 10, 0, 1);
				}
			});
			
			btn[2].setOnActionControl(new IControllable() {
				@Override
				public void onActionUp(float x, float y) {
					
				}
				
				@Override
				public void onActionMove(float x, float y) {
					
				}
				
				@Override
				public void onActionDown(float x, float y) {
					// TODO 비트를 들려준다.
					sound.Play("02", 10, 10, 0, 1);
				}
			});
			
			btn[3].setOnActionControl(new IControllable() {
				@Override
				public void onActionUp(float x, float y) {
					
				}
				
				@Override
				public void onActionMove(float x, float y) {
					
				}
				
				@Override
				public void onActionDown(float x, float y) {
					// TODO 비트를 들려준다.
					sound.Play("03", 10, 10, 0, 1);
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
					sound.Play("04", 10, 10, 0, 1);
				}
			});
		
			btn[5].setOnActionControl(new IControllable() {
				@Override
				public void onActionUp(float x, float y) {
					
				}
				
				@Override
				public void onActionMove(float x, float y) {
					
				}
				
				@Override
				public void onActionDown(float x, float y) {
					// TODO 비트를 들려준다.
					sound.Play("05", 10, 10, 0, 1);
				}
			});
			btn[6].setOnActionControl(new IControllable() {
				@Override
				public void onActionUp(float x, float y) {
					
				}
				
				@Override
				public void onActionMove(float x, float y) {
					
				}
				
				@Override
				public void onActionDown(float x, float y) {
					// TODO 비트를 들려준다.
					sound.Play("06", 10, 10, 0, 1);
				}
			});
			btn[7].setOnActionControl(new IControllable() {
				@Override
				public void onActionUp(float x, float y) {
					
				}
				
				@Override
				public void onActionMove(float x, float y) {
					
				}
				
				@Override
				public void onActionDown(float x, float y) {
					// TODO 비트를 들려준다.
					sound.Play("07", 10, 10, 0, 1);
				}
			});
			btn[8].setOnActionControl(new IControllable() {
				@Override
				public void onActionUp(float x, float y) {
					
				}
				
				@Override
				public void onActionMove(float x, float y) {
					
				}
				
				@Override
				public void onActionDown(float x, float y) {
					// TODO 비트를 들려준다.
					sound.Play("08", 10, 10, 0, 1);
				}
			});
			btn[9].setOnActionControl(new IControllable() {
				@Override
				public void onActionUp(float x, float y) {
					
				}
				
				@Override
				public void onActionMove(float x, float y) {
					
				}
				
				@Override
				public void onActionDown(float x, float y) {
					// TODO 비트를 들려준다.
					sound.Play("09", 10, 10, 0, 1);
				}
			});
			btn[10].setOnActionControl(new IControllable() {
				@Override
				public void onActionUp(float x, float y) {
					
				}
				
				@Override
				public void onActionMove(float x, float y) {
					
				}
				
				@Override
				public void onActionDown(float x, float y) {
					// TODO 비트를 들려준다.
					sound.Play("10", 10, 10, 0, 1);
				}
			});
			btn[11].setOnActionControl(new IControllable() {
				@Override
				public void onActionUp(float x, float y) {
					
				}
				
				@Override
				public void onActionMove(float x, float y) {
					
				}
				
				@Override
				public void onActionDown(float x, float y) {
					// TODO 비트를 들려준다.
					sound.Play("11", 10, 10, 0, 1);
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
					sound.Play("12", 10, 10, 0, 1);
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
					sound.Play("13", 10, 10, 0, 1);
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
					sound.Play("14", 10, 10, 0, 1);
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
