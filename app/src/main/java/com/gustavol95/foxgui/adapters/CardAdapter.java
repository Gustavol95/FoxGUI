package com.gustavol95.foxgui.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.gustavol95.foxgui.R;
import com.gustavol95.foxgui.models.TVShow;

import java.util.List;

/**
 * Created by Tavo on 01/09/2016.
 */
public class CardAdapter extends RecyclerView.Adapter<CardAdapter.ViewHolder> {

    List<TVShow> list;
    Context context;
    public  CardAdapter(List<TVShow> list , Context ctx)
    {
        this.list=list;
        context=ctx;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cardview_recycler, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.tvShow=getItem(position);
        holder.text.setText(list.get(position).getName());
        holder.image.setImageResource(list.get(position).getImage());
    }
    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public TVShow getItem(int position)
    {
        return  list.get(position);
    }
    public class ViewHolder extends RecyclerView.ViewHolder
    {
        ImageView image;
        TextView text;
        TVShow tvShow;
        public ViewHolder(View itemView){
            super(itemView);
            image=(ImageView)itemView.findViewById(R.id.imageCard);
            text=(TextView)itemView.findViewById(R.id.textCard);

        }
    }




}
