package android.example.rvtask;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TextViewAdapter extends RecyclerView.Adapter<TextViewAdapter.TextViewHolder>{

    ArrayList<TextViewModel> list;
    Context context;

    public TextViewAdapter(ArrayList<TextViewModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public TextViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.rv_item, parent, false);
        return new TextViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TextViewHolder holder, int position) {
        TextViewModel model = list.get(position);
        holder.textView.setText(model.getText());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class TextViewHolder extends RecyclerView.ViewHolder{

        TextView textView;
        int position;

        public TextViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.tv1);

            itemView.findViewById(R.id.btn1).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Log.d("demo", "You Upvoted the " + list.get(position).getText());
                }
            });

            itemView.findViewById(R.id.btn2).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Log.d("demo", "You DownVoted the " + list.get(position).getText());
                }
            });

            itemView.findViewById(R.id.btn3).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Log.d("demo",list.get(position).getText() +" + 1");
                }
            });

            itemView.findViewById(R.id.btn4).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Log.d("demo",list.get(position).getText() +" - 1");
                }
            });
        }
    }
}
