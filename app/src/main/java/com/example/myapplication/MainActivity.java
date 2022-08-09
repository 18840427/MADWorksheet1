package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private TextView resultBox;
    private EditText firstNumber, secondNumber;
    private Button addition, subtraction, multiplication, division;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNumber = (EditText) findViewById(R.id.firstNumberText);
        secondNumber = (EditText)findViewById(R.id.secondNumberText);
        addition = (Button)findViewById(R.id.additionButton);
        subtraction = (Button)findViewById(R.id.subtractionButton);
        multiplication = (Button)findViewById(R.id.multiplicationButton);
        division = (Button)findViewById(R.id.divisionButton);
        resultBox = (TextView)findViewById(R.id.resultText);

        addition.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Editable editable1 = firstNumber.getText();
                Editable editable2 = secondNumber.getText();
                double number1 = Double.parseDouble(editable1.toString());
                double number2 = Double.parseDouble(editable2.toString());
                double result = number1 + number2;
                resultBox.setText(Double.toString(result));
            }
        });
        subtraction.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Editable editable1 = firstNumber.getText();
                Editable editable2 = secondNumber.getText();
                double number1 = Double.parseDouble(editable1.toString());
                double number2 = Double.parseDouble(editable2.toString());
                double result = number1 - number2;
                resultBox.setText(Double.toString(result));
            }
        });
        multiplication.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Editable editable1 = firstNumber.getText();
                Editable editable2 = secondNumber.getText();
                double number1 = Double.parseDouble(editable1.toString());
                double number2 = Double.parseDouble(editable2.toString());
                double result = number1 * number2;
                resultBox.setText(Double.toString(result));
            }
        });
        division.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Editable editable1 = firstNumber.getText();
                Editable editable2 = secondNumber.getText();
                double number1 = Double.parseDouble(editable1.toString());
                double number2 = Double.parseDouble(editable2.toString());
                double result = number1 / number2;
                resultBox.setText(Double.toString(result));
            }
        });

    }
}