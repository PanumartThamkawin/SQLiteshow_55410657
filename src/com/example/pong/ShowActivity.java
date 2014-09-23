package com.example.pong;

import java.util.ArrayList;
import java.util.HashMap;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class ShowActivity extends Activity{
	private ListView ListView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.show);
		ListView = (ListView) findViewById(R.id.listView1);
		My my = new My(this);
		ArrayList<HashMap<String, String>> arrayList = my.
				SelectAllData();
		
		SimpleAdapter adapter;
		adapter = new SimpleAdapter(ShowActivity.this, arrayList,
				R.layout.show_item, new String[] { "MemberID", "Name", "Tel" }, 
				new int[] {R.id.ColMemberID,R.id.ColName,R.id.ColTel});
		ListView.setAdapter(adapter);
	}

}
