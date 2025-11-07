package com.example.questnavigasitugas.view

import androidx.compose.runtime.Composable

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

