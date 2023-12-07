import kotlinx.serialization.Serializable

@Serializable()
data class Country(
    val name: Name,
    val tld: List<String> = emptyList(),
    val cca2: String = "",
    val ccn3: String = "",
    val cca3: String = "",
    val cioc: String = "",
    val fifa: String = "",
    val independent: Boolean? = null,
    val status: String = "",
    val unMember: Boolean,
    val currencies: Map<String, Currency> = emptyMap(),
    val idd: Idd = Idd(),
    val capital: List<String> = emptyList(),
    val altSpellings: List<String>,
    val region: String,
    val subregion: String? = null,
    val languages: Map<String, String> = emptyMap(),
    val translations: Map<String, Translation>,
    val latlng: List<Double>,
    val landlocked: Boolean,
    val area: Double,
    val demonyms: Demonym? = null,
    val flag: String,
    val maps: Maps,
    val population: Int,
    val gini: Map<String, Double>? = null,
    val car: Car,
    val timezones: List<String>,
    val continents: List<String>,
    val flags: Flags,
    val coatOfArms: CoatOfArms? = null,
    val startOfWeek: String,
    val capitalInfo: CapitalInfo? = null,
    val postalCode: PostalCode? = null,
    val borders: List<String> = emptyList()
)

@Serializable
data class Name(
    val common: String,
    val official: String,
    val nativeName: Map<String, NativeName>? = null
)

@Serializable
data class NativeName(
    val official: String,
    val common: String
)

@Serializable
data class Currency(
    val name: String,
    val symbol: String? = null
)

@Serializable
data class Idd(
    val root: String = "",
    val suffixes: List<String> = emptyList()
)

@Serializable
data class Translation(
    val official: String,
    val common: String
)

@Serializable
data class Demonym(
    val eng: Gender = Gender(),
    val fra: Gender = Gender()
)

@Serializable
data class Gender(
    val f: String = "",
    val m: String = ""
)

@Serializable
data class Maps(
    val googleMaps: String,
    val openStreetMaps: String
)

@Serializable
data class Car(
    val signs: List<String>? = null,
    val side: String
)

@Serializable
data class Flags(
    val png: String,
    val svg: String,
    val alt: String = "",
)

@Serializable
data class CoatOfArms(
    val png: String? = null,
    val svg: String? = null
)

@Serializable
data class CapitalInfo(
    val latlng: List<Double> = emptyList()
)

@Serializable
data class PostalCode(
    val format: String = "",
    val regex: String = ""
)
