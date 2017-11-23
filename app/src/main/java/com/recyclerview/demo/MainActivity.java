package com.recyclerview.demo;

import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangshy
 */
public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ComponentName componentName1;
    private ComponentName componentName2;
    private PackageManager packageManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new RecyclerAdapter(this, getListBean()));


        componentName2 = getComponentName();

        componentName1 = new ComponentName(getBaseContext(), "com.recyclerview.demo.icons");

        packageManager = getApplicationContext().getPackageManager();

        String s1 = "123";
        String s2 = new String("123");

        Log.e("MainActivity", "---wangshy---->>>> onCreate(MainActivity.java:40)" + (s1 == s2));
        Log.e("MainActivity", "---wangshy---->>>> onCreate(MainActivity.java:40)" + (s1.equals(s2)));

    }

    public List<BaseItme> getListBean() {
        List<BaseItme> listBean = new ArrayList<>();
        listBean.add(new RecyclerItme(2, getIamgeList()));
        listBean.add(new Textitme(0x000000));
        listBean.add(new Textitme(0x000000));
        listBean.add(new ImageItme(0x000001, "http://p1.qqyou.com/pic/UploadPic/2014-8/23/201408230135482283.jpg"));
        listBean.add(new ImageItme(0x000001, "http://img2.imgtn.bdimg.com/it/u=2588103307,1672386335&fm=214&gp=0.jpg"));
        listBean.add(new Textitme(0x000000));
        listBean.add(new Textitme(0x000000));
        listBean.add(new Textitme(0x000000));
        listBean.add(new RecyclerItme(0x000002, getIamgeList()));
        listBean.add(new Textitme(0x000000));
        listBean.add(new Textitme(0x000000));
        listBean.add(new ImageItme(0x000001, "http://p1.qqyou.com/pic/UploadPic/2014-8/23/201408230135482283.jpg"));
        listBean.add(new ImageItme(0x000001, "http://img2.imgtn.bdimg.com/it/u=2588103307,1672386335&fm=214&gp=0.jpg"));
        listBean.add(new Textitme(0x000000));
        listBean.add(new Textitme(0x000000));
        listBean.add(new Textitme(0x000000));
        listBean.add(new RecyclerItme(0x000002, getIamgeList()));
        listBean.add(new Textitme(0x000000));
        listBean.add(new Textitme(0x000000));
        listBean.add(new ImageItme(0x000001, "http://p1.qqyou.com/pic/UploadPic/2014-8/23/201408230135482283.jpg"));
        listBean.add(new ImageItme(0x000001, "http://img2.imgtn.bdimg.com/it/u=2588103307,1672386335&fm=214&gp=0.jpg"));
        listBean.add(new Textitme(0x000000));
        listBean.add(new Textitme(0x000000));
        listBean.add(new Textitme(0x000000));
        listBean.add(new RecyclerItme(0x000002, getIamgeList()));
        listBean.add(new Textitme(0x000000));
        listBean.add(new Textitme(0x000000));
        listBean.add(new ImageItme(0x000001, "http://p1.qqyou.com/pic/UploadPic/2014-8/23/201408230135482283.jpg"));
        listBean.add(new ImageItme(0x000001, "http://img2.imgtn.bdimg.com/it/u=2588103307,1672386335&fm=214&gp=0.jpg"));
        listBean.add(new Textitme(0x000000));
        listBean.add(new Textitme(0x000000));
        listBean.add(new Textitme(0x000000));

        return listBean;
    }

    public List<ImageItme> getIamgeList() {
        List<ImageItme> iamgeList = new ArrayList<>();
        iamgeList.add(new ImageItme(0x000001, "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1511347992892&di=090308d974d1fe1d234ad22bf06a577e&imgtype=0&src=http%3A%2F%2Fimgsrc.baidu.com%2Fimgad%2Fpic%2Fitem%2Fac4bd11373f082020aab300240fbfbedab641bd5.jpg"));
        iamgeList.add(new ImageItme(0x000001, "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1511347992893&di=4c4d5e4c2409db0d8126c597196a2603&imgtype=0&src=http%3A%2F%2Fimgsrc.baidu.com%2Fimgad%2Fpic%2Fitem%2Fb58f8c5494eef01f1ab847f8ebfe9925bc317d5a.jpg"));
        iamgeList.add(new ImageItme(0x000001, "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1511348069129&di=97b52b4c08d53939ff7a5ce08572ceb5&imgtype=0&src=http%3A%2F%2Fpic22.nipic.com%2F20120801%2F10643934_164833498196_2.jpg"));
        iamgeList.add(new ImageItme(0x000001, "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1511348124303&di=7bf4ce516aa98615bdee47f38ac83b91&imgtype=0&src=http%3A%2F%2Fpic28.nipic.com%2F20130422%2F6608733_205145009304_2.jpg"));
        return iamgeList;
    }

    private void disableComponent(ComponentName componentName) {
        packageManager.setComponentEnabledSetting(componentName, PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP);
    }

    private void enadleComponent(ComponentName componentName) {
        packageManager.setComponentEnabledSetting(componentName, PackageManager.COMPONENT_ENABLED_STATE_ENABLED, PackageManager.DONT_KILL_APP);
    }

    public void changeIcon(View view) {
        disableComponent(componentName2);
        enadleComponent(componentName1);
    }
}
