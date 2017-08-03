package com.appizona.openvision;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by yehia on 29/07/17.
 */

public class PersonAdapter extends BaseAdapter {


    private List<Person> list;
    private Context mContext;


    public PersonAdapter(List<Person> list, Context mContext) {
        this.list = list;
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = convertView;
        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.item_list, parent, false);
        }


        ImageView imageView = (ImageView) view.findViewById(R.id.item_img);
        TextView nameTV = (TextView) view.findViewById(R.id.item_name);
        TextView descriptionTV = (TextView) view.findViewById(R.id.item_description);

        Person person = list.get(position);

//        imageView.setImageResource(person.getImg());
        Picasso.with(mContext)
                .load(person.getImg())
                .placeholder(R.drawable.profile3)
                .error(R.drawable.profile4)
                .into(imageView);

        nameTV.setText(person.getName());
        descriptionTV.setText(person.getDescription());

        return view;
    }
}
