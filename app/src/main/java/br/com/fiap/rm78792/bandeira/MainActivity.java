package br.com.fiap.rm78792.bandeira;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }//OnCreate

    public void entrar(View view) {
        Intent it = new Intent(this, AdapterActivity.class);
        startActivity(it);
    }
}//Class