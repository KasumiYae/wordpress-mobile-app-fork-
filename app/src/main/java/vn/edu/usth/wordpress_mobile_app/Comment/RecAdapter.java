package vn.edu.usth.wordpress_mobile_app.Comment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import vn.edu.usth.wordpress_mobile_app.R;

public class RecAdapter extends RecyclerView.Adapter<RecAdapter.RecViewAdapter> {
    List<Comment> cmtlist;
    public RecAdapter(List<Comment> cmtlist){
        this.cmtlist = cmtlist;
    }

    @NonNull
    @Override
    public RecViewAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.comment_cards,parent,false);

        return new RecViewAdapter(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecViewAdapter holder, int position) {
        Comment com = cmtlist.get(position);
        holder.nameId.setText(com.getName());
        holder.dateId.setText(com.getDate());
        holder.cmtId.setText(com.getCmt());
    }

    @Override
    public int getItemCount() {
        return cmtlist.size();
    }

    public class RecViewAdapter  extends RecyclerView.ViewHolder{
        private CardView cardView;
        private TextView nameId;
        private TextView dateId;
        private TextView cmtId;

        public RecViewAdapter(@NonNull View itemView) {
            super(itemView);
            cardView = itemView.findViewById(R.id.cardview);
            nameId = itemView.findViewById(R.id.name);
            dateId = itemView.findViewById(R.id.date);
            cmtId = itemView.findViewById(R.id.cmt);
        }
    }
}
