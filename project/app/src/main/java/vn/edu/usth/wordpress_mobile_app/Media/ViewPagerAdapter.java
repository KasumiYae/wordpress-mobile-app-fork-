package vn.edu.usth.wordpress_mobile_app.Media;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private final int PAGE_COUNT = 4;
    private String titles[] = new String[] { "ALL", "PICTURE", "DOCUMENT","VIDEO" };
    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }
    @Override
    public int getCount() {
        return PAGE_COUNT; // number of pages for a ViewPager
    }
    @Override
    public Fragment getItem(int page) {
// returns an instance of Fragment corresponding to the specified page
        switch (page) {
            case 0: return new AllFrag();
            case 1: return new PicsFrag();
            case 2: return new DocsFrag();
            case 3: return new VideosFrag();
        }
        return new AllFrag(); // failsafe
    }
    @Override
    public CharSequence getPageTitle(int page) {
// returns a tab title corresponding to the specified page
        return titles[page];
    }

}
