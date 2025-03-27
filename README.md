# Library Management System 📚

Bu proje, basit bir **Kütüphane Yönetim Sistemi** uygulamasını simüle etmek için yazılmıştır. Proje, **kitap ödünç alma** ve **iade etme** gibi temel kütüphane işlevlerini gerçekleştiren sınıflardan oluşmaktadır.

## İçindekiler
- [Proje Hakkında](#proje-hakkında)
- [Sınıflar](#sınıflar)
  - [Book Sınıfı](#book-sınıfı)
  - [Library Sınıfı](#library-sınıfı)
  - [Member Sınıfı](#member-sınıfı)
  - [Main Sınıfı](#main-sınıfı)
- [Proje Yapısı](#proje-yapısı)
- [Kullanım](#kullanım)
- [Katkıda Bulunma](#katkıda-bulunma)
- [Lisans](#lisans)

---

## Proje Hakkında

Bu proje, kütüphanedeki kitapların ve üyelerin yönetilmesine olanak tanır. Kitaplar ödünç alınabilir, iade edilebilir ve kitap durumları görüntülenebilir. Kütüphane üyeleri kitapları ödünç alabilir ve iade edebilir.

---

## Sınıflar

### 📖 **Book Sınıfı**

**Book** sınıfı, kitapların temel bilgilerini tutar ve ödünç alma işlemlerini yönetir.

#### Özellikler:
- **title**: Kitabın ismi.
- **author**: Kitabın yazarı.
- **isbn**: Kitabın ISBN numarası.
- **isAvailable**: Kitap ödünç alınabilir mi? (boolean)
- **borrowedMember**: Kitabın ödünç alındığı üye.

#### Yöntemler:
- `getTitle()`, `setTitle(String title)`: Kitap ismini alır ve ayarlar.
- `getAuthor()`, `setAuthor(String author)`: Yazar bilgisi alır ve ayarlar.
- `getIsbn()`, `setIsbn(int isbn)`: ISBN numarasını alır ve ayarlar.
- `displayInfo()`: Kitap bilgilerini ekrana yazdırır.
- `borrowBook()`: Kitap ödünç alınır (eğer uygun ise).
- `returnBook()`: Kitap iade edilir.

---

### 🏛 **Library Sınıfı**

**Library** sınıfı, kütüphanedeki kitaplar ve üyelerle ilgili işlemleri yönetir.

#### Özellikler:
- **books**: Kütüphanedeki kitapların listesi.
- **members**: Kütüphanedeki üyelerin listesi.

#### Yöntemler:
- `addBook(Book book)`: Kitap ekler.
- `addMember(Member member)`: Üye ekler.
- `displayAvailableBooks()`: Kütüphanedeki mevcut kitapları gösterir.
- `displayBook(Book book)`: Belirli bir kitabın bilgilerini görüntüler.

---

### 🧑‍🤝‍🧑 **Member Sınıfı**

**Member** sınıfı, kütüphanedeki üyeleri temsil eder. Üyeler, kitapları ödünç alabilir ve iade edebilir.

#### Özellikler:
- **name**: Üyenin adı.
- **memberID**: Üyenin kimlik numarası.
- **borrowedBooks**: Üyenin ödünç aldığı kitapların listesi.

#### Yöntemler:
- `getName()`, `setName(String name)`: Üyenin adını alır ve ayarlar.
- `getMemberID()`, `setMemberID(int memberID)`: Üyenin kimlik numarasını alır ve ayarlar.
- `borrowBook(Book book)`: Kitap ödünç alır.
- `returnBook(Book book)`: Kitap iade eder.

---

### 🎬 **Main Sınıfı**

**Main** sınıfı, programın çalıştırıldığı ve kütüphane işlemlerinin gerçekleştirildiği ana sınıftır.

#### İşleyiş:
- Kütüphane ve üyeler oluşturulur.
- Kitaplar kütüphaneye eklenir.
- Üyeler kitapları ödünç alır ve kitap durumu görüntülenir.

#### Örnek Kod:
```java
public static void main(String[] args) {
    Library myLibrary = new Library();
    
    Book firstBook = new Book("Rüya Avcısı", "Stephen King", 126);
    Book secondBook = new Book("Anna Karennina", "Tolstoy", 130);
    Book thirdBook = new Book("Hayvan Çiftliği", "George Orwell", 300);

    Member ali = new Member("Ali", 4563);
    Member ahmet = new Member("Ahmet", 3067);

    myLibrary.addBook(firstBook);
    myLibrary.addBook(secondBook);
    myLibrary.addBook(thirdBook);
    
    myLibrary.addMember(ahmet);
    myLibrary.addMember(ali);
    
    myLibrary.displayAvailableBooks(); // Mevcut kitapları göster

    ali.borrowBook(thirdBook); // Ali, "Hayvan Çiftliği" kitabını ödünç alır
    myLibrary.displayBook(thirdBook); // Kitabın detaylarını göster
}
```

---

## Proje Yapısı

Proje dosya yapısı şu şekildedir:

```
src/
│
├── classesTemplate/
│   ├── Book.java
│   ├── Library.java
│   ├── Member.java
│   └── Main.java
```

---

## Kullanım

1. Bu projeyi **clone** ederek bilgisayarınıza indirin.
2. **Main.java** dosyasını çalıştırarak kütüphane yönetim sistemini test edin.
3. Kitap ekleyebilir, üye ekleyebilir ve ödünç alma işlemlerini gerçekleştirebilirsiniz.

---

## Katkıda Bulunma

Proje hakkında katkıda bulunmak isterseniz, lütfen şu adımları takip edin:

1. Repo'yu **fork** yapın.
2. Yeni bir **branch** oluşturun.
3. Yaptığınız değişiklikleri **commit** edin.
4. **Pull request** gönderin.

---

## License

Library Management System

Copyright (C) 2025 Emrullah Enis Çetinkaya and contributors

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program.  If not, see <https://www.gnu.org/licenses/>.
