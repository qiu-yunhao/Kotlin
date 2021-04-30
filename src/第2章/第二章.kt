data class Country(
        val name : String,
        val continient : String,
        val population : Int
)

class CountryApp{
    fun filterCountries(countries: List<Country>,
                        test : (Country) -> Boolean ):List<Country>{
        val res = mutableListOf<Country>()
        for(c in countries){
            if (test(c)){//传入一个叫test的方法，方法调用传入Country类的参数，经过处理后得到Boolean类的值
                res.add(c)
            }
        }
        return res
    }

}

class CountryTest{
    fun isBigEuropeanCountry(country: Country) : Boolean {
        return country.continient == "EU" && country.population>10000
    }
}

fun main(args : Array<String>){
    val countryApp = CountryApp()
    val countryTest = CountryTest()
    val countries = listOf(
            Country("England","EU",20000),
            Country("China","AS",90000)
    )
    println(countryApp.filterCountries(countries,countryTest::isBigEuropeanCountry))
    //将方法引用表达式当做参数时要用::注明？？？

    println(countryApp.filterCountries(countries,fun(country : Country):Boolean{
        return country.continient == "EU" && country.population>10000
    }))


    println(countryApp.filterCountries(countries,{
        country -> country.continient == "EU" && country.population>10000
    }))
}
