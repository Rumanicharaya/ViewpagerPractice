package com.bbli.nikki.r2_viewpager;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment {
    private String title;
    private int page;

    public static SecondFragment newInstance(int page,String title){
        SecondFragment fragmentSecond= new SecondFragment();
        Bundle args= new Bundle();
        args.putInt("someint",page);
        args.putString("someTitle",title);
        return fragmentSecond;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_second, container, false);
        TextView tvLabel1 = (TextView) view.findViewById(R.id.tvLabel1);
        tvLabel1.setText(page + " -- " + title);
        return view;
    }


}
