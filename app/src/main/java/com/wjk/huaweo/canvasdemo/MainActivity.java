package com.wjk.huaweo.canvasdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         initView();
    }

    private void initView() {
        List<PieData>  datas=new ArrayList<>();
        datas.add(new PieData("1",10f));
        datas.add(new PieData("2",10f));
        datas.add(new PieData("3",30f));
        datas.add(new PieData("4",10f));
        datas.add(new PieData("5",10f));
        datas.add(new PieData("6",30f));
        MyView myView = (MyView) findViewById(R.id.myview);
    myView.setStartAngle(90);
        myView.setData(((ArrayList<PieData>) datas));
    }
}
