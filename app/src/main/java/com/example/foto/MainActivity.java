package com.example.foto;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Referencia al EditText, Button, y ImageView
        EditText ETNombre = findViewById(R.id.ETNombreFoto);
        Button BTAceptar = findViewById(R.id.BTAceptar);
        ImageView imageView = findViewById(R.id.imageView);

        // Mostrar la imagen desde drawable en ImageView
        imageView.setImageResource(R.drawable.foto);

        // Acción cuando se presiona el botón
        BTAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Captura el texto ingresado en el EditText (nombre de la foto)
                String StNombre = ETNombre.getText().toString();

                // Crear el Intent para pasar el nombre a la otra Activity
                Intent sIntent = new Intent(MainActivity.this, AResultado.class);
                sIntent.putExtra("STNombre", StNombre);  // Pasar el nombre de la foto
                sIntent.putExtra("ImageResource", R.drawable.foto);  // Pasar la imagen de drawable
                startActivity(sIntent);  // Iniciar la otra Activity
            }
        });
    }
}
