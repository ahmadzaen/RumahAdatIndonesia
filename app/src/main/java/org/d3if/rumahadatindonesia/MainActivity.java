package org.d3if.rumahadatindonesia;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvRumah;
    private ArrayList<Rumah> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvRumah = findViewById(R.id.rv_rumah);

        ArrayList<Rumah> rumah = new ArrayList<>();
        rumah.add(new Rumah("Baduy", "Banten", "Rumah adat Baduy adalah rumah panggung yang hampir seluruh bagian rumahnya menggunakan bahan dari bambu. Sifat kekeluargaan Suku Baduy yang sangat kental sangat berpengaruh terhadap proses pembangunan rumah adat ini.", R.drawable.baduy));

        rumah.add(new Rumah("Bolon", "Sumatera Utara", "Zaman dahulu, rumah adat Suku Batak ini merupakan tempat tinggal 13 raja di Sumatera Utara. Rumah ini memiliki beberapa kekhasan, di antaranya berbentuk persegi empat dan atapnya seperti pelana kuda. Ruangan dalam rumah ini terbagi menjadi beberapa ruangan khusus, yaitu ruang tamu dan ruangan tempat para istri tamu yang datang.", R.drawable.bolon));

        rumah.add(new Rumah("Gadang", "Sumatera Barat", "Rumah tradisional Minangkabau ini memiliki ciri khas unik, yaitu atap berbentuk melengkung dengan ujung lancip. Disebut rumah Gadang karena memang rumah ini berukuran besar. Jumlah kamar di rumah ini tergantung dari jumlah perempuan yang tinggal di dalamnya.", R.drawable.gadang));

        rumah.add(new Rumah("Honai", "Papua", "Bentuk rumah ini sangat unik yakni berbentuk seperti kerucut dan dibangun dari material alam. Rumah honai dibedakan menjadi tiga kategori yaitu rumah untuk pria (Honai), wanita (Ebei), dan kandang hewan atau babi (wamai). Rumah honai bagi masyarakat Papua bukan saja menjadi tempat tinggal semata, melainkan juga sebagai tempat pengajaran kehidupan untuk mendidik para pria maupun wanita.", R.drawable.honai));

        rumah.add(new Rumah("Joglo", "Jawa Tengah", "Bentuk arsitektur rumah ini sangat unik dan sarat akan nilai-nilai kebudayaan masyarakat Jawa. Dibangun dari kayu jati, menjadikan struktur rumah ini tahan lama dan juga kuat. Bangunan ini juga memiliki arsitektur unik yaitu berbentuk persegi panjang dengan atap rumah dibuat tinggi.", R.drawable.joglo));

        rumah.add(new Rumah("Kebaya", "DKI Jakarta", "Rumah adat Suku Betawi ini memiliki ciri khas tersendiri yaitu bentuknya seperti kubus serta teras luas yang berfungsi untuk menjamu tamu dan sekaligus tempat berkumpul keluarga. Secara arsitektur, bangunan ini memiliki makna filosofis yakni karakter suku Betawi yang selalu mengedepankan prinsip kekeluargaan, keterbukaan, keramahan dan keharmonisan.", R.drawable.kebaya));

        rumah.add(new Rumah("Limas", "Sumatera Selatan", "Sesuai namanya, rumah ini berbentuk limas dengan bangunan bertingkat-tingkat di mana masing-masing tingkat memiliki filosofi budaya tersendiri. Tingkatan di rumah ini memiliki lima ruangan yang menjadi simbol dari lima jenjang kehidupan masyarakat yaitu usia, jenis, bakat, pangkat dan martabat.", R.drawable.limas));

        rumah.add(new Rumah("Mandar", "Sulawesi Barat", "Rumah adat Mandar merupakan rumah adat khas Mamuju, Sulawesi Barat. Rumah ini berstruktur panggung yang disusun dengan tiang-tiang dari kayu balok berukuran setinggi dua meter. Dinding rumah ini menggunakan material papan yang pada umumnya merupakan papan ukir sesuai motif khas dari Suku Mandar.", R.drawable.mandar));

        rumah.add(new Rumah("Panggung", "Sulawesi Utara", "Rumah adat ini dikenal dengan sebutan \"wale\" atau \"bale\". Rumah ini ditopang oleh beberapa kayu agar dapat berdiri kokoh dan memiliki dua tangga di serambi bagian depannya. Sesuai dengan filosofi masyarakat Minahasa, dua tangga tersebut bermakna khusus pada saat peminangan. Rumah panggung ini bisa dihuni oleh enam hingga delapan keluarga.", R.drawable.panggung));

        rumah.add(new Rumah("Tongkonan", "Sulawesi Selatan", "Atap dari rumah ini berbentuk melengkung seperti perahu dengan struktur rumah panggung yang memiliki tiang penyangga bulat berdiri berjajar menopang bangunan. Rumah ini juga dicirikan melalui adanya susunan tanduk kerbau di depan rumah sebagai hiasan yang menunjukkan tingkat strata sosial dari pemilik rumah.", R.drawable.tongkonan));

        ListRumahAdapter adapter = new ListRumahAdapter(rumah, MainActivity.this);
        rvRumah.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        rvRumah.setLayoutManager(layoutManager);

        DividerItemDecoration divider = new DividerItemDecoration(this, layoutManager.getOrientation());
        rvRumah.addItemDecoration(divider);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_bio, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode (int selectMode){
        switch (selectMode){
            case R.id.profile:
                Intent intent = new Intent(MainActivity.this,AboutActivity.class);
                startActivity(intent);
        }
    }

}
