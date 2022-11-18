/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.sp.senac.projetointegradorII.model;

/**
 *
 * @author William
 */
public class Produto {    
    
    private int codigoProduto;
    private String descricaoProduto;
    private int dtCompraProduto;
    private String fornecedorProd;
    private String marcaProduto;
    private String nomeProduto;
    private String prateleiraProd;
    private int quantProd;
    private int valorProduto;
    private String categoriaProd;
    
    public Produto(){    
    }

    public Produto(int codigoProduto, int valorProduto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public int getCodigoProduto(){
        return codigoProduto;
    }
    public void setCodigoProduto(int codigoProduto){
        this.codigoProduto = codigoProduto;
    }
    public String getDescricaoProduto(){
        return descricaoProduto;
    }
    public void setDescricaoProduto(String descricaoProduto){
        this.descricaoProduto = descricaoProduto;
    }
    public int getDtCompraProduto(){
        return dtCompraProduto;
    }
    public void setDtCompraProduto(int dtCompraProduto){
        this.dtCompraProduto = dtCompraProduto;
    }
    public String getFornecedorProd(){
        return fornecedorProd;
    }
    public void setFornecedorProd(String fornecedorProd){
        this.fornecedorProd = fornecedorProd;
    }
    public String getMarcaProduto(){
        return marcaProduto;
    }
    public void setMarcaProduto(String marcaProduto){
        this.marcaProduto = marcaProduto;
    }
    public String getNomeProduto(){
        return nomeProduto;
    }
    public void setNomeProduto(String nomeProduto){
        this.nomeProduto = nomeProduto;
    }
    public String getPrateleiraProd(){
        return prateleiraProd;
    }
    public void setPrateleiraProd (String prateleiraProd){
        this.prateleiraProd = prateleiraProd;
    }
    public int getQuantProd(){
        return quantProd;
    }
    public void setQuantProd(int quantProd){
        this.quantProd = quantProd;
    }
    public int getValorProduto(){
        return valorProduto;
    }
    public void setValorProduto(int valorProduto){
        this.valorProduto = valorProduto;
    }
    
    public String getCategoriaProd (){
        return categoriaProd;
    }
    public void setCategoriaProd(String categoriaProd){
        this.categoriaProd = categoriaProd;
    }
}
