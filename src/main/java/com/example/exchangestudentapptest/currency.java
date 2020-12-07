package com.example.exchangestudentapptest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;

public class currency extends AppCompatActivity {
    private ImageButton back;
    private Spinner spfrom;
    private Spinner spto;
    private EditText input, output;
    private Button convertBut;
    //USDtoALL
    private Double USDtoEUR = 0.83;
    private Double USDtoGBP = 0.75;
    private Double USDtoCAD = 1.28;
    private Double USDtoINR = 73.88;
    //EURtoALL
    private Double EURtoUSD = 1.21;
    private Double EURtoGBP = 0.91;
    private Double EURtoCAD = 1.55;
    private Double EURtoINR = 89.46;
    //GBPtoALL
    private Double GBPtoEUR = 1.10;
    private Double GBPtoUSD = 1.33;
    private Double GBPtoCAD = 1.70;
    private Double GBPtoINR = 90.03;
    //CADtoALL
    private Double CADtoEUR = 0.64;
    private Double CADtoGBP = 0.59;
    private Double CADtoUSD = 0.78;
    private Double CADtoINR = 57.66;
    //INRtoALL
    private Double INRtoEUR = 0.0112;
    private Double INRtoGBP = 0.0102;
    private Double INRtoCAD = 0.0173;
    private Double INRtoUSD = 0.0135;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = findViewById(R.id.txtammountCurr);
        spfrom = findViewById(R.id.spfromCurr);
        spto = findViewById(R.id.sptoCurr);
        convertBut = findViewById(R.id.buttonConvertCurr);

        String[] from = {"USD", "EUR", "GBP", "CAD", "INR"};
        ArrayAdapter ad = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, from);
        spfrom.setAdapter(ad);

        String[] to = {"USD", "EUR", "GBP", "CAD", "INR"};
        ArrayAdapter ad2 = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, to);
        spto.setAdapter(ad2);

        convertBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Double total;
                Double amount = Double.parseDouble(input.getText().toString());
                //USD to ALL
                if (spfrom.getSelectedItem().toString() == "USD" && spto.getSelectedItem().toString() == "USD") {
                    total = amount;
                    Toast.makeText(getApplicationContext(), total.toString(), Toast.LENGTH_LONG).show();
                } else if (spfrom.getSelectedItem().toString() == "USD" && spto.getSelectedItem().toString() == "EUR") {
                    total = amount * USDtoEUR;
                    Toast.makeText(getApplicationContext(), total.toString(), Toast.LENGTH_LONG).show();
                } else if (spfrom.getSelectedItem().toString() == "USD" && spto.getSelectedItem().toString() == "GBP") {
                    total = amount * USDtoGBP;
                    Toast.makeText(getApplicationContext(), total.toString(), Toast.LENGTH_LONG).show();
                } else if (spfrom.getSelectedItem().toString() == "USD" && spto.getSelectedItem().toString() == "CAD") {
                    total = amount * USDtoCAD;
                    Toast.makeText(getApplicationContext(), total.toString(), Toast.LENGTH_LONG).show();
                } else if (spfrom.getSelectedItem().toString() == "USD" && spto.getSelectedItem().toString() == "INR") {
                    total = amount * USDtoINR;
                    Toast.makeText(getApplicationContext(), total.toString(), Toast.LENGTH_LONG).show();
                }
                //EURtoALL
                else if (spfrom.getSelectedItem().toString() == "EUR" && spto.getSelectedItem().toString() == "USD") {
                    total = amount * EURtoUSD;
                    Toast.makeText(getApplicationContext(), total.toString(), Toast.LENGTH_LONG).show();
                } else if (spfrom.getSelectedItem().toString() == "EUR" && spto.getSelectedItem().toString() == "EUR") {
                    total = amount;
                    Toast.makeText(getApplicationContext(), total.toString(), Toast.LENGTH_LONG).show();
                } else if (spfrom.getSelectedItem().toString() == "EUR" && spto.getSelectedItem().toString() == "GBP") {
                    total = amount * EURtoGBP;
                    Toast.makeText(getApplicationContext(), total.toString(), Toast.LENGTH_LONG).show();
                } else if (spfrom.getSelectedItem().toString() == "EUR" && spto.getSelectedItem().toString() == "CAD") {
                    total = amount * EURtoCAD;
                    Toast.makeText(getApplicationContext(), total.toString(), Toast.LENGTH_LONG).show();
                } else if (spfrom.getSelectedItem().toString() == "EUR" && spto.getSelectedItem().toString() == "INR") {
                    total = amount * EURtoINR;
                    Toast.makeText(getApplicationContext(), total.toString(), Toast.LENGTH_LONG).show();
                }
                //GBPtoALL
                else if (spfrom.getSelectedItem().toString() == "GBP" && spto.getSelectedItem().toString() == "USD") {
                    total = amount * GBPtoUSD;
                    Toast.makeText(getApplicationContext(), total.toString(), Toast.LENGTH_LONG).show();
                } else if (spfrom.getSelectedItem().toString() == "GBP" && spto.getSelectedItem().toString() == "EUR") {
                    total = amount * GBPtoEUR;
                    Toast.makeText(getApplicationContext(), total.toString(), Toast.LENGTH_LONG).show();
                } else if (spfrom.getSelectedItem().toString() == "GBP" && spto.getSelectedItem().toString() == "GBP") {
                    total = amount;
                    Toast.makeText(getApplicationContext(), total.toString(), Toast.LENGTH_LONG).show();
                } else if (spfrom.getSelectedItem().toString() == "GBP" && spto.getSelectedItem().toString() == "CAD") {
                    total = amount * GBPtoCAD;
                    Toast.makeText(getApplicationContext(), total.toString(), Toast.LENGTH_LONG).show();
                } else if (spfrom.getSelectedItem().toString() == "GBP" && spto.getSelectedItem().toString() == "INR") {
                    total = amount * GBPtoINR;
                    Toast.makeText(getApplicationContext(), total.toString(), Toast.LENGTH_LONG).show();
                }
                //CADtoALL
                else if (spfrom.getSelectedItem().toString() == "CAD" && spto.getSelectedItem().toString() == "USD") {
                    total = amount * CADtoUSD;
                    Toast.makeText(getApplicationContext(), total.toString(), Toast.LENGTH_LONG).show();
                } else if (spfrom.getSelectedItem().toString() == "CAD" && spto.getSelectedItem().toString() == "EUR") {
                    total = amount * CADtoEUR;
                    Toast.makeText(getApplicationContext(), total.toString(), Toast.LENGTH_LONG).show();
                } else if (spfrom.getSelectedItem().toString() == "CAD" && spto.getSelectedItem().toString() == "GBP") {
                    total = amount * CADtoGBP;
                    Toast.makeText(getApplicationContext(), total.toString(), Toast.LENGTH_LONG).show();
                } else if (spfrom.getSelectedItem().toString() == "CAD" && spto.getSelectedItem().toString() == "CAD") {
                    total = amount;
                    Toast.makeText(getApplicationContext(), total.toString(), Toast.LENGTH_LONG).show();
                } else if (spfrom.getSelectedItem().toString() == "CAD" && spto.getSelectedItem().toString() == "INR") {
                    total = amount * CADtoINR;
                    Toast.makeText(getApplicationContext(), total.toString(), Toast.LENGTH_LONG).show();
                }
                //INRtoALL
                else if (spfrom.getSelectedItem().toString() == "INR" && spto.getSelectedItem().toString() == "USD") {
                    total = amount * INRtoUSD;
                    Toast.makeText(getApplicationContext(), total.toString(), Toast.LENGTH_LONG).show();
                } else if (spfrom.getSelectedItem().toString() == "INR" && spto.getSelectedItem().toString() == "EUR") {
                    total = amount * INRtoEUR;
                    Toast.makeText(getApplicationContext(), total.toString(), Toast.LENGTH_LONG).show();
                } else if (spfrom.getSelectedItem().toString() == "INR" && spto.getSelectedItem().toString() == "GBP") {
                    total = amount * INRtoGBP;
                    Toast.makeText(getApplicationContext(), total.toString(), Toast.LENGTH_LONG).show();
                } else if (spfrom.getSelectedItem().toString() == "INR" && spto.getSelectedItem().toString() == "CAD") {
                    total = amount * INRtoCAD;
                    Toast.makeText(getApplicationContext(), total.toString(), Toast.LENGTH_LONG).show();
                } else if (spfrom.getSelectedItem().toString() == "INR" && spto.getSelectedItem().toString() == "INR") {
                    total = amount;
                    Toast.makeText(getApplicationContext(), total.toString(), Toast.LENGTH_LONG).show();
                }
            }
        });

        back = findViewById(R.id.backButtonCurrency);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(currency.this, MainActivity.class);
                startActivity(i);
            }
        });

    }
}