package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox checkBox1,checkBox2,checkBox3,checkBox4,checkBox5,checkBox6,checkBox7,checkBox8,checkBox9,checkBox10,checkBox11,checkBox12,checkBox13,checkBox14,checkBox15,checkBox16;
    Button Savebutton,Clearbutton;
    RadioButton radioButton1,radioButton2,radioButton3,radioButton4,radioButton5;



    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        checkBox1=findViewById(R.id.cb1);
        checkBox2=findViewById(R.id.cb2);
        checkBox3=findViewById(R.id.cb3);
        checkBox4=findViewById(R.id.cb4);
        checkBox5=findViewById(R.id.cb5);
        checkBox6=findViewById(R.id.cb6);
        checkBox7=findViewById(R.id.cb7);
        checkBox8=findViewById(R.id.cb8);
        checkBox9=findViewById(R.id.cb9);
        checkBox10=findViewById(R.id.cb10);
        checkBox11=findViewById(R.id.cb11);
        checkBox12=findViewById(R.id.cb12);
        checkBox13=findViewById(R.id.cb13);
        checkBox14=findViewById(R.id.cb14);
        checkBox15=findViewById(R.id.cb15);
        checkBox16=findViewById(R.id.cb16);

        Savebutton=findViewById(R.id.Save);
        Clearbutton=findViewById(R.id.Clear);

        radioButton1=findViewById(R.id.r1);
        radioButton2=findViewById(R.id.r2);
        radioButton3=findViewById(R.id.r3);
        radioButton4=findViewById(R.id.r4);
        radioButton5=findViewById(R.id.r5);


        checkBox9.setEnabled(false);
        checkBox10.setEnabled(false);
        checkBox11.setEnabled(false);
        checkBox12.setEnabled(false);
        checkBox13.setEnabled(false);
        checkBox14.setEnabled(false);
        checkBox15.setEnabled(false);
        checkBox16.setEnabled(false);

        radioButton1.setEnabled(false);
        radioButton2.setEnabled(false);
        radioButton3.setEnabled(false);
        radioButton4.setEnabled(false);
        radioButton5.setEnabled(false);

        checkBox1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                checkBox9.setEnabled(true);
                checkBox10.setEnabled(true);
                checkBox11.setVisibility(View.INVISIBLE);
                checkBox12.setVisibility(View.INVISIBLE);
                checkBox13.setEnabled(true);
                checkBox14.setEnabled(true);
                checkBox15.setVisibility(View.INVISIBLE);
                checkBox16.setVisibility(View.INVISIBLE);

                radioButton1.setEnabled(true);
                radioButton2.setEnabled(true);
                radioButton3.setEnabled(true);
                radioButton4.setEnabled(true);
                radioButton5.setEnabled(true);

            }
        });

        checkBox2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                checkBox9.setVisibility(View.INVISIBLE);
                checkBox10.setEnabled(true);
                checkBox11.setVisibility(View.INVISIBLE);
                checkBox12.setVisibility(View.INVISIBLE);
                checkBox13.setVisibility(View.INVISIBLE);
                checkBox14.setEnabled(true);
                checkBox15.setVisibility(View.INVISIBLE);
                checkBox16.setVisibility(View.INVISIBLE);

                radioButton1.setEnabled(true);
                radioButton2.setEnabled(true);
                radioButton3.setEnabled(true);
                radioButton4.setEnabled(true);
                radioButton5.setEnabled(true);
            }
        });

        checkBox3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                checkBox9.setVisibility(View.INVISIBLE);
                checkBox10.setEnabled(true);
                checkBox11.setEnabled(true);
                checkBox12.setVisibility(View.INVISIBLE);
                checkBox13.setVisibility(View.INVISIBLE);
                checkBox14.setEnabled(true);
                checkBox15.setEnabled(true);
                checkBox16.setVisibility(View.INVISIBLE);

                radioButton1.setEnabled(true);
                radioButton2.setEnabled(true);
                radioButton3.setEnabled(true);
                radioButton4.setEnabled(true);
                radioButton5.setEnabled(true);
            }
        });

        checkBox4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                checkBox9.setVisibility(View.VISIBLE);
                checkBox10.setVisibility(View.VISIBLE);
                checkBox11.setVisibility(View.VISIBLE);
                checkBox12.setVisibility(View.VISIBLE);
                checkBox13.setVisibility(View.VISIBLE);
                checkBox14.setVisibility(View.VISIBLE);
                checkBox15.setVisibility(View.VISIBLE);
                checkBox16.setVisibility(View.VISIBLE);

                checkBox9.setEnabled(true);
                checkBox10.setEnabled(true);
                checkBox11.setEnabled(true);
                checkBox12.setEnabled(true);
                checkBox13.setEnabled(true);
                checkBox14.setEnabled(true);
                checkBox15.setEnabled(true);
                checkBox16.setEnabled(true);

                radioButton1.setEnabled(true);
                radioButton2.setEnabled(true);
                radioButton3.setEnabled(true);
                radioButton4.setEnabled(true);
                radioButton5.setEnabled(true);
            }
        });

        checkBox5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                checkBox9.setVisibility(View.INVISIBLE);
                checkBox10.setVisibility(View.INVISIBLE);
                checkBox11.setVisibility(View.INVISIBLE);
                checkBox12.setVisibility(View.INVISIBLE);
                checkBox13.setEnabled(true);
                checkBox14.setEnabled(true);
                checkBox15.setVisibility(View.INVISIBLE);
                checkBox16.setVisibility(View.INVISIBLE);

                radioButton1.setEnabled(true);
                radioButton2.setEnabled(true);
                radioButton3.setEnabled(true);
                radioButton4.setEnabled(true);
                radioButton5.setEnabled(true);
            }
        });

        checkBox6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                checkBox9.setVisibility(View.INVISIBLE);
                checkBox10.setVisibility(View.INVISIBLE);
                checkBox11.setVisibility(View.INVISIBLE);
                checkBox12.setVisibility(View.INVISIBLE);
                checkBox13.setVisibility(View.INVISIBLE);
                checkBox14.setEnabled(true);
                checkBox15.setVisibility(View.INVISIBLE);
                checkBox16.setVisibility(View.INVISIBLE);

                radioButton1.setEnabled(true);
                radioButton2.setEnabled(true);
                radioButton3.setEnabled(true);
                radioButton4.setEnabled(true);
                radioButton5.setEnabled(true);
            }
        });


        checkBox7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                checkBox9.setVisibility(View.INVISIBLE);
                checkBox10.setVisibility(View.INVISIBLE);
                checkBox11.setVisibility(View.INVISIBLE);
                checkBox12.setVisibility(View.INVISIBLE);
                checkBox14.setEnabled(true);
                checkBox15.setEnabled(true);
                checkBox13.setVisibility(View.INVISIBLE);
                checkBox16.setVisibility(View.INVISIBLE);

                radioButton1.setEnabled(true);
                radioButton2.setEnabled(true);
                radioButton3.setEnabled(true);
                radioButton4.setEnabled(true);
                radioButton5.setEnabled(true);
            }
        });


        checkBox8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                checkBox9.setVisibility(View.INVISIBLE);
                checkBox10.setVisibility(View.INVISIBLE);
                checkBox11.setVisibility(View.INVISIBLE);
                checkBox12.setVisibility(View.INVISIBLE);
                checkBox13.setEnabled(true);
                checkBox14.setEnabled(true);
                checkBox15.setEnabled(true);
                checkBox16.setEnabled(true);


                radioButton1.setEnabled(true);
                radioButton2.setEnabled(true);
                radioButton3.setEnabled(true);
                radioButton4.setEnabled(true);
                radioButton5.setEnabled(true);

            }
        });



        Savebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                StringBuffer result = new StringBuffer();


                if(checkBox1.isChecked()) {
                    result.append("Your record added");

                }
                if(checkBox2.isChecked()) {
                    result.append("Your record added");
                }
                if(checkBox3.isChecked()) {
                    result.append("Your record added");
                }
                if(checkBox4.isChecked()) {
                    result.append("Your record added");
                }
                if(checkBox5.isChecked()) {
                    result.append("Your record added");
                }
                if(checkBox6.isChecked()) {
                    result.append("Your record added");
                }
                if(checkBox7.isChecked()) {
                    result.append("Your record added");
                }
                if(checkBox8.isChecked()) {
                    result.append("Your record added");
                }
               if(!checkBox1.isChecked() && !checkBox2.isChecked() && !checkBox3.isChecked()  && !checkBox4.isChecked()  && !checkBox5.isChecked()  && !checkBox6.isChecked()  && !checkBox7.isChecked()  && !checkBox8.isChecked()){
                   result.append("No Records Added");


                }
                Message.message(MainActivity.this, result.toString());

            }
        });

        Clearbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(checkBox1.isChecked())
                    checkBox1.setChecked(false);
                if(checkBox2.isChecked())
                    checkBox2.setChecked(false);
                if(checkBox3.isChecked())
                    checkBox3.setChecked(false);
                if(checkBox4.isChecked())
                    checkBox4.setChecked(false);
                if(checkBox5.isChecked())
                    checkBox5.setChecked(false);
                if(checkBox6.isChecked())
                    checkBox6.setChecked(false);
                if(checkBox7.isChecked())
                    checkBox7.setChecked(false);
                if(checkBox8.isChecked())
                    checkBox8.setChecked(false);

                checkBox9.setVisibility(View.VISIBLE);
                checkBox9.setChecked(false);
                checkBox9.setEnabled(false);

                checkBox10.setVisibility(View.VISIBLE);
                checkBox10.setChecked(false);
                checkBox10.setEnabled(false);

                checkBox11.setVisibility(View.VISIBLE);
                checkBox11.setChecked(false);
                checkBox11.setEnabled(false);

                checkBox12.setVisibility(View.VISIBLE);
                checkBox12.setChecked(false);
                checkBox12.setEnabled(false);

                checkBox13.setVisibility(View.VISIBLE);
                checkBox13.setChecked(false);
                checkBox13.setEnabled(false);

                checkBox14.setVisibility(View.VISIBLE);
                checkBox14.setChecked(false);
                checkBox14.setEnabled(false);

                checkBox15.setVisibility(View.VISIBLE);
                checkBox15.setChecked(false);
                checkBox15.setEnabled(false);

                checkBox16.setVisibility(View.VISIBLE);
                checkBox16.setChecked(false);
                checkBox16.setEnabled(false);

                radioButton1.setChecked(false);
                radioButton2.setChecked(false);
                radioButton3.setChecked(false);
                radioButton4.setChecked(false);
                radioButton5.setChecked(false);

                radioButton1.setEnabled(false);
                radioButton2.setEnabled(false);
                radioButton3.setEnabled(false);
                radioButton4.setEnabled(false);
                radioButton5.setEnabled(false);

            }
        });
    }


    }