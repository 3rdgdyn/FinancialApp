package com.example.test3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button openMyFinance;
    private Button transactionButton;
    private TextView CurrentBalance;
    private Button buttonBalance;
    private Button signOut;
    private Button buttonaboutus;
    private Button buttonreport;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        openMyFinance=findViewById(R.id.openMyFinance);
        openMyFinance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,MyFinanceScreen.class);
                startActivity(intent);
            }
        });


        transactionButton=findViewById(R.id.transactionButton);
        transactionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Transactions.class);
                startActivity(intent);
            }
        });



        buttonBalance=findViewById(R.id.buttonBalance);
        buttonBalance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,BalanceScreen.class);
                startActivity(intent);
            }
        });

        signOut=findViewById(R.id.Signout);
        signOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, Login.class);
                startActivity(intent);
            }
        });

        buttonaboutus=findViewById(R.id.buttonaboutus);
        buttonaboutus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, Aboutus.class);
                startActivity(intent);
            }
        });

        buttonreport=findViewById(R.id.buttonreport);
        buttonreport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, Reports.class);
                startActivity(intent);
            }
        });





















        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });












    }
}