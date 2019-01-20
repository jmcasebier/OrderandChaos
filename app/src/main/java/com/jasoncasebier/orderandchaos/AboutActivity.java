package com.jasoncasebier.orderandchaos;

//Jason Casebier

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class AboutActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        TextView textView = findViewById(R.id.textView);
        TextView textView2 = findViewById(R.id.textView2);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            textView.setText(Html.fromHtml("This app was developed by Jason Casebier and " +
                    "is based on the game <b>Order and Chaos</b> invented by Stephen " +
                    "Sniderman.", Html.FROM_HTML_MODE_COMPACT));
            textView2.setText("");
            textView.setTextColor(0xe7e1e1ff);
        } else {
            textView.setText(Html.fromHtml("This app was developed by Jason Casebier and " +
                    "is based on the game <b>Order and Chaos</b> invented by Stephen " +
                    "Sniderman."));
            textView2.setText("");
            textView.setTextColor(0xe7e1e1ff);
        }
    }
}
