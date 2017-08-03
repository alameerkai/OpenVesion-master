package com.appizona.openvision;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
//        RecyclerView.LayoutManager manager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecyclerAdapter adapter = new RecyclerAdapter(createDummyData(), this);
        recyclerView.setAdapter(adapter);

    }

    private List<Person> createDummyData() {

        List<Person> persons = new ArrayList<>();

        Person p = new Person();
        p.setName("Yehia");
        p.setDescription("Hey my name is mohamed yehia and Iam an android developer");
        p.setImg("https://firebasestorage.googleapis.com/v0/b/ai-calendar-3ff7b.appspot.com/o/users%2FPiVKAe4Y4zXP3glujlifSmKUCUE2%2F83397?alt=media&token=479fc702-4cd1-4ffd-bfe8-28626104eb56");

        Person p2 = new Person();
        p2.setName("Mohamed ");
        p2.setDescription("Hey my name is mohamed yehia and Iam an android developer");
        p2.setImg("https://firebas21212estorage.googleapis.com/v0/b/ai-calendar-3ff7b.appspot.com/o/users%2FPiVKAe4Y4zXP3glujlifSmKUCUE2%2F83397?alt=media&token=479fc702-4cd1-4ffd-bfe8-28626104eb56");

        persons.add(p);
        persons.add(p2);
        persons.add(p);
        persons.add(p2);
        persons.add(p);
        persons.add(p);
        persons.add(p2);
        persons.add(p);
        persons.add(p);
        persons.add(p);
        persons.add(p);
        persons.add(p);
        persons.add(p);
        persons.add(p);
        persons.add(p);
        persons.add(p);
        persons.add(p);
        persons.add(p);
        persons.add(p);
        persons.add(p);
        persons.add(p);
        persons.add(p);
        persons.add(p);
        persons.add(p);
        persons.add(p);
        persons.add(p);
        persons.add(p);
        persons.add(p);
        persons.add(p);
        persons.add(p);
        persons.add(p);

        return persons;
    }
}
