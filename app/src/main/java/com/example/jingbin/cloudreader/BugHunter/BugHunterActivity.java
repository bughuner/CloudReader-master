package com.example.jingbin.cloudreader.BugHunter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class BugHunterActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        Log.e("123MainActivity","项目开始运行");

        FloatingActionButton button=new FloatingActionButton(Camera.getCurrentActivity());
        ScreenShotListenManager manager = ScreenShotListenManager.newInstance(Camera.getCurrentActivity());
        //设置截屏监听
        manager.setListener(
                new ScreenShotListenManager.OnScreenShotListener() {
                    public void onShot(String imagePath) {
                        // do something
                        Camera camera=new Camera();
                        camera.camera(Camera.getCurrentActivity());
                    }
                }
        );
        manager.startListen();

    }


    @Override
    protected void onDestroy() {
        // TODO Auto-generated method stub
        super.onDestroy();

    }
}
