package yangj.screenadapter

/**
 * Created by YangJ on 2019/4/13.
 */
class Config {

    companion object {
        /**
         * 最小宽度限定符适配
         * <p>
         *     可以对宽度进行适配
         * </p>
         */
        const val SMALL_WIDTH_MATCH = 0
        /**
         * 最小宽度限定符适配 + 权重适配
         * <p>
         *     可以对宽度 + 高度进行适配
         * </p>
         */
        const val FULL_MATCH = 1
    }

}