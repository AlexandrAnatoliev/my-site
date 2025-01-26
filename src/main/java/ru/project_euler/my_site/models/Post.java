package ru.project_euler.my_site.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Class contains data structure for transferring an article to and from the database
 */
@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String seo_title;
    private String title;
    private String anons;
    private String full_text;
    private int views;

    public String getSeo_title() {
        return seo_title;
    }

    /**
     * @param seo_title title for search engine optimisation "blog/.../seo_title/.."
     */
    public void setSeo_title(String seo_title) {
        this.seo_title = seo_title;
    }

    public Long getId() {
        return id;
    }

    /**
     * @param id unique article number in the database
     */
    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    /**
     * @param title article title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    public String getAnons() {
        return anons;
    }

    /**
     * @param anons article preview
     */
    public void setAnons(String anons) {
        this.anons = anons;
    }

    public String getFull_text() {
        return full_text;
    }

    /**
     * @param full_text article full text
     */
    public void setFull_text(String full_text) {
        this.full_text = full_text;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public Post() {
    }

    public Post(String title, String anons, String full_text) {
        this.title = title;
        this.anons = anons;
        this.full_text = full_text;
    }

    public Post(String seo_title, String title, String anons, String full_text) {
        this.seo_title = seo_title;
        this.title = title;
        this.anons = anons;
        this.full_text = full_text;
    }
}
