package com.wear.mhare.mywatchface;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.wearable.watchface.CanvasWatchFaceService;
import android.view.SurfaceHolder;

/**
 * Created by mhare on 5/8/15.
 */
public class WeatherWatchFaceService extends CanvasWatchFaceService
{
  @Override
  public Engine onCreateEngine()
  {
    return new Engine();
  }

  private class Engine extends CanvasWatchFaceService.Engine
  {
    Paint mTextPaint;
    Float mTextXOffset;
    Float mTextYOffset;

    @Override
    public void onCreate(SurfaceHolder holder)
    {
      super.onCreate(holder);

      mTextPaint = new Paint();
      mTextPaint.setTextSize(40);
      mTextPaint.setColor(Color.WHITE);
      mTextPaint.setAntiAlias(true);

      mTextXOffset = mTextPaint.measureText("12:00") / 2;
      mTextYOffset = (mTextPaint.ascent() + mTextPaint.descent()) / 2;

    }

    @Override
    public void onDraw(Canvas canvas, Rect bounds)
    {
      canvas.drawText("12:00", bounds.centerX() - mTextXOffset,
                      bounds.centerY() - mTextYOffset,
                      mTextPaint);
    }

  }
}
