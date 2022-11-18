
//Богатова Полина, гуппа 303

package com.example.calculate;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    EditText texA, texB, texF;
    TextView result;
    TextView resultD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texA = findViewById(R.id.txtA);
        texB = findViewById(R.id.txtB);
        texF = findViewById(R.id.texF);
        result = findViewById(R.id.LabC);
        resultD = this.<TextView>findViewById(R.id.resD);
    }

    public void add_click(View v)
    {
        String A = texA.getText().toString();
        String B = texB.getText().toString();

        int inA = Integer.parseInt(A);
        int inB = Integer.parseInt(B);

        int inc = inA + inB;

        String C = String.valueOf(inc);
        result.setText(C);
    }

    public void sub_click(View v)
    {
        String A = texA.getText().toString();
        String B = texB.getText().toString();

        int inA = Integer.parseInt(A);
        int inB = Integer.parseInt(B);

        int inc = inA - inB;

        String C = String.valueOf(inc);
        result.setText(C);
    }

    public void mul_click(View v)
    {
        String A = texA.getText().toString();
        String B = texB.getText().toString();

        int inA = Integer.parseInt(A);
        int inB = Integer.parseInt(B);

        int inc = inA * inB;

        String C = String.valueOf(inc);
        result.setText(C);
    }

    public void div_click(View v)
    {
        String A = texA.getText().toString();
        String B = texB.getText().toString();

        float inA = Float.parseFloat(A);
        float inB = Float.parseFloat(B);

        float inc = inA / inB;

        String C = String.valueOf(inc);
        result.setText(C);
    }

    public void sin_click(View v)
    {
        String A = texF.getText().toString();

        float inA = Float.parseFloat(A);
        float radian = (float) Math.toRadians(inA);
        float fC = (float) Math.sin(radian);

        String C = String.valueOf(fC);
        resultD.setText(C);
    }

    public void cos_click(View v)
    {
        String A = texF.getText().toString();

        float inA = Float.parseFloat(A);
        float radian = (float) Math.toRadians(inA);
        float fC = (float) Math.cos(radian);

        String C = String.valueOf(fC);
        resultD.setText(C);
    }

    public void tan_click(View v)
    {
        String A = texF.getText().toString();

        float inA = Float.parseFloat(A);
        float radian = (float) Math.toRadians(inA);
        float fC = (float) Math.tan(radian);

        String C = String.valueOf(fC);
        resultD.setText(C);
    }

    public void pow_click(View v)
    {
        String A = texA.getText().toString();
        String B = texB.getText().toString();

        int inA = Integer.parseInt(A);
        int inB = Integer.parseInt(B);

        int fC = (int) Math.pow(inA, inB);

        String C = String.valueOf(fC);
        result.setText(C);
    }

    public void sqrt_click(View v)
    {
        String A = texF.getText().toString();

        float inA = Float.parseFloat(A);
        float fC = (float) Math.sqrt(inA);

        String C = String.valueOf(fC);
        resultD.setText(C);
    }

}