package com.example.nicolas.relojes;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BlankFragment prueba1 = new BlankFragment();
        prueba1.nombre = "America/New_York";
        BlankFragment prueba2 = new BlankFragment();
        prueba2.nombre = "America/Buenos_Aires";
        BlankFragment prueba3 = new BlankFragment();
        prueba3.nombre = "Asia/Shanghai";

        BlankFragment prueba4 = new BlankFragment();
        prueba4.nombre = "Europe/Moscow";
        BlankFragment prueba5 = new BlankFragment();
        prueba5.nombre = "Europe/Berlin";
        BlankFragment prueba6 = new BlankFragment();
        prueba6.nombre = "Europe/Budapest";

       FragmentManager fm = getFragmentManager();
       FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.prueba1, prueba1, "Prueba1");
        ft.add(R.id.prueba2, prueba2, "Prueba2");
        ft.add(R.id.prueba3, prueba3, "Prueba3");
        ft.add(R.id.prueba4, prueba4, "Prueba1");
        ft.add(R.id.prueba5, prueba5, "Prueba2");
        ft.add(R.id.prueba6, prueba6, "Prueba3");
        ft.commit();


    }
}
