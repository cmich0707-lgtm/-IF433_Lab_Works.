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