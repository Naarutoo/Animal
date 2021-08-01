package com.example.animal;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.utils.widget.ImageFilterView;
import androidx.recyclerview.widget.RecyclerView;
public class AnimalViewHolder extends RecyclerView.ViewHolder {
    private ImageView mivImage;
    private TextView mtvName;
    private TextView mtvType;
    public AnimalViewHolder(@NonNull View itemView) {
        super(itemView);
        initview();
    }

    private void initview() {
    mivImage = itemView.findViewById(R.id.ivImage);
    mtvName = itemView.findViewById(R.id.tvName);
    mtvType = itemView.findViewById(R.id.tvType);
    }
    public void setData(Animal animal){
        mivImage.setImageResource(animal.getImage());
        mtvName.setText(animal.getName());
        mtvType.setText(animal.getType());
    }
}
