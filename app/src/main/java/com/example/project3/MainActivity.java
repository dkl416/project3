package com.example.project3;

import android.content.Intent;
import android.app.Activity;
import android.view.View.OnClickListener;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    //public int currentPage = 1;
    //Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        Button button2 = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {

                                          Intent intent = new Intent(MainActivity.this, page2.class);
                                          startActivity(intent);
                                          finish();
                                      }
                                  }
        );
        button2.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {

                                           Intent intent = new Intent(MainActivity.this, page5.class);
                                           startActivity(intent);
                                           finish();
                                       }
                                   }
        );

    }


/*    public void goPage(int page) {

        switch (page) {
            case 1:
                intent = new Intent(this, MainActivity.class);
                break;
            case 2:
                intent = new Intent(this, page_2.class);
                break;
            case 3:
                intent = new Intent(this, page_3.class);
                break;
            case 4:
                intent = new Intent(this, page_4.class);
                break;
            case 5:
                intent = new Intent(this, page_5.class);
                break;
        }
        startActivity(intent);
    }

    public void nextPage() {
        currentPage++;
        goPage(currentPage);
    }

    public void previousPage() {
        currentPage--;
        goPage(currentPage);
    }

    public void endPage() {
        currentPage = 5;
        goPage(currentPage);
    }

    public void mainPage() {
        currentPage = 1;
        goPage(currentPage);
    }
    */
}
