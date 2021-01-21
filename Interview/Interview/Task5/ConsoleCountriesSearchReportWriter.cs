using System;

namespace Interview.Task5
{
    public class ConsoleCountriesSearchReportWriter
    {
        public void Write(CountryDto[] foundCountries) // zapis raportu na konsolę
        {
            Console.WriteLine("Odanelziono następujące państwa:");

            foreach (var country in foundCountries)
            {
                string countryName = country.Name;
                string countryCapitalLetters = countryName.ToUpper();
                int density = (int) (country.Population / country.Area);

                Console.WriteLine($"- {countryCapitalLetters}");
                Console.WriteLine($"  - stolica: {country.Capital}");
                Console.WriteLine($"    - ludność: {country.Population / 1e6} milionów");
                Console.WriteLine($"    - powierzchnia: {country.Area} km^2");

                Console.WriteLine($"  - stolica: {country.Capital}");
                Console.WriteLine($"    - ludność: {country.Population / 1e6} milionów");
                Console.WriteLine($"    - powierzchnia: {country.Area} km^2");
                Console.WriteLine($"    - długość i szerokość geograficzna: {country.LatLng[0]} i {country.LatLng[1]} stopni");
                Console.WriteLine($"    - gęstość zaludnienia: {density} osoby/km^2");
                Console.WriteLine($"    - alpha3Code: {country.Alpha3Code}");

              //  altSpelling
            }
        }
    }
}
