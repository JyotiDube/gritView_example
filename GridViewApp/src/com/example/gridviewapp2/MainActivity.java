package com.example.gridviewapp2;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;

public class MainActivity extends Activity {

	
	GridView gridview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        gridview =(GridView) findViewById(R.id.grid_View);
        gridview.setAdapter(new ImageAdapter(MainActivity.this));
       
         gridview.setAdapter(new ImageAdapter(MainActivity.this));
         gridview.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View v, int position,
					long id) {
				Intent i=new Intent(MainActivity.this,SingleViewActivity.class);
				i.putExtra("id", position);
				startActivity(i);
				
				
				// TODO Auto-generated method stub
				
			}
		});
		

    }
    
    

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
