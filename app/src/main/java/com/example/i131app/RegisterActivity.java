package com.example.i131app;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RadioButton;
import android.widget.Toast;

import com.example.i131app.activity.MainActivity;
import com.example.i131app.activity.testActivity;
import com.example.i131app.sqlDatabase.DBManager;
import com.example.i131app.sqlDatabase.patientManager;
import com.example.i131app.sqlDatabase.user.patient;
import com.qmuiteam.qmui.widget.dialog.QMUIDialog;
import com.qmuiteam.qmui.widget.dialog.QMUIDialogAction;

import java.util.Calendar;
import java.util.Date;

public class RegisterActivity extends Activity implements View.OnClickListener {

    private TextView name;
    private TextView sex;
    private RadioGroup sexRadio;
    private RadioButton male;
    private RadioButton female;
    private TextView inDate;
    private TextView indateText;
    private RadioGroup diseaseRadio;
    private TextView disease;
    private RadioButton type1;
    private RadioButton type2;
    private RadioButton type3;
    private RadioButton unReserve;
    private RadioButton reserve;
    private RadioButton finished;
    private TextView username;
    private TextView iDcard;
    private TextView password;
    private patient patient = new patient();

    private String Username;
    private String Password;
    private String IDcard;
    private String Nname;
    private String Name;
    private boolean Sex;
    private int State;
    private Date Time = new Date();
    private int time_year;
    private int time_month;
    private int time_day;
    private String Type;
    private int Mark = 0;
    private String Plan = null;
    private String CheckPassword;
    private Calendar calendar;
    private Dialog DatePickerDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        name = (TextView) findViewById(R.id.name);
        sex = (TextView) findViewById(R.id.sex);
        sexRadio = (RadioGroup) findViewById(R.id.sexRadio);
        male = (RadioButton) findViewById(R.id.male);
        female = (RadioButton) findViewById(R.id.female);
        inDate = (TextView) findViewById(R.id.inDate);
        indateText = (TextView) findViewById(R.id.indateText);
        diseaseRadio = (RadioGroup) findViewById(R.id.diseaseRadio);
        disease = (TextView) findViewById(R.id.disease);
        type1 = (RadioButton) findViewById(R.id.type1);
        type2 = (RadioButton) findViewById(R.id.type2);
        type3 = (RadioButton) findViewById(R.id.type3);
        unReserve = (RadioButton) findViewById(R.id.unReserve);
        reserve = (RadioButton) findViewById(R.id.Reserve);
        finished = (RadioButton) findViewById(R.id.finished);
        username = (TextView) findViewById(R.id.username);
        iDcard = (TextView) findViewById(R.id.IDcard);
        password = (TextView) findViewById(R.id.password);

        findViewById(R.id.register).setOnClickListener(this);
        findViewById(R.id.indateText).setOnClickListener(this);

    }

    private EditText getNameText(){
        return (EditText) findViewById(R.id.nameText);
    }

    private EditText getUsernameText(){ return (EditText) findViewById(R.id.usernameText); }

    private EditText getIDcardText(){
        return (EditText) findViewById(R.id.IDcardText);
    }

    private EditText getPasswordText(){
        return (EditText) findViewById(R.id.passwordText);
    }

    public RadioButton getType1() { return type1; }

    public RadioButton getType2() { return type2; }

    public RadioButton getType3() { return type3; }

    public RadioButton getMale() { return male; }

    public RadioButton getFemale() { return female; }

    public EditText getNnameText(){return (EditText) findViewById(R.id.NnameText);}

    public EditText getPasswordCheckText(){return (EditText) findViewById(R.id.passwordCheckText);}


    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.register:
                //TODO implement
                Username = getUsernameText().getText().toString().trim();
                Password = getPasswordText().getText().toString().trim();
                IDcard = getIDcardText().getText().toString().trim();
                Name = getNameText().getText().toString().trim();
                Nname = getNnameText().getText().toString().trim();
                CheckPassword = getPasswordCheckText().getText().toString().trim();

                if(checkEmpty()&&checkIDAndUsername()&&checkSex()&&checkState()&&getDiseaseType()&&EnsurePassword()){
                    if(!TextUtils.isEmpty(indateText.getText().toString().trim())){
                        //其中的值不为空,说明拥有预约时间
                        Time.setYear(time_year);
                        Time.setMonth(time_month);
                        Time.setYear(time_day);
                    }
                    patient.setMark(0);
                    patient.setState(State);
                    patient.setSex(Sex);
                    patient.setUsername(Username);
                    patient.setPassword(Password);
                    patient.setType(Type);
                    patient.setIDcard(IDcard);
                    patient.setName(Name);
                    patient.setNname(Nname);
                    new QMUIDialog.MessageDialogBuilder(RegisterActivity.this).setMessage("您确定要提交注册信息吗？")
                            .setTitle("个人注册信息")
                            .addAction("取消", new QMUIDialogAction.ActionListener() {
                        @Override
                        public void onClick(QMUIDialog dialog, int index) {
                            dialog.dismiss();
                        }
                            })
                            .addAction("确定",new QMUIDialogAction.ActionListener(){
                                @Override
                                public void onClick(QMUIDialog dialog, int index) {
                                    new loginThread().start();
                                    Toast.makeText(RegisterActivity.this, "注册成功，请重新登录", Toast.LENGTH_SHORT).show();
                                    Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
                                    startActivity(intent);

                                }
                            })
                            .create().show();
                }
                break;
            case R.id.indateText:
                calendar = Calendar.getInstance();
                DatePickerDialog = new DatePickerDialog(RegisterActivity.this,
                                   new DatePickerDialog.OnDateSetListener() {
                           @Override
                           public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                               System.out.println("年-->" + year + "月-->"
                                       + monthOfYear + "日-->" + dayOfMonth);
                               time_day = dayOfMonth;
                               time_month = monthOfYear;
                               time_year = year;
                               indateText.setText(year + "/" + monthOfYear + "/" + dayOfMonth); }},
                        calendar.get(Calendar.YEAR),
                        calendar.get(Calendar.MONTH),
                        calendar.get(Calendar.DAY_OF_MONTH));
                DatePickerDialog.show();
                break;
        }
    }

    public Boolean checkEmpty() {

        if (TextUtils.isEmpty(Name)) {
            Toast.makeText(RegisterActivity.this, "姓名不可为空", Toast.LENGTH_SHORT).show();
            return false;
        }

        if(!getMale().isChecked()&&!getFemale().isChecked()){
            Toast.makeText(RegisterActivity.this, "性别不可为空", Toast.LENGTH_SHORT).show();
            return false;
        }

        if(!getType1().isChecked()&&!getType2().isChecked()&&!getType3().isChecked()){
            Toast.makeText(RegisterActivity.this, "预约状态不可为空", Toast.LENGTH_SHORT).show();
            return false;
        }

        if (TextUtils.isEmpty(Username)) {
            Toast.makeText(RegisterActivity.this, "电话号码不可为空", Toast.LENGTH_SHORT).show();
            return false;
        }

        if (TextUtils.isEmpty(IDcard)) {
            Toast.makeText(RegisterActivity.this, "身份证号不可为空", Toast.LENGTH_SHORT).show();
            return false;
        }

        if (TextUtils.isEmpty(Password)) {
            Toast.makeText(RegisterActivity.this, "密码不可为空", Toast.LENGTH_SHORT).show();
            return false;
        }

        if (TextUtils.isEmpty(CheckPassword)) {
            Toast.makeText(RegisterActivity.this, "核对密码不可为空", Toast.LENGTH_SHORT).show();
            return false;
        }

        return true;
    }

    public boolean checkSex(){
        //核对性别和身份证号是否吻合
        int subID_sex = Integer.valueOf(IDcard.substring(14,15));
        if(getMale().isChecked()&&subID_sex==1){
            //男性
            Sex = true;
            return true;//"1"代表男
        }
        else if (getFemale().isChecked()&&subID_sex==0){
            //女性
            Sex = false;
            return true;//"0"代表女
        }
        else {
            //未选择性别
            Toast.makeText(RegisterActivity.this,"您所填写的性别和身份证号中信息不匹配，请检查相应信息",Toast.LENGTH_SHORT).show();
        }
        return false;
    }

    public Boolean getDiseaseType(){
        if(getType1().isChecked()){
            Type = getType1().getText().toString();
        }
        else if(getType2().isChecked()){
            Type = getType2().getText().toString();

        }
        else if (getType3().isChecked()){
            Type = getType3().getText().toString();
        }
        else {
            Toast.makeText(RegisterActivity.this, "疾病类型不可为空", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }

    public Boolean checkState(){
        if(unReserve.isChecked()){
            //没有预约
            State = 0;
            if(!TextUtils.isEmpty(indateText.getText().toString())){
                indateText.setText("");
                Toast.makeText(RegisterActivity.this, "不可填写入院时间", Toast.LENGTH_SHORT).show();
                indateText.setFocusable(false);//设置为不可编辑
                indateText.setClickable(false);//设置为不可点击
            }
        }
        else if(reserve.isChecked()){
            //已经预约
            State = 1;
            if(TextUtils.isEmpty(indateText.getText().toString().trim())){
                //已预约但是时间未填写
                Toast.makeText(RegisterActivity.this, "预约时间未填写", Toast.LENGTH_SHORT).show();
                return false;
            }
        }
        else if(finished.isChecked()) {
            //已经完成治疗
            State = 2;
        }
        else {
            Toast.makeText(RegisterActivity.this, "入院状态不可为空", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }

    public Boolean checkIDAndUsername(){
        if(IDcard.length()!=18){
            //身份证号位数错误
            getIDcardText().setText("");
            Toast.makeText(RegisterActivity.this, "身份证号格式错误，请重新输入", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (Username.length()!=11)
        {
            //身份证号位数错误
            getUsernameText().setText("");
            Toast.makeText(RegisterActivity.this, "手机号码格式错误，请重新输入", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }

    public Boolean EnsurePassword(){
        if (!Password.equals(CheckPassword)) {
            Toast.makeText(RegisterActivity.this, "密码输入错误，请重新输入", Toast.LENGTH_SHORT).show();
            getPasswordText().setText("");
            getPasswordCheckText().setText("");
            return false;
        }
        return true;
    }

    private class loginThread extends Thread{
        private DBManager dbManager = DBManager.getInstance(RegisterActivity.this);

        @Override
        public void run() {
            super.run();
            patientManager patientManager = dbManager.getStudentManager();
           try {
               patientManager.insert(patient);
           }catch (Exception e){
               e.fillInStackTrace();
           }

        }
    }



}
