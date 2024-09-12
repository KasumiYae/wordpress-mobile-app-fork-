package vn.edu.usth.wordpress_mobile_app;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPagerAdapter extends FragmentStateAdapter {
    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0 : return new All() ;
            case 1 : return new pending() ;
            case 2 : return new Unanswered() ;
            case 3 : return new replied() ;
            case 4 : return new Approved() ;
            case 5 : return new Spam() ;
            case 6 : return new Bin() ;
            default: return new All();
        }
    }

    @Override
    public int getItemCount() {
        return 7;
    }
}
