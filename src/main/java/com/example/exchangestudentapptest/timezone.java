package com.example.exchangestudentapptest;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.util.Calendar;
import android.os.Build;
import android.os.Bundle;
import android.text.format.Time;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class timezone extends AppCompatActivity {
    private ImageButton back;
    private Spinner spfrom;
    private Spinner spto;
    private EditText input, output;
    private Button convertBut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timezone);

        input = findViewById(R.id.txtammountTime);
        output = findViewById(R.id.outputTime);
        spfrom = findViewById(R.id.spfromTime);
        spto = findViewById(R.id.sptoTime);
        convertBut = findViewById(R.id.buttonConvertTime);

        String[] from = {
                "LINT (UTC +14)",
                "CHADT (UTC +13:45)",
                "NZDT (UTC +13)",
                "ANAT (UTC +12)",
                "AEDT (UTC +11)",
                "ACDT (UTC +10:30)",
                "AEST (UTC +10)",
                "ACST (UTC +9:30)",
                "JST (UTC +9)",
                "ACWST (UTC +8:45)",
                "CST (UTC +8)",
                "WIB (UTC +7)",
                "MMT (UTC +6:30)",
                "BST (UTC +6)",
                "NPT (UTC +5:45)",
                "IST (UTC +5:30)",
                "UZT (UTC +5)",
                "AFT (UTC +4:30)",
                "GST (UTC +4)",
                "IRST (UTC +3:30)",
                "MSK (UTC +3)",
                "EET (UTC +2)",
                "CET (UTC +1)",
                "GMT (UTC +0)",
                "CVT (UTC -1)",
                "GST (UTC -2)",
                "NDT (UTC -2:30)",
                "ART (UTC -3)",
                "EDT (UTC -4)",
                "CDT (UTC -5)",
                "CST (UTC -6)",
                "PDT (UTC -7)",
                "AKDT (UTC -8)",
                "HDT (UTC -9)",
                "MART (UTC -9:30)",
                "HST (UTC -10)",
                "NUT (UTC -11)",
                "AoE (UTC -12)"
        };
        ArrayAdapter ad = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, from);
        spfrom.setAdapter(ad);

        String[] to = {
                "LINT (UTC +14)",
                "CHADT (UTC +13:45)",
                "NZDT (UTC +13)",
                "ANAT (UTC +12)",
                "AEDT (UTC +11)",
                "ACDT (UTC +10:30)",
                "AEST (UTC +10)",
                "ACST (UTC +9:30)",
                "JST (UTC +9)",
                "ACWST (UTC +8:45)",
                "CST (UTC +8)",
                "WIB (UTC +7)",
                "MMT (UTC +6:30)",
                "BST (UTC +6)",
                "NPT (UTC +5:45)",
                "IST (UTC +5:30)",
                "UZT (UTC +5)",
                "AFT (UTC +4:30)",
                "GST (UTC +4)",
                "IRST (UTC +3:30)",
                "MSK (UTC +3)",
                "EET (UTC +2)",
                "CET (UTC +1)",
                "GMT (UTC +0)",
                "CVT (UTC -1)",
                "GST (UTC -2)",
                "NDT (UTC -2:30)",
                "ART (UTC -3)",
                "EDT (UTC -4)",
                "CDT (UTC -5)",
                "CST (UTC -6)",
                "PDT (UTC -7)",
                "AKDT (UTC -8)",
                "HDT (UTC -9)",
                "MART (UTC -9:30)",
                "HST (UTC -10)",
                "NUT (UTC -11)",
                "AoE (UTC -12)"
        };
        ArrayAdapter ad2 = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, to);
        spto.setAdapter(ad2);

        convertBut.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onClick(View v) {
                Date inicial = null, base = null,endhour = null;
                Calendar c1 = Calendar.getInstance();
                Calendar c2 = Calendar.getInstance();


                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");

                try {
                    //INITIAL HOUR TO GMC
                    inicial= sdf.parse(input.toString());
                    c1.setTime(inicial);

                    if(spfrom.getSelectedItem().toString() == "LINT (UTC +14)"){
                        c1.add(Calendar.HOUR, -14);
                        base = c1.getTime();
                    }
                    else if(spfrom.getSelectedItem().toString() == "CHADT (UTC +13:45)"){
                        c1.add(Calendar.MINUTE, -45);
                        c1.add(Calendar.HOUR, -13);
                        base = c1.getTime();
                    }
                    else if(spfrom.getSelectedItem().toString() == "NZDT (UTC +13)"){
                        c1.add(Calendar.HOUR, -13);
                        base = c1.getTime();
                    }
                    else if(spfrom.getSelectedItem().toString() == "ANAT (UTC +12)"){
                        c1.add(Calendar.HOUR, -12);
                        base = c1.getTime();
                    }
                    else if(spfrom.getSelectedItem().toString() == "AEDT (UTC +11)"){
                        c1.add(Calendar.HOUR, -11);
                        base = c1.getTime();
                    }
                    else if(spfrom.getSelectedItem().toString() == "ACDT (UTC +10:30)"){
                        c1.add(Calendar.MINUTE, -30);
                        c1.add(Calendar.HOUR, -10);
                        base = c1.getTime();
                    }
                    else if(spfrom.getSelectedItem().toString() == "AEST (UTC +10)"){
                        c1.add(Calendar.HOUR, -10);
                        base = c1.getTime();
                    }
                    else if(spfrom.getSelectedItem().toString() == "ACST (UTC +9:30)"){
                        c1.add(Calendar.MINUTE, -30);
                        c1.add(Calendar.HOUR, -9);
                        base = c1.getTime();
                    }
                    else if(spfrom.getSelectedItem().toString() == "JST (UTC +9)"){
                        c1.add(Calendar.HOUR, -9);
                        base = c1.getTime();
                    }
                    else if(spfrom.getSelectedItem().toString() == "ACWST (UTC +8:45)"){
                        c1.add(Calendar.MINUTE, -45);
                        c1.add(Calendar.HOUR, -8);
                        base = c1.getTime();
                    }
                    else if(spfrom.getSelectedItem().toString() == "CST (UTC +8)"){
                        c1.add(Calendar.HOUR, -8);
                        base = c1.getTime();
                    }
                    else if(spfrom.getSelectedItem().toString() == "WIB (UTC +7)"){
                        c1.add(Calendar.HOUR, -7);
                        base = c1.getTime();
                    }
                    else if(spfrom.getSelectedItem().toString() == "MMT (UTC +6:30)"){
                        c1.add(Calendar.MINUTE, -30);
                        c1.add(Calendar.HOUR, -6);
                        base = c1.getTime();
                    }
                    else if(spfrom.getSelectedItem().toString() == "BST (UTC +6)"){
                        c1.add(Calendar.HOUR, -6);
                        base = c1.getTime();
                    }
                    else if(spfrom.getSelectedItem().toString() == "NPT (UTC +5:45)"){
                        c1.add(Calendar.MINUTE, -45);
                        c1.add(Calendar.HOUR, -5);
                        base = c1.getTime();
                    }
                    else if(spfrom.getSelectedItem().toString() == "IST (UTC +5:30)"){
                        c1.add(Calendar.MINUTE, -30);
                        c1.add(Calendar.HOUR, -5);
                        base = c1.getTime();
                    }
                    else if(spfrom.getSelectedItem().toString() == "UZT (UTC +5)"){
                        c1.add(Calendar.HOUR, -5);
                        base = c1.getTime();
                    }
                    else if(spfrom.getSelectedItem().toString() == "AFT (UTC +4:30)"){
                        c1.add(Calendar.MINUTE, -30);
                        c1.add(Calendar.HOUR, -4);
                        base = c1.getTime();
                    }
                    else if(spfrom.getSelectedItem().toString() == "GST (UTC +4)"){
                        c1.add(Calendar.HOUR, -4);
                        base = c1.getTime();
                    }
                    else if(spfrom.getSelectedItem().toString() == "IRST (UTC +3:30)"){
                        c1.add(Calendar.MINUTE, -30);
                        c1.add(Calendar.HOUR, -3);
                        base = c1.getTime();
                    }
                    else if(spfrom.getSelectedItem().toString() == "MSK (UTC +3)"){
                        c1.add(Calendar.HOUR, -3);
                        base = c1.getTime();
                    }
                    else if(spfrom.getSelectedItem().toString() == "EET (UTC +2)"){
                        c1.add(Calendar.HOUR, -2);
                        base = c1.getTime();
                    }
                    else if(spfrom.getSelectedItem().toString() == "CET (UTC +1)"){
                        c1.add(Calendar.HOUR, -1);
                        base = c1.getTime();
                    }
                    else if(spfrom.getSelectedItem().toString() == "GMT (UTC +0)"){
                        base = c1.getTime();
                    }
                    else if(spfrom.getSelectedItem().toString() == "CVT (UTC -1)"){
                        c1.add(Calendar.HOUR, +1);
                        base = c1.getTime();
                    }
                    else if(spfrom.getSelectedItem().toString() == "GST (UTC -2)"){
                        c1.add(Calendar.HOUR, +2);
                        base = c1.getTime();
                    }
                    else if(spfrom.getSelectedItem().toString() == "ART (UTC -3)"){
                        c1.add(Calendar.HOUR, +3);
                        base = c1.getTime();
                    }
                    else if(spfrom.getSelectedItem().toString() == "NDT (UTC -2:30)"){
                        c1.add(Calendar.MINUTE, +30);
                        c1.add(Calendar.HOUR, +2);
                        base = c1.getTime();
                    }
                    else if(spfrom.getSelectedItem().toString() == "EDT (UTC -4)"){
                        c1.add(Calendar.HOUR, +4);
                        base = c1.getTime();
                    }
                    else if(spfrom.getSelectedItem().toString() == "CDT (UTC -5)"){
                        c1.add(Calendar.HOUR, +5);
                        base = c1.getTime();
                    }
                    else if(spfrom.getSelectedItem().toString() == "CST (UTC -6)"){
                        c1.add(Calendar.HOUR, +6);
                        base = c1.getTime();
                    }
                    else if(spfrom.getSelectedItem().toString() == "PDT (UTC -7)"){
                        c1.add(Calendar.HOUR, +7);
                        base = c1.getTime();
                    }
                    else if(spfrom.getSelectedItem().toString() == "AKDT (UTC -8)"){
                        c1.add(Calendar.HOUR, +8);
                        base = c1.getTime();
                    }
                    else if(spfrom.getSelectedItem().toString() == "HDT (UTC -9)"){
                        c1.add(Calendar.HOUR, +9);
                        base = c1.getTime();
                    }
                    else if(spfrom.getSelectedItem().toString() == "MART (UTC -9:30)"){
                        c1.add(Calendar.MINUTE, +30);
                        c1.add(Calendar.HOUR, +9);
                        base = c1.getTime();
                    }
                    else if(spfrom.getSelectedItem().toString() == "HST (UTC -10)"){
                        c1.add(Calendar.HOUR, +10);
                        base = c1.getTime();
                    }
                    else if(spfrom.getSelectedItem().toString() == "NUT (UTC -11)"){
                        c1.add(Calendar.HOUR, +11);
                        base = c1.getTime();
                    }
                    else if(spfrom.getSelectedItem().toString() == "AoE (UTC -12)"){
                        c1.add(Calendar.HOUR, +12);
                        base = c1.getTime();
                    }
                    //BASE GMC to ENDHOUR

                    c2.setTime(base);

                    if(spto.getSelectedItem().toString() == "LINT (UTC +14)"){
                        c2.add(Calendar.HOUR, +14);
                        endhour = c2.getTime();
                        output.setText(sdf.format(endhour));
                    }
                    else if(spto.getSelectedItem().toString() == "CHADT (UTC +13:45)"){
                        c2.add(Calendar.MINUTE, +45);
                        c2.add(Calendar.HOUR, +13);
                        endhour = c2.getTime();
                        output.setText(sdf.format(endhour));
                    }
                    else if(spto.getSelectedItem().toString() == "NZDT (UTC +13)"){
                        c2.add(Calendar.HOUR, +13);
                        endhour = c2.getTime();
                        output.setText(sdf.format(endhour));
                    }
                    else if(spto.getSelectedItem().toString() == "ANAT (UTC +12)"){
                        c2.add(Calendar.HOUR, +12);
                        endhour = c2.getTime();
                        output.setText(sdf.format(endhour));
                    }
                    else if(spto.getSelectedItem().toString() == "AEDT (UTC +11)"){
                        c2.add(Calendar.HOUR, +11);
                        endhour = c2.getTime();
                        output.setText(sdf.format(endhour));
                    }
                    else if(spto.getSelectedItem().toString() == "ACDT (UTC +10:30)"){
                        c2.add(Calendar.MINUTE, +30);
                        c2.add(Calendar.HOUR, +10);
                        endhour = c2.getTime();
                        output.setText(sdf.format(endhour));
                    }
                    else if(spto.getSelectedItem().toString() == "AEST (UTC +10)"){
                        c2.add(Calendar.HOUR, +10);
                        endhour = c2.getTime();
                        output.setText(sdf.format(endhour));
                    }
                    else if(spto.getSelectedItem().toString() == "ACST (UTC +9:30)"){
                        c2.add(Calendar.MINUTE, +30);
                        c2.add(Calendar.HOUR, +9);
                        endhour = c2.getTime();
                        output.setText(sdf.format(endhour));
                    }
                    else if(spto.getSelectedItem().toString() == "JST (UTC +9)"){
                        c2.add(Calendar.HOUR, +9);
                        endhour = c2.getTime();
                        output.setText(sdf.format(endhour));
                    }
                    else if(spto.getSelectedItem().toString() == "ACWST (UTC +8:45)"){
                        c2.add(Calendar.MINUTE, +45);
                        c2.add(Calendar.HOUR, +8);
                        endhour = c2.getTime();
                        output.setText(sdf.format(endhour));
                    }
                    else if(spto.getSelectedItem().toString() == "CST (UTC +8)"){
                        c2.add(Calendar.HOUR, +8);
                        endhour = c2.getTime();
                        output.setText(sdf.format(endhour));
                    }
                    else if(spto.getSelectedItem().toString() == "WIB (UTC +7)"){
                        c2.add(Calendar.HOUR, +7);
                        endhour = c2.getTime();
                        output.setText(sdf.format(endhour));
                    }
                    else if(spto.getSelectedItem().toString() == "MMT (UTC +6:30)"){
                        c2.add(Calendar.MINUTE, +30);
                        c2.add(Calendar.HOUR, +6);
                        endhour = c2.getTime();
                        output.setText(sdf.format(endhour));
                    }
                    else if(spto.getSelectedItem().toString() == "BST (UTC +6)"){
                        c2.add(Calendar.HOUR, +6);
                        endhour = c2.getTime();
                        output.setText(sdf.format(endhour));
                    }
                    else if(spto.getSelectedItem().toString() == "NPT (UTC +5:45)"){
                        c2.add(Calendar.MINUTE, +45);
                        c2.add(Calendar.HOUR, +5);
                        endhour = c2.getTime();
                        output.setText(sdf.format(endhour));
                    }
                    else if(spto.getSelectedItem().toString() == "IST (UTC +5:30)"){
                        c2.add(Calendar.MINUTE, +30);
                        c2.add(Calendar.HOUR, +5);
                        endhour = c2.getTime();
                        output.setText(sdf.format(endhour));
                    }
                    else if(spto.getSelectedItem().toString() == "UZT (UTC +5)"){
                        c2.add(Calendar.HOUR, +5);
                        endhour = c2.getTime();
                        output.setText(sdf.format(endhour));
                    }
                    else if(spto.getSelectedItem().toString() == "AFT (UTC +4:30)"){
                        c2.add(Calendar.MINUTE, +30);
                        c2.add(Calendar.HOUR, +4);
                        endhour = c2.getTime();
                        output.setText(sdf.format(endhour));
                    }
                    else if(spto.getSelectedItem().toString() == "GST (UTC +4)"){
                        c2.add(Calendar.HOUR, +4);
                        endhour = c2.getTime();
                        output.setText(sdf.format(endhour));
                    }
                    else if(spto.getSelectedItem().toString() == "IRST (UTC +3:30)"){
                        c2.add(Calendar.MINUTE, +30);
                        c2.add(Calendar.HOUR, +3);
                        endhour = c2.getTime();
                        output.setText(sdf.format(endhour));
                    }
                    else if(spto.getSelectedItem().toString() == "MSK (UTC +3)"){
                        c2.add(Calendar.HOUR, +3);
                        endhour = c2.getTime();
                        output.setText(sdf.format(endhour));
                    }
                    else if(spto.getSelectedItem().toString() == "EET (UTC +2)"){
                        c2.add(Calendar.HOUR, +2);
                        endhour = c2.getTime();
                        output.setText(sdf.format(endhour));
                    }
                    else if(spto.getSelectedItem().toString() == "CET (UTC +1)"){
                        c2.add(Calendar.HOUR, +1);
                        endhour = c2.getTime();
                        output.setText(sdf.format(endhour));
                    }
                    else if(spto.getSelectedItem().toString() == "GMT (UTC +0)"){
                        endhour = c2.getTime();
                        output.setText(sdf.format(endhour));
                    }
                    else if(spto.getSelectedItem().toString() == "CVT (UTC -1)"){
                        c2.add(Calendar.HOUR, -1);
                        endhour = c2.getTime();
                        output.setText(sdf.format(endhour));
                    }
                    else if(spto.getSelectedItem().toString() == "GST (UTC -2)"){
                        c2.add(Calendar.HOUR, -2);
                        endhour = c2.getTime();
                        output.setText(sdf.format(endhour));
                    }
                    else if(spto.getSelectedItem().toString() == "ART (UTC -3)"){
                        c2.add(Calendar.HOUR, -3);
                        endhour = c2.getTime();
                        output.setText(sdf.format(endhour));
                    }
                    else if(spto.getSelectedItem().toString() == "NDT (UTC -2:30)"){
                        c2.add(Calendar.MINUTE, -30);
                        c2.add(Calendar.HOUR, -2);
                        endhour = c2.getTime();
                        output.setText(sdf.format(endhour));
                    }
                    else if(spto.getSelectedItem().toString() == "EDT (UTC -4)"){
                        c2.add(Calendar.HOUR, -4);
                        endhour = c2.getTime();
                        output.setText(sdf.format(endhour));
                    }
                    else if(spto.getSelectedItem().toString() == "CDT (UTC -5)"){
                        c2.add(Calendar.HOUR, -5);
                        endhour = c2.getTime();
                        output.setText(sdf.format(endhour));
                    }
                    else if(spto.getSelectedItem().toString() == "CST (UTC -6)"){
                        c2.add(Calendar.HOUR, -6);
                        endhour = c2.getTime();
                        output.setText(sdf.format(endhour));
                    }
                    else if(spto.getSelectedItem().toString() == "PDT (UTC -7)"){
                        c2.add(Calendar.HOUR, -7);
                        endhour = c2.getTime();
                        output.setText(sdf.format(endhour));
                    }
                    else if(spto.getSelectedItem().toString() == "AKDT (UTC -8)"){
                        c2.add(Calendar.HOUR, -8);
                        endhour = c2.getTime();
                        output.setText(sdf.format(endhour));
                    }
                    else if(spto.getSelectedItem().toString() == "HDT (UTC -9)"){
                        c2.add(Calendar.HOUR, -9);
                        endhour = c2.getTime();
                        output.setText(sdf.format(endhour));
                    }
                    else if(spto.getSelectedItem().toString() == "MART (UTC -9:30)"){
                        c2.add(Calendar.MINUTE, -30);
                        c2.add(Calendar.HOUR, -9);
                        endhour = c2.getTime();
                        output.setText(sdf.format(endhour));;
                    }
                    else if(spto.getSelectedItem().toString() == "HST (UTC -10)"){
                        c2.add(Calendar.HOUR, -10);
                        endhour = c2.getTime();
                        output.setText(sdf.format(endhour));
                    }
                    else if(spto.getSelectedItem().toString() == "NUT (UTC -11)"){
                        c2.add(Calendar.HOUR, -11);
                        endhour = c2.getTime();
                        output.setText(sdf.format(endhour));
                    }
                    else if(spto.getSelectedItem().toString() == "AoE (UTC -12)"){
                        c2.add(Calendar.HOUR, -12);
                        endhour = c2.getTime();
                        output.setText(sdf.format(endhour));
                    }

                } catch (ParseException e) {
                    e.printStackTrace();
                }

            }
        });

        back = findViewById(R.id.backButtonTimezone);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(timezone.this, MainActivity.class);
                startActivity(i);
            }
        });
    }

}