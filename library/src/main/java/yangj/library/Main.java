package yangj.library;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author YangJ
 */
public class Main {

    /**
     * UI设计尺寸（单位：dp）
     */
    private static final int[] DESIGN = new int[]{360, 640};

    public static void main(String[] args) {
        List<DisplayMetrics> list = new ArrayList<>();
        // 三星 Galaxy Core 4G mini
        list.add(new DisplayMetrics(480, 800, 1.5f, 160));
        // 酷派 Coolpad 5370
        list.add(new DisplayMetrics(720, 1184, 2.0f, 320));
        // 红米 Note 7 Pro
        list.add(new DisplayMetrics(1080, 2120, 2.75f, 440));
        // ZUK Z1
        // 小米 3
        list.add(new DisplayMetrics(1080, 1920, 3.0f, 480));
        // OPPO R15
        list.add(new DisplayMetrics(1080, 2280, 3.0f, 480));
        // Google Nexus 6
        // Google Pixel XL
        list.add(new DisplayMetrics(1440, 2392, 3.5f, 560));
        // Moto XT1789-05
        list.add(new DisplayMetrics(1440, 2368, 4.0f, 640));
        // 三星 Galaxy S8
        list.add(new DisplayMetrics(1440, 2768, 4.0f, 640));
        for (DisplayMetrics metrics : list) {
            createFile(metrics);
        }
    }

    private static void createFile(DisplayMetrics metrics) {
        // 创建value-sw{dp}dp文件夹
        int dp = (int) (metrics.widthPixels / metrics.density);
        String child = "library/src/main/res/value/values-sw" + dp + "dp";
        File file = new File(new File("").getAbsoluteFile(), child);
        if (file.exists()) {
            return;
        } else {
            file.mkdirs();
        }
        System.out.println("libraryFile = " + file.getAbsolutePath());
        // 创建dimens.xml文件
        BufferedWriter bw = null;
        try {
            String fileName = file.getAbsolutePath() + "/dimens.xml";
            bw = new BufferedWriter(new FileWriter(fileName));
            bw.write("<resources>\n");
            final int standard = DESIGN[0];
            final float mean = metrics.widthPixels / metrics.density / standard;
            for (int i = 1; i <= DESIGN[1]; i++) {
                float value = (float) ((int) (mean * i * 1000)) / 1000;
                String str = "    <dimen name=\"dp_" + i + "\">" + value + "dp</dimen>\n";
                bw.write(str);
            }
            bw.write("</resources>");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
