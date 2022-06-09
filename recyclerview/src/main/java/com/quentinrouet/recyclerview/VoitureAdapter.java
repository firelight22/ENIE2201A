package com.quentinrouet.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

/**
 * Created by quentin for AndroKado on 09/06/2022.
 */
public class VoitureAdapter extends RecyclerView.Adapter<VoitureAdapter.VoitureViewHolder> {
    ArrayList<Voiture> dataSource;

    public VoitureAdapter(ArrayList<Voiture> dataSource) {
        this.dataSource = dataSource;
    }

    class VoitureViewHolder extends RecyclerView.ViewHolder{
        TextView textViewEnergie, textViewModele;
        public VoitureViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewEnergie = itemView.findViewById(R.id.textViewEnergie);
            textViewModele = itemView.findViewById(R.id.textViewModele);
        }
    }

    @NonNull
    @Override
    public VoitureViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //Transforme un layout en une Vue
        View itemView =  LayoutInflater.from(parent.getContext()).inflate(R.layout.item_voiture, parent, false);
        return new VoitureViewHolder(itemView);
    }

    //Va être appelé à chaque fois qu'un élément de notre liste est à afficher avec la "position"
    @Override
    public void onBindViewHolder(@NonNull VoitureViewHolder holder, int position) {
        Voiture voiture = dataSource.get(position);
        holder.textViewEnergie.setText(voiture.getEnergie());
        holder.textViewModele.setText(voiture.getModele());
    }

    @Override
    public int getItemCount() {
        return dataSource.size();
    }





}
