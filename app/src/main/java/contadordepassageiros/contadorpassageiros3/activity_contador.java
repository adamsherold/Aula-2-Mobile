package contadordepassageiros.contadorpassageiros3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class activity_contador extends AppCompatActivity {

    private TextView txtContador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contador);

        txtContador = (TextView) findViewById(R.id.txtContador);

    }

    public void contar(View v) {

        String valAtual = txtContador.getText().toString();
        int proxVal = Integer.parseInt(valAtual) + 1;
        txtContador.setText(String.valueOf(proxVal));

        if (proxVal == 30) {
            Toast.makeText(this, "Lotação Atingida!", Toast.LENGTH_SHORT).show();
        }

    }
    public void reiniciar(View v) {
        txtContador.setText("0");
    }
}



