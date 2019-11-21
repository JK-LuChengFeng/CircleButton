package com.example.circlebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.oguzdev.circularfloatingactionmenu.library.FloatingActionButton;
import com.oguzdev.circularfloatingactionmenu.library.FloatingActionMenu;
import com.oguzdev.circularfloatingactionmenu.library.SubActionButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn_ceshi;
    private Button btn_ceshi2;
    private Button btn_ceshi3;
    private Button btn_ceshi5;
    private Button btn_ceshi6;
    private Button btn_ceshiBranch;
    private TextView tv_ceshiBranch2;
    private ImageView iv_ceshiBranch;
    private TextView tv_ceshi2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

        TextView a = new TextView(this); a.setText("a"); a.setBackgroundResource(android.R.drawable.btn_default_small);
        TextView b = new TextView(this); b.setText("b"); b.setBackgroundResource(android.R.drawable.btn_default_small);
        TextView c = new TextView(this); c.setText("c"); c.setBackgroundResource(android.R.drawable.btn_default_small);
        TextView d = new TextView(this); d.setText("d"); d.setBackgroundResource(android.R.drawable.btn_default_small);
        TextView e = new TextView(this); e.setText("e"); e.setBackgroundResource(android.R.drawable.btn_default_small);
        TextView f = new TextView(this); f.setText("f"); f.setBackgroundResource(android.R.drawable.btn_default_small);
        TextView g = new TextView(this); g.setText("g"); g.setBackgroundResource(android.R.drawable.btn_default_small);
        TextView h = new TextView(this); h.setText("h"); h.setBackgroundResource(android.R.drawable.btn_default_small);

        FrameLayout.LayoutParams tvParams = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        a.setLayoutParams(tvParams);
        b.setLayoutParams(tvParams);
        c.setLayoutParams(tvParams);
        d.setLayoutParams(tvParams);
        e.setLayoutParams(tvParams);
        f.setLayoutParams(tvParams);
//        g.setLayoutParams(tvParams);
//        h.setLayoutParams(tvParams);

        SubActionButton.Builder subBuilder = new SubActionButton.Builder(this);

        FloatingActionMenu circleMenu = new FloatingActionMenu.Builder(this)
                .setStartAngle(0) // A whole circle!
                .setEndAngle(360)
                .setRadius(150)
                .addSubActionView(a)
                .addSubActionView(b)
                .addSubActionView(c)
                .addSubActionView(d)
                .addSubActionView(e)
                .addSubActionView(f)
//                .addSubActionView(g)
//                .addSubActionView(h)
                .attachTo(btn_ceshi)
                .build();
    }

    private void initView() {

        btn_ceshi = findViewById(R.id.btn_ceshi);
        btn_ceshi.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_ceshi:
                //
                break;
            default:
                break;
        }
    }
}
