package com.develop.mauriciodinki.tvify.ui.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.develop.mauriciodinki.tvify.R;
import com.develop.mauriciodinki.tvify.domain.Show;
import com.develop.mauriciodinki.tvify.io.model.ShowsResponse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by mauriciodinki on 23/12/15.
 */
public class ShowListAdapter extends RecyclerView.Adapter<ShowListAdapter.ShowListViewHolder> {

    ArrayList <Show> shows;
    Context context;

    public ShowListAdapter(Context context) {
        this.context = context;
        this.shows = new ArrayList<>();
    }

    @Override
    public ShowListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context)
                .inflate(R.layout.item_show, parent, false);

        return new ShowListViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ShowListViewHolder holder, int position) {
        Show currentShow = shows.get(position);

        holder.setShowName(currentShow.getName());
    }

    @Override
    public int getItemCount() {
        return shows.size();
    }

    public void addAll(@NonNull ShowsResponse shows){
        if (shows == null)
            throw  new NullPointerException("The items cannot be null");

        this.shows.addAll((Collection<? extends Show>) shows);
        notifyDataSetChanged();
    }

    public class ShowListViewHolder extends RecyclerView.ViewHolder{

        TextView showName;
        ImageView showImage;

        public ShowListViewHolder(View itemView) {
            super(itemView);

            showName = (TextView) itemView.findViewById(R.id.txt_name);
            showImage = (ImageView) itemView.findViewById(R.id.img_show);
        }

        public void setShowName (String name){
            showName.setText(name);
        }
    }
}
