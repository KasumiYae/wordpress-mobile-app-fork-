package vn.edu.usth.wordpress_mobile_app.Post;

import androidx.annotation.NonNull;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


public class PostFragmentAdapter extends FragmentPagerAdapter {
    private final int PAGE_COUNT = 4;
    private String titles[] = new String[] { "POSTED", "DRAFT", "SCHEDULE", "TRASH" };
    public PostFragmentAdapter(FragmentManager fm) {
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
            case 1: return new DraftFragment();
            case 2: return new ScheduleFragment();
            case 3: return new TrashFragment();
            default: return new PostedFragment();
        }
         // failsafe
    }

    public CharSequence getPageTitle(int page) {
// returns a tab title corresponding to the specified page
        return titles[page];
    }
}

