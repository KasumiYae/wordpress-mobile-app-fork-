package vn.edu.usth.wordpress_mobile_app.Page;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import vn.edu.usth.wordpress_mobile_app.R;

public class RecAdapterPage extends RecyclerView.Adapter<RecAdapterPage.RecViewAdapter> {
    List<Page> pagelist;
    public RecAdapterPage(List<Page> pagelist){
        this.pagelist = pagelist;
    }

    @NonNull
    @Override
    public RecViewAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.page_cards,parent,false);

        return new RecViewAdapter(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecViewAdapter holder, int position) {
        Page com = pagelist.get(position);
        holder.titleID.setText(com.getTitle());
        holder.dateID.setText(com.getDate());
        holder.contentID.setText(com.getContent());
    }

    @Override
    public int getItemCount() {
        return pagelist.size();
    }

    class RecViewAdapter  extends RecyclerView.ViewHolder{
        private CardView cardView;
        private TextView titleID;
        private TextView dateID;
        private TextView contentID;

        public RecViewAdapter(@NonNull View itemView) {
            super(itemView);
            cardView = itemView.findViewById(R.id.pageview);
            titleID = itemView.findViewById(R.id.home_page_text);
            dateID = itemView.findViewById(R.id.date);
            contentID = itemView.findViewById(R.id.content_page);
        }
    }
}



