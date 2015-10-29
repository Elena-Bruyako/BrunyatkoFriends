package com.bruyako.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by brunyatko on 07.09.15.
 */
@Entity
@Table(name = "POST")
public class Post implements Serializable{

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "TITLE", nullable = false)
    private String title;

    @Column(name = "CONTENT", nullable = false)
    private String content;

    @Column(name = "DATE")
    private Date date;

    @ManyToOne
    @JoinColumn(name = "CONTACT_ID")
    private Contact postOfContact;

    public Post() {
    }

    public Post(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Contact getPostOfContact() {
        return postOfContact;
    }

    public void setPostOfContact(Contact postOfContact) {
        this.postOfContact = postOfContact;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Post post = (Post) o;

        if (content != null ? !content.equals(post.content) : post.content != null) return false;
        if (date != null ? !date.equals(post.date) : post.date != null) return false;
        if (id != null ? !id.equals(post.id) : post.id != null) return false;
        if (postOfContact != null ? !postOfContact.equals(post.postOfContact) : post.postOfContact != null)
            return false;
        if (title != null ? !title.equals(post.title) : post.title != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (postOfContact != null ? postOfContact.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", date=" + date +
                '}';
    }
}
