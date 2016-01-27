package org.codeselect.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button spotifyStreamerApp;
    private Button scoresApp;
    private Button libraryApp;
    private Button buildItBiggerApp;
    private Button xyzReaderApp;
    private Button capstoneApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        spotifyStreamerApp = (Button) findViewById(R.id.spotify_streamer);
        scoresApp = (Button) findViewById(R.id.scores_app);
        libraryApp = (Button) findViewById(R.id.library_app);
        buildItBiggerApp = (Button) findViewById(R.id.build_it_bigger);
        xyzReaderApp = (Button) findViewById(R.id.xyz_reader);
        capstoneApp = (Button) findViewById(R.id.my_own_app);

        spotifyStreamerApp.setOnClickListener(this);
        scoresApp.setOnClickListener(this);
        libraryApp.setOnClickListener(this);
        buildItBiggerApp.setOnClickListener(this);
        xyzReaderApp.setOnClickListener(this);
        capstoneApp.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String message = getString(R.string.this_btn_will_launch_my);
        switch (v.getId()) {
            case R.id.spotify_streamer:
                message += " " + getString(R.string.spotify_streamer);
                break;
            case R.id.scores_app:
                message += " " + getString(R.string.scores_app);
                break;
            case R.id.library_app:
                message += " " + getString(R.string.library_app);
                break;
            case R.id.build_it_bigger:
                message += " " + getString(R.string.build_it_bigger);
                break;
            case R.id.xyz_reader:
                message += " " + getString(R.string.xyz_reader);
                break;
            case R.id.my_own_app:
                message += " " + getString(R.string.capstone_my_own_app);
                break;
        }
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

    }
}
