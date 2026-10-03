# Running the application
Navigate to an safe directory and run the following code to get the code an
~~~
git clone https://github.com/HeyItsAp/mappeVurdering2
cd mappeVurdering2
~~~
Bygg deretter prosjektet og kjør applikasjonen med følgende Maven-kommando:

~~~
mvn javafx:run
~~~

For å kjøre enhetstestene separat kan følgende kommando benyttes:
~~~
mvn test
~~~

Det er også mulig å bygge og pakke prosjektet til en .jar-fil
~~~
mvn clean package
~~~

Merk at prosjektet krever en internettforbindelse ved første bygg, da Maven laster ned nødvendige avhengigheter automatisk fra Maven Central.
