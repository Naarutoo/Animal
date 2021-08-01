package com.example.animal;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class AnimalAdapter extends RecyclerView.Adapter<AnimalViewHolder> {
    ArrayList<Animal>animalList;
    public AnimalAdapter(ArrayList<Animal> animalList )
    { this.animalList = animalList;
    }

    @NonNull
    @Override
    public AnimalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.singlerow,parent,false);
        return new AnimalViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AnimalViewHolder holder, int position) {
Animal animal = animalList.get(position);
holder.setData(animal);
    }

    @Override
    public int getItemCount() {
        return animalList.size();
    }
}
