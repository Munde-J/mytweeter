package dev.jojo.mytwitterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.jojo.mytwitterapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayTweets()
    }
    fun displayTweets(){
       var tweeter1 =  Tweeter("","Angela @jojangelah", "Software developers design, program, build, deploy and maintain software using many different skills and tools. They also help build software systems that power networks and devices and ensure that those systems remain functional.","1d","8","14","78","165")
        var tweeter2 = Tweeter("","Nancy Bliss","Software developers design, program, build, deploy and maintain software using many different skills and tools. They also help build software systems that power networks and devices and ensure that those systems remain functional.","12h","67","987","23","12")
        var tweeter3 = Tweeter("","Manuela @junemanuel","Software developers design, program, build, deploy and maintain software using many different skills and tools. They also help build software systems that power networks and devices and ensure that those systems remain functional.","12h","9","dfg","23","12")
        var tweeter4 = Tweeter("","Nancy Bliss","Software developers design, program, build, deploy and maintain software using many different skills and tools. They also help build software systems that power networks and devices and ensure that those systems remain functional.","12h","65","678","23","12")
        var tweeter5 = Tweeter("","Gabu @gabrieliss","Software developers design, program, build, deploy and maintain software using many different skills and tools. They also help build software systems that power networks and devices and ensure that those systems remain functional.","12h","21","dfg","23","12")
        var tweeter6 = Tweeter("","Leah @amorlenah","Software developers design, program, build, deploy and maintain software using many different skills and tools. They also help build software systems that power networks and devices and ensure that those systems remain functional.","12h","1","78","23","12")


        var tweetList =
            listOf(tweeter1,tweeter2,tweeter3,tweeter4,tweeter5,tweeter6)
        var adapter = TweeterAdapter(tweetList)
        binding.rvTweets.layoutManager = LinearLayoutManager(this)
        binding.rvTweets.adapter = adapter
    }
}