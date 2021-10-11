package Adapterfolder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rec.R;

public class YouAdapter extends RecyclerView.Adapter<YouAdapter.holder>
{
    String[] data;

    public YouAdapter(String[] data){
        this.data=data;
    }



    @NonNull
    @Override
    public holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.single_row_lay,parent,false);
        return new holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull holder holder, int position)
    {
        holder.tv.setText(data[position]);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }


    class holder extends RecyclerView.ViewHolder
    {
        ImageView img;
        TextView tv;
        public holder(@NonNull View itemView) {
            super(itemView);
            img=(ImageView)itemView.findViewById(R.id.imgid);
            tv=(TextView)itemView.findViewById(R.id.textid);
        }
    }

}




