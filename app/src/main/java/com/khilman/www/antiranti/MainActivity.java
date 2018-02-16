package com.khilman.www.antiranti;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tvNomorAntrian)
    TextView tvNomorAntrian;
    @BindView(R.id.btnAmbilAntrian)
    Button btnAmbilAntrian;
    @BindView(R.id.btnLihatAntrian)
    Button btnLihatAntrian;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.btnAmbilAntrian)
    public void onBtnAmbilAntrianClicked() {

    }

    @OnClick(R.id.btnLihatAntrian)
    public void onBtnLihatAntrianClicked() {

    }
}
