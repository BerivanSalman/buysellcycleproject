Feature: US_001 Kullanici Buysellcycle sayfasında arama yapar



  @Smoke
  Scenario: TC01 Kullanici phone aramasında  sonuc bulmali

    Given kullanici buysellcyle anasayfasında gider
    Then arama kutusuna tablet yazar enter tusuna basar
    Then sayfayı kapatır