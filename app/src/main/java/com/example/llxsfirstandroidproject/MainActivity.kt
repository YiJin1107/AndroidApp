package com.example.llxsfirstandroidproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState) // 父对象帮忙初始化
        setContentView(R.layout.activity_main) // 不是必须的；用来把视图加载到到当前页面
        // val:常量  var:变量 定义量时在冒号后限定类型 视图接口和程序绑定
        val loginText:TextView = findViewById(R.id.login_text_view) // 寻找id，R:resource存放了所有视图的id
        val loginButton: Button = findViewById(R.id.login_button)
        val loginName : EditText = findViewById(R.id.login_name)
        val jumpButton : Button = findViewById(R.id.second_activity_button)

        // 调用按钮触发函数并显示
        loginButton.setOnClickListener {
            Toast.makeText(
                this, // 上下文
                "你点击了确认按钮~", // 输出内容
                Toast.LENGTH_SHORT // 模板
            ).show()
            Log.d("MainActivity onCreate", loginName.text.toString()) // 开发者提示
            loginText.text = loginName.text
            loginText.setText(loginName.text)
         }

        // 跳转
        jumpButton.setOnClickListener {
            // 显示跳转 快递包裹 (自己 ; 目标) 适用于应用内部跳转
            val intent : Intent = Intent(this,SecondActivity::class.java)
            // 传递
            startActivity(intent)
        }

    }
}