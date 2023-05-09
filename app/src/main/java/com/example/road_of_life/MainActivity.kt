package com.example.road_of_life

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.road_of_life.ui.theme.RoadofLifeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // This contains the MapView in XML and needs to be called after the access token is configured.
        setContentView(R.layout.activity_main)
    }
}

//@Preview
//@Composable
//fun MyLayoutPreview() {
//    setContentView(R.layout.activity_main)
//}
//
//fun setContentView(activityMain: Int) {
//    setContentView(R.layout.activity_main)
//}
