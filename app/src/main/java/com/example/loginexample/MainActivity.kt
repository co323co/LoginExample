package com.example.loginexample

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.Nullable
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // ?물음표를 타입 뒤에 붙이면 null이 들어가
        // 자바에서는 @Nullable
        var something: Int? = null

        /**
         * shared preferences는 어떤 액티비티든지 접근 가능
         * 인자 첫번째 name은 저장 공간명
         * 뒤에는 그냥 외워서 쓰샘.
         */
        var prefs = getSharedPreferences("profile", Context.MODE_PRIVATE)

        // 자동 로그인
        var id = prefs.getString("id", null)
        if(id != null) {
            //TODO 로그인 했으면 다음 액티비티
        }

        // !! 는 값이 널이 아니다!
        btn_login.setOnClickListener {
            if(et_id.text!!.equals("coco")  && et_pwd.text!!.equals("1213")) {
                // TODO 다음 액티비티
            }else {
                et_id.error = "id 틀림"
            }
        }

        btn_register.setOnClickListener {
            // TODO 회원가입 액티비티 실행
            var intent = Intent(this,RegisterActivity::class.java)
            startActivity(intent)

        }

    }
}
