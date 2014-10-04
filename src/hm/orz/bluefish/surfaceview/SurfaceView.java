package hm.orz.bluefish.surfaceview;

import android.app.Activity;
import android.os.Bundle;

public class SurfaceView extends Activity {
  
  AnimationSurfaceView surfaceView;
  
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        surfaceView = new AnimationSurfaceView(this);
        setContentView(surfaceView);
        
    }
}
