package com.edisonmoreno.patrones.estructurales.proxy;

public class Document {
    private ImageProxy imageProxy;
    private String nameDocument;
    private String textDocument;

    public Document(String nameDocument) {
        this.setNameDocument(nameDocument);
        this.cargarContenido();
        this.showContent();
    }

    private void cargarContenido() {
        this.textDocument = "Texto del documento";
        this.imageProxy = new ImageProxy("imagen.jpg");
        System.out.println("Documento cargado en memoria");
    }

    public void showContent() {
        System.out.println("Este es el contenido...");
        System.out.println("name: " + this.nameDocument);
        System.out.println("text: " + this.textDocument + "\n");
    }

    public void doScroll() {
        System.out.println("El usuario hizo scroll...");
        imageProxy.show();
    }

    public String getNameDocument() {
        return nameDocument;
    }

    public void setNameDocument(String nameDocument) {
        this.nameDocument = nameDocument;
    }
}
