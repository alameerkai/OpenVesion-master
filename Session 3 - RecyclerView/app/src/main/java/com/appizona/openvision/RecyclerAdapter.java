package com.appizona.openvision;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by yehia on 29/07/17.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerHolder> {

    private List<Person> list;
    private Context mContext;

    public RecyclerAdapter(List<Person> list, Context mContext) {
        this.list = list;
        this.mContext = mContext;
    }

    @Override
    public RecyclerAdapter.RecyclerHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(mContext).inflate(R.layout.item_list, parent, false);

        return new RecyclerHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerAdapter.RecyclerHolder holder, final int position) {

        Person person = list.get(position);
        holder.name.setText(person.getName());
        holder.description.setText(person.getDescription());

        Picasso.with(mContext)
                .load(person.getImg())
                .error(R.drawable.profile4)
                .placeholder(R.drawable.profile3)
                .into(holder.imageView);


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "position " + position, Toast.LENGTH_SHORT).show();
            }
        });

        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "position Image " + position, Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class RecyclerHolder extends RecyclerView.ViewHolder {

        private ImageView imageView;
        private TextView name;
        private TextView description;


        public RecyclerHolder(View view) {
            super(view);
            imageView = (ImageView) view.findViewById(R.id.item_img);
            name = (TextView) view.findViewById(R.id.item_name);
            description = (TextView) view.findViewById(R.id.item_description);
        }
    }
}
