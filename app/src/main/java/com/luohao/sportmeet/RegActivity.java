package com.luohao.sportmeet;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;

import com.luohao.sportmeet.Service.UserService;

public class RegActivity extends Activity implements View.OnClickListener {
    private Button ExitButton;
    private Button RegButton;

    private EditText username;
    private EditText password1;
    private EditText password2;

    private Switch type;

    UserService userService = new UserService();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_reg);

        //注册和返回按钮
        ExitButton = (Button) findViewById(R.id.exit_button);
        RegButton = (Button) findViewById(R.id.enter_reg_button);

        //用户注册信息
        username = (EditText) findViewById(R.id.username_edit);
        password1 = (EditText) findViewById(R.id.input_password);
        password2 = (EditText) findViewById(R.id.enter_password);

        //用户类型
        type = (Switch) findViewById(R.id.class_teach);

        RegButton.setOnClickListener(this);
        ExitButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.exit_button:
                finish();
                break;
            case R.id.enter_reg_button:
                if (!username.getText().toString().equals("")) {
//                    if (userService.enterPassword(password1.getText().toString(), password2.getText().toString())) {
//                        type.setOnClickListener(new CompoundButton.OnCheckedChangeListener() {
//                            @Override
//                            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//                                System.out.println(isChecked);
//                            }
//                        });
//                    }
                }
                break;
        }
    }
}
