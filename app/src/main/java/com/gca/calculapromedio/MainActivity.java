package com.gca.calculapromedio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    RadioGroup rg_prom;
    RadioButton rb_prom2;
    RadioButton rb_prom3;

    EditText et_porce1, et_porce2, et_porce3;

    Button btn_promedia;
    Button btn_limpiar;
    Button btn_clear;

    EditText et_01, et_02, et_03;
    TextView tv_prom1;

    EditText et_11, et_12, et_13;
    TextView tv_prom2;

    EditText et_21, et_22, et_23;
    TextView tv_prom3;

    EditText et_31, et_32, et_33;
    TextView tv_prom4;

    EditText et_41, et_42, et_43;
    TextView tv_prom5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rg_prom = findViewById(R.id.rg_prom);
        rb_prom2 = findViewById(R.id.rb_prom2);
        rb_prom3 = findViewById(R.id.rb_prom3);

        et_porce1 = findViewById(R.id.et_porce1);
        et_porce2 = findViewById(R.id.et_porce2);
        et_porce3 = findViewById(R.id.et_porce3);

        btn_promedia = findViewById(R.id.btn_promedia);
        btn_limpiar = findViewById(R.id.btn_limpiar);
        btn_clear = findViewById(R.id.btn_clear);


        et_01 = findViewById(R.id.et_01);
        et_02 = findViewById(R.id.et_02);
        et_03 = findViewById(R.id.et_03);

        tv_prom1 = findViewById(R.id.tv_prom1);

        et_11 = findViewById(R.id.et_11);
        et_12 = findViewById(R.id.et_12);
        et_13 = findViewById(R.id.et_13);
        tv_prom2 = findViewById(R.id.tv_prom2);

        et_21 = findViewById(R.id.et_21);
        et_22 = findViewById(R.id.et_22);
        et_23 = findViewById(R.id.et_23);
        tv_prom3 = findViewById(R.id.tv_prom3);

        et_31 = findViewById(R.id.et_31);
        et_32 = findViewById(R.id.et_32);
        et_33 = findViewById(R.id.et_33);
        tv_prom4 = findViewById(R.id.tv_prom4);

        et_41 = findViewById(R.id.et_41);
        et_42 = findViewById(R.id.et_42);
        et_43 = findViewById(R.id.et_43);
        tv_prom5 = findViewById(R.id.tv_prom5);

        rg_prom.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.rb_prom2:
                        muestraPara2Calificaciones(et_porce1,et_porce2,et_porce3);
                        muestraPara2Calificaciones(et_01,et_02,et_03,tv_prom1);
                        muestraPara2Calificaciones(et_11,et_12,et_13,tv_prom2);
                        muestraPara2Calificaciones(et_21,et_22,et_23,tv_prom3);
                        muestraPara2Calificaciones(et_31,et_32,et_33,tv_prom4);
                        muestraPara2Calificaciones(et_41,et_42,et_43,tv_prom5);
                        break;
                    case R.id.rb_prom3:
                        muestraPara3Calificaciones(et_porce1,et_porce2,et_porce3);
                        muestraPara3Calificaciones(et_01,et_02,et_03,tv_prom1);
                        muestraPara3Calificaciones(et_11,et_12,et_13,tv_prom2);
                        muestraPara3Calificaciones(et_21,et_22,et_23,tv_prom3);
                        muestraPara3Calificaciones(et_31,et_32,et_33,tv_prom4);
                        muestraPara3Calificaciones(et_41,et_42,et_43,tv_prom5);
                        break;
                    default:
                        break;
                }


            }
        });

        btn_promedia.setOnClickListener(this);
        btn_limpiar.setOnClickListener(this);
        btn_clear.setOnClickListener(this);
        tv_prom1.setOnClickListener(this);
        tv_prom2.setOnClickListener(this);
        tv_prom3.setOnClickListener(this);
        tv_prom4.setOnClickListener(this);
        tv_prom5.setOnClickListener(this);


    }

    public void muestraPara2Calificaciones(EditText et1, EditText et2, EditText et3, TextView tv_res){

        et1.setText("");
        et2.setText("");

        LinearLayout.LayoutParams et1_parametros = (LinearLayout.LayoutParams) et1.getLayoutParams();
        et1_parametros.weight = 1.3f;
        et1.setLayoutParams(et1_parametros);

        LinearLayout.LayoutParams et2_parametros = (LinearLayout.LayoutParams) et2.getLayoutParams();
        et2_parametros.weight = 1.3f;
        et2.setLayoutParams(et2_parametros);

        LinearLayout.LayoutParams et3_parametros = (LinearLayout.LayoutParams) et3.getLayoutParams();
        et3_parametros.weight = 0f;
        et3.setLayoutParams(et3_parametros);

        LinearLayout.LayoutParams tvres_parametros = (LinearLayout.LayoutParams) tv_res.getLayoutParams();
        tvres_parametros.weight = 1.3f;
        tv_res.setLayoutParams(tvres_parametros);

    }

    public void muestraPara2Calificaciones(EditText et1, EditText et2, EditText et3){

        et1.setText("");
        et2.setText("");

        LinearLayout.LayoutParams et1_parametros = (LinearLayout.LayoutParams) et1.getLayoutParams();
        et1_parametros.weight = 1.5f;
        et1.setLayoutParams(et1_parametros);

        LinearLayout.LayoutParams et2_parametros = (LinearLayout.LayoutParams) et2.getLayoutParams();
        et2_parametros.weight = 1.5f;
        et2.setLayoutParams(et2_parametros);

        LinearLayout.LayoutParams et3_parametros = (LinearLayout.LayoutParams) et3.getLayoutParams();
        et3_parametros.weight = 0f;
        et3.setLayoutParams(et3_parametros);

    }

    public void muestraPara3Calificaciones(EditText et1, EditText et2, EditText et3, TextView tv_res){

        et1.setText("");
        et2.setText("");
        et3.setText("");

        LinearLayout.LayoutParams et1_parametros = (LinearLayout.LayoutParams) et1.getLayoutParams();
        et1_parametros.weight = 1f;
        et1.setLayoutParams(et1_parametros);

        LinearLayout.LayoutParams et2_parametros = (LinearLayout.LayoutParams) et2.getLayoutParams();
        et2_parametros.weight = 1f;
        et2.setLayoutParams(et2_parametros);

        LinearLayout.LayoutParams et3_parametros = (LinearLayout.LayoutParams) et3.getLayoutParams();
        et3_parametros.weight = 1f;
        et3.setLayoutParams(et3_parametros);

        LinearLayout.LayoutParams tvres_parametros = (LinearLayout.LayoutParams) tv_res.getLayoutParams();
        tvres_parametros.weight = 1f;
        tv_res.setLayoutParams(tvres_parametros);
//        tv_res.setLayoutParams(new TableLayout.LayoutParams(1,1,2));
    }

    public void muestraPara3Calificaciones(EditText et1, EditText et2, EditText et3){

        et1.setText("");
        et2.setText("");
        et3.setText("");

        LinearLayout.LayoutParams et1_parametros = (LinearLayout.LayoutParams) et1.getLayoutParams();
        et1_parametros.weight = 1f;
        et1.setLayoutParams(et1_parametros);

        LinearLayout.LayoutParams et2_parametros = (LinearLayout.LayoutParams) et2.getLayoutParams();
        et2_parametros.weight = 1f;
        et2.setLayoutParams(et2_parametros);

        LinearLayout.LayoutParams et3_parametros = (LinearLayout.LayoutParams) et3.getLayoutParams();
        et3_parametros.weight = 1f;
        et3.setLayoutParams(et3_parametros);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_promedia:
                tv_prom1.setText(String.format("%.2f", promedia(et_01.getText().toString(), et_02.getText().toString(),et_03.getText().toString())));
                tv_prom2.setText(String.format("%.2f", promedia(et_11.getText().toString(), et_12.getText().toString(),et_13.getText().toString())));
                tv_prom3.setText(String.format("%.2f", promedia(et_21.getText().toString(), et_22.getText().toString(),et_23.getText().toString())));
                tv_prom4.setText(String.format("%.2f", promedia(et_31.getText().toString(), et_32.getText().toString(),et_33.getText().toString())));
                tv_prom5.setText(String.format("%.2f", promedia(et_41.getText().toString(), et_42.getText().toString(),et_43.getText().toString())));
                break;

            case R.id.btn_limpiar:
                et_01.setText("");
                et_02.setText("");
                et_03.setText("");
                tv_prom1.setText("");

                et_11.setText("");
                et_12.setText("");
                et_13.setText("");
                tv_prom2.setText("");

                et_21.setText("");
                et_22.setText("");
                et_23.setText("");
                tv_prom3.setText("");

                et_31.setText("");
                et_32.setText("");
                et_33.setText("");
                tv_prom4.setText("");

                et_41.setText("");
                et_42.setText("");
                et_43.setText("");
                tv_prom5.setText("");

                break;
            case R.id.tv_prom1:
                tv_prom1.setText(String.format("%.2f", promedia(et_01.getText().toString(), et_02.getText().toString(),et_03.getText().toString())));
                break;
            case R.id.tv_prom2:
                tv_prom2.setText(String.format("%.2f", promedia(et_11.getText().toString(), et_12.getText().toString(),et_13.getText().toString())));
                break;
            case R.id.tv_prom3:
                tv_prom3.setText(String.format("%.2f", promedia(et_21.getText().toString(), et_22.getText().toString(),et_23.getText().toString())));
                break;
            case R.id.tv_prom4:
                tv_prom4.setText(String.format("%.2f", promedia(et_31.getText().toString(), et_32.getText().toString(),et_33.getText().toString())));
                break;
            case R.id.tv_prom5:
                tv_prom5.setText(String.format("%.2f", promedia(et_41.getText().toString(), et_42.getText().toString(),et_43.getText().toString())));
                break;
            case  R.id.btn_clear:
                et_porce1.setText("");
                et_porce2.setText("");
                et_porce3.setText("");
                break;
            default:
                System.out.println("No eciste acción");
                break;
        }
    }

    public double promedia(String calA, String calB, String calC){
        double cal_1 = 0;
        double cal_2 = 0;
        double cal_3 = 0;
        double resultado = 0;

        double porcentaje1, porcentaje2, porcentaje3;

        //et_porce1.getText().toString()

        if(rb_prom2.isChecked() == true){
            if (et_porce1.getText().toString().equals("") || et_porce2.getText().toString().equals("")){
                Toast.makeText(getApplicationContext(), "Favor de agregar datos de PORCENTAJE", Toast.LENGTH_SHORT).show();
            }
            else {
                porcentaje1 = Double.parseDouble(et_porce1.getText().toString()) / 100;
                porcentaje2 = Double.parseDouble(et_porce2.getText().toString()) / 100;
                if(porcentaje1 +porcentaje2 != 1){
                    Toast.makeText(getApplicationContext(), "El PORCENTAJE no suma 100%", Toast.LENGTH_SHORT).show();
                }
                else {
                    if (calA.equals("")) {
                        cal_1 = 0;
                    } else {
                        cal_1 = Double.parseDouble(calA);
                    }
                    if (calB.equals("")) {
                        cal_2 = 0;
                    } else {
                        cal_2 = Double.parseDouble(calB);
                    }
                    resultado = (cal_1 * porcentaje1) + (cal_2 * porcentaje2);
                }
            }

        }
        else if (rb_prom3.isChecked() == true) {
            if (et_porce1.getText().toString().equals("") || et_porce2.getText().toString().equals("") || et_porce3.getText().toString().equals("")) {
                Toast.makeText(getApplicationContext(), "Favor de agregar datos de PORCENTAJE", Toast.LENGTH_SHORT).show();
            } else {
                porcentaje1 = Double.parseDouble(et_porce1.getText().toString()) / 100;
                porcentaje2 = Double.parseDouble(et_porce2.getText().toString()) / 100;
                porcentaje3 = Double.parseDouble(et_porce3.getText().toString()) / 100;
                if (porcentaje1 + porcentaje2 + porcentaje3 != 1) {
                    Toast.makeText(getApplicationContext(), "El PORCENTAJE no suma 100%", Toast.LENGTH_SHORT).show();
                } else {
                    if (calA.equals("")) {
                        cal_1 = 0;
                    } else {
                        cal_1 = Double.parseDouble(calA);
                    }
                    if (calB.equals("")) {
                        cal_2 = 0;
                    } else {
                        cal_2 = Double.parseDouble(calB);
                    }
                    if (calC.equals("")) {
                        cal_3 = 0;
                    } else {
                        cal_3 = Double.parseDouble(calC);
                    }
                    resultado = (cal_1 * porcentaje1) + (cal_2 * porcentaje2) + (cal_3 * porcentaje3);
                }
            }
        }


        return resultado;


    }


}
