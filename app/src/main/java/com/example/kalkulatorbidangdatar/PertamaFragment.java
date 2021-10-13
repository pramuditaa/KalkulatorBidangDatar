package com.example.kalkulatorbidangdatar;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.awt.font.TextAttribute;

public class PertamaFragment extends Fragment {
    private Button btnHasil;
    private EditText txt_panjang, txt_lebar;
    private TextView hasilluas, hasilkeliling;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_pertama, container, false);
        btnHasil =v.findViewById(R.id.btnHasil);
        txt_panjang=v.findViewById(R.id.txt_panjang);
        txt_lebar=v.findViewById(R.id.txt_lebar);
        hasilluas = v.findViewById(R.id.hasilluas);
        hasilkeliling= v.findViewById(R.id.hasilkeliling);

        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nilai1 =txt_panjang.getText().toString();
                String nilai2 =txt_lebar.getText().toString();

                if(nilai1.isEmpty()){
                    txt_panjang.setError("Data tidak boleh kosong");
                    txt_panjang.requestFocus();
                }else if(nilai2.isEmpty()){
                    txt_lebar.setError("Data tidak boleh kosong");
                    txt_lebar.requestFocus();
                }else {
                    Integer panjang= Integer.parseInt(nilai1);
                    Integer lebar= Integer.parseInt(nilai2);

                    Integer luas = panjang * lebar;
                    Integer keliling = 2 * panjang + 2 * lebar;

                    hasilluas.setText(String.valueOf(luas));
                    hasilkeliling.setText(String.valueOf(keliling));
                }
            }
        });
        return v;
    }
}