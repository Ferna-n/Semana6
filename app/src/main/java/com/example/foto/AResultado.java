package com.example.foto;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class AResultado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aresultado);

        // Obtener el TextView y el ImageView
        TextView resultadoTexto = findViewById(R.id.resultadoTexto);
        ImageView resultadoImagen = findViewById(R.id.resultadoImagen);

        // Obtener el Intent que inició esta Activity y los datos enviados
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            // Obtener el nombre de la foto
            String StNombre = extras.getString("STNombre");
            resultadoTexto.setText("Nombre de la foto: " + StNombre);

            // Obtener la referencia del recurso de la imagen y mostrarla
            int imageResource = extras.getInt("ImageResource");
            resultadoImagen.setImageResource(imageResource);
        }
    }
}
