package com.example.gohasu.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertCurrency(View view) {
        Log.i("Info","Convert button pressed");

        EditText editText = (EditText) findViewById(R.id.editText2);

        String amountInPounds = editText.getText().toString();

        double amountInDollars = Double.parseDouble(amountInPounds) * 1.3;

        String amountInDollarString = String.format("%.2f", amountInDollars);

        Log.i("Amount in dollars", amountInDollarString);

        Toast.makeText(this, "£"+ amountInPounds +" is $" + amountInDollarString, Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
