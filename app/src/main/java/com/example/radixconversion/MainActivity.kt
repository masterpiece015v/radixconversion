package com.example.radixconversion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        seekBarSrcRadix.setOnSeekBarChangeListener( SeekBarSrcRadixListener() )
        seekBarDestRadix.setOnSeekBarChangeListener( SeekBarDestRadixListener() )
    }
    inner class SeekBarSrcRadixListener : SeekBar.OnSeekBarChangeListener{
        val radixMap = mapOf( 0 to "2" , 1 to "8" , 2 to "10" , 3 to "16")
        override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
            txtSrcRadix.text = radixMap[progress]
        }
        override fun onStartTrackingTouch(seekBar: SeekBar?) {}
        override fun onStopTrackingTouch(seekBar: SeekBar?) {}
    }
    inner class SeekBarDestRadixListener : SeekBar.OnSeekBarChangeListener{
        val radixMap = mapOf( 0 to "2" , 1 to "8" , 2 to "10" , 3 to "16")
        override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
            txtDestRadix.text = radixMap[progress]
        }
        override fun onStartTrackingTouch(seekBar: SeekBar?) {}
        override fun onStopTrackingTouch(seekBar: SeekBar?) {}
    }


}

