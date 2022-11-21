package com.example.agendacrud;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import DB.DBContactos;
import DB.DBMetodos;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnIngresar = findViewById(R.id.btnIngresar);
        EditText txtnombre = findViewById(R.id.txtnombre);
        EditText txtnumero = findViewById(R.id.txttelefono);
        EditText txtcorreo = findViewById(R.id.txtcorreo);


        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre = txtnombre.getText().toString();
                String numero = txtnumero.getText().toString();
                String correo = txtcorreo.getText().toString();
                DBMetodos obj = new DBMetodos();
                DBContactos contact = new DBContactos();
                contact.setNumero(numero);
                contact.setNombre(nombre);
                contact.setCorreo(correo);
                int resInsert = obj.insertarUsuario(MainActivity.this,contact);
                if(resInsert==1){

                    Toast.makeText(MainActivity.this,"Se han ingresado los datos :D",Toast.LENGTH_SHORT).show();

                }else{

                    Toast.makeText(MainActivity.this,"No se ingresaron los datos...",Toast.LENGTH_SHORT).show();


                }
            }
        });
    }
}