package com.masterandroid.cgpacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Secondb extends AppCompatActivity {
    EditText a1, a2, a3, b1, b2, b3, c1, c2, c3, d1, d2, d3, e1, e2, g, h, j;
    Button bt1, bt2;
    TextView x;
    TextView y;
    TextView o1, o2, o3, o4, o5, o7, o8, o10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondb);

        g = (EditText) findViewById(R.id.input17);
        h = (EditText) findViewById(R.id.input19);
        //i = (EditText) findViewById(R.id.input21);
        j = (EditText) findViewById(R.id.input22);
        a2 = (EditText) findViewById(R.id.input2);
        b2 = (EditText) findViewById(R.id.input5);
        c2 = (EditText) findViewById(R.id.input8);
        d2 = (EditText) findViewById(R.id.input11);
        e2 = (EditText) findViewById(R.id.input14);
        //f2 = (EditText) findViewById(R.id.input17);
        a3 = (EditText) findViewById(R.id.input3);
        b3 = (EditText) findViewById(R.id.input6);
        c3 = (EditText) findViewById(R.id.input9);
        d3 = (EditText) findViewById(R.id.input12);
        //e3 = (EditText) findViewById(R.id.input15);
        //f3 = (EditText) findViewById(R.id.input18);
        bt1 = findViewById(R.id.Button);
        bt2 = findViewById(R.id.Buttonr);
        x = findViewById(R.id.output11);
        o1= findViewById(R.id.output1);
        o2= findViewById(R.id.output2);
        o3= findViewById(R.id.output3);
        o4= findViewById(R.id.output4);
        o5= findViewById(R.id.output5);
        //o6= findViewById(R.id.output6);
        o7= findViewById(R.id.output7);
        o8= findViewById(R.id.output8);
        //o9= findViewById(R.id.output9);
        o10= findViewById(R.id.output10);
        //y = findViewById(R.id.textView2);

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                g.setText("");
                h.setText("");
                //i.setText("");
                j.setText("");
                a2.setText("");
                a3.setText("");
                b2.setText("");
                b3.setText("");
                c2.setText("");
                c3.setText("");
                d2.setText("");
                d3.setText("");
                e2.setText("");
                //e3.setText("");

                x.setText("");
                o1.setText("");
                o2.setText("");
                o3.setText("");
                o4.setText("");
                o5.setText("");
                //o6.setText("");
                o7.setText("");
                o8.setText("");
                //o9.setText("");
                o10.setText("");





            }
        });



        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //y.setText("welcome");
                //startActivity(new Intent(MainActivity.this,Home.class));
                //final int fa1 = Integer.parseInt(a1.getText().toString());
                //Toast.makeText(MainActivity.this,"cpa is" + fa1,Toast.LENGTH_SHORT).show();
                String sa2 = a2.getText().toString().trim();
                String sa3 = a3.getText().toString();
                String sb2 = b2.getText().toString();
                String sb3 = b3.getText().toString();
                String sc2 = c2.getText().toString();
                String sc3 = c3.getText().toString();
                String sd2 = d2.getText().toString();
                String sd3 = d3.getText().toString();
                String se2 = e2.getText().toString();
                //String se3 = e3.getText().toString();

                String sg = g.getText().toString();
                String sh = h.getText().toString();
                //String si = i.getText().toString();
                String sj = j.getText().toString();



                if(sc2.isEmpty() || sc3.isEmpty() || sa2.isEmpty() || sa3.isEmpty() || sb2.isEmpty() || sb3.isEmpty() || sd2.isEmpty() || sd3.isEmpty() || se2.isEmpty() || sg.isEmpty() || sh.isEmpty() || sj.isEmpty()){
                    // a2.setError("Please enter marks");
                    //a2.requestFocus();
                    Toast.makeText(Secondb.this,"Please Enter Marks!",Toast.LENGTH_SHORT).show();
                }else
                {


                    int fg = Integer.parseInt(g.getText().toString());
                    int fh = Integer.parseInt(h.getText().toString());
                    //int fi = Integer.parseInt(i.getText().toString());
                    int fj = Integer.parseInt(j.getText().toString());
                    int fa2 = Integer.parseInt(a2.getText().toString());
                    int fb2 = Integer.parseInt(b2.getText().toString());
                    int fc2 = Integer.parseInt(c2.getText().toString());
                    int fd2 = Integer.parseInt(d2.getText().toString());
                    int fe2 = Integer.parseInt(e2.getText().toString());

                    int fa3 = Integer.parseInt(a3.getText().toString());
                    int fb3 = Integer.parseInt(b3.getText().toString());
                    int fc3 = Integer.parseInt(c3.getText().toString());
                    int fd3 = Integer.parseInt(d3.getText().toString());
                    //int fe3 = Integer.parseInt(e3.getText().toString());




                    if ((0 > fg) || (fg > 100)) {
                        g.setError("Invalid Marks");
                        g.requestFocus();
                    } else if ((0 > fh) || (fh > 100)) {
                        h.setError("Invalid Marks");
                        h.requestFocus();
                    }  else if ((0 > fj) || (fj > 100)) {
                        j.setError("Invalid Marks");
                        j.requestFocus();
                    } else if ((0 > fa2) || (fa2  > 50)) {
                        a2.setError("Invalid Marks");
                        a2.requestFocus();
                    } else if ((0 > fa3) || (fa3  > 50)) {
                        a3.setError("Invalid Marks");
                        a3.requestFocus();
                    } else if ((0 > fb2) || (fb2  > 50)) {
                        b2.setError("Invalid Marks");
                        b2.requestFocus();
                    } else if ((0 > fb3) || (fb3  > 50)) {
                        b3.setError("Invalid Marks");
                        b3.requestFocus();
                    } else if ((0 > fc2) || (fc2  > 50)) {
                        c2.setError("Invalid Marks");
                        c2.requestFocus();
                    } else if ((0 > fc3) || (fc3  > 50)) {
                        c3.setError("Invalid Marks");
                        c3.requestFocus();
                    } else if ((0 > fd2) || (fd2  > 50)) {
                        d2.setError("Invalid Marks");
                        d2.requestFocus();
                    } else if ((0 > fd3) || (fd3  > 50)) {
                        d3.setError("Invalid Marks");
                        d3.requestFocus();
                    } else if ((0 > fe2) || (fe2  > 100)) {
                        e2.setError("Invalid Marks");
                        e2.requestFocus();
                    }
                    else {
                        int af = fa2 + fa3;
                        int afg = ((af / 10) + 1);
                        if (afg >= 10)
                            o1.setText("O");
                        else if (afg == 9)
                            o1.setText("E");
                        else if (afg == 8)
                            o1.setText("A");
                        else if (afg == 7)
                            o1.setText("B");
                        else if (afg == 6)
                            o1.setText("C");
                        else if (afg == 5)
                            o1.setText("D");
                        else if (afg <= 4)
                            o1.setText("F");


                        int bf = fb2 + fb3;
                        int bfg = ((bf / 10) + 1);
                        if (bfg >= 10)
                            o2.setText("O");
                        else if (bfg == 9)
                            o2.setText("E");
                        else if (bfg == 8)
                            o2.setText("A");
                        else if (bfg == 7)
                            o2.setText("B");
                        else if (bfg == 6)
                            o2.setText("C");
                        else if (bfg == 5)
                            o2.setText("D");
                        else if (bfg <= 4)
                            o2.setText("F");


                        int cf = fc2 + fc3;
                        int cfg = ((cf / 10) + 1);
                        if (cfg >= 10)
                            o3.setText("O");
                        else if (cfg == 9)
                            o3.setText("E");
                        else if (cfg == 8)
                            o3.setText("A");
                        else if (cfg == 7)
                            o3.setText("B");
                        else if (cfg == 6)
                            o3.setText("C");
                        else if (cfg == 5)
                            o3.setText("D");
                        else if (cfg <= 4)
                            o3.setText("F");


                        int df = fd2 + fd3;
                        int dfg = ((df / 10) + 1);
                        if (dfg >= 10)
                            o4.setText("O");
                        else if (dfg == 9)
                            o4.setText("E");
                        else if (dfg == 8)
                            o4.setText("A");
                        else if (dfg == 7)
                            o4.setText("B");
                        else if (dfg == 6)
                            o4.setText("C");
                        else if (dfg == 5)
                            o4.setText("D");
                        else if (dfg <= 4)
                            o4.setText("F");


                        int ef = fe2;
                        int efg = ((ef / 10) + 1);
                        if (efg >= 10)
                            o5.setText("O");
                        else if (efg == 9)
                            o5.setText("E");
                        else if (efg == 8)
                            o5.setText("A");
                        else if (efg == 7)
                            o5.setText("B");
                        else if (efg == 6)
                            o5.setText("C");
                        else if (efg == 5)
                            o5.setText("D");
                        else if (efg <= 4)
                            o5.setText("F");




                        int gfg = ((fg / 10) + 1);
                        if (gfg >= 10)
                            o7.setText("O");
                        else if (gfg == 9)
                            o7.setText("E");
                        else if (gfg == 8)
                            o7.setText("A");
                        else if (gfg == 7)
                            o7.setText("B");
                        else if (gfg == 6)
                            o7.setText("C");
                        else if (gfg == 5)
                            o7.setText("D");
                        else if (gfg <= 4)
                            o7.setText("F");

                        int hfg = ((fh / 10) + 1);
                        if (hfg >= 10)
                            o8.setText("O");
                        else if (hfg == 9)
                            o8.setText("E");
                        else if (hfg == 8)
                            o8.setText("A");
                        else if (hfg == 7)
                            o8.setText("B");
                        else if (hfg == 6)
                            o8.setText("C");
                        else if (hfg == 5)
                            o8.setText("D");
                        else if (hfg <= 4)
                            o8.setText("F");



                        int jfg = ((fj / 10) + 1);
                        if (jfg >= 10)
                            o10.setText("O");
                        else if (jfg == 9)
                            o10.setText("E");
                        else if (jfg == 8)
                            o10.setText("A");
                        else if (jfg == 7)
                            o10.setText("B");
                        else if (jfg == 6)
                            o10.setText("C");
                        else if (jfg == 5)
                            o10.setText("D");
                        else if (jfg <= 4)
                            o10.setText("F");

                        // * credit;
                        if(af == 100) {
                            af=99;
                        }
                        if(bf == 100) {
                            bf=99;
                        }
                        if(cf == 100) {
                            cf=99;
                        }
                        if(df == 100) {
                            df=99;
                        }
                        if(ef == 100) {
                            ef=99;
                        }

                        if(fg == 100) {
                            fg=99;
                        }
                        if(fh == 100) {
                            fh=99;
                        }

                        if(fj == 100) {
                            fj=99;
                        }

                        int a = ((af / 10) + 1) * 4;
                        int b = ((bf / 10) + 1) * 4;
                        int c = ((cf / 10) + 1) * 3;
                        int d = ((df / 10) + 1) * 3;
                        int e = ((ef / 10) + 1) * 2;
                        //int f = ((ff / 10) + 1) * 4;
                        float g = (float) (((fg / 10) + 1) * 1.5);
                        int h = ((fh / 10) + 1) * 1;
                        //int i = ((fi / 10) + 1) * 1;
                        int j = (fj / 10) + 1;
                        //float m = 0;
                        //float gpa = 0;
                        float m = a + b + c + d + e + g + h + j;
                        float gpa = (float) (m / 19.5);
                        String G = String.format("%.2f", gpa);

                        x.setText("SGPA:-" + G);


                    }
                }


            }










            //}
        });
    }
}