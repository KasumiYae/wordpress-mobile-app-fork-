package vn.edu.usth.wordpress_mobile_app.Page;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


public class ViewPagerAdapter extends FragmentPagerAdapter {
    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new PageFragment();
            case 1:
                return new DraftFragment();
            case 2:
                return new ScheduleFragment();
            case 3:
                return new RecycleFragment();

            default: return new PageFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = "";
        switch (position) {
            case 0:
                title = "Post";
                break;
            case 1:
                title = "Draft";
                break;
            case 2:
                title = "Schedule";
                break;
            case 3:
                title = "Recycle";
                break;
        }
        return title;
    }
}
