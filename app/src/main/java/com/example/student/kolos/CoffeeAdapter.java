package com.example.student.kolos;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

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
        holder.setName(coffees.get(position).getName());
        holder.setPrice(coffees.get(position).getPrice() + "");
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
        @BindView(R.id.obraz)
        ImageView obraz;
        @OnClick(R.id.btn_wybierz)
        void onNameClick(){
            if(obraz.getVisibility()==View.INVISIBLE){
                obraz.setVisibility(View.VISIBLE);
            }
            else{
                obraz.setVisibility(View.INVISIBLE);
            }
        }

   

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            obraz.setVisibility(View.INVISIBLE);
        }

        public void setName(String name) {
            txt_kawa.setText(name);
        }

        public void setPrice(String price) {
            txt_cena.setText(price);
        }
    }
}
