package com.doctarhyf.customview

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import android.view.View
import androidx.appcompat.app.AlertDialog
import com.doctarhyf.customview.EmotionalFaceView.Companion.HAPPY
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1
        happyButton.setOnClickListener({
            emotionalFaceView.happinessState = EmotionalFaceView.HAPPY
            happyFaceText.setText("Im fucking happy")
        })
// 2


        sadButton.setOnClickListener({ v ->
            emotionalFaceView.happinessState = EmotionalFaceView.SAD
            happyFaceText.setText("Im fucking sad")
        })



        val person:Person = Person(20, "Rhyf")

        val builder = AlertDialog.Builder(this);
        builder.setTitle("${person.name}'s Presentation")
        person.age = 25
        person.name = "Docta"
        builder.setMessage(person.presentation())
        builder.setPositiveButton("OK", { dialog, which ->

            println(person.presentation())
            println("clicking ...")

        })

        builder.show()


    }

    /*val clickListener = View.OnClickListener { view ->

        console
    }*/


}
