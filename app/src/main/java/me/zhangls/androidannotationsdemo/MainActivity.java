package me.zhangls.androidannotationsdemo;

import android.app.Activity;
import android.widget.TextView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.res.StringRes;

@EActivity(R.layout.activity_main)
public class MainActivity extends Activity {

    @StringRes
    String hello_world;


    @ViewById
    TextView tv;

    @AfterViews
    void afterViews() {
        tv.setText(hello_world);
    }
}
