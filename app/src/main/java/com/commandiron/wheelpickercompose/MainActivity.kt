package com.commandiron.wheelpickercompose

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.commandiron.wheel_picker_compose.WheelTimePicker
import com.commandiron.wheel_picker_compose.core.TimeFormat
import com.commandiron.wheel_picker_compose.core.WheelPickerDefaults
import com.commandiron.wheelpickercompose.ui.theme.WheelPickerComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WheelPickerComposeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Box(modifier = Modifier.padding(horizontal = 18.dp)) {
                            WheelTimePicker(
                                timeFormat = TimeFormat.AM_PM,
                                textColor = Color(0xFFE3E3E3),
                                size = DpSize(width = 256.dp, height = 256.dp),
                                rowCount = 5,
                                textStyle = TextStyle(fontSize = 48.sp)
                            ) { snappedTime ->
                                Log.d("Girish", "$snappedTime")
                            }
                        }
//                        WheelDatePicker() { snappedDate ->
//                            println(snappedDate)
//                        }
//                        WheelDateTimePicker(
//                            timeFormat = TimeFormat.AM_PM,
//                        ) { snappedDateTime ->
//                            println(snappedDateTime)
//                        }
//                        WheelDateTimePicker(
//                            startDateTime = LocalDateTime.of(
//                                2025, 10, 20, 5, 30
//                            ),
//                            yearsRange = null,
//                            backwardsDisabled = true,
//                            timeFormat = TimeFormat.AM_PM,
//                            size = DpSize(200.dp, 100.dp),
//                            rowCount = 5,
//                            textStyle = MaterialTheme.typography.titleSmall,
//                            textColor = Color(0xFFffc300),
//                            selectorProperties = WheelPickerDefaults.selectorProperties(
//                                enabled = true,
//                                shape = RoundedCornerShape(0.dp),
//                                color = Color(0xFFf1faee).copy(alpha = 0.2f),
//                                border = BorderStroke(2.dp, Color(0xFFf1faee))
//                            )
//                        ){ snappedDateTime ->
//                            println(snappedDateTime)
//                        }
                    }
                }
            }
        }
    }
}