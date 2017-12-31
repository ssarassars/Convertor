package com.example.saranyar.androidconvertor;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText input;

    boolean decimalClicked = false;
    boolean binaryClicked = false;
    boolean hexClicked = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = (EditText) findViewById(R.id.input);
        final Button decimal = (Button) findViewById(R.id.txtDecimal);
        final Button binary = (Button) findViewById(R.id.txtBinary);
        final Button hex = (Button) findViewById(R.id.txtHex);
        decimal.setBackgroundColor(Color.RED);
        binary.setBackgroundColor(Color.RED);
        hex.setBackgroundColor(Color.RED);

        decimal.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                decimalClicked = true;
                decimal.setBackgroundColor(Color.GREEN);
                binary.setBackgroundColor(Color.RED);
                hex.setBackgroundColor(Color.RED);
                if(!errorChecking()) {
                    String value = input.getText().toString();
                    String inputFinal = NumberConverter.calcDecimal(value);
                    input.setText(inputFinal);
                }



            }
        });

                binary.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View view) {
                        binaryClicked = true;
                        binary.setBackgroundColor(Color.GREEN);
                        hex.setBackgroundColor(Color.RED);
                        decimal.setBackgroundColor(Color.RED);
                        if(!errorChecking()) {
                            String value = input.getText().toString();
                            String inputFinal = NumberConverter.calcBinary(value);
                            input.setText(inputFinal);
                        }



                    }
                });

                        hex.setOnClickListener(new View.OnClickListener() {

                            @Override
                            public void onClick(View view) {
                                hexClicked = true;
                                binary.setBackgroundColor(Color.RED);
                                hex.setBackgroundColor(Color.GREEN);
                                decimal.setBackgroundColor(Color.RED);
                                if(!errorChecking()) {
                                    String value = input.getText().toString();
                                    String inputFinal = NumberConverter.calcHex(value);
                                    input.setText(inputFinal);
                                }


                            }
                        });

    }

    public boolean errorChecking() {
        //String valueInput = input.getText().toString();

        String error = "ERROR";

        if (input.getText().toString().trim().isEmpty()) {
            input.setText(error);
            return true;
        } else {
            return false;
        }
    }

}