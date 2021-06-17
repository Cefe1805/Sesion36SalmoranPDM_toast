package com.example.sesion36salmoranpdm_toast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnToast1, btnToast2, btnToast3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnToast1=findViewById(R.id.btnToast1);
        btnToast2=findViewById(R.id.btnToast2);

        //btnToast3=findViewById(R.id.btnToast3);
    }

    //metodos para toast1
    public void toast1Personalizado(View view){
        Context context = getApplicationContext();
        CharSequence mensaje="Mensaje Emergente \n\nToast Personalizado Salmoran";
        int duration= Toast.LENGTH_LONG;

        //integracion de variables oobjeto a objeto Toast
        Toast toast1Per= Toast.makeText(context, mensaje, duration);
        toast1Per.setGravity(Gravity.CENTER_HORIZONTAL, -100,50);
        toast1Per.show();
    }

    //Metodo para toast2
    public void toast2Personalizado(View view){
        //layoutinflater compilacion o ejecucion
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.toast2, null);

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setDuration(Toast.LENGTH_LONG);
        //llamado, invocacion a elementos vista   integracion
        toast.setView(layout);
        toast.show();
    }

    //Metodo para toast2
    public void toast3Personalizado(View view){
        //layoutinflater compilacion o ejecucion
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.toast3, null);

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setDuration(Toast.LENGTH_LONG);
        //llamado, invocacion a elementos vista   integracion
        toast.setView(layout);
        toast.show();
    }
}