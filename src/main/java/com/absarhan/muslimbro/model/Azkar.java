package com.absarhan.muslimbro.model;


import javax.persistence.*;
import java.util.Objects;

@Entity(name = "azkar")
public class Azkar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String type;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String arabicContent;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String italianContent;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String transliteration;

    @Column(nullable = false)
    private int maxNumber;

    public Azkar() {
    }

    public Azkar(String type, String arabicContent, String transliteration, String italianContent, int maxNumber) {
        this.type = type;
        this.arabicContent = arabicContent;
        this.italianContent = italianContent;
        this.transliteration = transliteration;
        this.maxNumber = maxNumber;
    }

    public Azkar(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getArabicContent() {
        return arabicContent;
    }

    public void setArabicContent(String arabicContent) {
        this.arabicContent = arabicContent;
    }

    public String getItalianContent() {
        return italianContent;
    }

    public void setItalianContent(String italianContent) {
        this.italianContent = italianContent;
    }

    public String getTransliteration() {
        return transliteration;
    }

    public void setTransliteration(String transliteration) {
        this.transliteration = transliteration;
    }

    public int getMaxNumber() {
        return maxNumber;
    }

    public void setMaxNumber(int maxNumber) {
        this.maxNumber = maxNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Azkar that = (Azkar) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Azkar{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", arabicContent='" + arabicContent + '\'' +
                ", italianContent='" + italianContent + '\'' +
                ", transliteration='" + transliteration + '\'' +
                ", maxNumber=" + maxNumber +
                '}';
    }
}

