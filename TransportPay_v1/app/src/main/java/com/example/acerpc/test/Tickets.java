package com.example.acerpc.test;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class Tickets extends AppCompatActivity implements View.OnClickListener {

    private BottomNavigationView mMainNav;
    private FrameLayout mMainFrame;


    private TransportpayFragment transportpayFragment;
    private TicketsFragment ticketsFragment;


    private int visibility;

    private RelativeLayout openForm;
    private RelativeLayout closeForm;
    private LinearLayout linearLayoutForOpenForm;


    private RelativeLayout openForm2;
    private RelativeLayout closeForm2;
    private LinearLayout linearLayoutForOpenForm2;

    private RelativeLayout openForm3;
    private RelativeLayout closeForm3;
    private LinearLayout linearLayoutForOpenForm3;

    private RelativeLayout openForm4;
    private RelativeLayout closeForm4;
    private LinearLayout linearLayoutForOpenForm4;

    private RelativeLayout openForm5;
    private RelativeLayout closeForm5;
    private LinearLayout linearLayoutForOpenForm5;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tickets);


        mMainFrame = (FrameLayout) findViewById(R.id.main_frame);
        mMainNav = (BottomNavigationView) findViewById(R.id.main_nav);


        transportpayFragment = new TransportpayFragment();
        ticketsFragment = new TicketsFragment();

        setFragment(transportpayFragment);

        mMainNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.nav_transportpay:
                        setFragment(transportpayFragment);
                        return true;
                    case R.id.nav_tickets:
                        setFragment(ticketsFragment);
                        return true;
                    default:
                        return false;
                }

            }

        });










    }

    private void setFragment(Fragment fragment) {

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        fragmentTransaction.replace(R.id.main_frame, fragment);

        fragmentTransaction.commit();

    }

    public void onClick(View view) {

        if (view.getId() == R.id.qr_code_button1) {
            Intent changeToTickets = new Intent(this, Qr.class);
            startActivity(changeToTickets);
        }

        if (view.getId() == R.id.qr_code_button2) {
            Intent changeToTickets = new Intent(this, Qr.class);
            startActivity(changeToTickets);
        }

        if (view.getId() == R.id.qr_code_button3) {
            Intent changeToTickets = new Intent(this, Qr.class);
            startActivity(changeToTickets);
        }

        if (view.getId() == R.id.qr_code_button4) {
            Intent changeToTickets = new Intent(this, Qr.class);
            startActivity(changeToTickets);
        }


        openForm = findViewById(R.id.openForm);
        closeForm = findViewById(R.id.closeForm);
        linearLayoutForOpenForm = (LinearLayout)findViewById(R.id.linearLayoutForOpenForm);

        if(view.getId() == R.id.closeForm) {
            closeForm.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    closeForm.setVisibility(View.GONE);
                    linearLayoutForOpenForm.startAnimation(new ScaleAnimToShow(1.0f, 1.0f, 1.0f, 0.0f, 500,
                            linearLayoutForOpenForm, true));
                    linearLayoutForOpenForm.setVisibility(View.VISIBLE);
                }
            });
        }
        if(view.getId() == R.id.openForm) {
            openForm.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    linearLayoutForOpenForm.setVisibility(View.GONE);
                    closeForm.startAnimation(new ScaleAnimToShow(1.0f, 1.0f, 1.0f, 0.0f, 500,
                            closeForm, true));
                    closeForm.setVisibility(View.VISIBLE);
                }
            });
        }



        openForm2 = findViewById(R.id.openForm2);
        closeForm2 = findViewById(R.id.closeForm2);
        linearLayoutForOpenForm2 = (LinearLayout)findViewById(R.id.linearLayoutForOpenForm2);

        if(view.getId() == R.id.closeForm2) {
            closeForm2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    closeForm2.setVisibility(View.GONE);
                    linearLayoutForOpenForm2.startAnimation(new ScaleAnimToShow(1.0f, 1.0f, 1.0f, 0.0f, 500,
                            linearLayoutForOpenForm2, true));
                    linearLayoutForOpenForm2.setVisibility(View.VISIBLE);
                }
            });
        }
        if(view.getId() == R.id.openForm2) {
            openForm2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    linearLayoutForOpenForm2.setVisibility(View.GONE);
                    closeForm2.startAnimation(new ScaleAnimToShow(1.0f, 1.0f, 1.0f, 0.0f, 500,
                            closeForm2, true));
                    closeForm2.setVisibility(View.VISIBLE);
                }
            });
        }






        openForm3 = findViewById(R.id.openForm3);
        closeForm3 = findViewById(R.id.closeForm3);
        linearLayoutForOpenForm3 = (LinearLayout)findViewById(R.id.linearLayoutForOpenForm3);

        if(view.getId() == R.id.closeForm3) {
            closeForm3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    closeForm3.setVisibility(View.GONE);
                    linearLayoutForOpenForm3.startAnimation(new ScaleAnimToShow(1.0f, 1.0f, 1.0f, 0.0f, 500,
                            linearLayoutForOpenForm3, true));
                    linearLayoutForOpenForm3.setVisibility(View.VISIBLE);
                }
            });
        }
        if(view.getId() == R.id.openForm3) {
            openForm3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    linearLayoutForOpenForm3.setVisibility(View.GONE);
                    closeForm3.startAnimation(new ScaleAnimToShow(1.0f, 1.0f, 1.0f, 0.0f, 500,
                            closeForm3, true));
                    closeForm3.setVisibility(View.VISIBLE);
                }
            });
        }





        openForm4 = findViewById(R.id.openForm4);
        closeForm4 = findViewById(R.id.closeForm4);
        linearLayoutForOpenForm4 = (LinearLayout)findViewById(R.id.linearLayoutForOpenForm4);

        if(view.getId() == R.id.closeForm4) {
            closeForm4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    closeForm4.setVisibility(View.GONE);
                    linearLayoutForOpenForm4.startAnimation(new ScaleAnimToShow(1.0f, 1.0f, 1.0f, 0.0f, 500,
                            linearLayoutForOpenForm4, true));
                    linearLayoutForOpenForm4.setVisibility(View.VISIBLE);
                }
            });
        }
        if(view.getId() == R.id.openForm4) {
            openForm4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    linearLayoutForOpenForm4.setVisibility(View.GONE);
                    closeForm4.startAnimation(new ScaleAnimToShow(1.0f, 1.0f, 1.0f, 0.0f, 500,
                            closeForm4, true));
                    closeForm4.setVisibility(View.VISIBLE);
                }
            });
        }


        openForm5 = findViewById(R.id.openForm5);
        closeForm5 = findViewById(R.id.closeForm5);
        linearLayoutForOpenForm5 = (LinearLayout)findViewById(R.id.linearLayoutForOpenForm5);

        if(view.getId() == R.id.closeForm5) {
            closeForm5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    closeForm5.setVisibility(View.GONE);
                    linearLayoutForOpenForm5.startAnimation(new ScaleAnimToShow(1.0f, 1.0f, 1.0f, 0.0f, 500,
                            linearLayoutForOpenForm5, true));
                    linearLayoutForOpenForm5.setVisibility(View.VISIBLE);
                }
            });
        }
        if(view.getId() == R.id.openForm5) {
            openForm5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    linearLayoutForOpenForm5.setVisibility(View.GONE);
                    closeForm5.startAnimation(new ScaleAnimToShow(1.0f, 1.0f, 1.0f, 0.0f, 500,
                            closeForm5, true));
                    closeForm5.setVisibility(View.VISIBLE);
                }
            });
        }





    }
}
