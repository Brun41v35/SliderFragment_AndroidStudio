package com.example.sliderfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.heinrichreimersoftware.materialintro.app.IntroActivity
import com.heinrichreimersoftware.materialintro.slide.FragmentSlide

class MainActivity : IntroActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        isButtonBackVisible = false
        isButtonNextVisible = false

        addSlide(FragmentSlide.Builder()
            .fragment(R.layout.intro_1)
            .background(R.color.colorBackground)
            .build())

        addSlide(FragmentSlide.Builder()
            .fragment(R.layout.intro_2)
            .background(R.color.colorBackground)
            .build())

        addSlide(FragmentSlide.Builder()
            .fragment(R.layout.intro_3)
            .background(R.color.colorBackground)
            .canGoForward(false)
            .build())
    }
}
