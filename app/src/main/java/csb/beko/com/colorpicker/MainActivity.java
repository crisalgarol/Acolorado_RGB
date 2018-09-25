package csb.beko.com.colorpicker;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    SeekBar s1;
    SeekBar s2;
    SeekBar s3;

    TextView rtv;
    TextView gtv;
    TextView btv;

    ConstraintLayout layout;

    ImageButton botonAnimar;

    int r = 0;
    int g = 0;
    int blu = 0;


    Window window;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        s1 = (SeekBar) findViewById(R.id.s1);
        s2 = (SeekBar) findViewById(R.id.s2);
        s3 = (SeekBar) findViewById(R.id.s3);

        rtv = (TextView) findViewById(R.id.rtv);
        btv = (TextView) findViewById(R.id.btv);
        gtv = (TextView) findViewById(R.id.gtv);

        botonAnimar = (ImageButton) findViewById(R.id.botonAnimar);

        layout = (ConstraintLayout) findViewById(R.id.layout);

        window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);

        s1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                r = i;
                rtv.setText("" + i);
                //rtv.setTextColor(Color.rgb(blu,r,g));
                layout.setBackgroundColor(Color.rgb(r,g,blu));
                window.setStatusBarColor(Color.rgb(r,g,blu));
                window.setNavigationBarColor(Color.rgb(255,255,255));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        s2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                g = i;
                gtv.setText("" + i);
                //gtv.setTextColor(Color.rgb(blu,r,g));
                layout.setBackgroundColor(Color.rgb(r,g,blu));
                window.setStatusBarColor(Color.rgb(r,g,blu));
                window.setNavigationBarColor(Color.rgb(255,255,255));

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        s3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                blu = i;
               // btv.setTextColor(Color.rgb(blu,r,g));
                btv.setText("" + i);
                layout.setBackgroundColor(Color.rgb(r,g,blu));
                window.setStatusBarColor(Color.rgb(r,g,blu));
                window.setNavigationBarColor(Color.rgb(255,255,255));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        botonAnimar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(int i=0; i<255; i++){
                    for(int j=0; j<255; j++){
                        for(int k=0; k<255; k++){
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    layout.setBackgroundColor(Color.rgb(i,j,k));
                                }
                            });
                        }
                    }
                }
            }
        });

    }
}
