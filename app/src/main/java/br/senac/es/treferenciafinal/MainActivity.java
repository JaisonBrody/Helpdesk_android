package br.senac.es.treferenciafinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import br.senac.es.treferenciafinal.ex.Activity;
import br.senac.es.treferenciafinal.fragments.Tab1;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText loginT=(EditText)findViewById(R.id.loginT);
        final EditText passwordT=(EditText)findViewById(R.id.passwordT);
        final Button logBt=(Button)findViewById(R.id.loginB);
        logBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                    Intent intent = new Intent(getApplicationContext(), Activity.class);
                    startActivity(intent);


            }
        });
    }
}
