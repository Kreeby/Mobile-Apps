package com.example.acerpc.test;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.zxing.Result;

import me.dm7.barcodescanner.zxing.ZXingScannerView;


/**
 * A simple {@link Fragment} subclass.
 */
public class TransportpayFragment extends Fragment implements View.OnClickListener {

    private static final int REQUEST_CAMERA = 1;
    private ZXingScannerView scannerView;


    public TransportpayFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_transportpay,
                container, false);

        return view;
    }


    @Override
    public void onClick(View view) {


    }
}
