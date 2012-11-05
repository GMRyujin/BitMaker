package BitMaker.Base;

import android.content.Context;
import android.graphics.Canvas;
import Technology.Base.GameView;
import Technology.Base.GameView.GameThread;

public class BitMakerView extends GameView {

	public BitMakerView(Context context, boolean isFullSceen,
			boolean isShowTitle) {
		super(context, isFullSceen, isShowTitle);
	}
	
	class BitMakerThread extends GameThread{
		@Override
		protected void onInitialize() {
			super.onInitialize();
		}

		@Override
		protected void Update(float timeDelta) {
			super.Update(timeDelta);
		}
		
		@Override
		protected void Draw(Canvas canvas) {
			super.Draw(canvas);
		}
	}
	
	@Override
	protected GameThread CreateCurrentThread() {
		return new BitMakerThread();
	}
}
