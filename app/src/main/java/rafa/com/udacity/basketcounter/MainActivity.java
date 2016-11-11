package rafa.com.udacity.basketcounter;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    public int contadorA;
    public int contadorB;
    TextView resultadoA;
    TextView resultadoB;
    public int faltasA;
    public int faltasB;
    TextView contadorFaltasA;
    TextView contadorFaltasB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Contadores de puntos A y B

        resultadoA= (TextView)findViewById(R.id.contadorA); contadorA=0;
        resultadoB= (TextView)findViewById(R.id.contadorB); contadorB=0;

        // Contador Faltas A y B

        contadorFaltasA=(TextView)findViewById(R.id.faltasA); faltasA=0;
        contadorFaltasB=(TextView)findViewById(R.id.faltasB); faltasB=0;

    }


// Métodos del contador de puntos A

    public void tiroLibreA(View vista){contadorA++; resultadoA.setText(""+contadorA);}
    public void dobleA (View vista){contadorA=contadorA+2; resultadoA.setText(""+contadorA);}
    public void tripleA (View vista){contadorA=contadorA+3; resultadoA.setText(""+contadorA);}

// Métodos del contador de puntos B

    public void tiroLibreB  (View vista){contadorB++; resultadoB.setText(""+contadorB);}
    public void dobleB      (View vista){contadorB=contadorB+2; resultadoB.setText(""+contadorB);}
    public void tripleB     (View vista){contadorB=contadorB+3; resultadoB.setText(""+contadorB);}

// Reset de puntos A y B

    public void resetearA (View vista){contadorA=0; resultadoA.setText(""+contadorA);}
    public void resetearB (View vista){contadorB=0; resultadoB.setText(""+contadorB);}

// Métodos de Faltas A y B

    public void incrementoFaltaA(View vista){faltasA++;  contadorFaltasA.setText(""+faltasA);}
    public void incrementoFaltaB(View vista){faltasB++; contadorFaltasB.setText(""+faltasB);}

    public void decrementoFaltaA(View vista){faltasA--; if (faltasA<0){faltasA=0;} ;contadorFaltasA.setText(""+faltasA);}
    public void decrementoFaltaB(View vista){faltasB--; if (faltasB<0){faltasB=0;}contadorFaltasB.setText(""+faltasB);}}