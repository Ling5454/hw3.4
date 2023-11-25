package continent;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.hw34.R;

import java.util.ArrayList;

import country.OnClick;

public class ContinentAdapter extends RecyclerView.Adapter<ContinentViewHolder> {
    private ArrayList<ContinentModel> continentModeList;
    private OnClick onClick;

    public ContinentAdapter(ArrayList<ContinentModel> continentModeList, OnClick onClick) {
        this.continentModeList = continentModeList;
        this.onClick = onClick;
    }

    @NonNull
    @Override
    public ContinentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ContinentViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_continent, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ContinentViewHolder holder, int position) {
        holder.bind(continentModeList.get(position));
        holder.itemView.setOnClickListener(view ->{
            onClick.onClick(position);
        });
    }

    @Override
    public int getItemCount() {
        return continentModeList.size();
    }
}

class ContinentViewHolder extends RecyclerView.ViewHolder {
    private ImageView imgContinent;
    private TextView tvContinent;


    public ContinentViewHolder(@NonNull View itemView) {
        super(itemView);
        imgContinent=itemView.findViewById(R.id.img_continent);
        tvContinent=itemView.findViewById(R.id.name_continent);
    }

    public void bind(ContinentModel continentModel) {
        tvContinent.setText(continentModel.getName());
        Glide.with(imgContinent).load(continentModel.getFlag()).into(imgContinent);

    }
}
