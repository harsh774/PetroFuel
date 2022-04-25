package com.example.petrofuel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private TextView P_need,P;
    private EditText n1,n2,n3;
    private  Button cal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        P_need = (TextView)findViewById(R.id.textView4);
        cal = (Button)findViewById(R.id.calculate) ;
        P = (TextView) findViewById(R.id.textView5);
        n1 = (EditText)findViewById(R.id.editTextNumberDecimal);
        n2 = (EditText)findViewById(R.id.editTextNumberDecimal2);
        n3 = (EditText)findViewById(R.id.editTextNumberDecimal3);
        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double number1 = Double.parseDouble(n1.getText().toString());
                double number2 = Double.parseDouble(n2.getText().toString());
                double number3 = Double.parseDouble(n3.getText().toString());
                double Petrol = number1/number3;
                double Price = Petrol*number2;
                P_need.setText("Petrol needed: "+ String.valueOf(Petrol));
                P.setText("Petrol: "+ String.valueOf(Price));


            }
        });

    }
}