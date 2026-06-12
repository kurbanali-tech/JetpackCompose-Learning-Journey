package Intent

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable

@Preview(showBackground = true, showSystemUi = true)

fun implicit(){
    val context= LocalContext.current

    Column(modifier = Modifier.fillMaxSize().padding(horizontal = 30.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

        ) {

        //To Open Links we use Intent.ACTION_VIEW

        Button(onClick = {

            val intent= Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://chatgpt.com/?utm_source=microsoft&utm_medium=paid_search&utm_campaign=MSFT_C_SEM_BBR_Core_CHT_BAU_ACQ_PER_MIX_ALL_APAC_IN_EN_110625&c_id=570613014&c_agid=1175379920558659&c_crid=&c_kwid=kwd-73461689170595:loc-90&c_ims=&c_pms=262831&c_nw=o&c_dvc=c&msclkid=3a977444361b1b89be981e4489b1147a")
                )

            context.startActivity(intent)


        },
            modifier = Modifier.fillMaxWidth()
        ) {

            Text(text = "Open Link")
        }

        //To Open Apps we use Int

        Button({
            val intent= Intent(

                Intent.ACTION_MAIN
                )
            intent.setPackage("com.google.android.youtube")
            context.startActivity(intent)

        },
            modifier = Modifier.fillMaxWidth()


        ) {
            Text(text = "Open App")
        }

        //Sharing data from one app to another

        Button(onClick ={

            val intent= Intent(
                 Intent.ACTION_SEND)
            intent.type="text/plain"
            intent.putExtra(Intent.EXTRA_TEXT,"Welcome to Android Journey")

            context.startActivity(Intent.createChooser(intent,"Share message"))

        },
            modifier = Modifier.fillMaxWidth()


            ) {

            Text("Send any data")

        }






    }
}