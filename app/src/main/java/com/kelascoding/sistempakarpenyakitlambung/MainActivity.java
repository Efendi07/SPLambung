package com.kelascoding.sistempakarpenyakitlambung;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox checkNyeriPerih, checkPerutKembung,
            checkNafsuMakan, checkMual,
            checkSembelit, checkDiare,
            checkBbMenurun, checkDemam, checkBabHitam,
            checkRasaMakanan, checkBabCair,
            checkKejangPerut, checkNyeriUlu,
            checkKenyangBerlebih, checkNyeriTukak,
            checkMuntah, checkRasaTerbakar;

    Button btnDiagnosa;
    TextView tvResult;
    TextView nmPenyakit;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkNyeriPerih = findViewById(R.id.cx_nyeri_perih_lambung);
        checkPerutKembung = findViewById(R.id.cx_perut_kembung);
        checkNafsuMakan = findViewById(R.id.cx_nafsu_makan);
        checkMual = findViewById(R.id.cx_mual);
        checkSembelit = findViewById(R.id.cx_sembelit);
        checkDiare = findViewById(R.id.cx_diare);
        checkBabHitam = findViewById(R.id.cx_bab_hitam);
        checkBbMenurun = findViewById(R.id.cx_bb_menurun);
        checkDemam = findViewById(R.id.cx_demam);
        checkRasaMakanan = findViewById(R.id.cx_rasa_makanan);
        checkBabCair = findViewById(R.id.cx_bab_cair);
        checkKejangPerut = findViewById(R.id.cx_kejang_perut);
        checkNyeriUlu = findViewById(R.id.cx_nyeri_ulu_hati);
        checkKenyangBerlebih = findViewById(R.id.cx_kenyang);
        checkNyeriTukak = findViewById(R.id.cx_nyeri_tukak);
        checkMuntah = findViewById(R.id.cx_muntah);
        checkRasaTerbakar = findViewById(R.id.cx_rs_terbakar_dada);

        btnDiagnosa = findViewById(R.id.btn_diagnosa);
        tvResult = findViewById(R.id.tv_result);

        nmPenyakit = findViewById(R.id.penyakit);


        tvResult.setText("Result"); // Kosongkan TextView saat pertama kali aplikasi dijalankan

        btnDiagnosa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                nmPenyakit.setText("a");
                // Untuk Penyakit Gastritis
                    if (checkNyeriPerih.isChecked() && checkPerutKembung.isChecked()
                            && checkNafsuMakan.isChecked() && checkMual.isChecked() &&
                            checkNyeriUlu.isChecked()) {
                        nmPenyakit.setText("Gastritis");
                    }
                    if (checkNyeriPerih.isChecked() && checkPerutKembung.isChecked()
                            && checkMual.isChecked() && checkSembelit.isChecked() &&
                            checkDiare.isChecked() && checkKenyangBerlebih.isChecked()) {
                        nmPenyakit.setText("Dispepsia");
                    }
                    if (checkNafsuMakan.isChecked() && checkMual.isChecked()
                            && checkBbMenurun.isChecked() && checkBabHitam.isChecked() &&
                            checkKejangPerut.isChecked()) {
                        nmPenyakit.setText("Kanker Lambung");
                    }
                    if (checkNyeriPerih.isChecked() && checkPerutKembung.isChecked()
                            && checkMual.isChecked() && checkDemam.isChecked() &&
                            checkRasaMakanan.isChecked() && checkKejangPerut.isChecked()
                            && checkRasaTerbakar.isChecked()) {
                        nmPenyakit.setText("GERD");
                    }
                    if (checkNyeriPerih.isChecked() && checkMual.isChecked()
                            && checkDiare.isChecked() && checkDemam.isChecked() &&
                            checkRasaMakanan.isChecked() && checkKejangPerut.isChecked()
                            && checkMuntah.isChecked()) {
                        nmPenyakit.setText("Gastroenteritis");
                    }
                    if (checkPerutKembung.isChecked() && checkNafsuMakan.isChecked()
                            && checkBbMenurun.isChecked() && checkRasaMakanan.isChecked() &&
                            checkKejangPerut.isChecked() && checkKenyangBerlebih.isChecked()) {
                        nmPenyakit.setText("Gastroparesis");
                    }
                    if (checkNyeriPerih.isChecked() && checkNafsuMakan.isChecked()
                            && checkMual.isChecked() && checkBabHitam.isChecked() &&
                            checkNyeriTukak.isChecked()) {
                        nmPenyakit.setText("Tukak Lambung");
                    }
                // tampilkan penyakit
                tvResult.setText("Anda Menderita \n" + nmPenyakit.getText());
            }
        });
    }

    public void onClickChecked(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        String str = "";

        switch (view.getId()) {
            case R.id.cx_nyeri_perih_lambung:
                str = checked ? "Gejala Nyeri atau Perih Pada Lambung Diseleksi" :
                        "Gejala Nyeri atau Perih Pada Lambung Tidak Diseleksi";
                break;
            case R.id.cx_perut_kembung:
                str = checked ? "Gejala Perut Kembung Diseleksi" :
                        "Gejala Perut Kembung Tidak Diseleksi";
                break;
            case R.id.cx_nafsu_makan:
                str = checked ? "Gejala Nafsu Makan Berkurang Diseleksi" :
                        "Gejala Nafsu Makan Berkurang Tidak Diseleksi";
                break;
            case R.id.cx_mual:
                str = checked ? "Gejala Mual Diseleksi" :
                        "Gejala Mual Tidak Diseleksi";
                break;
            case R.id.cx_sembelit:
                str = checked ? "Gejala Sembelit Diseleksi" :
                        "Gejala Sembelit Tidak Diseleksi";
                break;
            case R.id.cx_diare:
                str = checked ? "Gejala Diare Diseleksi" :
                        "Gejala Diare Tidak Diseleksi";
                break;
            case R.id.cx_bb_menurun:
                str = checked ? "Gejala Berat Badan Menurun Diseleksi" :
                        "Gejala Berat Badan Menurun Tidak Diseleksi";
                break;
            case R.id.cx_bab_hitam:
                str = checked ? "Gejala BAB Berwarna Hitam Diseleksi" :
                        "Gejala BAB Berwarna Hitam Tidak Diseleksi";
                break;
            case R.id.cx_demam:
                str = checked ? "Gejala Demam Diseleksi" :
                        "Gejala Demam Tidak Diseleksi";
                break;
            case R.id.cx_rasa_makanan:
                str = checked ? "Gejala Rasa Makanan Kembali Diseleksi" :
                        "Gejala Rasa Makanan Kembali Tidak Diseleksi";
                break;
            case R.id.cx_bab_cair:
                str = checked ? "Gejala BAB Cair Diseleksi" :
                        "Gejala BAB Cair Tidak Diseleksi";
                break;
            case R.id.cx_kejang_perut:
                str = checked ? "Gejala Kejang Perut Diseleksi" :
                        "Gejala Kejang Perut Tidak Diseleksi";
                break;
            case R.id.cx_nyeri_ulu_hati:
                str = checked ? "Gejala Nyeri Pada Uluh Hati Diseleksi" :
                        "Gejala Nyeri Pada Uluh Hati Tidak Diseleksi";
                break;
            case R.id.cx_kenyang:
                str = checked ? "Gejala Perasaan Kenyang Berlebihan Diseleksi" :
                        "Gejala Perasaan Kenyang Berlebihan Tidak Diseleksi";
                break;
            case R.id.cx_nyeri_tukak:
                str = checked ? "Gejala Nyeri Pada Tukak Lambung Diseleksi" :
                        "Gejala Nyeri Pada Tukak Lambung Tidak Diseleksi";
                break;
            case R.id.cx_muntah:
                str = checked ? "Gejala Muntah Diseleksi" :
                        "Gejala Muntah Tidak Diseleksi";
                break;
            case R.id.cx_rs_terbakar_dada:
                str = checked ? "Gejala Rasa Terbakar Dibagian(HeartBurn) Dada Diseleksi" :
                        "Gejala Gejala Rasa Terbakar Dibagian(HeartBurn) Tidak Diseleksi";
                break;


        }
        Toast.makeText(getApplicationContext(), str, Toast.LENGTH_SHORT).show();
    }

}