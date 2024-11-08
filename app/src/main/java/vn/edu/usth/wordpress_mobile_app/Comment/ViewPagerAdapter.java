package vn.edu.usth.wordpress_mobile_app.Comment;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    private final int PAGE_COUNT = 7;
    private String titles[] = new String[] { "All", "Pending", "Unanswered", "Replied", "Approved", "Spam", "Bin" };
    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }
    @Override
    public int getCount() {
        return PAGE_COUNT; // number of pages for a ViewPager
    }
    @NonNull
    @Override
    public Fragment getItem(int page) {
// returns an instance of Fragment corresponding to the specified page
        switch (page) {
            case 1: return new pending();
            case 2: return new Unanswered();
            case 3: return new replied();
            case 4: return new Unanswered();
            case 5: return new Spam();
            case 6: return new Bin();
            default: return new All();
        }
        // failsafe
    }

    public CharSequence getPageTitle(int page) {
// returns a tab title corresponding to the specified page
        return titles[page];
    }
}