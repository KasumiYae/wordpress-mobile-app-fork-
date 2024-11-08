package vn.edu.usth.wordpress_mobile_app.Media;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import vn.edu.usth.wordpress_mobile_app.Comment.Comment;
import vn.edu.usth.wordpress_mobile_app.R;

public class RecAdapter extends RecyclerView.Adapter<RecAdapter.RecViewAdapter> {
    List<Media> medialist;
    public RecAdapter(List<Media> medialist){
        this.medialist = medialist;
    }

    @NonNull
    @Override
    public RecViewAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.media_card,parent,false);

        return new RecViewAdapter(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecViewAdapter holder, int position) {
        Media m = medialist.get(position);
        holder.imageView1.setImageResource(m.getId());
    }

    @Override
    public int getItemCount() {
        return medialist.size();
    }

    class RecViewAdapter  extends RecyclerView.ViewHolder{
        private CardView cardView;
        private ImageView imageView1;

        public RecViewAdapter(@NonNull View itemView) {
            super(itemView);
            cardView = itemView.findViewById(R.id.cardview);
            imageView1 = itemView.findViewById(R.id.imageView1);
        }
    }
}
