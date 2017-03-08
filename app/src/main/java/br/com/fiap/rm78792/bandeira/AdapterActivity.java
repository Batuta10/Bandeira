package br.com.fiap.rm78792.bandeira;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class AdapterActivity extends AppCompatActivity {

    Spinner spBandeira;
    ImageView imgBandeira;

    String[] pais = {"Argentina", "Brasil", "Franca", "Japao"};

    int[] fotos = {R.drawable.argentina, R.drawable.brasil, R.drawable.franca, R.drawable.japao};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adapter);

        spBandeira = (Spinner) findViewById(R.id.spBandera);
        imgBandeira = (ImageView) findViewById(R.id.imgBandeira);

        ArrayAdapter<String> adp = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, pais);
        spBandeira.setAdapter(adp);

        spBandeira.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                imgBandeira.setImageResource(fotos[position]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }//OnCreate

}//Main Class