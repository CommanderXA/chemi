package com.chemi.chemiapp;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Km3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_km3);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Углеводороды");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button btn_alk = findViewById(R.id.btn_alk);
        btn_alk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Km3Activity.this, AlkansActivity.class);
                startActivity(intent);
            }
        });

        Button btn_clk = findViewById(R.id.btn_clk);
        btn_clk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Km3Activity.this, ClkAlkansActivity.class);
                startActivity(intent);
            }
        });

        Button btn_alken = findViewById(R.id.btn_alken);
        btn_alken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Km3Activity.this, AlkensActivity.class);
                startActivity(intent);
            }
        });

        Button btn_alkd = findViewById(R.id.btn_alkd);
        btn_alkd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Km3Activity.this, AlkdsActivity.class);
                startActivity(intent);
            }
        });

        Button btn_arn = findViewById(R.id.btn_arn);
        btn_arn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Km3Activity.this, ArensActivity.class);
                startActivity(intent);
            }
        });

        Button btn_alkin = findViewById(R.id.btn_alkin);
        btn_alkin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Km3Activity.this, AlkinsActivity.class);
                startActivity(intent);
            }
        });
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {

            case android.R.id.home:
                // app icon in action bar clicked; goto parent activity.
                this.finish();
                return true;
            case R.id.about:
                Intent intent = new Intent(this, AboutActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}

