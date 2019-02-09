package com.example.tablelayoutdyn;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    LinearLayout myLinearLayout;
    TableLayout myTableLayout;
    TableRow myTableRow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        myLinearLayout = findViewById(R.id.Layout);
        myTableLayout = new TableLayout(this);
        myTableLayout.setLayoutParams(new TableLayout.LayoutParams(TableLayout.LayoutParams.MATCH_PARENT, TableLayout.LayoutParams.WRAP_CONTENT));
        myTableLayout.setStretchAllColumns(true);


        for (int i = 0; i < 50; i++) {

            myTableRow = new TableRow(this);
            myTableRow.setLayoutParams(new TableRow.LayoutParams(0, TableLayout.LayoutParams.WRAP_CONTENT));
            myTableRow.setBackgroundColor(Color.BLACK);

            TextView t1 = new TextView(this);
            t1.setText("Table");
            t1.setTextSize(20);
            t1.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
            t1.setLayoutParams(new TableRow.LayoutParams(TableLayout.LayoutParams.MATCH_PARENT, TableLayout.LayoutParams.WRAP_CONTENT));
            t1.setBackgroundColor(Color.WHITE);
            myTableRow.addView(t1);


            t1 = new TextView(this);
            t1.setText("Layout");
            t1.setTextSize(20);
            t1.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
            t1.setLayoutParams(new TableRow.LayoutParams(TableLayout.LayoutParams.MATCH_PARENT, TableLayout.LayoutParams.WRAP_CONTENT));
            t1.setBackgroundColor(Color.WHITE);
            myTableRow.addView(t1);


            t1 = new TextView(this);
            t1.setText("Dynamic");
            t1.setTextSize(20);
            t1.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
            t1.setLayoutParams(new TableRow.LayoutParams(TableLayout.LayoutParams.MATCH_PARENT, TableLayout.LayoutParams.WRAP_CONTENT));
            t1.setBackgroundColor(Color.WHITE);
            myTableRow.addView(t1);


            t1 = new TextView(this);
            t1.setText("Test");
            t1.setTextSize(20);
            t1.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
            t1.setLayoutParams(new TableRow.LayoutParams(TableLayout.LayoutParams.MATCH_PARENT, TableLayout.LayoutParams.WRAP_CONTENT));
            t1.setBackgroundColor(Color.WHITE);
            myTableRow.addView(t1);


/*
            final int value = i + 1;
            Button bt = new Button(this);
            bt.setText("Button " + value);
            bt.setTextSize(20);
            bt.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
            bt.setLayoutParams(new TableRow.LayoutParams(TableLayout.LayoutParams.MATCH_PARENT, TableLayout.LayoutParams.WRAP_CONTENT));
            myTableRow.addView(bt);

            bt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(MainActivity.this, "Hello " + value, Toast.LENGTH_SHORT).show();
                }
            });*/


            myTableRow.setPadding(1, 1, 1, 1);
            myTableLayout.addView(myTableRow);
        }

        myLinearLayout.addView(myTableLayout);



    }
}
