package com.example.hoangcode.calculator1;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.view.View.OnClickListener;




public class MainActivity extends AppCompatActivity implements OnClickListener {

    //khai bao bien
    private Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9,
            btnCham, btnAmDuong, btnBang, btnNgoac, btnCong, btnTru, btnXoa, btnNhan, btnChia, btnSet0;
    private EditText edtText;
    String str = "";
    String pheptoan = "";
    float a = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //tham chieu cac button thong qua id cung voi cac bien moi dat
        edtText = (EditText) findViewById(R.id.editText);

        btn0 = (Button) findViewById(R.id.button0);
        btn1 = (Button) findViewById(R.id.button1);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button3);
        btn4 = (Button) findViewById(R.id.button4);
        btn5 = (Button) findViewById(R.id.button5);
        btn6 = (Button) findViewById(R.id.button6);
        btn7 = (Button) findViewById(R.id.button7);
        btn8 = (Button) findViewById(R.id.button8);
        btn9 = (Button) findViewById(R.id.button9);

        btnCham = (Button) findViewById(R.id.buttonCham);
        btnAmDuong = (Button) findViewById(R.id.buttonAmDuong);
        btnBang = (Button) findViewById(R.id.buttonBang);
        btnNgoac = (Button) findViewById(R.id.buttonNgoac);
        btnCong = (Button) findViewById(R.id.buttonCong);
        btnTru = (Button) findViewById(R.id.buttonTru);
        btnXoa = (Button) findViewById(R.id.buttonXoa);
        btnNhan = (Button) findViewById(R.id.buttonNhan);
        btnChia = (Button) findViewById(R.id.buttonChia);
        btnSet0 = (Button) findViewById(R.id.buttonSet0);
        //
        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);

        btnCham.setOnClickListener(this);
        btnAmDuong.setOnClickListener(this);
        btnBang.setOnClickListener(this);
        btnNgoac.setOnClickListener(this);
        btnCong.setOnClickListener(this);
        btnTru.setOnClickListener(this);
        btnXoa.setOnClickListener(this);
        btnNhan.setOnClickListener(this);
        btnChia.setOnClickListener(this);
        btnSet0.setOnClickListener(this);
        //

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == btn0.getId()) {
            str = str + 0;
            edtText.setText(str);
        } else if (v.getId() == btn1.getId()) {
            str = str + 1;
            edtText.setText(str);
        } else if (v.getId() == btn2.getId()) {
            str = str + 2;
            edtText.setText(str);
        } else if (v.getId() == btn3.getId()) {
            str = str + 3;
            edtText.setText(str);
        } else if (v.getId() == btn4.getId()) {
            str = str + 4;
            edtText.setText(str);
        } else if (v.getId() == btn5.getId()) {
            str = str + 5;
            edtText.setText(str);
        } else if (v.getId() == btn6.getId()) {
            str = str + 6;
            edtText.setText(str);
        } else if (v.getId() == btn7.getId()) {
            str = str + 7;
            edtText.setText(str);
        } else if (v.getId() == btn8.getId()) {
            str = str + 8;
            edtText.setText(str);
        } else if (v.getId() == btn9.getId()) {
            str = str + 9;
            edtText.setText(str);
        } else if (v.getId() == btnBang.getId()) {

            String ht = edtText.getText().toString();
            if (pheptoan == "+") {
                float b = 0;
                String test = ht.replace('+', '#');
                String[] str2 = test.split("#");
                for (int i = 0; i < str2.length; i++) {
                    a = Float.parseFloat(str2[i]);
                    b = b + a;
                }
                str = "";
                edtText.setText(str);
                str = str + b;
                edtText.setText(str);
            } else if (pheptoan == "-") {
                float b = 0;
                String test = ht.replace('-', '#');
                String[] str2 = test.split("#");
                for (int i = 0; i < str2.length; i++) {
                    a = Float.parseFloat(str2[i]);
                    if (i < 2) {
                        b = -b - a;
                    } else if (i >= 2) {
                        a = a * -1;
                        b = -b - a;
                        b = b * -1;
                    }
                }
                str = "";
                edtText.setText(str);
                str = str + b;
                edtText.setText(str);
            } else if (pheptoan == "*") {
                float b = 1;
                String test = ht.replace('*', '#');
                String[] str2 = test.split("#");
                for (int i = 0; i < str2.length; i++) {
                    a = Float.parseFloat(str2[i]);
                    b = b * a;
                }
                str = "";
                edtText.setText(str);
                str = str + b;
                edtText.setText(str);
            }else if (pheptoan == "/") {
                float b=1;
                String test = ht.replace('/', '#');
                String[] str2 = test.split("#");
                for (int i = 0; i < str2.length; i++) {
                    a = Float.parseFloat(str2[i]);
                    if(i<1) b = a/b;
                    else b=b/a;
                }
                str = "";
                edtText.setText(str);
                str = str + b;
                edtText.setText(str);
            }
        } else if (v.getId() == btnCong.getId()) {
            str = str + "+";
            this.pheptoan = "+";
            edtText.setText(str);
        } else if (v.getId() == btnTru.getId()) {
            str = str + "-";
            this.pheptoan = "-";
            edtText.setText(str);
        } else if (v.getId() == btnNhan.getId()) {
            str = str + "*";
            this.pheptoan = "*";
            edtText.setText(str);
        } else if (v.getId() == btnChia.getId()) {
            str = str + "/";
            this.pheptoan = "/";
            edtText.setText(str);
        } else if (v.getId() == btnAmDuong.getId()) {
            str = "-" + str;
            edtText.setText(str);
        } else if (v.getId() == btnCham.getId()) {
            str = str + ".";
            edtText.setText(str);
        } else if (v.getId() == btnSet0.getId()) {
            str = "";
            edtText.setText("");
        } else if (v.getId() == btnNgoac.getId()) {
            str = "";
            edtText.setText("");
        }else if(v.getId()==btnXoa.getId()){

        }
    }
}
