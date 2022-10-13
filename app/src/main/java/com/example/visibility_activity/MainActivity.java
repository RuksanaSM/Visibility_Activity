package com.example.visibility_activity;

        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout l1,l2;
    Button login,signup;
    View v1,v2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        l1=findViewById(R.id.l1);
        l2=findViewById(R.id.l2);
        login=findViewById(R.id.login);
        signup=findViewById(R.id.signup);
        v1=findViewById(R.id.view1);
        v2=findViewById(R.id.view2);

        login.setBackgroundColor(getResources().getColor(R.color.pink));
        signup.setBackgroundColor(getResources().getColor(R.color.gray));
        l1.setVisibility(View.VISIBLE);
        l2.setVisibility(View.GONE);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login.setBackgroundColor(getResources().getColor(R.color.teal_700));
                signup.setBackgroundColor(getResources().getColor(R.color.gray));
                login.setTextColor(getResources().getColor(R.color.black));
                signup.setTextColor(getResources().getColor(R.color.white));
                l1.setVisibility(View.VISIBLE);
                l2.setVisibility(View.GONE);

                v1.setBackgroundColor(getResources().getColor(R.color.black));
                v1.setVisibility(View.VISIBLE);
                v2.setVisibility(View.GONE);
            }
        });

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signup.setBackgroundColor(getResources().getColor(R.color.teal_700));
                login.setBackgroundColor(getResources().getColor(R.color.gray));
                signup.setTextColor(getResources().getColor(R.color.black));
                login.setTextColor(getResources().getColor(R.color.white));
                l2.setVisibility(View.VISIBLE);
                l1.setVisibility(View.GONE);

                v2.setBackgroundColor(getResources().getColor(R.color.black));
                v2.setVisibility(View.VISIBLE);
                v1.setVisibility(View.GONE);
            }
        });
    }

   /* public void login(View view) {
        l1.setVisibility(View.VISIBLE);
        l2.setVisibility(View.GONE);
    }

    public void signup(View view) {
        l2.setVisibility(View.VISIBLE);
        l1.setVisibility(View.GONE);
    }*/
}