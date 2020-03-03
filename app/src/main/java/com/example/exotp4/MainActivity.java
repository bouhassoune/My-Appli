package com.example.exotp4;

import android.os.Bundle;

import com.example.exotp4.R;
import com.example.exotp4.ui.main.SectionsPagerAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.exotp4.ui.main.SectionsPagerAdapter;
import androidx.appcompat.widget.Toolbar;




public class MainActivity extends AppCompatActivity {

    private MenuItem item;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);


        // Créer un adaptateur qui retourne un fragment
// pour chacune des sections de l'activité
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());

// dire au viewpager d'utiliser cet adaptateur
        viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        switch (id){
            case R.id.action_image:
                // Toast.makeText(this, "action image est cliquée", Toast.LENGTH_LONG).show();
                Snackbar.make(viewPager,"action title est cliquée",Snackbar.LENGTH_LONG).show();
                break;

            case R.id.action_bar_title:

                //Toast.makeText(this, "action title est cliquée", Toast.LENGTH_LONG).show();
                Snackbar.make(viewPager,"action title est cliquée",Snackbar.LENGTH_LONG).show();
                break;

            case R.id.action_settings:

                //Toast.makeText(this, "action title est cliquée", Toast.LENGTH_LONG).show();
                Snackbar.make(viewPager,"action settings est cliquée",Snackbar.LENGTH_LONG).show();
                break;


        }

        return super.onOptionsItemSelected(item);
    }
}
