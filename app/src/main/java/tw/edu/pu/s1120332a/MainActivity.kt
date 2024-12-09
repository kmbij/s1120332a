package tw.edu.pu.s1120332a

import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import tw.edu.pu.s1120332a.R

import tw.edu.pu.s1120332a.ui.theme.S1120332aTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // 設定螢幕方向為直向
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT

        setContent {
            S1120332aTheme {
                MainScreen()
            }
        }
    }
}

@Composable
fun MainScreen() {
    // 假設初始的遊戲時間與分數
    val gameTime = remember { 0 }
    val score = remember { 0 }


    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF95FE95)), // 設定背景顏色
        verticalArrangement = Arrangement.Top, // 從上到下排列
        horizontalAlignment = Alignment.CenterHorizontally // 水平置中
    ) {
        // 標題文字（置於最上方）
        Text(
            text = "2024期末上機考(資管二A林宜潔)",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF6A0DAD), // 紫色文字
            modifier = Modifier.padding(top = 16.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        // 圖片（撐滿螢幕寬度）
        Image(
            painter = painterResource(id = R.drawable.class_a), // 替換為 class_a 或 class_b
            contentDescription = "Class Image",
            modifier = Modifier
                .fillMaxWidth() // 撐滿螢幕寬度
                .aspectRatio(1.5f) // 控制圖片高寬比，避免過於拉伸
        )

        Spacer(modifier = Modifier.height(16.dp))

        // 遊戲資訊文字
        Text(
            text = "遊戲持續時間 $gameTime 秒",
            fontSize = 18.sp,
            color = Color.Black
        )
        Text(
            text = "您的成績 $score 分",
            fontSize = 18.sp,
            color = Color.Black
        )

        Spacer(modifier = Modifier.height(16.dp))

        // 結束應用程式按鈕
        Button(
            onClick = { (finish()) } // 結束應用程式
        ) {
            Text(text = "結束App")
        }
    }
}

fun finish() {
    TODO("Not yet implemented")
}





