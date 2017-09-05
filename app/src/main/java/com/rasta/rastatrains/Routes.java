package com.rasta.rastatrains;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import static com.rasta.rastatrains.R.id.destination;
import static com.rasta.rastatrains.R.id.location;

public class Routes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_routes);

        ArrayList<Ticket> tickets = new ArrayList<Ticket>();

        for(int i = 0; i < 20; i ++){

            tickets.add(new Ticket("Liverpool merseySide", "Manchester Picadilly", "Monday", "April", "Tuesday","April"));
        }


        RouteAdapter routeAdapter = new RouteAdapter(this, tickets);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(routeAdapter);
    }
}
