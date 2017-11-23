package com.recyclerview.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangshy
 */
public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new RecyclerAdapter(this, getListBean()));
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
//        iamgeList.add(new ImageItme(1, "http://h.hiphotos.baidu.com/image/pic/item/8326cffc1e178a82063b734efc03738da877e8dd.jpg"));
//        iamgeList.add(new ImageItme(1, "http://h.hiphotos.baidu.com/image/pic/item/8326cffc1e178a82063b734efc03738da877e8dd.jpg"));
//        iamgeList.add(new ImageItme(1, "http://h.hiphotos.baidu.com/image/pic/item/8326cffc1e178a82063b734efc03738da877e8dd.jpg"));
        return iamgeList;
    }
}
