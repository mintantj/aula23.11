package br.com.etecia.myapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView IdRecycleViewFilmes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);]

        IdRecycleViewFilmes = findViewById(R.id.IdRecycleViewFilmes);

        IdRecycleViewFilmes.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));
        IdRecycleViewFilmes.setHasFixedSize(true);
//        IdRecycleViewFilmes.setAdapter(adapter);


    }
}