package kku.kmnc.akaradat.easykku;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class ServiceActivity extends AppCompatActivity {

    //Explicit
    private ListView listView;
    private String[] nameStrings,phoneStrings, imageStrings;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);

        //Blind Widget
        listView = (ListView) findViewById(R.id.livFriend);

        //Receive Value From Intent
        nameStrings = getIntent().getStringArrayExtra("Name");
        phoneStrings = getIntent().getStringArrayExtra("Phone");
        imageStrings = getIntent().getStringArrayExtra("Image");

        //Create Listview
        MyAdapter myAdapter = new MyAdapter(ServiceActivity.this, nameStrings
                , phoneStrings, imageStrings);
        listView.setAdapter(myAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                confirmCall(nameStrings[i], phoneStrings[i]);

            }// onItemClcik
        });

    }   //Main Method

    private void confirmCall(String nameString, String phoneString) {

    }
}   //Main Class
