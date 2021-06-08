package sg.edu.rp.c347.id19007966.mydatabook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class AboutUsActivity extends AppCompatActivity {

    ImageView rpImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        rpImageView = findViewById(R.id.rpImageView);
        String rpLogoURL = "https://upload.wikimedia.org/wikipedia/commons/8/80/Republic_Polytechnic_Logo.jpg";
        Picasso.with(this)
                .load(rpLogoURL)
                .error(R.drawable.error)
                .placeholder(R.drawable.ajax_loader)
                .into(rpImageView);
    }
}