package com.iqbal.viewutilities;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;

/**
 * Created by iqbal.pribadi@yahoo.com on 12/19/15.
 */
public class ViewUtilities {

    public static void setVisible(View...views){
        for (View view : views)
            view.setVisibility(View.VISIBLE);

    }

    public static void setInvisible(View...views){
        for (View view : views)
            view.setVisibility(View.INVISIBLE);

    }

    public static void setGone(View...views){
        for (View view : views)
            view.setVisibility(View.GONE);
    }

    public static void addSimpleFragment(Fragment fragment, FragmentManager fragmentManager, int layout, boolean addNullToBackStack){
        FragmentTransaction ft =  fragmentManager.beginTransaction();
        ft.add(layout, fragment);
        if (addNullToBackStack == true) {
            ft.addToBackStack(null);
        }
        ft.commit();
    }

    public static void replaceSimpleFragment(Fragment fragment, FragmentManager fragmentManager, int layout, boolean addNullToBackStack){
        FragmentTransaction ft =  fragmentManager.beginTransaction();
        ft.replace(layout, fragment);
        if (addNullToBackStack == true) {
            ft.addToBackStack(null);
        }
        ft.commit();
    }

    public static void closeFragment(FragmentManager fragmentManager){
        fragmentManager.popBackStack();
    }

    public static void setOnClickListeners(View.OnClickListener onClickListener, View... views) {
        for (View view : views)
            view.setOnClickListener(onClickListener);
    }

    public static void setOnTouchListeners(View.OnTouchListener onTouchListener, View... views) {
        for (View view : views)
            view.setOnTouchListener(onTouchListener);
    }


}
