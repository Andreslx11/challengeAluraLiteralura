package com.challengedesafioalura.literalura.model;



import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

// mapeo de la estructura interna del objeto results de la api

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosLibro(

        @JsonAlias("title") String titulo,
        @JsonAlias("authors") List<DatosAutor> autor,
        @JsonAlias("languages") List<String> idiomas,
        @JsonAlias("download_count") int numeroDeDescargas


) {

}






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