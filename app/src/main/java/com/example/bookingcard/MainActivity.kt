package com.example.bookingcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.background
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.res.colorResource
import com.example.booking.ui.theme.colorPeach
import com.example.booking.ui.theme.colorPrimary
import com.example.bookingcard.ui.theme.BookingCardTheme
import com.example.bookingcard.ui.theme.colorPrimary  // Importing color from your Colors.kt file

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BookingCardTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    // Main content layout
                    MainContent(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun MainContent(modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(16.dp)) {
        // Greeting Text
        Greeting(name = "Android")

        // Card with custom background color, shape, and elevation
        Card(
            modifier = Modifier
                .padding(top = 32.dp)
                .fillMaxWidth(),
            backgroundColor = colorPrimary,  // Using colorPrimary from Colors.kt
            shape = RoundedCornerShape(16.dp),  // Custom rounded corners
            elevation = 8.dp  // Add shadow/elevation
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Text(
                    text = "Welcome to Booking App!",
                    color = Color.White,  // Use white text color
                    style = MaterialTheme.typography.bodyLarge
                )
                // Add more content inside the card if needed
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier,
        style = MaterialTheme.typography.h4  // Style it using Material theme typography
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BookingCardTheme {
        MainContent()
    }
}
