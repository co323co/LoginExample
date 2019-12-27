package com.example.loginexample

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        btn_enroll.setOnClickListener {
            var id = et_register_id.text
            var psw = et_PSD.text
            var rpsw = et_RPSW.text

            //id?.equals를 하면 id의 값이 널일수 있단게 아니라
            //equals함수의 결과값이 널일 수 있다
            Log.d("dkdk", et_register_id.text.toString())

            if(id.toString().equals("")){
                et_register_id.error="빈칸 존재"//
            }
            else{
                if(!et_PSD.text.toString().equals(rpsw))
                    et_RPSW.error="비밀번호가 같지 않음"
                else
                {
                    //TODO 회원정보 등록
                }
            }
        }
    }
}