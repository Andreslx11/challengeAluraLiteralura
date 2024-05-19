package com.challengedesafioalura.literalura.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosAutor(

       @JsonAlias("name") String nombre,
       @JsonAlias("birth_year") String FechaNacimineto,
       @JsonAlias("death_year") String FechaMuerte


) {
}
/*
public class Book {
    private int id;
    private String title;
    private List<Author> authors;
    private List<Translator> translators;
    private List<String> subjects;
    private List<String> bookshelves;
    private List<String> languages;
    private boolean copyright;
    private String mediaType;
    private Formats formats;
    private int downloadCount;


    public class Author {
        private String name;
        private int birthYear;
        private int deathYear;
 /*

 {
  "count": 1,
  "next": null,
  "previous": null,
  "results": [
    {
      "id": 58221,
      "title": "La Odisea",
      "authors": [
        {
          "name": "Homer",
          "birth_year": -750,
          "death_year": -650
        }
      ],
      "translators": [
        {
          "name": "Segalá y Estalella, Luis",
          "birth_year": 1873,
          "death_year": 1938
        }
      ],
      "subjects": [
        "Epic poetry, Greek -- Translations into Spanish",
        "Odysseus, King of Ithaca (Mythological character)"
      ],
      "bookshelves": [],
      "languages": [
        "es"
      ],
      "copyright": false,
      "media_type": "Text",
      "formats": {
        "text/plain; charset=us-ascii": "https://www.gutenberg.org/ebooks/58221.txt.utf-8",
        "text/html": "https://www.gutenberg.org/ebooks/58221.html.images",
        "text/html; charset=utf-8": "https://www.gutenberg.org/files/58221/58221-h/58221-h.htm",
        "application/epub+zip": "https://www.gutenberg.org/ebooks/58221.epub3.images",
        "application/x-mobipocket-ebook": "https://www.gutenberg.org/ebooks/58221.kf8.images",
        "text/plain; charset=utf-8": "https://www.gutenberg.org/files/58221/58221-0.txt",
        "application/rdf+xml": "https://www.gutenberg.org/ebooks/58221.rdf",
        "image/jpeg": "https://www.gutenberg.org/cache/epub/58221/pg58221.cover.medium.jpg",
        "application/octet-stream": "https://www.gutenberg.org/cache/epub/58221/pg58221-h.zip"
      },
      "download_count": 3340
    }
  ]
}













  */