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

public class OxHaveActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ox_have);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Кислородсодержащие");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button btn_spt = findViewById(R.id.btn_spt);
        btn_spt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OxHaveActivity.this, SptActivity.class);
                startActivity(intent);
            }
        });

        Button btn_fen = findViewById(R.id.btn_fen);
        btn_fen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OxHaveActivity.this, FenolsActivity.class);
                startActivity(intent);
            }
        });

        Button btn_aldg = findViewById(R.id.btn_aldg);
        btn_aldg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OxHaveActivity.this, AldgActivity.class);
                startActivity(intent);
            }
        });

        Button btn_ket = findViewById(R.id.btn_ket);
        btn_ket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OxHaveActivity.this, KetActivity.class);
                startActivity(intent);
            }
        });

        Button btn_KK = findViewById(R.id.btn_kk);
        btn_KK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OxHaveActivity.this, KKActivity.class);
                startActivity(intent);
            }
        });

        Button btn_jirs = findViewById(R.id.btn_jirs);
        btn_jirs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OxHaveActivity.this, JirsActivity.class);
                startActivity(intent);
            }
        });
        Button btn_ygl = findViewById(R.id.btn_ygl);
        btn_ygl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OxHaveActivity.this, YglActivity.class);
                startActivity(intent);
            }
        });
        Button btn_efirs = findViewById(R.id.btn_efirs);
        btn_efirs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OxHaveActivity.this, EfirsActivity.class);
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
