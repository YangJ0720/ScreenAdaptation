# ScreenAdaptation
Android 屏幕适配最佳实践

## 运行效果
<img src="https://github.com/YangJ0720/ScreenAdaptation/blob/master/jpg/01.jpg" width="800" height="550"/>

### 生成dimen.xml文件
1.找到library中的Main文件，是Java文件可以直接运行  
2.将生成的value文件夹拷贝到自己的Android工程对应目录  

### 在布局文件中使用
```
<TextView
      android:layout_width="@dimen/dp_90"
      android:layout_height="@dimen/dp_80"
      android:text="90dp - 80dp"
      android:gravity="center"
      android:background="@color/colorAccent"/>
```

### 注意事项
1.高度适配可以结合UI设计使用weight进行适配