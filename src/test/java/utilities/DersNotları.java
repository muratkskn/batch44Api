

/* 1) API testlerinde Web Driver kullanıyor musunuz? Hangi dependencies'leri kullanıyorsunuz?
        API testlerinde, UI testleri için gerekli Web Driver dependencies'lere ihtiyaç yoktur.
        Başlangıç için Rest-Assured veye JUnit ve TEstNG gibi dependencies'ler yeterli olur.

        2) Doğrulama için kullanılan, Hard Assert ve Verification farkları nelerdir?
        Hard Assert kullandığımızda ilk hata olan yerde test durur.
        Verification'da; testler hata olsa dahi çalışır. Hatalı olan test için hata mesajı alınır.
        ÖNEMLİ: Soft Assert = Verification

        3) API testlerinde request nasıl tanımlanır?
        given().when().get() içerisinde tanımlanır.

        4) Request'ten gelen cevap (response) nerede saklanır?
        Response response'un içerisinde.

        5) assertThat() Hard mı yoksa Soft Assert müdür?
        assertThat() Hard assertion'dır.

        6) API Testlerinde response doğrulma nasıl yapılır?
        a) TestNG ve JUnit Assert'leri kullanılarak
        b) Json Path -> JsonPath() json = response.JsonPath();
        c) Matchers Class
        d) De-Serialization
        e)
        f)
        g)
        h)

        7) Matchers.equalto(): Key-Value şeklinde girilen datanın, eşit olduğunu doğrulamak için kullanılır.

        8) Matchers.hasSize(): Datanın size'ını doğrulamak için kullanılır.

        9) Matchers.hasItem(): Girilen tek bir data'yı doğrulamak için kullanılır.

        10) Matchers.hasItems(): Girilen birden fazla datayı doğrulamak için kullanılır.

        11) Matcher Class: http://hamcrest.org/JavaHamcrest/javadoc/1.3/org/hamcrest/Matchers.html



        TEST iÇiN KULLANILAN ADRESLER

        https://restful-booker.herokuapp.com/booking

        https://reqres.in/api/users

        http://dummy.restapiexample.com/api/v1/employee

        https://jsonplaceholder.typicode.com/

        https://www.gmibank.com/api/authenticate

        http://www.gmibank.com/api/tp-customers
*/

   /*
   https://jsonplaceholder.typicode.com/todos/7

   {
   "userId": 1,
   "id": 7,
   "title": "illo expedita consequatur quia in",
   "completed": false
}
    */






       /*
       http://www.gmibank.com/api/tp-customers/114351 adresindeki müşteri bilgilerini doğrulayın

    {
       "firstName": "Della",
       "lastName": "Heaney",
       "email": "ricardo.larkin@yahoo.com",
       "mobilePhoneNumber": "123-456-7893",
    }
        */




           /*
           http://www.gmibank.com/api/tp-customers/43703

           "firstName": "Alda",
           "lastName": "Monahan",
           "middleInitial": "Nichelle Hermann Kohler",
           "email": "com.github.javafaker.Name@7c011174@gmail.com",
           "mobilePhoneNumber": "909-162-8114",
           "city": "St Louis",
           "ssn": "108-53-6655"

           1) MATCHERS CLASS
           2) JSON PATH
           3) De-Serialization
            */


