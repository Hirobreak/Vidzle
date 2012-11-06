package com.example.rompecabezasmenu;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
    	inflater.inflate(R.menu.menu_principal, menu);
        return super.onCreateOptionsMenu(menu);
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
     switch (item.getItemId()) {
     case R.id.itemAyuda:
    	 Toast.makeText(getApplicationContext(),"Mueve las piezas del " +
    	 		"rompecabezas hecho con el video arrastrandolas" +
    	 		" con la pantalla tactil, giralas rotando tu smart-phone  y logra formar" +
    	 		" el paisaje o la acividad que estas filmando" , Toast.LENGTH_LONG).show();
      // Acciones
      //return true;
    	 break;
     case R.id.itemAcercaDe:
    	 Toast.makeText(getApplicationContext(),"Vidzle V.0.1.1 \n Leonardo Tamayo \n" +
    	 		"Pedro Iñiguez \n Carlos Caicedo" , Toast.LENGTH_LONG).show();
      // Acciones
      //return true;
    	 break;
     case R.id.itemStart:
    	 Toast.makeText(getApplicationContext(),"Pasara a la ventana" +
    	 		" de seleccion de nivel" , Toast.LENGTH_LONG).show();
      // Acciones
      //return true;
    	 break;
     default:
     }
	return false;
    }
}
