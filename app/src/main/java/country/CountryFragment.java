package country;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hw34.databinding.FragmentContinentBinding;

import java.util.ArrayList;


public class CountryFragment extends Fragment {
    private FragmentContinentBinding binding;

    private Integer position;
    private ArrayList<CountryModel> countryModels = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentContinentBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        position = getArguments().getInt("continent");
        checkPosition(position);
        CountryAdapter countryAdapter = new CountryAdapter(countryModels);
        binding.recyclerView.setAdapter(countryAdapter);
    }

    private void checkPosition(Integer position) {
        switch (position) {
            case 0:
                loadEurasia();
                break;
            case 1:
                loadNorthAmerica();
                break;
            case 2:
                loadSuotAmerica();
                break;
            case 3:
                loadAfrica();
                break;
            case 4:
                loadAustralia();
                break;


        }

    }

    private void loadEurasia() {
        countryModels.add(new CountryModel("https://militaryarms.ru/wp-content/uploads/2021/08/flag-kirgizstana.orig_.jpg", "Kyrgyzstan"));
        countryModels.add(new CountryModel("https://militaryarms.ru/wp-content/uploads/2021/08/flag-kirgizstana.orig_.jpg", "Kyrgyzstan"));
        countryModels.add(new CountryModel("https://militaryarms.ru/wp-content/uploads/2021/08/flag-kirgizstana.orig_.jpg", "Kyrgyzstan"));
        countryModels.add(new CountryModel("https://militaryarms.ru/wp-content/uploads/2021/08/flag-kirgizstana.orig_.jpg", "Kyrgyzstan"));
        countryModels.add(new CountryModel("https://militaryarms.ru/wp-content/uploads/2021/08/flag-kirgizstana.orig_.jpg", "Kyrgyzstan"));


    }

    private void loadAustralia() {
        countryModels.add(new CountryModel("https://militaryarms.ru/wp-content/uploads/2021/08/flag-kirgizstana.orig_.jpg", "Kyrgyzstan"));
        countryModels.add(new CountryModel("https://militaryarms.ru/wp-content/uploads/2021/08/flag-kirgizstana.orig_.jpg", "Kyrgyzstan"));
        countryModels.add(new CountryModel("https://militaryarms.ru/wp-content/uploads/2021/08/flag-kirgizstana.orig_.jpg", "Kyrgyzstan"));
        countryModels.add(new CountryModel("https://militaryarms.ru/wp-content/uploads/2021/08/flag-kirgizstana.orig_.jpg", "Kyrgyzstan"));
        countryModels.add(new CountryModel("https://militaryarms.ru/wp-content/uploads/2021/08/flag-kirgizstana.orig_.jpg", "Kyrgyzstan"));

    }

    private void loadAfrica() {
        countryModels.add(new CountryModel("https://wp-s.ru/wallpapers/15/14/418973776957306/flag-severnoj-afriki-alzhira.jpg", "Algir"));
        countryModels.add(new CountryModel("https://wp-s.ru/wallpapers/15/14/418973776957306/flag-severnoj-afriki-alzhira.jpg", "Algir"));
        countryModels.add(new CountryModel("https://wp-s.ru/wallpapers/15/14/418973776957306/flag-severnoj-afriki-alzhira.jpg", "Algir"));
        countryModels.add(new CountryModel("https://wp-s.ru/wallpapers/15/14/418973776957306/flag-severnoj-afriki-alzhira.jpg", "Algir"));
        countryModels.add(new CountryModel("https://wp-s.ru/wallpapers/15/14/418973776957306/flag-severnoj-afriki-alzhira.jpg", "Algir"));

    }

    private void loadSuotAmerica() {
        countryModels.add(new CountryModel("https://immi.ksdd.ru/wp-content/uploads/2019/11/Argentina.png", "Argentina"));
        countryModels.add(new CountryModel("https://immi.ksdd.ru/wp-content/uploads/2019/11/Argentina.png", "Argentina"));
        countryModels.add(new CountryModel("https://immi.ksdd.ru/wp-content/uploads/2019/11/Argentina.png", "Argentina"));
        countryModels.add(new CountryModel("https://immi.ksdd.ru/wp-content/uploads/2019/11/Argentina.png", "Argentina"));
        countryModels.add(new CountryModel("https://immi.ksdd.ru/wp-content/uploads/2019/11/Argentina.png", "Argentina"));

    }

    private void loadNorthAmerica() {
        countryModels.add(new CountryModel("https://w.forfun.com/fetch/66/66b747daedc86e1b0c7d1767e49c11eb.jpeg", "Kanada"));
        countryModels.add(new CountryModel("https://w.forfun.com/fetch/66/66b747daedc86e1b0c7d1767e49c11eb.jpeg", "Kanada"));
        countryModels.add(new CountryModel("https://w.forfun.com/fetch/66/66b747daedc86e1b0c7d1767e49c11eb.jpeg", "Kanada"));
        countryModels.add(new CountryModel("https://w.forfun.com/fetch/66/66b747daedc86e1b0c7d1767e49c11eb.jpeg", "Kanada"));
        countryModels.add(new CountryModel("https://w.forfun.com/fetch/66/66b747daedc86e1b0c7d1767e49c11eb.jpeg", "Kanada"));


    }
}
