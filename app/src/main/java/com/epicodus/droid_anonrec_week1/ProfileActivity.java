package com.epicodus.droid_anonrec_week1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class ProfileActivity extends AppCompatActivity {
    @Bind(R.id.name) TextView mName;
    @Bind(R.id.homegroup) TextView mHomegroup;
    @Bind(R.id.neighborhood) TextView mNeighborhood;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String homegroup = intent.getStringExtra("homegroup");
        String neighborhood = intent.getStringExtra("neighborhood");
    }
}
