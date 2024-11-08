package vn.edu.usth.wordpress_mobile_app.Post;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import vn.edu.usth.wordpress_mobile_app.R;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {
    private List<PostItemDetail> listPost;

    public RecyclerAdapter(List<PostItemDetail> listPost) {
        this.listPost = listPost;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.posts_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    //for(int position = 0; position < listPost.size(); position++)
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        PostItemDetail post = listPost.get(position);
        holder.date.setText(post.getDate());
        holder.title.setText(post.getTitle());
        holder.content.setText(post.getContent());
    }

    @Override
    public int getItemCount() {
        return listPost.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        private CardView cardView;
        private TextView date;
        private TextView title;
        private TextView content;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            cardView = itemView.findViewById(R.id.cardView);
            date = itemView.findViewById(R.id.post_day);
            title = itemView.findViewById(R.id.post_title);
            content = itemView.findViewById(R.id.post_content);

        }
    }
}
