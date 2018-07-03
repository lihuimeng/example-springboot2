package com.taimei.example.entry;

import com.taimei.example.base.BaseEntry;

public class Movie extends BaseEntry {

    private Long id;

    /**
     * 电影名称
     */
    private String name;

    /**
     * 电影票价格
     */
    private String price;

    /**
     * 数据有效性状态
     */
    private String status;

    /**
     * 电影ID
     */
    private String movieCode;

    /**
     * 剩余电影票数量
     */
    private Integer ticketCount;

    public String getMovieCode() {
        return movieCode;
    }

    public void setMovieCode(String movieCode) {
        this.movieCode = movieCode;
    }

    public Integer getTicketCount() {
        return ticketCount;
    }

    public void setTicketCount(Integer ticketCount) {
        this.ticketCount = ticketCount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", status='" + status + '\'' +
                ", movieCode='" + movieCode + '\'' +
                ", ticketCount=" + ticketCount +
                '}';
    }
}
