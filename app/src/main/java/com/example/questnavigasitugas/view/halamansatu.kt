package com.example.questnavigasitugas.view

import androidx.compose.runtime.Composable

enum class Navigasi{
    SelamatDatang,
    Formulirku,
    ListDetail
}

@Composable
fun DateApp(
    navController: NavHostController = rememberNavController(),
    modifier : Modifier = Modifier
) {
    Scaffold(modifier = modifier) { isiRuang ->
        NavHost(
            navController = navController,
            startDestination = Navigasi.SelamatDatang.name,
            modifier = Modifier.padding(isiRuang)
        ) {

            composable(route = Navigasi.SelamatDatang.name) {
                HalamanSelamatDatang(
                    onSubmitClick = {
                        navController.navigate(Navigasi.ListDetail.name)
                    }
                )

            }
        }
    }
}