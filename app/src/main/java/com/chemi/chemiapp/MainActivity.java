package com.chemi.chemiapp;

import android.content.Intent;
import android.os.Bundle;
import androidx.core.view.GravityCompat;
import androidx.appcompat.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import com.google.android.material.navigation.NavigationView;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import android.view.Menu;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
            this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

        setTitle("Таблица Менделеева");
        FragmentHome fragment = new FragmentHome();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fram, fragment, "FragmentHome");
        fragmentTransaction.commit();

        showHome();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        }

        else {
            if(fragment instanceof FragmentHome) {
                super.onBackPressed();
            }

            else {
                showHome();
                 }
            }
        }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.about) {
            Intent intent = new Intent(this, AboutActivity.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void showHome(){
        fragment = new FragmentHome();
        if(fragment != null) {
            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction().replace(R.id.fram, fragment, fragment.getTag()).commit();
        }
    }

    Fragment fragment = null;

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            setTitle("Таблица Менделеева");
            fragment = new FragmentHome();
        }  else if (id == R.id.nav_elements) {
            setTitle("Элементы");
            fragment = new FragmentElements();
        }
          else if (id == R.id.nav_orgchem) {
            setTitle("Органическая Химия");
            fragment = new FragmentOrgchem();

        }
          else if (id == R.id.nav_inorgchem) {
            setTitle("Неорганическая Химия");
            fragment = new FragmentInorgchem();
        }
          else if (id == R.id.nav_theory) {
              setTitle("Теория Бутлерова");
              fragment = new FragmentTheory();
        }
          else if (id == R.id.nav_chem_link) {
              setTitle("Химическая Связь");
              fragment = new FragmentChemLink();
        }
            else if (id == R.id.nav_chem_react) {
                setTitle("Химические Реакции");
                fragment = new FragmentChemReact();
        }

          if(fragment != null) {
              FragmentManager manager = getSupportFragmentManager();
              manager.beginTransaction().replace(R.id.fram, fragment, fragment.getTag()).commit();
          }
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
