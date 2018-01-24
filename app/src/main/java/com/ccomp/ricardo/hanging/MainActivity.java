package com.ccomp.ricardo.hanging;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    String word;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        word = "ABRA";

        visibilizaUnders(word.length());

        Button a = (Button) findViewById(R.id.buttonA);
        Button b = (Button) findViewById(R.id.buttonB);
        Button c = (Button) findViewById(R.id.buttonC);
        Button d = (Button) findViewById(R.id.buttonD);
        Button e = (Button) findViewById(R.id.buttonE);
        Button f = (Button) findViewById(R.id.buttonF);
        Button g = (Button) findViewById(R.id.buttonG);
        Button h = (Button) findViewById(R.id.buttonH);
        Button i = (Button) findViewById(R.id.buttonI);
        Button j = (Button) findViewById(R.id.buttonJ);
        Button k = (Button) findViewById(R.id.buttonK);
        Button l = (Button) findViewById(R.id.buttonL);
        Button m = (Button) findViewById(R.id.buttonM);
        Button n = (Button) findViewById(R.id.buttonN);
        Button o = (Button) findViewById(R.id.);
        Button p = (Button) findViewById(R.id.);
        Button q = (Button) findViewById(R.id.);
        Button r = (Button) findViewById(R.id.);
        Button s = (Button) findViewById(R.id.);
        Button t = (Button) findViewById(R.id.);
        Button u = (Button) findViewById(R.id.);
        Button v = (Button) findViewById(R.id.);
        Button w = (Button) findViewById(R.id.);
        Button x = (Button) findViewById(R.id.);
        Button y = (Button) findViewById(R.id.);
        Button z = (Button) findViewById(R.id.);






    }

    public void onClick(View v){

    }

    public void visibilizaUnders(int n){

        final Button und1 = (Button) findViewById(R.id.under1);
        final Button und2 = (Button) findViewById(R.id.under2);
        final Button und3 = (Button) findViewById(R.id.under3);
        final Button und4 = (Button) findViewById(R.id.under4);
        final Button und5 = (Button) findViewById(R.id.under5);
        final Button und6 = (Button) findViewById(R.id.under6);
        final Button und7 = (Button) findViewById(R.id.under7);
        final Button und8 = (Button) findViewById(R.id.under8);
        final Button und9 = (Button) findViewById(R.id.under9);
        final Button und10 = (Button) findViewById(R.id.under10);
        final Button und11 = (Button) findViewById(R.id.under11);
        final Button und12 = (Button) findViewById(R.id.under12);
        final Button und13 = (Button) findViewById(R.id.under13);
        final Button und14 = (Button) findViewById(R.id.under14);
        final Button und15 = (Button) findViewById(R.id.under15);
        final Button und16 = (Button) findViewById(R.id.under16);
        final Button und17 = (Button) findViewById(R.id.under17);
        final Button und18 = (Button) findViewById(R.id.under18);
        final Button und19 = (Button) findViewById(R.id.under19);
        final Button und20 = (Button) findViewById(R.id.under20);
        final Button und21 = (Button) findViewById(R.id.under21);
        final Button und22 = (Button) findViewById(R.id.under22);
        final Button und23 = (Button) findViewById(R.id.under23);
        final Button und24 = (Button) findViewById(R.id.under24);
        final Button und25 = (Button) findViewById(R.id.under25);
        final Button und26 = (Button) findViewById(R.id.under26);
        final Button und27 = (Button) findViewById(R.id.under27);
        final Button und28 = (Button) findViewById(R.id.under28);
        final Button und29 = (Button) findViewById(R.id.under29);
        final Button und30 = (Button) findViewById(R.id.under30);


        switch(n){

            case 30: und30.setVisibility(View.VISIBLE);
            case 29: und29.setVisibility(View.VISIBLE);
            case 28: und28.setVisibility(View.VISIBLE);
            case 27: und27.setVisibility(View.VISIBLE);
            case 26: und26.setVisibility(View.VISIBLE);
            case 25: und25.setVisibility(View.VISIBLE);
            case 24: und24.setVisibility(View.VISIBLE);
            case 23: und23.setVisibility(View.VISIBLE);
            case 22: und22.setVisibility(View.VISIBLE);
            case 21: und21.setVisibility(View.VISIBLE);
            case 20: und20.setVisibility(View.VISIBLE);
            case 19: und19.setVisibility(View.VISIBLE);
            case 18: und18.setVisibility(View.VISIBLE);
            case 17: und17.setVisibility(View.VISIBLE);
            case 16: und16.setVisibility(View.VISIBLE);
            case 15: und15.setVisibility(View.VISIBLE);
            case 14: und14.setVisibility(View.VISIBLE);
            case 13: und13.setVisibility(View.VISIBLE);
            case 12: und12.setVisibility(View.VISIBLE);
            case 11: und11.setVisibility(View.VISIBLE);
            case 10: und10.setVisibility(View.VISIBLE);
            case 9: und9.setVisibility(View.VISIBLE);
            case 8: und8.setVisibility(View.VISIBLE);
            case 7: und7.setVisibility(View.VISIBLE);
            case 6: und6.setVisibility(View.VISIBLE);
            case 5: und5.setVisibility(View.VISIBLE);
            case 4: und4.setVisibility(View.VISIBLE);
            case 3: und3.setVisibility(View.VISIBLE);
            case 2: und2.setVisibility(View.VISIBLE);
            case 1: und1.setVisibility(View.VISIBLE);

        }
    }
}
