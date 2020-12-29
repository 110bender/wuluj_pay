package com.example.wuluj.util;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.wuluj.Card;
import com.example.wuluj.R;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ExampleViewHolder> {
    private ArrayList<Card> mExampleList;
    private OnItemClickListener mListener;
    public interface OnItemClickListener {
        void onItemClick (int pos);
    }
    public void setOnItemClickListener (OnItemClickListener listener){
        mListener = listener;
    }
    public static class ExampleViewHolder extends RecyclerView.ViewHolder {

        public ImageView cardImg;
        public TextView cardTitle;
        public ImageView cardImgProfile;
        public TextView cardName;
        public Button feedBtn;

        public ExampleViewHolder(View itemView, final OnItemClickListener listener) {
            super(itemView);
            cardImg = itemView.findViewById(R.id.cardImg);
            cardTitle = itemView.findViewById(R.id.cardTitle);
            cardImgProfile = itemView.findViewById(R.id.cardImgProfile);
            cardName = itemView.findViewById(R.id.cardName);
            feedBtn = itemView.findViewById(R.id.feedBtn);

            feedBtn .setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (listener != null){
                        int pos = getAdapterPosition();
                        if (pos != RecyclerView.NO_POSITION){
                            listener.onItemClick(pos);
                        }
                    }

                }
            });



        }
    }



    public Adapter(ArrayList<Card> exampleList) {
        mExampleList = exampleList;
    }
    @Override
    public ExampleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card, parent, false);
        ExampleViewHolder evh = new ExampleViewHolder(v, mListener );
        return evh;
    }
    @Override
    public void onBindViewHolder(ExampleViewHolder holder, int position) {
        Card currentItem = mExampleList.get(position);
        holder.cardImg.setImageResource(currentItem.getCardImg());
        holder.cardTitle.setText(currentItem.getCardTitle());
        holder.cardImgProfile.setImageResource(currentItem.getCardImgProfile());
        holder.cardName.setText(currentItem.getCardName());

    }
    @Override
    public int getItemCount() {
        return mExampleList.size();
    }


}