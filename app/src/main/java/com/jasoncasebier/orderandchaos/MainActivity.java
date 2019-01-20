package com.jasoncasebier.orderandchaos;

//Jason Casebier

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button playButton = findViewById(R.id.playButton);
        playButton.setOnClickListener(this);

        Button rulesButton = findViewById(R.id.rulesButton);
        rulesButton.setOnClickListener(this);

        Button aboutButton = findViewById(R.id.aboutButton);
        aboutButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.playButton) {
            Intent intent = new Intent(getApplicationContext(), PlayActivity.class);
            startActivity(intent);
        } else if (view.getId() == R.id.rulesButton) {
            String url = "https://en.wikipedia.org/wiki/Order_and_Chaos";
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(url));
            startActivity(intent);
        } else if (view.getId() == R.id.aboutButton) {
            Intent intent = new Intent(getApplicationContext(), AboutActivity.class);
            startActivity(intent);
        } else {
            throw new RuntimeException("Not allocated.");
        }
    }
}
