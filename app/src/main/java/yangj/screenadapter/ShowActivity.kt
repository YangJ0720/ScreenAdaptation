package yangj.screenadapter

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

/**
 * @author YangJ
 */
class ShowActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutResID())
    }

    private fun getLayoutResID(): Int {
        val mode = intent.getIntExtra("mode", Config.SMALL_WIDTH_MATCH)
        return if (Config.SMALL_WIDTH_MATCH == mode) {
            // 最小宽度限定符适配
            R.layout.activity_show
        } else {
            // 最小宽度限定符适配 + 权重适配
            R.layout.activity_full
        }
    }
}
