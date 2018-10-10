package tt.test.com.imagedemo;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
      public void changeFunction(View view)
      {
          ImageView iv= (ImageView) findViewById(R.id.iv);
           iv.setImageResource(R.drawable.cat);
      }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
