package org.d3if.rumahadatindonesia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    ImageView imgRumah;
    TextView tvNama;
    TextView tvAsal;
    TextView tvDetail;

    String detailNama, detailAsal, detailRumah;
    int detailImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvNama = findViewById(R.id.tv_nama);
        detailNama = getIntent().getStringExtra("nama rumah");
        tvNama.setText(detailNama);

        tvAsal = findViewById(R.id.tv_asal);
        detailAsal = getIntent().getStringExtra("asal rumah");
        tvAsal.setText(detailAsal);

        tvDetail = findViewById(R.id.tv_detail);
        detailAsal = getIntent().getStringExtra("detail rumah");
        tvDetail.setText(detailAsal);

        imgRumah = findViewById(R.id.img_detail);
        detailImg = getIntent().getIntExtra("img rumah", 0);
        imgRumah.setImageResource(detailImg);
    }
}
