package com.example.numeroaleatorio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private TextView txtResult;
    private EditText TextoEdit;
    private Button btnAleatorio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtResult=(TextView)findViewById(R.id.TxtResult);
        TextoEdit=(EditText)findViewById(R.id.TextEdit);
        btnAleatorio=(Button)findViewById(R.id.buttonAleatorio);
        btnAleatorio.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        if(btnAleatorio==v){
            comenzar();
        }

    }
    private void comenzar(){
        int numero=Integer.valueOf(TextoEdit.getText().toString());
        for (int i=1;i<=numero;i++){
            int random =(int)(Math.random()*(numero));
            String resul=String.valueOf(random);
            txtResult.setText(resul);

        }

    }
}