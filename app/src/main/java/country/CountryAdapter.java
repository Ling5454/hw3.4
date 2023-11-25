package country;

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

public class CountryAdapter extends RecyclerView.Adapter<CountryViewHolder> {
    private ArrayList<CountryModel> countryModelArrayList;

    public CountryAdapter(ArrayList<CountryModel> countryModelArrayList) {
        this.countryModelArrayList = countryModelArrayList;
    }

    @NonNull
    @Override
    public CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CountryViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_country, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CountryViewHolder holder, int position) {
        holder.bind(countryModelArrayList.get(position));

    }

    @Override
    public int getItemCount() {
        return countryModelArrayList.size();
    }
}

class CountryViewHolder extends RecyclerView.ViewHolder {
private ImageView imageCountry;
private TextView nameCountry;
    public CountryViewHolder(@NonNull View itemView) {
        super(itemView);
        imageCountry=itemView.findViewById(R.id.img_continent);
        nameCountry = itemView.findViewById(R.id.item_country);
    }

    public void bind(CountryModel countryModel) {
        nameCountry.setText(countryModel.getCountryName());
        Glide.with(imageCountry).load(countryModel.getCountryImg()).into(imageCountry);

    }
}
