package com.example.student.kolos;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;

/**
 * Created by student on 2018-01-03.
 */

public class CoffeeAdapter  extends RecyclerView.Adapter<CoffeeAdapter.ViewHolder>{

    ArrayList<Coffee>coffees=new ArrayList<>();

    public CoffeeAdapter(ArrayList<Coffee> coffees) {
        this.coffees = coffees;
    }

    @Override
    public CoffeeAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemLayoutView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item, null);
        return new ViewHolder(itemLayoutView);
    }

    @Override
    public void onBindViewHolder(CoffeeAdapter.ViewHolder holder, int position) {
        holder.setName(coffees.get(position).getPlaceName());
        holder.setPrice(coffees.get(position).getInformation() + "");
    }

    @Override
    public int getItemCount() {
        return coffees.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.txt_kawa)
        TextView txt_kawa;
        @BindView(R.id.txt_cena)
        TextView txt_cena;

        public ViewHolder(View itemView) {
            super(itemView);
        }
    }
}
