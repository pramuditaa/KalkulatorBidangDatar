package com.example.kalkulatorbidangdatar;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class KetigaFragment extends Fragment {
    private EditText txt_jari;
    private Button btnHasil;
    private TextView hasilluas, hasilkeliling;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_ketiga, container, false);
        txt_jari=v.findViewById(R.id.txt_jari);
        btnHasil=v.findViewById(R.id.btnHasil);
        hasilluas=v.findViewById(R.id.hasilluas);
        hasilkeliling= v.findViewById(R.id.hasilkeliling);

        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nilai =txt_jari.getText().toString();

                if(nilai.isEmpty()){
                    txt_jari.setError("Data tidak boleh kosong");
                    txt_jari.requestFocus();
                }else {
                    Double jari = Double.parseDouble(nilai);
                    Double luas = Math.PI * Math.pow(jari, 2);
                    Double keliling = 2 * jari * Math.PI;

                    hasilluas.setText(String.format("%.2f", luas));
                    hasilkeliling.setText(String.format("%.2f", keliling));
                }
            }
        });
        return v;
    }
}