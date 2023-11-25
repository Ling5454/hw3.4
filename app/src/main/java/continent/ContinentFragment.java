package continent;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hw34.R;
import com.example.hw34.databinding.FragmentContinentBinding;

import java.util.ArrayList;

import country.CountryFragment;
import country.OnClick;

public class ContinentFragment extends Fragment implements OnClick {

    private FragmentContinentBinding binding;
    private ArrayList <ContinentModel> continentList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentContinentBinding.inflate(getLayoutInflater());
       return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        ContinentAdapter continentAdapter = new ContinentAdapter(continentList, this);
        binding.recyclerView.setAdapter(continentAdapter);

    }

    private void loadData() {
        continentList.add(new ContinentModel("https://ykl-res.azureedge.net/5cbb06af-4a12-44a4-9734-9b9638097826/1.png","Eurasia"));
        continentList.add(new ContinentModel("https://www.istockphoto.com/photo/north-america-topographic-map-3d-render-color-gm1443496007-482451935?utm_source=pixabay&utm_medium=affiliate&utm_campaign=SRP_photo_sponsored&utm_content=https%3A%2F%2Fpixabay.com%2Fru%2Fphotos%2Fsearch%2F%25D1%2581%25D0%25B5%25D0%25B2%25D0%25B5%25D1%2580%25D0%25BD%25D0%25B0%25D1%258F%2520%25D0%25B0%25D0%25BC%25D0%25B5%25D1%2580%25D0%25B8%25D0%25BA%25D0%25B0%2F&utm_term=%D1%81%D0%B5%D0%B2%D0%B5%D1%80%D0%BD%D0%B0%D1%8F+%D0%B0%D0%BC%D0%B5%D1%80%D0%B8%D0%BA%D0%B0","North America"));
        continentList.add(new ContinentModel("https://pixabay.com/ru/photos/%D1%8E%D0%B6%D0%BD%D0%B0%D1%8F-%D0%B0%D0%BC%D0%B5%D1%80%D0%B8%D0%BA%D0%B0-%D0%BA%D0%BE%D0%BD%D1%82%D0%B8%D0%BD%D0%B5%D0%BD%D1%82-%D0%B7%D0%B5%D0%BC%D0%BB%D1%8F-74073/","South America"));
        continentList.add(new ContinentModel("https://www.istockphoto.com/photo/african-elephants-in-the-plains-of-serengeti-tanzania-gm1141711907-305980851?utm_source=pixabay&utm_medium=affiliate&utm_campaign=SRP_image_sponsored&utm_content=https%3A%2F%2Fpixabay.com%2Fru%2Fimages%2Fsearch%2F%25D0%25B0%25D1%2584%25D1%2580%25D0%25B8%25D0%25BA%25D0%25B0%2F&utm_term=%D0%B0%D1%84%D1%80%D0%B8%D0%BA%D0%B0","Africa"));
        continentList.add(new ContinentModel("https://www.mapsland.com/maps/oceania/australia/large-physical-map-of-australia-with-major-cities.jpg","Australia"));
    }

    @Override
    public void onClick(int position) {
        Bundle bundle = new Bundle();
      bundle.putInt("continent",position);
        CountryFragment countryFragment = new CountryFragment();
        countryFragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container,countryFragment).addToBackStack(null).commit();
    }
}