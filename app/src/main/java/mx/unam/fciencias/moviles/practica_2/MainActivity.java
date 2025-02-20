package mx.unam.fciencias.moviles.practica_2;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
/**
 * @author Gonzalez Jimenez Cristian Rafael
 * <a href="cris_rgj13@hotmail.com">cris_rgj13@hotmail.com</a>
 **/

/**
 * @author Ximena Andrade Luviano.
 * <a href="mailto:andradeluvianoximena@ciencias.unam.mx">andradeluvianoximena@ciencias.uanm.mx</a>
 * */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}