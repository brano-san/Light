package av.ponomarev.spinner

import android.graphics.Color
import android.graphics.Paint.Align
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout.Alignment
import android.view.View
import android.widget.AdapterView
import android.widget.Button
import android.widget.RadioButton
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.core.view.get
import com.google.android.material.textfield.TextInputLayout
import kotlin.random.Random
import kotlin.random.nextInt

class MainActivity : AppCompatActivity() {
    val arr = listOf(
        R.id.button2, R.id.button3, R.id.button4, R.id.button3, R.id.button2
    )
    val colors = listOf(
        Color.RED, Color.YELLOW, Color.GREEN, Color.YELLOW, Color.RED
    )
    var i = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        for (j in 0..2)
        {
            val btn = findViewById<Button>(arr[j])
            btn.setBackgroundColor(Color.GRAY)
        }

        val ligthBtn = findViewById<Button>(R.id.button)
        ligthBtn.setOnClickListener {
            showDeleteDialog()
        }
    }

    private fun showDeleteDialog() {
        for (j in 0..2)
        {
            val btn = findViewById<Button>(arr[j])
            btn.setBackgroundColor(Color.GRAY)
        }
        val btn = findViewById<Button>(arr[i % 5])
        btn.setBackgroundColor(colors[i % 5])
        i++

    }
}