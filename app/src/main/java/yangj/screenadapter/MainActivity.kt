package yangj.screenadapter

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

/**
 * @author YangJ
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initData()
        initView()
    }

    private fun initData() {

    }

    private fun initView() {
        val sb = StringBuilder("UI设计尺寸: \nwidth = 360dp\nheight = 640dp")
        val metrics = resources.displayMetrics
        sb.append("\n设备屏幕参数: \nwidthPixels = ")
        sb.append(metrics.widthPixels)
        sb.append("\nheightPixels = ")
        sb.append(metrics.heightPixels)
        sb.append("\ndensity = ")
        sb.append(metrics.density)
        sb.append("\ndensityDpi = ")
        sb.append(metrics.densityDpi)
        textView.text = sb
        btn_width.setOnClickListener {
            val intent = Intent(this, ShowActivity::class.java)
            intent.putExtra("mode", Config.SMALL_WIDTH_MATCH)
            startActivity(intent)
        }
        btn_full.setOnClickListener {
            val intent = Intent(this, ShowActivity::class.java)
            intent.putExtra("mode", Config.FULL_MATCH)
            startActivity(intent)
        }
    }

}
