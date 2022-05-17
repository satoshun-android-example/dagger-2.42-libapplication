package io.github.satoshun.example

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class AppActivity : AppCompatActivity() {
  @Inject lateinit var test: Test

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    test.show()
  }
}

class Test @Inject constructor() {
  fun show() {
    println("test")
  }
}