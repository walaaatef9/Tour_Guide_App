
package eg.jsutegypt.egyptguide;

import android.content.Context;

import java.util.List;


public class Hotel {

    public static void initFoodsList(List<Location> list, Context context) {

        list.add(new Location(
                context.getString(R.string.one_hotel_name),
                context.getString(R.string.one_hotel_desc),
                context.getString(R.string.one_hotel_addr),
                context.getString(R.string.one_hotel_tel),
                context.getString(R.string.one_hotel_work),
                R.drawable.hotel_one
        ));

        list.add(new Location(
                context.getString(R.string.two_hotel_name),
                context.getString(R.string.two_hotel_desc),
                context.getString(R.string.two_hotel_addr),
                context.getString(R.string.two_hotel_tel),
                context.getString(R.string.two_hotel_work),
                R.drawable.hotel_two
        ));

        list.add(new Location(
                context.getString(R.string.three_hotel_name),
                context.getString(R.string.three_hotel_desc),
                context.getString(R.string.three_hotel_addr),
                context.getString(R.string.three_hotel_tel),
                context.getString(R.string.three_hotel_work),
                R.drawable.hotel_three
        ));
    }
}
