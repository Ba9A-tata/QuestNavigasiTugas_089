package com.example.questnavigasitugas.view

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.style.TextAlign
import com.example.questnavigasitugas.R


@Composable
fun ListDaftarPeserta(

    onBerandaClick: () -> Unit,
    onFormulirPendaftaranClick: () -> Unit
){
    val backgroundColor = Color(0xFFE0B0FF)
    val cardColor = Color(0xFFF3E5F5)
    val purpleButtonColor = Color(0xFF7B68EE)
    val topBarColor = Color(0xFF9C27B0)

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("List Daftar Peserta", color = Color.White, fontSize = 20.sp, fontWeight = FontWeight.SemiBold) },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = topBarColor)
            )
        },
        containerColor = backgroundColor
    ) { isiRuang ->
        Column(
            modifier = Modifier
                .padding(isiRuang)
                .fillMaxSize()
                .padding(horizontal = 30.dp, vertical = 20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            TampilkanDataCard(label = "NAMA LENGKAP", value = stringResource(id = R.string.data_nama_lengkap), cardColor = cardColor)
            Spacer(modifier = Modifier.height(15.dp))
            TampilkanDataCard(label = "JENIS KELAMIN", value = stringResource(id = R.string.data_jenis_kelamin), cardColor = cardColor)
            Spacer(modifier = Modifier.height(15.dp))
            TampilkanDataCard(label = "STATUS PERKAWINAN", value = stringResource(id = R.string.data_status_perkawinan), cardColor = cardColor)
            Spacer(modifier = Modifier.height(15.dp))
            TampilkanDataCard(label = "ALAMAT", value = stringResource(id = R.string.data_alamat), cardColor = cardColor)

            Spacer(modifier = Modifier.height(60.dp))

            Button(onClick = onBerandaClick, modifier = Modifier.fillMaxWidth().height(50.dp), colors = ButtonDefaults.buttonColors(containerColor = purpleButtonColor)) { Text("Beranda") }
            Spacer(modifier = Modifier.height(10.dp))
            Button(onClick = onFormulirPendaftaranClick, modifier = Modifier.fillMaxWidth().height(50.dp), colors = ButtonDefaults.buttonColors(containerColor = purpleButtonColor)) { Text("Formulir Pendaftaran") }
        }
    }
}


@Composable
fun TampilkanDataCard(label: String, value: String, cardColor: Color) {
    Column(modifier = Modifier.fillMaxWidth()) {

        Text(
            text = label,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF4B0082),
            fontSize = 14.sp,
            modifier = Modifier.padding(bottom = 6.dp)
        )

        Surface(
            color = cardColor,
            shape = RoundedCornerShape(8.dp),
            modifier = Modifier.fillMaxWidth().heightIn(min = 50.dp)
        ) {

            Text(
                text = value,
                fontSize = 18.sp,
                color = Color.Black,
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 14.dp),
                textAlign = TextAlign.Start
            )
        }
    }
}
