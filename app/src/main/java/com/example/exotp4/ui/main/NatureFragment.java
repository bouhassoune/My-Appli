package com.example.exotp4.ui.main;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.exotp4.MainActivity;
import com.example.exotp4.R;

import androidx.fragment.app.Fragment;

public class NatureFragment extends Fragment {
    private String title;
    private int page;
    /**
     * Pour la sauvegarde et la récupération des données
     * dans un Bundle
     */
    private static final String ARG_SECTION_NUMBER = "numero_page";
    private static final String ARG_SECTION_TITLE = "titre_page";

    /**
     * Retourne une nouvelle instance de ce fragment
     * pour le numéro de section donné.
     */
    public static NatureFragment newInstance(int position, String title) {
        NatureFragment fragment = new NatureFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, position);
        args.putString(ARG_SECTION_TITLE, title);
        fragment.setArguments(args);
        return fragment;
    }

    // retrouver les valeurs des champs à partir du bundle
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        page = getArguments().getInt(ARG_SECTION_NUMBER, 0);
        title = getArguments().getString(ARG_SECTION_TITLE);
        //img = SectionsPagerAdapter.getImage(page, getContext());
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=null;
        if(page!=4){
            view = inflater.inflate(R.layout.fragment_main, container, false);
            TextView tvLabel = (TextView) view.findViewById(R.id.section_label);
            tvLabel.setText(page + " -- " + title);
            ImageView image = (ImageView) view.findViewById(R.id.saison);
            Drawable img = null;
            image.setImageDrawable(img);
        }
        else {
            view =inflater.inflate(R.layout.saison_layout,container,false);
            ImageView image = (ImageView) view.findViewById(R.id.imageView);
            ImageView image2 = (ImageView) view.findViewById(R.id.imageView2);
            ImageView image3 = (ImageView) view.findViewById(R.id.imageView3);
            ImageView image4 = (ImageView) view.findViewById(R.id.imageView4);


            image.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {

                    MainActivity a=(MainActivity) getActivity();

                    a.viewPager.setCurrentItem(0);


                }
            });

            image3.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {

                    MainActivity a=(MainActivity) getActivity();

                    a.viewPager.setCurrentItem(1);


                }
            });

            image2.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {

                    MainActivity a=(MainActivity) getActivity();

                    a.viewPager.setCurrentItem(2);


                }
            });

            image4.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {

                    MainActivity a=(MainActivity) getActivity();

                    a.viewPager.setCurrentItem(3);


                }
            });


        }



        return view;
    }
}


