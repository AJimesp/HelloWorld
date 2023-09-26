package com.antonioje.holamundo;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
/**
 * @author Antonio Jiménez Espejo
 * @version  1.0
* Aplicación que muestra el típico ejemplo de Hola Mundo
 * <al>
 *     <li>Se ha visto cómo se crean los recursos en XML</li>
 *     <li>Se ha instanciado en Java un objeto TextView</li>
 *     <li>Se ha personalizado la imagen de la aplicación</li>
 * </al>
* */

// TODO Tengo que mirar el temario explicado en clase sobre las Activity
public class MainActivity extends AppCompatActivity {
    private TextView tvMessageStart,tvMessageEnd;

    //Método que se llama en la creación de una Actividad
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvMessageStart = findViewById(R.id.tvMessageStart);
        tvMessageStart.setTextColor(getColor(R.color.green));
        tvMessageEnd = findViewById(R.id.tvMessageEnd);
        tvMessageEnd.setText(R.string.tvMessageCool);
        tvMessageEnd.setTextColor(getColor(R.color.orange));
    }
}