package com.example.profilescreen.screens


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.profilescreen.R
import com.example.profilescreen.composable.Header
import com.example.profilescreen.composable.InfoCard
import com.example.profilescreen.composable.InfoTitle
import com.example.profilescreen.composable.ProfileAvatar
import com.example.profilescreen.composable.SpacerVertical11
import com.example.profilescreen.composable.SpacerVertical18
import com.example.profilescreen.composable.SpacerVertical23
import com.example.profilescreen.viewmodels.ProfileViewModel
import com.example.profilescreen.viewmodels.state.ProfileUIState

@Composable
fun ProfileScreen(
    viewModel: ProfileViewModel = hiltViewModel()
) {
    val state by viewModel.profileState.collectAsState()
    ProfileContent(
        state,
        viewModel::onChangedName,
        viewModel::onChangedEmail,
        viewModel::onChangedBirth,
        viewModel::saveUserData
    )
}

@Composable
private fun ProfileContent(
    state: ProfileUIState,
    onChangedName: (String) -> Unit,
    onChangedEmail: (String) -> Unit,
    onChangedBirth: (String) -> Unit,
    saveData:()->Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 24.dp, top = 25.dp), horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Header(text = "Edit Profile")
        SpacerVertical23()
        ProfileAvatar(painter = painterResource(id = R.drawable.profile_pic))
        SpacerVertical23()
        InfoTitle(
            modifier = Modifier.align(alignment = Alignment.Start),
            name = stringResource(R.string.name)
        )
        SpacerVertical11()
        InfoCard(
            modifier = Modifier.align(alignment = Alignment.Start),
            text = state.name,
            onChangedName
        )
        SpacerVertical18()
        InfoTitle(
            modifier = Modifier.align(alignment = Alignment.Start),
            name = stringResource(R.string.email)
        )
        SpacerVertical11()
        InfoCard(
            modifier = Modifier.align(alignment = Alignment.Start),
            text = state.email, onChangedEmail
        )
        SpacerVertical18()
        InfoTitle(
            modifier = Modifier.align(alignment = Alignment.Start),
            name = stringResource(R.string.date_of_birth)
        )
        SpacerVertical11()
        InfoCard(
            modifier = Modifier.align(alignment = Alignment.Start),
            text = state.birth, onChangedBirth
        )
        SpacerVertical23()
        Button(
            onClick = saveData,
            modifier = Modifier.size(height = 45.dp, width = 221.dp),
            shape = RoundedCornerShape(8.dp),

            ) {
            Text(text = stringResource(R.string.save_changes_button), fontSize = 20.sp)
        }
    }
}

@Preview
@Composable
fun Preview() {
    ProfileScreen()
}