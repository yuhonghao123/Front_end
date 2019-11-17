package com.example.a3_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView[] img=new ImageView[12];
    private int[] imagePath=new int[]{R.mipmap.img01,R.mipmap.img02,R.mipmap.img02,R.mipmap.img02
            ,R.mipmap.img02,R.mipmap.img02,R.mipmap.img02,R.mipmap.img02,R.mipmap.img02
            ,R.mipmap.img02,R.mipmap.img02,R.mipmap.img02,R.mipmap.img02,R.mipmap.img02};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
