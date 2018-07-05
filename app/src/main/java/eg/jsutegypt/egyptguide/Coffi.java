

package eg.jsutegypt.egyptguide;

import android.content.Context;

import java.util.List;

public class Coffi {

    public static void initSightsList(List<Location> list, Context context) {

        list.add(new Location(
                context.getString(R.string.one_cafe_name),
                context.getString(R.string.one_cafe_desc),
                context.getString(R.string.one_cafe_addr),
                context.getString(R.string.one_cafe_tel),
                null,
                R.drawable.cafes_one
        ));
        list.add(new Location(
                context.getString(R.string.two_cafe_name),
                context.getString(R.string.two_cafe_desc),
                context.getString(R.string.two_cafe_addr),
                context.getString(R.string.two_cafe_tel),
                null,
                R.drawable.cafes_two
        ));
        list.add(new Location(
                context.getString(R.string.three_cafe_name),
                context.getString(R.string.three_cafe_desc),
                context.getString(R.string.three_cafe_addr),
                context.getString(R.string.three_cafe_tel),
                null,
                R.drawable.cafes_three
        ));




    }
}
