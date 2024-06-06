package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Msg()
        }
    }


    @Composable
    fun Msg() {
        Box(
            modifier = Modifier
                .background(Color.Green)
                .fillMaxSize()
        ) {
            Card(
                //First Quadrant
                colors = CardDefaults.cardColors(
                    containerColor = Color(237, 231, 246),


                    ),
                shape = RectangleShape,
                modifier = Modifier
                    .fillMaxWidth(0.5f)
                    .fillMaxHeight(0.5f),


                ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {

                    Text(
                        text = "Text composable",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(bottom = 16.dp),

                        )

                    Text(
                        text = "Display text and follows",
                        text = "the recommended Material Design guidelines.",
                        lineHeight = 20.sp,
                        textAlign = TextAlign.Justify,

                        )
                }

            }

            Card(
                 //First Quadrant
                colors = CardDefaults.cardColors(
                    containerColor = Color(179, 157,219 ),


                    ),
                shape = RectangleShape,
                modifier = Modifier
                    .fillMaxWidth(0.5f)
                    .fillMaxHeight(0.5f)
                    .align(Alignment.TopEnd),


                ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(18.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {

                    Text(
                        text = "Image Composable",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(bottom = 18.dp),

                        )

                    Text(
                        text = "Creates a composable that lays out",
                        text = "and draws a given Painter class Object.",
                        lineHeight = 20.sp,
                        textAlign = TextAlign.Justify,

                        )
                }

            }

            Card(
                 //Trird Quadrant
                colors = CardDefaults.cardColors(
                    containerColor = Color(126, 87, 194),


                    ),
                shape = RectangleShape,
                modifier = Modifier
                    .fillMaxWidth(0.5f)
                    .fillMaxHeight(0.5f)
                    .align(Alignment.BottomStart),


                ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {

                    Text(
                        text = "Row composable",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(bottom = 18.dp),

                        )

                    Text(
                        text = "A layout composable that places ",
                        text = "its children in a horizontal sequence."
                        lineHeight = 20.sp,
                        textAlign = TextAlign.Justify,

                        )
                }

            }

            Card(
                 //Fourth Quadrant
                colors = CardDefaults.cardColors(
                    containerColor = Color(209, 196, 233),
                ),
                shape = RectangleShape,
                modifier = Modifier
                    .fillMaxWidth(0.5f)
                    .fillMaxHeight(0.5f)
                    .align(Alignment.BottomEnd),

                ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(18.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {

                    Text(
                        text = "Column composable",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(bottom = 18.dp),

                        )

                    Text(
                        text = "A layout composable that places its children in a vertical sequence",
                         text = "its children in a vertical sequence",         
                        lineHeight = 20.sp,
                        textAlign = TextAlign.Justify,

                        )
                }

            }


        }

    }
}
