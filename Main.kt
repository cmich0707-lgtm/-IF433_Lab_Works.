package `week 7 03`

println("\n=== TEST SEALED CLASS ===")
val response: ApiResponse = ApiResponse.Succsess("Data berhasil ditarik!")

val uiMessage = when (response) {
    is ApiResponse.Success -> "Tampilkan: ${response.data}"
    is ApiResponse.Error -> "Munculkan alert: ${response.message}"
     is ApiResponse.Loading -> "Tampilkan Spinner"
}