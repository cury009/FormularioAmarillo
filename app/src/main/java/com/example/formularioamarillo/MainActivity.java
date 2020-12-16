package com.example.formularioamarillo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioButton rb_nacional = null;
    private RadioButton rb_extranjero =  null;
    private CheckBox cb_acepto = null;
    private TextView txtError = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rb_nacional = (RadioButton) findViewById(R.id.rb_Nacional);
        rb_extranjero = (RadioButton) findViewById(R.id.rb_Extranjero);
        cb_acepto = (CheckBox) findViewById(R.id.cb_Acepto);
        txtError = (TextView) findViewById(R.id.txtError);

    }

    public void mostrarNacionalidad(View view) {
        boolean estaSeleccionado = ((RadioButton) view).isChecked();
        switch (view.getId())
        {
            case R.id.rb_Nacional:
                if(estaSeleccionado)
                {
                    Toast.makeText(this, "Has seleccionado nacional",Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.rb_Extranjero:
                if (estaSeleccionado)
                {
                    Toast.makeText(this, "Has seleccionado extranjero",Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }
    public void mostrar(View view) {
        if (rb_nacional.isChecked())
        {
            Toast.makeText(this, "Has seleccionado nacional",Toast.LENGTH_SHORT).show();
        }
        else if (rb_extranjero.isChecked())
        {
            Toast.makeText(this, "Has seleccionado extranjero",Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this, "no has seleccionado nada",Toast.LENGTH_SHORT).show();
        }
    }

    public void aceptar(View view) {
        boolean estaSeleccoinado = cb_acepto.isChecked();
        if(estaSeleccoinado)
        {
            txtError.setText("");
            Toast.makeText(this,"ACEPTAR TERMINOS",Toast.LENGTH_SHORT).show();

        }else {
            Toast.makeText(this,"DEBES ACEPTAR LOS TERMINOS PARA CONTINUAR",Toast.LENGTH_SHORT).show();

            txtError.setText("DEBES ACEPTAR LOS TERMINOS");
            txtError.setTextColor(getResources().getColor(R.color.colorPrimary));
        }
    }
}