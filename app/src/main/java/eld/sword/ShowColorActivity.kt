package eld.sword

import android.graphics.drawable.ColorDrawable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ShowColorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_color)

        val color = intent.getIntExtra(EXTRA_COLOR, 0)
        val button = findViewById<Button>(R.id.button).apply {
            background = ColorDrawable(color)
        }
    }
}
