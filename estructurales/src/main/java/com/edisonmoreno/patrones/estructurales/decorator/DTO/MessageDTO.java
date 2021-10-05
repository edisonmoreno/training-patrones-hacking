package com.edisonmoreno.patrones.estructurales.decorator.DTO;

public class MessageDTO {
    private String title;
    private String body;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setImage(String image) {
        this.image = image;
    }

    private String image;

    public MessageDTO(String title, String body, String image) {
        this.title = title;
        this.body = body;
        this.image = image;
    }

    @Override
    public String toString() {
        return this.title.concat(" | ").concat(this.body).concat(" | ").concat(this.image);
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public String getImage() {
        return image;
    }
}
