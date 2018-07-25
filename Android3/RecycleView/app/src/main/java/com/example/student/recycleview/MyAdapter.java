package com.example.student.recycleview;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{

    protected final Context context;
    private final List<RecyclerItem> list;

    public MyAdapter(Context context, List<RecyclerItem> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler_item, viewGroup, false);
        return new MyViewHolder(v);
    }



    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder myViewHolder, int position) {

        final RecyclerItem item = list.get(position);

        myViewHolder.title.setText(item.getTitle());
        myViewHolder.imageView.setImageResource(item.getImgId());
        myViewHolder.description.setText(item.getDescription());
        myViewHolder.ratingBar.setRating(item.getRating());
        myViewHolder.imageButton.setImageResource(R.drawable.ic_favorite_black);
        myViewHolder.imageButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               if (item.isLiked()) {
                   item.setLiked(true);
                   myViewHolder.imageButton.setImageResource(R.drawable.ic_favorite_black);
               } else {
                   item.setLiked(false);
                   myViewHolder.imageButton.setImageResource(R.drawable.ic_favorite);
               }

           }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private TextView title;
        private ImageView imageView;
        private TextView description;
        private RatingBar ratingBar;
        private ImageButton imageButton;
        private ImageButton wikiUrl;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
            imageView = itemView.findViewById(R.id.image);
            description = itemView.findViewById(R.id.description);
            ratingBar = itemView.findViewById(R.id.rating);
            imageButton = itemView.findViewById(R.id.like);

            itemView.setOnClickListener(this);
        }
        @Override
        public void onClick(View view) {
            int position = getAdapterPosition();
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(list.get(position).getWikiUrl()));
            context.startActivity(browserIntent);
        }
    }
}
