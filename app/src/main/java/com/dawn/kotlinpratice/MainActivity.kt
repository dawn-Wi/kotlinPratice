package com.dawn.kotlinpratice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "SIGN UP",
                    Modifier.padding(10.dp),
                    fontSize = 30.sp
                )
                Spacer(modifier = Modifier.height(10.dp))
                EditForm(category = "ID")
                Spacer(modifier = Modifier.height(10.dp))
                PasswordEditForm(category = "PASSWORD")
                Spacer(modifier = Modifier.height(10.dp))
                PasswordEditForm(category = "PASSWORD CHECK")
                Spacer(modifier = Modifier.height(10.dp))
                EditForm(category = "NAME")
                Spacer(modifier = Modifier.height(10.dp))
                PhoneEditForm(category = "PHONE NUMBER")
                Spacer(modifier = Modifier.height(10.dp))
                Button(
                    onClick ={},
                    contentPadding = PaddingValues(10.dp),
                    modifier = Modifier.wrapContentSize()
                ) {
                    Text(text = "SUBMIT")
                }
            }
        }
    }
}

@Composable
fun SignupScreen(){

}

@Composable
fun EditForm(
    category: String,
    modifier: Modifier = Modifier
) {
    var text by remember { mutableStateOf("") }

    OutlinedTextField(
        value = text,
        onValueChange = { text = it },
        label = { Text(text = "$category") }
    )
}

@Composable
fun PhoneEditForm(
    category: String,
    modifier: Modifier = Modifier
) {
    var text by remember { mutableStateOf("") }

    OutlinedTextField(
        value = text,
        onValueChange = { text = it },
        label = { Text(text = "$category") },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone)
    )
}

@Composable
fun PasswordEditForm(
    category: String,
    modifier: Modifier = Modifier
) {
    var text by remember { mutableStateOf("") }

    OutlinedTextField(
        value = text,
        onValueChange = { text = it },
        label = { Text(text = "$category") },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        visualTransformation = PasswordVisualTransformation()
    )
}

@Composable
fun rememberText(
    text: String,
    modifier: Modifier = Modifier
){
    var text by remember {
        mutableStateOf(text)
    }
}