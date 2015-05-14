package com.example.jack.myapplication3listview;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyRowAdapter extends ArrayAdapter<String> {

    public MyRowAdapter(Context context, String[] values) {
        super(context,R.layout.row_layout2, values);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater theInflater = LayoutInflater.from(getContext());

        View theview = theInflater.inflate(R.layout.row_layout2, parent, false);

        String oneTvShow = getItem(position);
        TextView oneTextview = (TextView) theview.findViewById(R.id.textView1);
        oneTextview.setText(oneTvShow);
        ImageView oneImageview = (ImageView) theview.findViewById(R.id.imageView1);
        oneImageview.setImageResource(R.drawable.dot);


        return  theview;




        
    }
}
