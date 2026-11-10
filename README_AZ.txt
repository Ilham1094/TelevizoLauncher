TELEVIZO LAUNCHER - CNTV Plus Smart Box

Bu kiçik Android TV tətbiqi Apps menyusunda ayrıca “Televizo Launcher” kimi görünür.
Pultla seçildikdə com.ottplay.ottplay/.StartActivity ünvanını açır.

QURULMA / APK YARATMA
1. Mac-da Android Studio quraşdırın.
2. Android Studio > Open seçin və bu qovluğu açın.
3. Gradle Sync tamamlanana qədər gözləyin.
4. Build > Build Bundle(s) / APK(s) > Build APK(s) seçin.
5. APK adətən app/build/outputs/apk/debug/app-debug.apk yolunda yaranır.
6. APK-nı CNTV Box-a quraşdırmaq üçün Mac terminalında:

adb -s 192.168.100.39:39633 install -r ~/Downloads/app-debug.apk

Qeyd: app-debug.apk faylını həqiqi yerləşdiyi yerə uyğun göstərin.

MƏHDUDİYYƏT
Bu tətbiq yalnız Televizo-nu açan qısayoldur. Prime Video pult düyməsinin (keyCode 5116)
özünü dəyişmir. Bunun üçün CityNet/NES global-key handler-in ayrıca remap mexanizmi lazımdır.
