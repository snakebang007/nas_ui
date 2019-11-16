package com.ugreen.nas.filemanager;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.ugreen.nas.common.constant.ARouterConstant;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

@Route(path = ARouterConstant.AppFile.MAIN_ACTIVITY)
public class MainActivity extends AppCompatActivity {

    @BindView(R2.id.button)
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.af_activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R2.id.button})
    public void onClick(View view){
        Log.i("YQBFF","修改成功");
        button.setText("修改成功");
    }
}
