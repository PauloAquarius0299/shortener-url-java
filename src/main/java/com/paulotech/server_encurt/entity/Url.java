package com.paulotech.server_encurt.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.index.Indexed;

import java.time.LocalDateTime;

@Document(collection = "urls")
public class Url {

    @Id
    private String id;

    private String url;

    @Indexed(expireAfter = "0")
    private LocalDateTime expiresAt;

    public Url(String id, String url, LocalDateTime expiresAt) {
        this.id = id;
        this.url = url;
        this.expiresAt = expiresAt;
    }

    private Url(){
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public LocalDateTime getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(LocalDateTime expiresAt) {
        this.expiresAt = expiresAt;
    }
}
