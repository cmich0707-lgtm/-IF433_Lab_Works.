fun main() {
    // 3. Inisialisasi Sistem
    val homeDevices = mutableListOf<SmartDevice>()

    // 4. Konfigurasi Pencahayaan (apply & also)
    SmartDevice(
        name = "Philips WiZ Living Room",
        category = "Lighting",
        isOnline = true,
        powerLoad = 12
    ).apply {
        // Setup tambahan bila diperlukan
    }.also { device ->
        homeDevices.add(device)
    }

    // 5. Konfigurasi Keamanan (apply & also)
    SmartDevice("Ezviz Outdoor", "Camera")
        .apply {
            isOnline = true
            powerLoad = 5
        }
        .also { device ->
            println("(LOG) Kamera terhubung")
            homeDevices.add(device)
        }