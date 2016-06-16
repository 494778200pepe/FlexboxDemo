package com.zitech.flexboxdemo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Context mContext = MainActivity.this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.main_btn1://flexDirection
                startActivity(new Intent(mContext, FlexDirectionAct.class));
                break;
            case R.id.main_btn2://flexWrap
                startActivity(new Intent(mContext, FlexWrapAct.class));
                break;
            case R.id.main_btn3://justifyContent
                startActivity(new Intent(mContext, JustifyContentAct.class));
                break;
            case R.id.main_btn4://alignItems
                startActivity(new Intent(mContext, AlignItemsAct.class));
                break;
            case R.id.main_btn5://alignContent
                startActivity(new Intent(mContext, AlignContentAct.class));
                break;
            case R.id.main_btn6://layout_order
                startActivity(new Intent(mContext, LayoutOrderAct.class));
                break;
            case R.id.main_btn7://layout_flexGrow
                startActivity(new Intent(mContext, LayoutFlexGrowAct.class));
                break;
            case R.id.main_btn8://layout_flexShrink
                startActivity(new Intent(mContext, LayoutFlexShrinkAct.class));
                break;
            case R.id.main_btn9://layout_alignSelf
                startActivity(new Intent(mContext, LayoutAlignSelfAct.class));
                break;
            case R.id.main_btn10://layout_flexBasisPercent
                startActivity(new Intent(mContext, LayoutFlexBasisPercenAct.class));
                break;
        }
    }
}
