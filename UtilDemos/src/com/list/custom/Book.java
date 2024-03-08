package com.list.custom;

public class Book implements Comparable<Book>{
    private String title;
    private String author;
    private double price;

    public Book() {
    }

    public Book(String title, String author, double price)  {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Book o) {
        //return this.getTitle().compareTo(o.title);
        Double price1=this.getPrice();
        return price1.compareTo(o.getPrice());  //return ((Double)this.getPrice.compareTo(o.getPrice));
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
