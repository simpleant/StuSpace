package com.antwei.fragmentstu.activity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class MenuActivity extends ListActivity{

	private static String[] activitys = {"MainActivity","test","test","test"};
	private Intent intent;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_list_item_1, activitys);
		setListAdapter(adapter);
	}


	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		String className = activitys[position];
		System.out.println("com.antwei.fragmentstu.activity."+className);
		Class myClass;
		
		try {
			myClass = Class.forName("com.antwei.fragmentstu.activity."+className);
			Toast.makeText(getBaseContext(), myClass.toString(), Toast.LENGTH_SHORT).show();
			intent = new Intent(getBaseContext(),myClass);
			startActivity(intent);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("没有找到"+className);
			e.printStackTrace();
		}
	}

}
