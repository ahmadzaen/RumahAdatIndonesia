package org.d3if.rumahadatindonesia;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ListRumahAdapter extends RecyclerView.Adapter<ListRumahAdapter.ListViewHolder> {

    private ArrayList<Rumah> listRumah;
    private Context context;

    public ListRumahAdapter(ArrayList<Rumah> list, Context context) {
        this.listRumah = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_rumah, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        final Rumah rumah = listRumah.get(position);
        holder.imgRumah.setImageResource(rumah.getImage());
        holder.tvNama.setText(rumah.getNama());
        holder.tvAsal.setText(rumah.getAsal());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("nama rumah", rumah.getNama());
                intent.putExtra("asal rumah", rumah.getAsal());
                intent.putExtra("detail rumah", rumah.getDetail());
                intent.putExtra("img rumah", rumah.getImage());
                context.startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return listRumah.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
            ImageView imgRumah;
            TextView tvNama, tvAsal, tvDetail;

            ListViewHolder(View itemView) {
                super(itemView);
                imgRumah = itemView.findViewById(R.id.img_rumah);
                tvNama = itemView.findViewById(R.id.tv_rumah);
                tvAsal = itemView.findViewById(R.id.tv_asal);
                tvDetail= itemView.findViewById(R.id.tv_detail);
            }
        }
    }

