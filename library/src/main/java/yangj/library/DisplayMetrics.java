package yangj.library;

/**
 * Created by YangJ on 2019/4/7.
 */
public class DisplayMetrics {

    public int widthPixels;
    public int heightPixels;
    public float density;
    public int densityDpi;

    public DisplayMetrics(int widthPixels, int heightPixels, float density) {
        this(widthPixels, heightPixels, density, 0);
    }

    public DisplayMetrics(int widthPixels, int heightPixels, float density, int densityDpi) {
        this.widthPixels = widthPixels;
        this.heightPixels = heightPixels;
        this.density = density;
        this.densityDpi = densityDpi;
    }
}
