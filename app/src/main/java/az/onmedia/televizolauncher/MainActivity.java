package az.onmedia.televizolauncher;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends Activity {
    private static final String TELEVIZO_PACKAGE = "com.ottplay.ottplay";
    private static final String TELEVIZO_ACTIVITY = "com.ottplay.ottplay.StartActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        launchTelevizo();
    }

    private void launchTelevizo() {
        PackageManager pm = getPackageManager();
        Intent launchIntent = new Intent(Intent.ACTION_MAIN);
        launchIntent.addCategory(Intent.CATEGORY_LEANBACK_LAUNCHER);
        launchIntent.setComponent(new ComponentName(TELEVIZO_PACKAGE, TELEVIZO_ACTIVITY));
        launchIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

        try {
            if (pm.getPackageInfo(TELEVIZO_PACKAGE, 0) == null) {
                showMissingApp();
                return;
            }
            startActivity(launchIntent);
            finish();
        } catch (PackageManager.NameNotFoundException e) {
            showMissingApp();
        } catch (Exception e) {
            Toast.makeText(this, "Televizo açıla bilmədi: " + e.getMessage(), Toast.LENGTH_LONG).show();
            finish();
        }
    }

    private void showMissingApp() {
        Toast.makeText(this, "Televizo quraşdırılmayıb.", Toast.LENGTH_LONG).show();
        finish();
    }
}
