package br.senac.es.treferenciafinal.model;

public class Message {
    Long id;
    String text;
    Status status;

    public Message(Long id, String text, Status status){
        this.id=id;
        this.text=text;
        this.status = status;
    }
    @Override
    public String toString(){
        return this.text;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
