package com.example.liste_fruit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

  private ListView liste ;
  private TextView res;
  private ImageView image;
  int i ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String[] listItem = getResources().getStringArray(R.array.array_fruit);
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.mylist,R.id.texte,listItem);
            this.liste = (ListView) findViewById(R.id.liste);
            this.res = (TextView) findViewById(R.id.res);
           image = (ImageView) findViewById(R.id.img);
        image.setImageResource(R.drawable.pomme);
        image.setImageResource(R.drawable.kiwi);
        image.setImageResource(R.drawable.banane);
        image.setImageResource(R.drawable.banane);
        image.setImageResource(R.drawable.poire);
        image.setImageResource(R.drawable.figue);
        image.setImageResource(R.drawable.raisin);
        image.setImageResource(R.drawable.abrico);
        image.setImageResource(R.drawable.datte);
            liste.setAdapter(adapter);
            liste.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long id) {
                    String valeur = adapter.getItem(i);
                    res.setText("vous avez choisis : " +valeur) ;

                    if (valeur.equalsIgnoreCase("pomme")) {
                        image.setImageResource(R.drawable.pomme);
                    }
                    if (valeur.equalsIgnoreCase("kiwi")) {
                        image.setImageResource(R.drawable.kiwi);
                    }
                    if (valeur.equalsIgnoreCase("banane")) {
                        image.setImageResource(R.drawable.banane);
                    }
                    if (valeur.equalsIgnoreCase("poire")) {
                        image.setImageResource(R.drawable.poire);
                    }
                    if (valeur.equalsIgnoreCase("figue")) {
                        image.setImageResource(R.drawable.figue);
                    }
                    if (valeur.equalsIgnoreCase("abrico"))
                    {
                        image.setImageResource(R.drawable.abrico);
                    }
                    if (valeur.equalsIgnoreCase("raisain")) {
                        image.setImageResource(R.drawable.raisin);
                    }
                    if (valeur.equalsIgnoreCase("datte")) {
                        image.setImageResource(R.drawable.datte);
                    }


                }
            });


    }
}
