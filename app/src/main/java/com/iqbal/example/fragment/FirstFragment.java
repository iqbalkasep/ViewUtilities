package com.iqbal.example.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.iqbal.viewutilities.R;
import com.iqbal.viewutilities.ViewUtilities;

/**
 * Created by iqbal.pribadi@yahoo.com on 12/19/15.
 */
public class FirstFragment extends Fragment {
    private Button clickButton;
    private Button hideOrShow;
    private boolean hasclicked = false;
    private TextView text;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view  = inflater.inflate(R.layout.fragment_first, container, false);

        hideOrShow = (Button) view.findViewById(R.id.buttonToHide);
        ViewUtilities.setOnClickListeners(onClickListener, hideOrShow);

        clickButton = (Button) view.findViewById(R.id.buttonToSecond);
        ViewUtilities.setOnClickListeners(onClickListener, clickButton);

        text = (TextView) view.findViewById(R.id.text);

        return view;
    }

    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.buttonToSecond:
                    Fragment fragment = new SecondFragment();
                    FragmentManager fragmentManager = getFragmentManager();
                    ViewUtilities.replaceSimpleFragment(fragment, fragmentManager, R.id.container_fragment, true);

                    break;

                case R.id.buttonToHide:
                    if (hasclicked == false){
                    ViewUtilities.setGone(text, clickButton);
                        hideOrShow.setText(" Show Me");;;
                        hasclicked = true;
                    }
                    else {
                    ViewUtilities.setVisible(text, clickButton);
                        hideOrShow.setText(" Hide Me");
                        hasclicked = false;
                    }

                    break;
            }
        }
    };
}
