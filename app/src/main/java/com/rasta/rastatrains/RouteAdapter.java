package com.rasta.rastatrains;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by triumph on 2017-05-02.
 */

public class RouteAdapter extends ArrayAdapter<Ticket> {


    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context        The current context. Used to inflate the layout file.
     * @param tickets A List of AndroidFlavor objects to display in a list
     */
    public RouteAdapter(Activity context, ArrayList<Ticket> tickets){

        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, tickets);
    }



    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_routes, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Ticket currentTicket = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView locationTextView = (TextView) listItemView.findViewById(R.id.location);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        locationTextView.setText(currentTicket.getLocation());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView destinationTextView = (TextView) listItemView.findViewById(R.id.destination);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        destinationTextView.setText(currentTicket.getDestination());


        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView dayNameTextView = (TextView) listItemView.findViewById(R.id.dayName);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        dayNameTextView.setText(currentTicket.getArrDayName());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView dayNumTextView = (TextView) listItemView.findViewById(R.id.dayNum);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        dayNumTextView.setText(currentTicket.getArrDayNo());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView arrMonthTextView = (TextView) listItemView.findViewById(R.id.month);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        arrMonthTextView.setText(currentTicket.getArrMonth());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView arrivalTimeTextView = (TextView) listItemView.findViewById(R.id.arrivaltime);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        arrivalTimeTextView.setText(currentTicket.getArrivalTime());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView depatureTimeTextView = (TextView) listItemView.findViewById(R.id.depaturetime);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        depatureTimeTextView.setText(currentTicket.getDepartureTime());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView priceTextView = (TextView) listItemView.findViewById(R.id.price);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        priceTextView.setText(currentTicket.getPrice());


        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }


}
