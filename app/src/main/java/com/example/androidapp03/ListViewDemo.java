package com.example.androidapp03;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListViewDemo extends Activity {
	ArrayList<String> lst = new ArrayList<String>();
	private ListView lstView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_list_view_demo);
		
		lst.add("Egypt");
		lst.add("USA");
		lst.add("UK");		
		lst.add("Iraq");		
		lst.add("Lybia");		
		lst.add("Alex");
		
		
		
		lstView = (ListView)findViewById(R.id.listView1);
		
		ArrayAdapter<String> ad = 
				new ArrayAdapter<String>(getApplicationContext(), android.R.layout.browser_link_context_header,lst);		
		lstView.setAdapter(ad);
		
		lstView.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int position,
					long arg3) {
	 
				Toast.makeText(getApplicationContext(),"Position is : " +position +" Selected Item is : " + lstView.getItemAtPosition(position) 
						, Toast .LENGTH_SHORT).show();
			}
			
		});
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.list_view_demo, menu);
		return true;
	}

	class MyAdapter extends ArrayAdapter<String>
	{
		MyAdapter(Context ctx,int res,List lst)
		{
			super(ctx,res,lst);
		}
		
		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			// TODO Auto-generated method stub
			return super.getView(position, convertView, parent);
		}
	}
	
}



