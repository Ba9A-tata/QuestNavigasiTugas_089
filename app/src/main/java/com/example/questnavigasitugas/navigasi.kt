package com.example.questnavigasitugas


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FormIsian(
    onSubmitBtnClick: () -> Unit
) {

    var nama by remember { mutableStateOf("") }
    var alamat by remember { mutableStateOf("") }
    var jenisKelamin by remember { mutableStateOf("") }
    var status by remember { mutableStateOf("") }

    val genderOptions = listOf("Laki-laki", "Perempuan")
    val statusOptions = listOf("Janda", "Lajang", "Duda")
    val primaryPurple = Color(0xFF7E57C2)
    val backgroundLavender = Color(0xFFF3E5F5)

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Formulir Pendaftaran", color = Color.White, fontSize = 20.sp, fontWeight = FontWeight.Bold) },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = primaryPurple)
            )
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(backgroundLavender)
                .padding(innerPadding)
                .padding(horizontal = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
                shape = RoundedCornerShape(12.dp)
            ) {
                Column(
                    modifier = Modifier
                        .padding(24.dp)
                        .fillMaxWidth(),
                    horizontalAlignment = Alignment.Start
                ) {


                    Text(text = "Nama Lengkap", fontWeight = FontWeight.Bold, modifier = Modifier.fillMaxWidth().padding(bottom = 4.dp), color = Color.Black)
                    OutlinedTextField(
                        value = nama, onValueChange = { nama = it }, placeholder = { Text("Nama Lengkap") },
                        singleLine = true, modifier = Modifier.fillMaxWidth(),
                        colors = OutlinedTextFieldDefaults.colors(unfocusedContainerColor = Color.White, focusedContainerColor = Color.White, focusedBorderColor = Color.Gray, unfocusedBorderColor = Color.LightGray),
                        shape = RoundedCornerShape(8.dp)
                    )

                    Spacer(modifier = Modifier.height(24.dp))


                    Text(text = "Jenis Kelamin", fontWeight = FontWeight.Bold, modifier = Modifier.padding(bottom = 8.dp), color = Color.Black)
                    genderOptions.forEach { gender ->
                        Row(modifier = Modifier.selectable(selected = jenisKelamin == gender, onClick = { jenisKelamin = gender }).fillMaxWidth().padding(vertical = 2.dp), verticalAlignment = Alignment.CenterVertically) {
                            RadioButton(selected = jenisKelamin == gender, onClick = { jenisKelamin = gender })
                            Text(text = gender)
                        }
                    }

                    Spacer(modifier = Modifier.height(20.dp))


                    Text(text = "Status Perkawinan", fontWeight = FontWeight.Bold, modifier = Modifier.padding(bottom = 8.dp), color = Color.Black)
                    statusOptions.forEach { s ->
                        Row(modifier = Modifier.selectable(selected = status == s, onClick = { status = s }).fillMaxWidth().padding(vertical = 2.dp), verticalAlignment = Alignment.CenterVertically) {
                            RadioButton(selected = status == s, onClick = { status = s })
                            Text(text = s)
                        }
                    }

                    Spacer(modifier = Modifier.height(20.dp))


                    Text(text = "Alamat", fontWeight = FontWeight.Bold, modifier = Modifier.padding(bottom = 4.dp), color = Color.Black)
                    OutlinedTextField(
                        value = alamat, onValueChange = { alamat = it }, placeholder = { Text("Alamat") },
                        singleLine = true, modifier = Modifier.fillMaxWidth(),
                        colors = OutlinedTextFieldDefaults.colors(unfocusedContainerColor = Color.White, focusedContainerColor = Color.White, focusedBorderColor = Color.Gray, unfocusedBorderColor = Color.LightGray),
                        shape = RoundedCornerShape(8.dp)
                    )

                    Spacer(modifier = Modifier.height(30.dp))


                    Button(
                        onClick = onSubmitBtnClick,
                        colors = ButtonDefaults.buttonColors(containerColor = primaryPurple),
                        modifier = Modifier.fillMaxWidth().height(50.dp)
                    ) {
                        Text(text = "Submit", color = Color.White, fontSize = 18.sp)
                    }
                }
            }
        }
    }
}