package com.chemi.chemiapp;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class ElementsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elements);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Элементы");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        LinearLayout btn_h = findViewById(R.id.btn_h);
        btn_h.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Водород")
                        .setMessage("• Порядковый номер: 1\n• Период: 1\n• Группа: 1\n• Атомная масса: 1\n• Год открытия: 1766")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_he = findViewById(R.id.btn_he);
        btn_he.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Гелий")
                        .setMessage("• Порядковый номер: 2\n• Период: 1\n• Группа: 18\n• Атомная масса: 4\n• Год открытия: 1895")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_li = findViewById(R.id.btn_li);
        btn_li.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Литий")
                        .setMessage("• Порядковый номер: 3\n• Период: 2\n• Группа: 1\n• Атомная масса: 6.9\n• Год открытия: 1817")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_be = findViewById(R.id.btn_be);
        btn_be.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Берилий")
                        .setMessage("• Порядковый номер: 4\n• Период: 2\n• Группа: 2\n• Атомная масса: 9\n• Год открытия: 1797")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_b = findViewById(R.id.btn_b);
        btn_b.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Бор")
                        .setMessage("• Порядковый номер: 5\n• Период: 2\n• Группа: 13\n• Атомная масса: 10.8\n• Год открытия: 1808")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_c = findViewById(R.id.btn_c);
        btn_c.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Углерод")
                        .setMessage("• Порядковый номер: 6\n• Период: 2\n• Группа: 14\n• Атомная масса: 12\n• Год открытия: Доисторический период")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_n = findViewById(R.id.btn_n);
        btn_n.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Азот")
                        .setMessage("• Порядковый номер: 7\n• Период: 2\n• Группа: 15\n• Атомная масса: 14\n• Год открытия: 1772")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_o = findViewById(R.id.btn_o);
        btn_o.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Кислород")
                        .setMessage("• Порядковый номер: 8\n• Период: 2\n• Группа: 16\n• Атомная масса: 15.9\n• Год открытия: 1774")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_f = findViewById(R.id.btn_f);
        btn_f.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Фтор")
                        .setMessage("• Порядковый номер: 9\n• Период: 2\n• Группа: 17\n• Атомная масса: 18.9\n• Год открытия: 1886")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_ne = findViewById(R.id.btn_ne);
        btn_ne.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Неон")
                        .setMessage("• Порядковый номер: 10\n• Период: 2\n• Группа: 18\n• Атомная масса: 20.1\n• Год открытия: 1898")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_na = findViewById(R.id.btn_na);
        btn_na.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Натрий")
                        .setMessage("• Порядковый номер: 11\n• Период: 3\n• Группа: 1\n• Атомная масса: 22.9\n• Год открытия: 1807")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_mg = findViewById(R.id.btn_mg);
        btn_mg.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Магний")
                        .setMessage("• Порядковый номер: 12\n• Период: 3\n• Группа: 2\n• Атомная масса: 24.3\n• Год открытия: 1808")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_al = findViewById(R.id.btn_al);
        btn_al.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Аллюминий")
                        .setMessage("• Порядковый номер: 13\n• Период: 3\n• Группа: 13\n• Атомная масса: 26.9\n• Год открытия: 1825")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_si = findViewById(R.id.btn_si);
        btn_si.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Кремний")
                        .setMessage("• Порядковый номер: 14\n• Период: 3\n• Группа: 14\n• Атомная масса: 28\n• Год открытия: 1824")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_p = findViewById(R.id.btn_p);
        btn_p.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Фосфор")
                        .setMessage("• Порядковый номер: 15\n• Период: 3\n• Группа: 15\n• Атомная масса: 30.9\n• Год открытия: 1669")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_s = findViewById(R.id.btn_s);
        btn_s.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Сера")
                        .setMessage("• Порядковый номер: 16\n• Период: 3\n• Группа: 16\n• Атомная масса: 32\n• Год открытия: Доисторический период")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_cl = findViewById(R.id.btn_cl);
        btn_cl.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Хлор")
                        .setMessage("• Порядковый номер: 17\n• Период: 3\n• Группа: 17\n• Атомная масса: 35.4\n• Год открытия: 1774")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_ar = findViewById(R.id.btn_ar);
        btn_ar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Аргон")
                        .setMessage("• Порядковый номер: 18\n• Период: 3\n• Группа: 18\n• Атомная масса: 39.9\n• Год открытия: 1894")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_k = findViewById(R.id.btn_k);
        btn_k.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Калий")
                        .setMessage("• Порядковый номер: 19\n• Период: 4\n• Группа: 1\n• Атомная масса: 39\n• Год открытия: 1807")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_ca = findViewById(R.id.btn_ca);
        btn_ca.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Кальций")
                        .setMessage("• Порядковый номер: 20\n• Период: 4\n• Группа: 2\n• Атомная масса: 40\n• Год открытия: 1808")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_sc = findViewById(R.id.btn_sc);
        btn_sc.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Скандий")
                        .setMessage("• Порядковый номер: 21\n• Период: 4\n• Группа: 3\n• Атомная масса: 44.9\n• Год открытия: 1879")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_ti = findViewById(R.id.btn_ti);
        btn_ti.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Титан")
                        .setMessage("• Порядковый номер: 22\n• Период: 4\n• Группа: 4\n• Атомная масса: 47.8\n• Год открытия: 1791")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_v = findViewById(R.id.btn_v);
        btn_v.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Ванадий")
                        .setMessage("• Порядковый номер: 23\n• Период: 4\n• Группа: 5\n• Атомная масса: 50.9\n• Год открытия: 1801")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_cr = findViewById(R.id.btn_cr);
        btn_cr.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Хром")
                        .setMessage("• Порядковый номер: 24\n• Период: 4\n• Группа: 6\n• Атомная масса: 51.9\n• Год открытия: 1797")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_mn = findViewById(R.id.btn_mn);
        btn_mn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Марганец")
                        .setMessage("• Порядковый номер: 25\n• Период: 4\n• Группа: 7\n• Атомная масса: 54.9\n• Год открытия: 1774")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_fe = findViewById(R.id.btn_fe);
        btn_fe.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Железо")
                        .setMessage("• Порядковый номер: 26\n• Период: 4\n• Группа: 8\n• Атомная масса: 55.8\n• Год открытия: Доисторический период")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_co = findViewById(R.id.btn_co);
        btn_co.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Кобальт")
                        .setMessage("• Порядковый номер: 27\n• Период: 4\n• Группа: 9\n• Атомная масса: 58.9\n• Год открытия: 1735")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_ni = findViewById(R.id.btn_ni);
        btn_ni.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Никель")
                        .setMessage("• Порядковый номер: 28\n• Период: 4\n• Группа: 10\n• Атомная масса: 58.6\n• Год открытия: 1751")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_cu = findViewById(R.id.btn_cu);
        btn_cu.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Медь")
                        .setMessage("• Порядковый номер: 29\n• Период: 4\n• Группа: 11\n• Атомная масса: 63.5\n• Год открытия: Доисторический период")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_zn = findViewById(R.id.btn_zn);
        btn_zn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Цинк")
                        .setMessage("• Порядковый номер: 30\n• Период: 4\n• Группа: 12\n• Атомная масса: 65.4\n• Год открытия: Доисторический период")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_ga = findViewById(R.id.btn_ga);
        btn_ga.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Галлий")
                        .setMessage("• Порядковый номер: 31\n• Период: 4\n• Группа: 13\n• Атомная масса: 69.7\n• Год открытия: 1875")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_ge = findViewById(R.id.btn_ge);
        btn_ge.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Германий")
                        .setMessage("• Порядковый номер: 32\n• Период: 4\n• Группа: 14\n• Атомная масса: 72.6\n• Год открытия: 1886")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_as = findViewById(R.id.btn_as);
        btn_as.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Мышьяк")
                        .setMessage("• Порядковый номер: 33\n• Период: 4\n• Группа: 15\n• Атомная масса: 74.9\n• Год открытия: около 1250")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_se = findViewById(R.id.btn_se);
        btn_se.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Селен")
                        .setMessage("• Порядковый номер: 34\n• Период: 4\n• Группа: 16\n• Атомная масса: 78.9\n• Год открытия: 1817")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_br = findViewById(R.id.btn_br);
        btn_br.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Бром")
                        .setMessage("• Порядковый номер: 35\n• Период: 4\n• Группа: 17\n• Атомная масса: 79.9\n• Год открытия: 1826")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_kr = findViewById(R.id.btn_kr);
        btn_kr.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Криптон")
                        .setMessage("• Порядковый номер: 36\n• Период: 4\n• Группа: 18\n• Атомная масса: 83.7\n• Год открытия: 1898")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_rb = findViewById(R.id.btn_rb);
        btn_rb.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Рубидий")
                        .setMessage("• Порядковый номер: 37\n• Период: 5\n• Группа: 1\n• Атомная масса: 85.4\n• Год открытия: 1861")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_sr = findViewById(R.id.btn_sr);
        btn_sr.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Стронций")
                        .setMessage("• Порядковый номер: 38\n• Период: 5\n• Группа: 2\n• Атомная масса: 87.6\n• Год открытия: 1790")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_y = findViewById(R.id.btn_y);
        btn_y.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Иттрий")
                        .setMessage("• Порядковый номер: 39\n• Период: 5\n• Группа: 3\n• Атомная масса: 88.9\n• Год открытия: 1794")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_zr = findViewById(R.id.btn_zr);
        btn_zr.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Цирконий")
                        .setMessage("• Порядковый номер: 40\n• Период: 5\n• Группа: 4\n• Атомная масса: 91.2\n• Год открытия: 1789")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_nb = findViewById(R.id.btn_nb);
        btn_nb.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Ниобий")
                        .setMessage("• Порядковый номер: 41\n• Период: 5\n• Группа: 5\n• Атомная масса: 92.9\n• Год открытия: 1801")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_mo = findViewById(R.id.btn_mo);
        btn_mo.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Молибден")
                        .setMessage("• Порядковый номер: 42\n• Период: 5\n• Группа: 6\n• Атомная масса: 95.9\n• Год открытия: 1778")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_tc = findViewById(R.id.btn_tc);
        btn_tc.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Техниций")
                        .setMessage("• Порядковый номер: 43\n• Период: 5\n• Группа: 7\n• Атомная масса: 98.9\n• Год открытия: 1937")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_ru = findViewById(R.id.btn_ru);
        btn_ru.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Рутений")
                        .setMessage("• Порядковый номер: 44\n• Период: 5\n• Группа: 8\n• Атомная масса: 101\n• Год открытия: 1844")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_rh = findViewById(R.id.btn_rh);
        btn_rh.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Родий")
                        .setMessage("• Порядковый номер: 45\n• Период: 5\n• Группа: 9\n• Атомная масса: 102.9\n• Год открытия: 1803")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_pd = findViewById(R.id.btn_pd);
        btn_pd.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Палладий")
                        .setMessage("• Порядковый номер: 46\n• Период: 5\n• Группа: 10\n• Атомная масса: 106.4\n• Год открытия: 1803")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_ag = findViewById(R.id.btn_ag);
        btn_ag.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Серебро")
                        .setMessage("• Порядковый номер: 47\n• Период: 5\n• Группа: 11\n• Атомная масса: 107.8\n• Год открытия: Доисторический период")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_cd = findViewById(R.id.btn_cd);
        btn_cd.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Кадмий")
                        .setMessage("• Порядковый номер: 48\n• Период: 5\n• Группа: 12\n• Атомная масса: 112.4\n• Год открытия: 1817")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_in = findViewById(R.id.btn_in);
        btn_in.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Индий")
                        .setMessage("• Порядковый номер: 49\n• Период: 5\n• Группа: 13\n• Атомная масса: 114.8\n• Год открытия: 1863")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_sn = findViewById(R.id.btn_sn);
        btn_sn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Олово")
                        .setMessage("• Порядковый номер: 50\n• Период: 5\n• Группа: 14\n• Атомная масса: 118.7\n• Год открытия: Доисторический период")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_sb = findViewById(R.id.btn_sb);
        btn_sb.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Сурьма")
                        .setMessage("• Порядковый номер: 51\n• Период: 5\n• Группа: 15\n• Атомная масса: 121.7\n• Год открытия: Доисторический период")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_te = findViewById(R.id.btn_te);
        btn_te.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Теллур")
                        .setMessage("• Порядковый номер: 52\n• Период: 5\n• Группа: 16\n• Атомная масса: 127.6\n• Год открытия: 1782")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_i = findViewById(R.id.btn_i);
        btn_i.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Иод")
                        .setMessage("• Порядковый номер: 53\n• Период: 5\n• Группа: 17\n• Атомная масса: 126.9\n• Год открытия: 1811")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_xe = findViewById(R.id.btn_xe);
        btn_xe.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Ксенон")
                        .setMessage("• Порядковый номер: 54\n• Период: 5\n• Группа: 18\n• Атомная масса: 131.2\n• Год открытия: 1898")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_cs = findViewById(R.id.btn_cs);
        btn_cs.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Цезий")
                        .setMessage("• Порядковый номер: 55\n• Период: 6\n• Группа: 1\n• Атомная масса: 132.9\n• Год открытия: 1860")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_ba = findViewById(R.id.btn_ba);
        btn_ba.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Барий")
                        .setMessage("• Порядковый номер: 56\n• Период: 6\n• Группа: 2\n• Атомная масса: 137.3\n• Год открытия: 1808")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_la = findViewById(R.id.btn_la);
        btn_la.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Лантан")
                        .setMessage("• Порядковый номер: 57\n• Период: 6\n• Группа: 3\n• Атомная масса: 138.9\n• Год открытия: 1839")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_ce = findViewById(R.id.btn_ce);
        btn_ce.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Церий")
                        .setMessage("• Порядковый номер: 58\n• Период: 6\n• Группа: 4\n• Атомная масса: 140.1\n• Год открытия: 1803")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_pr = findViewById(R.id.btn_pr);
        btn_pr.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Празеодим")
                        .setMessage("• Порядковый номер: 59\n• Период: 6\n• Группа: 5\n• Атомная масса: 140.9\n• Год открытия: 1895")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_nd = findViewById(R.id.btn_nd);
        btn_nd.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Неодим")
                        .setMessage("• Порядковый номер: 60\n• Период: 6\n• Группа: -\n• Атомная масса: 144.2\n• Год открытия: 1895")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_pm = findViewById(R.id.btn_pm);
        btn_pm.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Прометий")
                        .setMessage("• Порядковый номер: 61\n• Период: 6\n• Группа: -\n• Атомная масса: 146.9\n• Год открытия: 1945")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_sm = findViewById(R.id.btn_sm);
        btn_sm.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Самарий")
                        .setMessage("• Порядковый номер: 62\n• Период: 6\n• Группа: -\n• Атомная масса: 150.3\n• Год открытия: 1879")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_eu = findViewById(R.id.btn_eu);
        btn_eu.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Европий")
                        .setMessage("• Порядковый номер: 63\n• Период: 6\n• Группа: -\n• Атомная масса: 151.9\n• Год открытия: 1901")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_gd = findViewById(R.id.btn_gd);
        btn_gd.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Гадолиний")
                        .setMessage("• Порядковый номер: 64\n• Период: 6\n• Группа: -\n• Атомная масса: 157.2\n• Год открытия: 1880")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_tb = findViewById(R.id.btn_tb);
        btn_tb.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Тербий")
                        .setMessage("• Порядковый номер: 65\n• Период: 6\n• Группа: -\n• Атомная масса: 158.9\n• Год открытия: 1843")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_dy = findViewById(R.id.btn_dy);
        btn_dy.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Диспрозий")
                        .setMessage("• Порядковый номер: 66\n• Период: 6\n• Группа: -\n• Атомная масса: 162.5\n• Год открытия: 1886")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_ho = findViewById(R.id.btn_ho);
        btn_ho.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Гольмий")
                        .setMessage("• Порядковый номер: 67\n• Период: 6\n• Группа: -\n• Атомная масса: 164.9\n• Год открытия: 1878")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_er = findViewById(R.id.btn_er);
        btn_er.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Эрбий")
                        .setMessage("• Порядковый номер: 68\n• Период: 6\n• Группа: -\n• Атомная масса: 167.2\n• Год открытия: 1842")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_tm = findViewById(R.id.btn_tm);
        btn_tm.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Тулий")
                        .setMessage("• Порядковый номер: 69\n• Период: 6\n• Группа: -\n• Атомная масса: 168.9\n• Год открытия: 1879")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_yb = findViewById(R.id.btn_yb);
        btn_yb.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Иттербий")
                        .setMessage("• Порядковый номер: 70\n• Период: 6\n• Группа: -\n• Атомная масса: 173\n• Год открытия: 1878")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_lu = findViewById(R.id.btn_lu);
        btn_lu.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Лютеций")
                        .setMessage("• Порядковый номер: 71\n• Период: 6\n• Группа: 3\n• Атомная масса: 174.9\n• Год открытия: 1907")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_hf = findViewById(R.id.btn_hf);
        btn_hf.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Гафний")
                        .setMessage("• Порядковый номер: 72\n• Период: 6\n• Группа: 4\n• Атомная масса: 178.4\n• Год открытия: 1923")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_ta = findViewById(R.id.btn_ta);
        btn_ta.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Тантал")
                        .setMessage("• Порядковый номер: 73\n• Период: 6\n• Группа: 5\n• Атомная масса: 180.9\n• Год открытия: 1802")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_w = findViewById(R.id.btn_w);
        btn_w.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Вольфрам")
                        .setMessage("• Порядковый номер: 74\n• Период: 6\n• Группа: 6\n• Атомная масса: 183.8\n• Год открытия: 1783")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_re = findViewById(R.id.btn_re);
        btn_re.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Рений")
                        .setMessage("• Порядковый номер: 75\n• Период: 6\n• Группа: 7\n• Атомная масса: 186.2\n• Год открытия: 1925")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_os = findViewById(R.id.btn_os);
        btn_os.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Осмий")
                        .setMessage("• Порядковый номер: 76\n• Период: 6\n• Группа: 8\n• Атомная масса: 190.2\n• Год открытия: 1803")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_ir = findViewById(R.id.btn_ir);
        btn_ir.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Иридий")
                        .setMessage("• Порядковый номер: 77\n• Период: 6\n• Группа: 9\n• Атомная масса: 192.2\n• Год открытия: 1803")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_pt = findViewById(R.id.btn_pt);
        btn_pt.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Платина")
                        .setMessage("• Порядковый номер: 78\n• Период: 6\n• Группа: 10\n• Атомная масса: 195\n• Год открытия: 1557")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_au = findViewById(R.id.btn_au);
        btn_au.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Золото")
                        .setMessage("• Порядковый номер: 79\n• Период: 6\n• Группа: 11\n• Атомная масса: 196.9\n• Год открытия: Доисторический период")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_hg = findViewById(R.id.btn_hg);
        btn_hg.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Ртуть")
                        .setMessage("• Порядковый номер: 80\n• Период: 6\n• Группа: 12\n• Атомная масса: 200.5\n• Год открытия: Доисторический период")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_tl = findViewById(R.id.btn_tl);
        btn_tl.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Таллий")
                        .setMessage("• Порядковый номер: 81\n• Период: 6\n• Группа: 13\n• Атомная масса: 204.3\n• Год открытия: 1861")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_pb = findViewById(R.id.btn_pb);
        btn_pb.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Свинец")
                        .setMessage("• Порядковый номер: 82\n• Период: 6\n• Группа: 14\n• Атомная масса: 207.2\n• Год открытия: Доисторический период")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_bi = findViewById(R.id.btn_bi);
        btn_bi.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Висмут")
                        .setMessage("• Порядковый номер: 83\n• Период: 6\n• Группа: 15\n• Атомная масса: 208.9\n• Год открытия: 1753")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_po = findViewById(R.id.btn_po);
        btn_po.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Полоний")
                        .setMessage("• Порядковый номер: 84\n• Период: 6\n• Группа: 16\n• Атомная масса: 208.9\n• Год открытия: 1898")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_at = findViewById(R.id.btn_at);
        btn_at.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Астат")
                        .setMessage("• Порядковый номер: 85\n• Период: 6\n• Группа: 17\n• Атомная масса: 209.9\n• Год открытия: 1940")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_rn = findViewById(R.id.btn_rn);
        btn_rn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Радон")
                        .setMessage("• Порядковый номер: 86\n• Период: 6\n• Группа: 18\n• Атомная масса: 222\n• Год открытия: 1900")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_fr = findViewById(R.id.btn_fr);
        btn_fr.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Франций")
                        .setMessage("• Порядковый номер: 87\n• Период: 7\n• Группа: 1\n• Атомная масса: 223\n• Год открытия: 1939")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_ra = findViewById(R.id.btn_ra);
        btn_ra.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Радий")
                        .setMessage("• Порядковый номер: 88\n• Период: 7\n• Группа: 2\n• Атомная масса: 226\n• Год открытия: 1898")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_ac = findViewById(R.id.btn_ac);
        btn_ac.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Актиний")
                        .setMessage("• Порядковый номер: 89\n• Период:7 \n• Группа: -\n• Атомная масса: 227\n• Год открытия: 1899")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_th = findViewById(R.id.btn_th);
        btn_th.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Торий")
                        .setMessage("• Порядковый номер: 90\n• Период:7 \n• Группа: -\n• Атомная масса: 232\n• Год открытия: 1829")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_pa = findViewById(R.id.btn_pa);
        btn_pa.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Протактиний")
                        .setMessage("• Порядковый номер: 91\n• Период: 7\n• Группа: -\n• Атомная масса: 231\n• Год открытия: 1917")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_u = findViewById(R.id.btn_u);
        btn_u.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Уран")
                        .setMessage("• Порядковый номер: 92\n• Период: 7\n• Группа: -\n• Атомная масса: 238\n• Год открытия: 1789")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_np = findViewById(R.id.btn_np);
        btn_np.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Нептуний")
                        .setMessage("• Порядковый номер: 93\n• Период: 7\n• Группа: -\n• Атомная масса: 237\n• Год открытия: 1940")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_pu = findViewById(R.id.btn_pu);
        btn_pu.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Плутоний")
                        .setMessage("• Порядковый номер: 94\n• Период: 7\n• Группа: -\n• Атомная масса: 244\n• Год открытия: 1940")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_am = findViewById(R.id.btn_am);
        btn_am.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Америций")
                        .setMessage("• Порядковый номер: 95\n• Период: 7\n• Группа: -\n• Атомная масса: 243\n• Год открытия: 1944")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_cm = findViewById(R.id.btn_cm);
        btn_cm.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Кюрий")
                        .setMessage("• Порядковый номер: 96\n• Период: 7\n• Группа: -\n• Атомная масса: 247\n• Год открытия: 1944")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_bk = findViewById(R.id.btn_bk);
        btn_bk.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Берклий")
                        .setMessage("• Порядковый номер: 97\n• Период: 7\n• Группа: -\n• Атомная масса: 247\n• Год открытия: 1949")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_cf = findViewById(R.id.btn_cf);
        btn_cf.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Калифорний")
                        .setMessage("• Порядковый номер: 98\n• Период: 7\n• Группа: -\n• Атомная масса: 251\n• Год открытия: 1950")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_es = findViewById(R.id.btn_es);
        btn_es.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Эйнштейний")
                        .setMessage("• Порядковый номер: 99\n• Период: 7\n• Группа: -\n• Атомная масса: 252\n• Год открытия: 1952")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_fm = findViewById(R.id.btn_fm);
        btn_fm.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Фермий")
                        .setMessage("• Порядковый номер: 100\n• Период: 7\n• Группа: -\n• Атомная масса: 257\n• Год открытия: 1952")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_md = findViewById(R.id.btn_md);
        btn_md.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Менделевий")
                        .setMessage("• Порядковый номер: 101\n• Период: 7\n• Группа: -\n• Атомная масса: 258\n• Год открытия: 1955")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_no = findViewById(R.id.btn_no);
        btn_no.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Нобелий")
                        .setMessage("• Порядковый номер: 102\n• Период: 7\n• Группа: -\n• Атомная масса: 259.1\n• Год открытия: 1965")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_lr = findViewById(R.id.btn_lr);
        btn_lr.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Лоуренсий")
                        .setMessage("• Порядковый номер: 103\n• Период: 7\n• Группа: 3\n• Атомная масса: 266\n• Год открытия: 1961")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_rf = findViewById(R.id.btn_rf);
        btn_rf.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Резерфордий")
                        .setMessage("• Порядковый номер: 104\n• Период: 7\n• Группа: 4\n• Атомная масса: 267\n• Год открытия: 1964/69")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_db = findViewById(R.id.btn_db);
        btn_db.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Дубний")
                        .setMessage("• Порядковый номер: 105\n• Период: 7\n• Группа: 5\n• Атомная масса: 268\n• Год открытия: 1967/70")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_sg = findViewById(R.id.btn_sg);
        btn_sg.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Сиборгий")
                        .setMessage("• Порядковый номер: 106\n• Период: 7\n• Группа: 6\n• Атомная масса: 269\n• Год открытия: 1974")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_bh = findViewById(R.id.btn_bh);
        btn_bh.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Борий")
                        .setMessage("• Порядковый номер: 107\n• Период: 7\n• Группа: 7\n• Атомная масса: 270\n• Год открытия: 1976")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_hs = findViewById(R.id.btn_hs);
        btn_hs.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Хассий")
                        .setMessage("• Порядковый номер: 108\n• Период: 7\n• Группа: 8\n• Атомная масса: \n• Год открытия: 1984")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_mt1 = findViewById(R.id.btn_mt1);
        btn_mt1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Мейтнерий")
                        .setMessage("• Порядковый номер: 109\n• Период: 7\n• Группа: 9\n• Атомная масса: 278\n• Год открытия: 1982")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_ds = findViewById(R.id.btn_ds);
        btn_ds.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Дармштадтий")
                        .setMessage("• Порядковый номер: 110\n• Период: 7\n• Группа: 10\n• Атомная масса: 281\n• Год открытия: 1994")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_rg = findViewById(R.id.btn_rg);
        btn_rg.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Рентгений")
                        .setMessage("• Порядковый номер: 111\n• Период: 7\n• Группа: 11\n• Атомная масса: 282\n• Год открытия: 1994")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_cn = findViewById(R.id.btn_cn);
        btn_cn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Коперниций")
                        .setMessage("• Порядковый номер: 112\n• Период: 7\n• Группа: 12\n• Атомная масса: 285\n• Год открытия: 1996")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_nh = findViewById(R.id.btn_nh);
        btn_nh.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Нихоний")
                        .setMessage("• Порядковый номер: 113\n• Период: 7\n• Группа: 13\n• Атомная масса: 286\n• Год открытия: 2004")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_fl = findViewById(R.id.btn_fl);
        btn_fl.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Флоренций")
                        .setMessage("• Порядковый номер: 114\n• Период: 7\n• Группа: 14\n• Атомная масса: 289\n• Год открытия: 1999")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_mc = findViewById(R.id.btn_mc);
        btn_mc.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Московий")
                        .setMessage("• Порядковый номер: 115\n• Период: 7\n• Группа: 15\n• Атомная масса: 290\n• Год открытия: 2004")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_lv = findViewById(R.id.btn_lv);
        btn_lv.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Ливермрпий")
                        .setMessage("• Порядковый номер: 116\n• Период: 7\n• Группа: 16\n• Атомная масса: 293\n• Год открытия: 2000")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_ts = findViewById(R.id.btn_ts);
        btn_ts.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Теннессин")
                        .setMessage("• Порядковый номер: 117\n• Период: 7\n• Группа: 17\n• Атомная масса: 294\n• Год открытия: 2010")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        LinearLayout btn_og = findViewById(R.id.btn_og);
        btn_og.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(ElementsActivity.this);
                builder.setTitle("Органесон")
                        .setMessage("• Порядковый номер: 118\n• Период: 7\n• Группа: 18\n• Атомная масса: 294\n• Год открытия: 2004")
//                        .setIcon(R.drawable.el1)
                        .setCancelable(true)
                        .setNegativeButton("ЗАКРЫТЬ",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
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
