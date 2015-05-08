import android.support.wearable.watchface.CanvasWatchFaceService;

/**
 * Created by mhare on 5/8/15.
 */
public class WeatherWatchFaceService extends CanvasWatchFaceService
{
  public Engine onCreateEngine( ) {
    return new Engine;
  }
}
