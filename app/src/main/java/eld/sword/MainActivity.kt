package eld.sword

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

const val EXTRA_COLOR = "eld.sword.COLOR"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun showColor(view: View) {
        val color = view.backgroundTintList.defaultColor
        val intent = Intent(this, ShowColorActivity::class.java).apply {
            putExtra(EXTRA_COLOR, color)
        }
        startActivity(intent)
    }
}
