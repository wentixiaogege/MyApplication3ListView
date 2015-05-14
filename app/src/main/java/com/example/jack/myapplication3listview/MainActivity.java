package com.example.jack.myapplication3listview;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] tvShows = {"Pushing Daisies", "Better Off Ted", "Twin Peaks",
                "Freaks and Geeks", "Orphan Black", "Walking Dead", "Breaking Bad", "The 400", "Alphas", "Life on Mars"
        };
//        ListAdapter theAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,tvShows);
//        ListAdapter theAdapter = new ArrayAdapter<String>(this,R.layout.row_layout,tvShows);
        ListAdapter theAdapter = new MyRowAdapter(this,tvShows);
        ListView theListView = (ListView)findViewById(R.id.myListView);
        theListView.setAdapter(theAdapter);

        theListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String getPosition = "you selected "+ String.valueOf(parent.getItemAtPosition(position));

                Toast.makeText(MainActivity.this,getPosition,Toast.LENGTH_SHORT).show();
            }
        });

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
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
