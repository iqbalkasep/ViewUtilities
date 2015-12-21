package com.iqbal.example.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.iqbal.viewutilities.R;
import com.iqbal.viewutilities.ViewUtilities;

/**
 * Created by iqbal.pribadi@yahoo.com on 12/19/15.
 */
public class SecondFragment extends Fragment {
    private Button clickButton;
    private Button closeThis;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view  = inflater.inflate(R.layout.fragment_second, container, false);

        clickButton = (Button) view.findViewById(R.id.buttonToFirst);
        ViewUtilities.setOnClickListeners(onClickListener, clickButton);

        closeThis = (Button) view.findViewById(R.id.closeFragment);
        ViewUtilities.setOnClickListeners(onClickListener, closeThis);

        return view;
    }

    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.buttonToFirst:
                    Fragment fragment = new FirstFragment();
                    FragmentManager fragmentManager = getFragmentManager();
                    ViewUtilities.replaceSimpleFragment(fragment, fragmentManager, R.id.container_fragment, true);

                    break;

                case R.id.closeFragment:
                    FragmentManager fragmentManager2 = getFragmentManager();
                    ViewUtilities.closeFragment(fragmentManager2);

                    break;
            }
        }
    };
}
