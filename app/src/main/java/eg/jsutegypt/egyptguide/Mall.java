

package eg.jsutegypt.egyptguide;

import android.content.Context;

import java.util.List;

public class Mall {

    public static void initInfoList(List<Location> list, Context context) {

        list.add(new Location(
                context.getString(R.string.one_mall_name),
                context.getString(R.string.one_mall_desc),
                context.getString(R.string.one_mall_addr),
                context.getString(R.string.one_mall_tel),
                context.getString(R.string.one_mall_work),
                R.drawable.mall_one
        ));

        list.add(new Location(
                context.getString(R.string.two_mall_name),
                context.getString(R.string.two_mall_desc),
                context.getString(R.string.two_mall_addr),
                context.getString(R.string.two_mall_tel),
                context.getString(R.string.two_mall_work),
                R.drawable.mall_two
        ));

        list.add(new Location(
                context.getString(R.string.three_mall_name),
                context.getString(R.string.three_mall_desc),
                context.getString(R.string.three_mall_addr),
                context.getString(R.string.three_mall_tel),
                context.getString(R.string.three_mall_work),
                R.drawable.mall_three
        ));

    }
}
