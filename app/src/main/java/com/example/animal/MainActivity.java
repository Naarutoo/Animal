package com.example.animal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private RecyclerView recyclerView;
private ArrayList<Animal>animalList  = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    initviews();
    buildAnimallist();
    setRecyclerView();

    }

    private void initviews() {
    recyclerView = findViewById(R.id.recyclerView);
    }
    private void buildAnimallist(){
        for (int i=0;i<=10;i++){
            Animal animal = new Animal(R.drawable.kurama,"Kurama","Maneater");
            animalList.add(animal);
        }
        for (int i=0;i<=10;i++){
            Animal animal = new Animal(R.drawable.shukaku,"Shukaku","Friendly");
            animalList.add(animal);
        }
    }
    private void setRecyclerView(){
        AnimalAdapter animalAdapter = new AnimalAdapter(animalList);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(animalAdapter);
    }

    }
