package xunyan.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * Create By xy.G on 2020/9/1.
 */
public class ToastUtil {
    public static void l(Context context,String content){
        Toast.makeText(context,content,Toast.LENGTH_LONG).show();
    }
    public static void s(Context context,String content){
        Toast.makeText(context,content,Toast.LENGTH_SHORT).show();
    }
}
