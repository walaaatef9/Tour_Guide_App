

package eg.jsutegypt.egyptguide;

import android.content.Context;

import java.util.List;


public class Restaurant {

    public static void initShopsList(List<Location> list, Context context) {

        list.add(new Location(
                context.getString(R.string.one_rest_name),
                context.getString(R.string.one_rest_desc),
                context.getString(R.string.one_rest_addr),
                context.getString(R.string.one_rest_tel),
                context.getString(R.string.one_rest_work),
                R.drawable.rest_one
        ));

        list.add(new Location(
                context.getString(R.string.two_rest_name),
                context.getString(R.string.two_rest_desc),
                context.getString(R.string.two_rest_addr),
                context.getString(R.string.two_rest_tel),
                context.getString(R.string.two_rest_work),
                R.drawable.rest_two
        ));

        list.add(new Location(
                context.getString(R.string.three_rest_name),
                context.getString(R.string.three_rest_desc),
                context.getString(R.string.three_rest_addr),
                context.getString(R.string.three_rest_tel),
                context.getString(R.string.three_rest_work),
                R.drawable.rest_three
        ));


    }
}
