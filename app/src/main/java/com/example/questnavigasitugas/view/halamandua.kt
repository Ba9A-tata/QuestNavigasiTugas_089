package com.example.questnavigasitugas.view

import androidx.compose.runtime.Composable

@Composable
fun HalamanSelamatDatang(
    onSubmitClick: () -> Unit
){
    val backgroundColor = Color(0xFFE0B0FF)
    val purpleButtonColor = Color(0xFF7B68EE)
    val textColor = Color(0xFF4B0082)

    Scaffold(
        containerColor = backgroundColor
    ) { isiRuang ->
        Column(
            modifier = Modifier
                .padding(isiRuang)
                .fillMaxSize()
                .padding(horizontal = 30.dp, vertical = 50.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceAround
        ) {

            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "Selamat Datang", fontSize = 30.sp, fontWeight = FontWeight.Bold, color = textColor)

                Spacer(modifier = Modifier.height(30.dp))

                Image(
                    painter = painterResource(id = R.drawable.logo_93),
                    contentDescription = "Logo Aplikasi",
                    modifier = Modifier.size(400.dp).padding(1.dp)
                )
            }

            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "MORE THAN A NUMBER !!", fontSize = 20.sp, fontWeight = FontWeight.Medium, color = Color.Black)
                Text(text = "7X CHAMPPP", fontSize = 18.sp, fontWeight = FontWeight.Normal, color = Color.Black)
            }

            Button(
                onClick = onSubmitClick,
                modifier = Modifier.fillMaxWidth().height(50.dp),
                colors = ButtonDefaults.buttonColors(containerColor = purpleButtonColor)
            ) {
                Text("Submit", fontSize = 18.sp)
            }
        }
    }
}

        }