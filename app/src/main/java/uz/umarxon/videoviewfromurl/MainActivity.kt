package uz.umarxon.videoviewfromurl

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import uz.umarxon.videoviewfromurl.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.play.setOnClickListener {
            val url = binding.titleTxt.text.toString().trim()

            if (url.isNotEmpty()){
                if (url.contains("youtube")||url.contains("facebook")){
                    Toast.makeText(this, "I can't play video from YouTube and FaceBook ", Toast.LENGTH_SHORT).show()
                }else{
                    binding.videoView.setVideoPath(url)
                    binding.videoView.start()
                }
            }
        }
    }
}