package lec14.kotlin

fun handleCountry(country: Country) {
    when (country) {
        Country.KOREA -> println(country.name)
        Country.AMERICA -> println(country.name)
    }
}

enum class Country(
    private val code: String
) {
    KOREA("KO"),
    AMERICA("US");
}