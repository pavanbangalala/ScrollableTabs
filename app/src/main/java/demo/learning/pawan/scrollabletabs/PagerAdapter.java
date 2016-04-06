package demo.learning.pawan.scrollabletabs;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

/**
 * Created by Pavan Bangalala on 06/04/16.
 */
public class PagerAdapter extends FragmentPagerAdapter {

    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        Fragment fragment = null;
        Log.d("ScrollableTabs"," getItem is called "+position);

        if(position == 0){
            fragment = new FragmentA();
        }
        else if(position == 1){
            fragment = new FragmentB();
        }
        else if(position == 2){
            fragment = new FragmentC();
        }
        return fragment;
    }

    @Override
    public int getCount() {
        Log.d("ScrollableTabs"," getCount is called ");
        return 3;
    }


    @Override
    public CharSequence getPageTitle(int position) {

        String strTitle = "";
        if(position == 0 ){
            strTitle = "Tab 1";
        }
        else if(position == 1){
            strTitle = "Tab 2";
        }
        else if(position == 2){
            strTitle = "Tab 3";
        }
        return strTitle;
    }
}
