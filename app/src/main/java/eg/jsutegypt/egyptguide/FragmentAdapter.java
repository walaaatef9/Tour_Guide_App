

package eg.jsutegypt.egyptguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class FragmentAdapter extends FragmentPagerAdapter {

    private Context context;

    public FragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new CoffiFragment();
        } else if (position == 1) {
            return new HotelFragment();
        } else if (position == 2){
            return new RestaurantFragment();
        } else {
            return new MallFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return context.getString(R.string.category_cafes);
        } else if (position == 1) {
            return context.getString(R.string.category_hotels);
        } else if (position == 2) {
            return context.getString(R.string.category_restaurant);
        } else {
            return context.getString(R.string.category_mall);
        }
    }
}
