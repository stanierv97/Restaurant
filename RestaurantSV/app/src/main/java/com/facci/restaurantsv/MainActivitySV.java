package com.facci.restaurantsv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivitySV extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_sv);
    }
    public void click1(View v){
        Toast.makeText(MainActivitySV.this,"Biche de Maniz",Toast.LENGTH_SHORT).show();
    }
    public void click2(View v){
        Toast.makeText(MainActivitySV.this,"Caldo de Cangrejo",Toast.LENGTH_SHORT).show();
    }
    public void click3(View v){
        Toast.makeText(MainActivitySV.this,"Arroz Colorado",Toast.LENGTH_SHORT).show();
    }
    public void click4(View v){
        Toast.makeText(MainActivitySV.this,"Ceviche de Camaron",Toast.LENGTH_SHORT).show();
    }
    public void click5(View v){
        Toast.makeText(MainActivitySV.this,"Pescado",Toast.LENGTH_SHORT).show();
    }
    public void click6(View v){
        Toast.makeText(MainActivitySV.this,"Caldo de Gallina",Toast.LENGTH_SHORT).show();
    }
    public void click7(View v){
        Toast.makeText(MainActivitySV.this,"Sanduche",Toast.LENGTH_SHORT).show();
    }
}
