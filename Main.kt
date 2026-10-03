fun main() {
    // 1. Instansiasi perangkat
    val lamp = SmartLamp("L01", "Ruang Tamu")
    val speaker = SmartSpeaker("S01", "Google Nest Dapur")
    val cctv = SmartCCTV("C01", "Ezviz Garasi")

    // CHECKPOINT 19: Simpan & Commit setelah instansiasi

    // 2. Instansiasi SmartHomeHub dan jalankan pengujian
    val hub = SmartHomeHub()
    hub.addDevice(lamp)
    hub.addDevice(speaker)
    hub.addDevice(cctv)

    println("=== MENGAKTIFKAN MODE KEAMANAN ===")
    hub.activateSecurityMode()

    println("\n=== MEMATIKAN SEMUA SAKELAR ===")
    hub.turnOffAllSwitches()
}