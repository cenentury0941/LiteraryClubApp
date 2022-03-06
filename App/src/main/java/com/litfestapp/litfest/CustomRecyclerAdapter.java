package com.litfestapp.litfest;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CustomRecyclerAdapter extends RecyclerView.Adapter<CustomRecyclerAdapter.ViewHolder> {

    int itemCount = 5 ;
    View.OnClickListener onClickListener ;

    public CustomRecyclerAdapter( View.OnClickListener onClickListener )
    {
        this.onClickListener = onClickListener ;
    }

    @NonNull
    @Override
    public CustomRecyclerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View V = LayoutInflater.from(parent.getContext()).inflate( R.layout.recycler_view_holder_layout , parent , false );
        return new ViewHolder( V , onClickListener ) ;
    }

    @Override
    public void onBindViewHolder(@NonNull CustomRecyclerAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return itemCount;
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        public ViewHolder(@NonNull View itemView , View.OnClickListener onClickListener) {
            super(itemView);
            itemView.setOnClickListener( onClickListener );
        }

    }

}



