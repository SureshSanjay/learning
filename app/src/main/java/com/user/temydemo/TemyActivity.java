package com.user.temydemo;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.roboteam.teamy.sdk.NlpResult;
import com.roboteam.teamy.sdk.RoboEntryPointActivity;
import com.roboteam.teamy.sdk.Robot;

public class TemyActivity extends RoboEntryPointActivity {

    Robot robot ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        robot = Robot.getInstance() ;
        robot.setNlpListener(new Robot.NlpListener() {
            @Override
            public void onNlpCompleted(NlpResult nlpResult) {

            }
        });
    }

    @Override
    protected Class getMainServiceClassName() {
        return Service.class;
    }

}
