package com.example.per4

import androidx.compose.runtime.Composable

@Composable
fun ActivitasPertama(modifier: Modifier) {
    Column(modifier = Modifier.padding(top=100.dp)
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(text = stringResource(id= R.string.prodi),
            fontSize = .35sp,
            fontWeight = FontWeight.Bold)
        Text(text = stringResource(id= R.string.Univ),
            fontSize = 22.sp)
        Spacer(modifier = Modifier.height(height = 25.dp))
    }
}




















