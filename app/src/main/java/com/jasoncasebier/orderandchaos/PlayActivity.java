package com.jasoncasebier.orderandchaos;

//Jason Casebier

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class PlayActivity extends Activity implements View.OnClickListener {

    int turnCounter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        ImageView imageView = findViewById(R.id.imageView00);
        imageView.setOnClickListener(this);
        imageView = findViewById(R.id.imageView01);
        imageView.setOnClickListener(this);
        imageView = findViewById(R.id.imageView02);
        imageView.setOnClickListener(this);
        imageView = findViewById(R.id.imageView03);
        imageView.setOnClickListener(this);
        imageView = findViewById(R.id.imageView04);
        imageView.setOnClickListener(this);
        imageView = findViewById(R.id.imageView05);
        imageView.setOnClickListener(this);
        imageView = findViewById(R.id.imageView10);
        imageView.setOnClickListener(this);
        imageView = findViewById(R.id.imageView11);
        imageView.setOnClickListener(this);
        imageView = findViewById(R.id.imageView12);
        imageView.setOnClickListener(this);
        imageView = findViewById(R.id.imageView13);
        imageView.setOnClickListener(this);
        imageView = findViewById(R.id.imageView14);
        imageView.setOnClickListener(this);
        imageView = findViewById(R.id.imageView15);
        imageView.setOnClickListener(this);
        imageView = findViewById(R.id.imageView20);
        imageView.setOnClickListener(this);
        imageView = findViewById(R.id.imageView21);
        imageView.setOnClickListener(this);
        imageView = findViewById(R.id.imageView22);
        imageView.setOnClickListener(this);
        imageView = findViewById(R.id.imageView23);
        imageView.setOnClickListener(this);
        imageView = findViewById(R.id.imageView24);
        imageView.setOnClickListener(this);
        imageView = findViewById(R.id.imageView25);
        imageView.setOnClickListener(this);
        imageView = findViewById(R.id.imageView30);
        imageView.setOnClickListener(this);
        imageView = findViewById(R.id.imageView31);
        imageView.setOnClickListener(this);
        imageView = findViewById(R.id.imageView32);
        imageView.setOnClickListener(this);
        imageView = findViewById(R.id.imageView33);
        imageView.setOnClickListener(this);
        imageView = findViewById(R.id.imageView34);
        imageView.setOnClickListener(this);
        imageView = findViewById(R.id.imageView35);
        imageView.setOnClickListener(this);
        imageView = findViewById(R.id.imageView40);
        imageView.setOnClickListener(this);
        imageView = findViewById(R.id.imageView41);
        imageView.setOnClickListener(this);
        imageView = findViewById(R.id.imageView42);
        imageView.setOnClickListener(this);
        imageView = findViewById(R.id.imageView43);
        imageView.setOnClickListener(this);
        imageView = findViewById(R.id.imageView44);
        imageView.setOnClickListener(this);
        imageView = findViewById(R.id.imageView45);
        imageView.setOnClickListener(this);
        imageView = findViewById(R.id.imageView50);
        imageView.setOnClickListener(this);
        imageView = findViewById(R.id.imageView51);
        imageView.setOnClickListener(this);
        imageView = findViewById(R.id.imageView52);
        imageView.setOnClickListener(this);
        imageView = findViewById(R.id.imageView53);
        imageView.setOnClickListener(this);
        imageView = findViewById(R.id.imageView54);
        imageView.setOnClickListener(this);
        imageView = findViewById(R.id.imageView55);
        imageView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        createChoiceDialog(id);
    }

    private void createChoiceDialog(final int id) {
        LayoutInflater inflater = getLayoutInflater();
        View alertLayout = inflater.inflate(R.layout.choice_layout, null);
        AlertDialog.Builder choiceAlert = new AlertDialog.Builder(this);
        choiceAlert.setView(alertLayout);
        choiceAlert.setCancelable(true);
        final AlertDialog choiceDialog = choiceAlert.create();
        choiceDialog.show();
        ImageView xImageView = alertLayout.findViewById(R.id.xImageView);
        xImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                choiceDialog.dismiss();
                ImageView imageView = findViewById(id);
                imageView.setImageResource(R.drawable.x);
                imageView.setEnabled(false);
                imageView.setTag("x");
                turnCounter++;
                checkForWinner();
                TextView turnTextView = findViewById(R.id.turnTextView);
                if (turnTextView.getText().toString() ==
                        getResources().getString(R.string.order_turn)) {
                    turnTextView.setText(R.string.chaos_turn);
                } else if (turnTextView.getText().toString() ==
                        getResources().getString(R.string.chaos_turn)) {
                    turnTextView.setText(R.string.order_turn);
                }
            }
        });
        ImageView oImageView = alertLayout.findViewById(R.id.oImageView);
        oImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                choiceDialog.dismiss();
                ImageView imageView = findViewById(id);
                imageView.setImageResource(R.drawable.o);
                imageView.setEnabled(false);
                imageView.setTag("o");
                turnCounter++;
                checkForWinner();
                TextView turnTextView = findViewById(R.id.turnTextView);
                if (turnTextView.getText().toString() ==
                        getResources().getString(R.string.order_turn)) {
                    turnTextView.setText(R.string.chaos_turn);
                } else if (turnTextView.getText().toString() ==
                        getResources().getString(R.string.chaos_turn)) {
                    turnTextView.setText(R.string.order_turn);
                }
            }
        });
    }

    private void checkForWinner() {
        ImageView imageView00 = findViewById(R.id.imageView00);
        ImageView imageView01 = findViewById(R.id.imageView01);
        ImageView imageView02 = findViewById(R.id.imageView02);
        ImageView imageView03 = findViewById(R.id.imageView03);
        ImageView imageView04 = findViewById(R.id.imageView04);
        ImageView imageView05 = findViewById(R.id.imageView05);
        ImageView imageView10 = findViewById(R.id.imageView10);
        ImageView imageView11 = findViewById(R.id.imageView11);
        ImageView imageView12 = findViewById(R.id.imageView12);
        ImageView imageView13 = findViewById(R.id.imageView13);
        ImageView imageView14 = findViewById(R.id.imageView14);
        ImageView imageView15 = findViewById(R.id.imageView15);
        ImageView imageView20 = findViewById(R.id.imageView20);
        ImageView imageView21 = findViewById(R.id.imageView21);
        ImageView imageView22 = findViewById(R.id.imageView22);
        ImageView imageView23 = findViewById(R.id.imageView23);
        ImageView imageView24 = findViewById(R.id.imageView24);
        ImageView imageView25 = findViewById(R.id.imageView25);
        ImageView imageView30 = findViewById(R.id.imageView30);
        ImageView imageView31 = findViewById(R.id.imageView31);
        ImageView imageView32 = findViewById(R.id.imageView32);
        ImageView imageView33 = findViewById(R.id.imageView33);
        ImageView imageView34 = findViewById(R.id.imageView34);
        ImageView imageView35 = findViewById(R.id.imageView35);
        ImageView imageView40 = findViewById(R.id.imageView40);
        ImageView imageView41 = findViewById(R.id.imageView41);
        ImageView imageView42 = findViewById(R.id.imageView42);
        ImageView imageView43 = findViewById(R.id.imageView43);
        ImageView imageView44 = findViewById(R.id.imageView44);
        ImageView imageView45 = findViewById(R.id.imageView45);
        ImageView imageView50 = findViewById(R.id.imageView50);
        ImageView imageView51 = findViewById(R.id.imageView51);
        ImageView imageView52 = findViewById(R.id.imageView52);
        ImageView imageView53 = findViewById(R.id.imageView53);
        ImageView imageView54 = findViewById(R.id.imageView54);
        ImageView imageView55 = findViewById(R.id.imageView55);

        String[][] winners = {{imageView00.getTag().toString(), imageView01.getTag().toString(),
                imageView02.getTag().toString(), imageView03.getTag().toString(),
                imageView04.getTag().toString()}, {imageView01.getTag().toString(),
                imageView02.getTag().toString(), imageView03.getTag().toString(),
                imageView04.getTag().toString(), imageView05.getTag().toString()},
                {imageView10.getTag().toString(), imageView11.getTag().toString(),
                imageView12.getTag().toString(), imageView13.getTag().toString(),
                imageView14.getTag().toString()}, {imageView11.getTag().toString(),
                imageView12.getTag().toString(), imageView13.getTag().toString(),
                imageView14.getTag().toString(), imageView15.getTag().toString()},
                {imageView20.getTag().toString(), imageView21.getTag().toString(),
                imageView22.getTag().toString(), imageView23.getTag().toString(),
                imageView24.getTag().toString()}, {imageView21.getTag().toString(),
                imageView22.getTag().toString(), imageView23.getTag().toString(),
                imageView24.getTag().toString(), imageView25.getTag().toString()},
                {imageView30.getTag().toString(), imageView31.getTag().toString(),
                imageView32.getTag().toString(), imageView33.getTag().toString(),
                imageView34.getTag().toString()}, {imageView31.getTag().toString(),
                imageView32.getTag().toString(), imageView33.getTag().toString(),
                imageView34.getTag().toString(), imageView35.getTag().toString()},
                {imageView40.getTag().toString(), imageView41.getTag().toString(),
                imageView42.getTag().toString(), imageView43.getTag().toString(),
                imageView44.getTag().toString()}, {imageView41.getTag().toString(),
                imageView42.getTag().toString(), imageView43.getTag().toString(),
                imageView44.getTag().toString(), imageView45.getTag().toString()},
                {imageView50.getTag().toString(), imageView51.getTag().toString(),
                imageView52.getTag().toString(), imageView53.getTag().toString(),
                imageView54.getTag().toString()}, {imageView51.getTag().toString(),
                imageView52.getTag().toString(), imageView53.getTag().toString(),
                imageView54.getTag().toString(), imageView55.getTag().toString()},
                {imageView05.getTag().toString(), imageView14.getTag().toString(),
                imageView23.getTag().toString(), imageView32.getTag().toString(),
                imageView41.getTag().toString()}, {imageView14.getTag().toString(),
                imageView23.getTag().toString(), imageView32.getTag().toString(),
                imageView41.getTag().toString(), imageView50.getTag().toString()},
                {imageView00.getTag().toString(), imageView11.getTag().toString(),
                imageView22.getTag().toString(), imageView33.getTag().toString(),
                imageView44.getTag().toString()}, {imageView11.getTag().toString(),
                imageView22.getTag().toString(), imageView33.getTag().toString(),
                imageView44.getTag().toString(), imageView55.getTag().toString()},
                {imageView00.getTag().toString(), imageView10.getTag().toString(),
                imageView20.getTag().toString(), imageView30.getTag().toString(),
                imageView40.getTag().toString()}, {imageView10.getTag().toString(),
                imageView20.getTag().toString(), imageView30.getTag().toString(),
                imageView40.getTag().toString(), imageView50.getTag().toString()},
                {imageView01.getTag().toString(), imageView11.getTag().toString(),
                imageView21.getTag().toString(), imageView31.getTag().toString(),
                imageView41.getTag().toString()}, {imageView11.getTag().toString(),
                imageView21.getTag().toString(), imageView31.getTag().toString(),
                imageView41.getTag().toString(), imageView51.getTag().toString()},
                {imageView02.getTag().toString(), imageView12.getTag().toString(),
                imageView22.getTag().toString(), imageView32.getTag().toString(),
                imageView42.getTag().toString()}, {imageView12.getTag().toString(),
                imageView22.getTag().toString(), imageView32.getTag().toString(),
                imageView42.getTag().toString(), imageView52.getTag().toString()},
                {imageView03.getTag().toString(), imageView13.getTag().toString(),
                imageView23.getTag().toString(), imageView33.getTag().toString(),
                imageView43.getTag().toString()}, {imageView13.getTag().toString(),
                imageView23.getTag().toString(), imageView33.getTag().toString(),
                imageView43.getTag().toString(), imageView53.getTag().toString()},
                {imageView04.getTag().toString(), imageView14.getTag().toString(),
                imageView24.getTag().toString(), imageView34.getTag().toString(),
                imageView44.getTag().toString()}, {imageView14.getTag().toString(),
                imageView24.getTag().toString(), imageView34.getTag().toString(),
                imageView44.getTag().toString(), imageView54.getTag().toString()},
                {imageView05.getTag().toString(), imageView15.getTag().toString(),
                imageView25.getTag().toString(), imageView35.getTag().toString(),
                imageView45.getTag().toString()}, {imageView15.getTag().toString(),
                imageView25.getTag().toString(), imageView35.getTag().toString(),
                imageView45.getTag().toString(), imageView55.getTag().toString()},
                {imageView04.getTag().toString(), imageView13.getTag().toString(),
                imageView22.getTag().toString(), imageView31.getTag().toString(),
                imageView40.getTag().toString()}, {imageView15.getTag().toString(),
                imageView24.getTag().toString(), imageView33.getTag().toString(),
                imageView42.getTag().toString(), imageView51.getTag().toString()},
                {imageView01.getTag().toString(), imageView12.getTag().toString(),
                imageView23.getTag().toString(), imageView34.getTag().toString(),
                imageView45.getTag().toString()}, {imageView10.getTag().toString(),
                imageView21.getTag().toString(), imageView32.getTag().toString(),
                imageView43.getTag().toString(), imageView54.getTag().toString()}};

        int counter = 0;

        for (int i = 0; i < winners.length; i++) {
            int xcounter = 0;
            int ocounter = 0;
            for (int a = 0; a < winners[i].length; a++) {
                if (winners[i][a].equals("x")) {
                    xcounter++;
                    counter++;
                }
                if (winners[i][a].equals("o")) {
                    ocounter++;
                    counter++;
                }
                if (xcounter >= 5 || ocounter >= 5) {
                    LayoutInflater inflater = getLayoutInflater();
                    View alertLayout = inflater.inflate(R.layout.winner_layout, null);
                    AlertDialog.Builder winnerAlert = new AlertDialog.Builder(this);
                    winnerAlert.setView(alertLayout);
                    AlertDialog winnerDialog = winnerAlert.create();
                    winnerDialog.setCanceledOnTouchOutside(false);
                    winnerDialog.setCancelable(false);
                    winnerDialog.show();
                    TextView okTextView = alertLayout.findViewById(R.id.okTextView);
                    okTextView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            finish();
                        }
                    });
                }
                if (counter == 160) {
                    LayoutInflater inflater = getLayoutInflater();
                    View alertLayout = inflater.inflate(R.layout.winner2_layout, null);
                    AlertDialog.Builder winnerAlert = new AlertDialog.Builder(this);
                    winnerAlert.setView(alertLayout);
                    AlertDialog winnerDialog = winnerAlert.create();
                    winnerDialog.setCanceledOnTouchOutside(false);
                    winnerDialog.setCancelable(false);
                    winnerDialog.show();
                    TextView okTextView = alertLayout.findViewById(R.id.okTextView);
                    okTextView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            finish();
                        }
                    });
                }
            }
        }
        return;
    }

    @Override
    public void onBackPressed() {
        if (turnCounter >= 1) {
            LayoutInflater inflater = getLayoutInflater();
            View alertLayout = inflater.inflate(R.layout.quit_layout, null);
            AlertDialog.Builder quitAlert = new AlertDialog.Builder(this);
            quitAlert.setView(alertLayout);
            quitAlert.setCancelable(true);
            final AlertDialog quitDialog = quitAlert.create();
            quitDialog.show();
            TextView quitTextView = alertLayout.findViewById(R.id.quitTextView);
            quitTextView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    PlayActivity.super.onBackPressed();
                }
            });
            TextView cancelTextView = alertLayout.findViewById(R.id.cancelTextView);
            cancelTextView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    quitDialog.dismiss();
                }
            });
        } else {
            super.onBackPressed();
        }
    }
}
