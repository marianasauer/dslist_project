package com.devsuperior.dslist.dtos;


import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.projections.GameMinProjection;

public class GameMinDTO {


    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GameMinDTO(){

    }

    public GameMinDTO(Game entity) {
        entity.getId();
        entity.getTitle();
        entity.getYear();
        entity.getImgUrl();
        entity.getShortDescription();
    }

    public GameMinDTO(GameMinProjection projection) {
        projection.getId();
        projection.getTitle();
        projection.getGameYear();
        projection.getImgUrl();
        projection.getShortDescription();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
