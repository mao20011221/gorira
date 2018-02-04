package net.kojira.a01_layouttest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int count = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView text = findViewById(R.id.text);
        final ImageView imageView = findViewById(R.id.imageView);
        Button button = findViewById(R.id.次に進む);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (count) {
                    case 1:
                        imageView.setImageResource(R.drawable.a001);
                        break;
                    case 2:
                        imageView.setImageResource(R.drawable.a002);
                        break;
                    case 3:
                        imageView.setImageResource(R.drawable.a003);
                        break;
                    case 4:
                        imageView.setImageResource(R.drawable.a004);
                        break;
                    case 5:
                        imageView.setImageResource(R.drawable.a005);
                        break;
                    case 6:
                        imageView.setImageResource(R.drawable.a006);
                        break;
                    case 7:
                        imageView.setImageResource(R.drawable.a007);
                        break;
                    case 8:
                        imageView.setImageResource(R.drawable.a008);
                        break;
                    case 9:
                        imageView.setImageResource(R.drawable.a009);
                        break;
                    case 10:
                        imageView.setImageResource(R.drawable.a010);
                        break;
                    case 11:
                        imageView.setImageResource(R.drawable.a011);
                        break;
                    case 12:
                        imageView.setImageResource(R.drawable.a012);
                        break;
                    case 13:
                        imageView.setImageResource(R.drawable.a013);
                        break;
                    case 14:
                        imageView.setImageResource(R.drawable.a014);
                        break;
                    case 15:
                        imageView.setImageResource(R.drawable.a015);
                        break;
                    case 16:
                        imageView.setImageResource(R.drawable.a016);
                        break;
                    case 17:
                        imageView.setImageResource(R.drawable.a017);
                        break;
                    case 18:
                        imageView.setImageResource(R.drawable.a018);
                        break;
                    case 19:
                        imageView.setImageResource(R.drawable.a019);
                        break;
                    case 20:
                        imageView.setImageResource(R.drawable.a020);
                        break;
                    case 21:
                        imageView.setImageResource(R.drawable.a021);
                        break;
                    case 22:
                        imageView.setImageResource(R.drawable.a022);
                        break;
                    case 23:
                        imageView.setImageResource(R.drawable.a023);
                        break;
                    case 24:
                        imageView.setImageResource(R.drawable.a024);
                        break;
                    case 25:
                        imageView.setImageResource(R.drawable.a025);
                        break;
                    case 26:
                        imageView.setImageResource(R.drawable.a026);
                        break;
                    case 27:
                        imageView.setImageResource(R.drawable.a027);
                        break;
                    case 28:
                        imageView.setImageResource(R.drawable.a028);
                        break;
                    case 29:
                        imageView.setImageResource(R.drawable.a029);
                        break;
                    case 30:
                        imageView.setImageResource(R.drawable.a030);
                        break;
                    case 31:
                        imageView.setImageResource(R.drawable.a031);
                        break;
                    case 32:
                        imageView.setImageResource(R.drawable.a032);
                        break;
                    case 33:
                        imageView.setImageResource(R.drawable.a033);
                        break;
                    case 34:
                        imageView.setImageResource(R.drawable.a034);
                        break;
                    case 35:
                        imageView.setImageResource(R.drawable.a035);
                        break;
                    case 36:
                        imageView.setImageResource(R.drawable.a036);
                        break;
                    case 37:
                        imageView.setImageResource(R.drawable.a037);
                        break;
                    case 38:
                        imageView.setImageResource(R.drawable.a038);
                        break;
                    case 39:
                        imageView.setImageResource(R.drawable.a039);
                        break;
                    case 40:
                        imageView.setImageResource(R.drawable.a040);
                        break;
                    case 41:
                        imageView.setImageResource(R.drawable.a041);
                        break;
                    case 42:
                        imageView.setImageResource(R.drawable.a042);
                        break;
                    case 43:
                        imageView.setImageResource(R.drawable.a043);
                        break;
                    case 44:
                        imageView.setImageResource(R.drawable.a044);
                        break;
                    case 45:
                        imageView.setImageResource(R.drawable.a045);
                        break;
                    case 46:
                        imageView.setImageResource(R.drawable.a046);
                        break;
                    case 47:
                        imageView.setImageResource(R.drawable.a047);
                        break;
                    case 48:
                        imageView.setImageResource(R.drawable.a048);
                        break;
                    case 49:
                        imageView.setImageResource(R.drawable.a049);
                        break;
                    case 50:
                        imageView.setImageResource(R.drawable.a050);
                        break;
                    case 51:
                        imageView.setImageResource(R.drawable.a051);
                        break;
                    case 52:
                        imageView.setImageResource(R.drawable.a052);
                        break;
                    case 53:
                        imageView.setImageResource(R.drawable.a053);
                        break;
                    case 54:
                        imageView.setImageResource(R.drawable.a054);
                        break;
                    case 55:
                        imageView.setImageResource(R.drawable.a055);
                        break;
                    case 56:
                        imageView.setImageResource(R.drawable.a056);
                        break;
                    case 57:
                        imageView.setImageResource(R.drawable.a057);
                        break;
                    case 58:
                        imageView.setImageResource(R.drawable.a058);
                        break;
                    case 59:
                        imageView.setImageResource(R.drawable.a059);
                        break;
                    case 60:
                        imageView.setImageResource(R.drawable.a060);
                        break;
                    case 61:
                        imageView.setImageResource(R.drawable.a061);
                        break;
                    case 62:
                        imageView.setImageResource(R.drawable.a062);
                        break;
                    case 63:
                        imageView.setImageResource(R.drawable.a063);
                        break;
                    case 64:
                        imageView.setImageResource(R.drawable.a064);
                        break;
                    case 65:
                        imageView.setImageResource(R.drawable.a065);
                        break;
                    case 66:
                        imageView.setImageResource(R.drawable.a066);
                        break;
                    case 67:
                        imageView.setImageResource(R.drawable.a067);
                        break;
                    case 68:
                        imageView.setImageResource(R.drawable.a068);
                        break;
                    case 69:
                        imageView.setImageResource(R.drawable.a069);
                        break;
                    case 70:
                        imageView.setImageResource(R.drawable.a070);
                        break;
                    case 71:
                        imageView.setImageResource(R.drawable.a071);
                        break;
                    case 72:
                        imageView.setImageResource(R.drawable.a072);
                        break;
                    case 73:
                        imageView.setImageResource(R.drawable.a073);
                        break;
                    case 74:
                        imageView.setImageResource(R.drawable.a074);
                        break;
                    case 75:
                        imageView.setImageResource(R.drawable.a075);
                        break;
                    case 76:
                        imageView.setImageResource(R.drawable.a076);
                        break;
                    case 77:
                        imageView.setImageResource(R.drawable.a077);
                        break;
                    case 78:
                        imageView.setImageResource(R.drawable.a078);
                        break;
                    case 79:
                        imageView.setImageResource(R.drawable.a079);
                        break;
                    case 80:
                        imageView.setImageResource(R.drawable.a080);
                        break;
                    case 81:
                        imageView.setImageResource(R.drawable.a081);
                        break;
                    case 82:
                        imageView.setImageResource(R.drawable.a082);
                        break;
                    case 83:
                        imageView.setImageResource(R.drawable.a083);
                        break;
                    case 84:
                        imageView.setImageResource(R.drawable.a084);
                        break;
                    case 85:
                        imageView.setImageResource(R.drawable.a085);
                        break;
                    case 86:
                        imageView.setImageResource(R.drawable.a086);
                        break;
                    case 87:
                        imageView.setImageResource(R.drawable.a087);
                        break;
                    case 88:
                        imageView.setImageResource(R.drawable.a088);
                        break;
                    case 89:
                        imageView.setImageResource(R.drawable.a089);
                        break;
                    case 90:
                        imageView.setImageResource(R.drawable.a090);
                        break;
                    case 91:
                        imageView.setImageResource(R.drawable.a091);
                        break;
                    case 92:
                        imageView.setImageResource(R.drawable.a092);
                        break;
                    case 93:
                        imageView.setImageResource(R.drawable.a093);
                        break;
                    case 94:
                        imageView.setImageResource(R.drawable.a094);
                        break;
                    case 95:
                        imageView.setImageResource(R.drawable.a095);
                        break;
                    case 96:
                        imageView.setImageResource(R.drawable.a096);
                        break;
                    case 97:
                        imageView.setImageResource(R.drawable.a097);
                        break;
                    case 98:
                        imageView.setImageResource(R.drawable.a098);
                        break;
                    case 99:
                        imageView.setImageResource(R.drawable.a099);
                        break;
                    case 100:
                        imageView.setImageResource(R.drawable.a100);
                        break;
                    case 101:
                        imageView.setImageResource(R.drawable.a101);
                        break;
                    case 102:
                        imageView.setImageResource(R.drawable.a102);
                        break;
                    case 103:
                        imageView.setImageResource(R.drawable.a103);
                        break;
                    case 104:
                        imageView.setImageResource(R.drawable.a104);
                        break;
                    case 105:
                        imageView.setImageResource(R.drawable.a105);
                        break;



                }
                count += 1;

            }
        });

    }
}
