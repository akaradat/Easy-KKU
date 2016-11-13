package kku.kmnc.akaradat.easykku;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

/**
 * Created by Array on 13/11/2559.
 */

public class MyAdapter extends BaseAdapter{

    //Explicit
    private Context context;
    private String[] nameStrings,phoneStrings, imageStrings;
    private TextView nameTextView, phoneTextView;
    private ImageView imageView;

    public MyAdapter(Context context,
                     String[] nameStrings,
                     String[] phoneStrings,
                     String[] imageStrings) {
        this.context = context;
        this.nameStrings = nameStrings;
        this.phoneStrings = phoneStrings;
        this.imageStrings = imageStrings;
    }

    @Override
    public int getCount() {
        return nameStrings.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view1 = layoutInflater.inflate(R.layout.my_layout, viewGroup, false);

        //Bind Widget
        nameTextView = (TextView) view1.findViewById(R.id.textView2);
        phoneTextView = (TextView) view1.findViewById(R.id.textView3);
        imageView = (ImageView) view1.findViewById(R.id.imageView3);

        //Show View
        nameTextView.setText(nameStrings[i]);
        phoneTextView.setText(phoneStrings[i]);

        Picasso.with(context).load(imageStrings[i]).into(imageView);

        return view1;
    }
}   //Main Class
