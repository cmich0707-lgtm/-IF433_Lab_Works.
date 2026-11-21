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
    // 6. Konfigurasi AC & Kabel (run) + Alat Pakan Peliharaan
    val acDevice = run {
        SmartDevice("Daikin Inverter (Kabel 3x2.5)", "HVAC", false, 800)
    }
    homeDevices.add(acDevice)

    homeDevices.add(
        SmartDevice("Picolo's Auto Feeder", "Pet Care", true, 10)
    )

    // 7. Pencarian Aman dengan let
    val searchResult = homeDevices.find { it.category == "Camera" }
    searchResult?.let {
        println(it.diagnose())
    }
    // 8. Menggunakan with untuk Format Summary
    with(homeDevices) {
        println("=== RINGKASAN SMART HOME DASHBOARD ===")
        println("Total perangkat terdaftar: ${this.size}")
    }

    // 9. Kalkulasi Daya dengan run
    val totalPower = homeDevices.run { sumOf { it.powerLoad } }
    println("Total konsumsi daya: $totalPower Watt")

    // 10. Eksekusi Dashboard
    println("\n--- Daftar Diagnostik Perangkat ---")
    homeDevices.forEach { device ->
        println(device.diagnose())
    }