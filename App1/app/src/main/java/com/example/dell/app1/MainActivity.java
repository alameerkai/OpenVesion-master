package com.example.dell.app1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    private int[] img = new int[]{R.drawable.p1, R.drawable.p2, R.drawable.p3, R.drawable.p4, R.drawable.p5};

    private String[] name ={"INESTA","MERAM","PIQUE","SUAREZ","MESSI"};

    private String[] des = {"MCD" , "LW" , "CB" , "CF" ,"SS" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        public void buttonOnClick(view v) {

            ImageButton imageButton = (ImageButton)v;
            startActivity(new Intent(getApplicationContext(),Main2Activity.class));

        }



        ListView listView = (ListView)findViewById(R.id.list_news);
        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);


    }



    class CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return img.length;
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
        public View getView(int i, View convertView, ViewGroup parent) {
                    convertView = getLayoutInflater().inflate(R.layout.listvplayers,null);

            ImageView imageView = (ImageView)convertView.findViewById(R.id.imageView1);
            TextView textView = (TextView)convertView.findViewById(R.id.textPlayer);
            TextView textView1 = (TextView)convertView.findViewById(R.id.textdes);

            imageView.setImageResource(img[i]);
            textView.setText(name[i]);
            textView1.setText(des[i]);








            return null;
        }


    }
}
